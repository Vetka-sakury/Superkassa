package com.example.superkassa.service;

import com.example.superkassa.model.ExampleObject;
import com.example.superkassa.model.Json;
import com.example.superkassa.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    @Transactional
    public ExampleObject increase (Integer id, Integer add){
        ExampleObject exampleObject1 = findById(id);
        Json newJson = new Json(exampleObject1.getObj().getCurrent() + add);
        exampleRepository.update(newJson, id);
        return findById(id);
    }

    public ExampleObject findById(Integer id) {
        ExampleObject exampleObject = null;
        if (exampleRepository.findById(id).isPresent()) exampleObject = exampleRepository.findById(id).get();
        return exampleObject;
    }
}
