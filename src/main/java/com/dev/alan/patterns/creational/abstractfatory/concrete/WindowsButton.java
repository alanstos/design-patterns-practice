package com.dev.alan.patterns.creational.abstractfatory.concrete;

import com.dev.alan.patterns.creational.abstractfatory.IButton;

public class WindowsButton implements IButton {
    @Override
    public String paint() {
        System.out.println("desenho button estilo win");
        return "win";
    }
}
