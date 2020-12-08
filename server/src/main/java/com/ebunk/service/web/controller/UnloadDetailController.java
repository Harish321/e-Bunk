package com.ebunk.service.web.controller;

import com.ebunk.service.entity.UnloadDetail;
import com.ebunk.service.service.UnloadDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/unloadDetail")
@Slf4j
public class UnloadDetailController {

    private final UnloadDetailService unloadDetailService;

    @Autowired
    public UnloadDetailController(UnloadDetailService unloadDetailService) {
        this.unloadDetailService = unloadDetailService;
    }

    @GetMapping
    public List<UnloadDetail> getAllUnloadDetails() {
        return unloadDetailService.findAllUnloadDetails();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UnloadDetail> getUnloadDetailById(@PathVariable Long id) {
        return unloadDetailService.findUnloadDetailById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UnloadDetail createUnloadDetail(@RequestBody @Validated UnloadDetail unloadDetail) {
        return unloadDetailService.saveUnloadDetail(unloadDetail);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UnloadDetail> updateUnloadDetail(@PathVariable Long id, @RequestBody UnloadDetail unloadDetail) {
        return unloadDetailService.findUnloadDetailById(id)
                .map(unloadDetailObj -> {
                    unloadDetail.setId(id);
                    return ResponseEntity.ok(unloadDetailService.saveUnloadDetail(unloadDetail));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UnloadDetail> deleteUnloadDetail(@PathVariable Long id) {
        return unloadDetailService.findUnloadDetailById(id)
                .map(unloadDetail -> {
                    unloadDetailService.deleteUnloadDetailById(id);
                    return ResponseEntity.ok(unloadDetail);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
