package com.dev.alan.patterns.creational.abstractfatory.concrete;

import com.dev.alan.patterns.creational.abstractfatory.IButton;
import com.dev.alan.patterns.creational.abstractfatory.ICheckbox;
import com.dev.alan.patterns.creational.abstractfatory.UIFactory;

public class MacFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacCheckbox();
    }
}
