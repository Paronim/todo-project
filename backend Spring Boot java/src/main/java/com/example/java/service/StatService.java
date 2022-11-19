package com.example.java.service;

import org.springframework.stereotype.Service;
import com.example.java.entity.Stat;
import com.example.java.repo.StatRepository;

import javax.transaction.Transactional;




@Service



@Transactional
public class StatService {

    private final StatRepository repository; 

    public StatService(StatRepository repository) {
        this.repository = repository;
    }

    public Stat findStat(String email) {
        return repository.findByUserEmail(email);
    }

}
