package com.dev.alan.patterns.creational.abstractfatory.concrete;

import com.dev.alan.patterns.creational.abstractfatory.IButton;
import com.dev.alan.patterns.creational.abstractfatory.ICheckbox;
import com.dev.alan.patterns.creational.abstractfatory.UIFactory;

public class WindowsFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
