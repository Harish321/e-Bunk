package com.ebunk.service.web.controller;

import com.ebunk.service.entity.dailySale;
import com.ebunk.service.service.dailySaleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dailySale")
@Slf4j
public class dailySaleController {

    private final dailySaleService dailySaleService;

    @Autowired
    public dailySaleController(dailySaleService dailySaleService) {
        this.dailySaleService = dailySaleService;
    }

    @GetMapping
    public List<dailySale> getAlldailySales() {
        return dailySaleService.findAlldailySales();
    }

    @GetMapping("/{id}")
    public ResponseEntity<dailySale> getdailySaleById(@PathVariable Long id) {
        return dailySaleService.finddailySaleById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public dailySale createdailySale(@RequestBody @Validated dailySale dailySale) {
        return dailySaleService.savedailySale(dailySale);
    }

    @PutMapping("/{id}")
    public ResponseEntity<dailySale> updatedailySale(@PathVariable Long id, @RequestBody dailySale dailySale) {
        return dailySaleService.finddailySaleById(id)
                .map(dailySaleObj -> {
                    dailySale.setId(id);
                    return ResponseEntity.ok(dailySaleService.savedailySale(dailySale));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<dailySale> deletedailySale(@PathVariable Long id) {
        return dailySaleService.finddailySaleById(id)
                .map(dailySale -> {
                    dailySaleService.deletedailySaleById(id);
                    return ResponseEntity.ok(dailySale);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
