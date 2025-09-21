package com.dev.alan.patterns.creational.abstractfatory.concrete;

import com.dev.alan.patterns.creational.abstractfatory.ICheckbox;

public class MacCheckbox implements ICheckbox {
    @Override
    public String paint() {
        System.out.println("desenho check estilo MAC");
        return "mac";
    }
}
