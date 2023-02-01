package com.example.superkassa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Json implements Serializable {

    public Json() {
    }

    public Json(Integer current) {
        this.current = current;
    }

    private Integer current;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }
}