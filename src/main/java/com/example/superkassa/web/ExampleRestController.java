package com.example.superkassa.web;

import com.example.superkassa.to.InputTo;
import com.example.superkassa.service.ExampleService;
import com.example.superkassa.to.OutputTo;
import com.example.superkassa.util.OutputUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class ExampleRestController {

    @Autowired
    private ExampleService exampleService;

    @PostMapping(value = "/modify", consumes = MediaType.APPLICATION_JSON_VALUE)
    public OutputTo update(@RequestBody InputTo inputObject) {
        try {
            return OutputUtil.asTo(exampleService.increase(inputObject.getId(), inputObject.getAdd()));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
        }
    }
}

