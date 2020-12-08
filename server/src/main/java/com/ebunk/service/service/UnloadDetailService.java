package com.ebunk.service.service;

import com.ebunk.service.entity.UnloadDetail;
import com.ebunk.service.repository.UnloadDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UnloadDetailService {

    private final UnloadDetailRepository unloadDetailRepository;

    @Autowired
    public UnloadDetailService(UnloadDetailRepository unloadDetailRepository) {
        this.unloadDetailRepository = unloadDetailRepository;
    }

    public List<UnloadDetail> findAllUnloadDetails() {
        return unloadDetailRepository.findAll();
    }

    public Optional<UnloadDetail> findUnloadDetailById(Long id) {
        return unloadDetailRepository.findById(id);
    }

    public UnloadDetail saveUnloadDetail(UnloadDetail unloadDetail) {
        return unloadDetailRepository.save(unloadDetail);
    }

    public void deleteUnloadDetailById(Long id) {
        unloadDetailRepository.deleteById(id);
    }
}
