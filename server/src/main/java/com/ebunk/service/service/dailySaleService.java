package com.ebunk.service.service;

import com.ebunk.service.entity.dailySale;
import com.ebunk.service.repository.dailySaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class dailySaleService {

    private final dailySaleRepository dailySaleRepository;

    @Autowired
    public dailySaleService(dailySaleRepository dailySaleRepository) {
        this.dailySaleRepository = dailySaleRepository;
    }

    public List<dailySale> findAlldailySales() {
        return dailySaleRepository.findAll();
    }

    public Optional<dailySale> finddailySaleById(Long id) {
        return dailySaleRepository.findById(id);
    }

    public dailySale savedailySale(dailySale dailySale) {
        return dailySaleRepository.save(dailySale);
    }

    public void deletedailySaleById(Long id) {
        dailySaleRepository.deleteById(id);
    }
}
