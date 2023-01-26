package com.example.superkassa.util;

import com.example.superkassa.model.ExampleObject;
import com.example.superkassa.to.OutputTo;

public class OutputUtil {

    public static OutputTo asTo(ExampleObject exampleObject) {
        return new OutputTo(exampleObject.getObj().getCurrent());
    }
}