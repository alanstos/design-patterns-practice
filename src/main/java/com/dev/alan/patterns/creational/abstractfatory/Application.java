package com.dev.alan.patterns.creational.abstractfatory;

public class Application {

    private IButton button;
    private ICheckbox checkbox;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public Application(){

    }

    public String renderUI() {
        return button.paint() + "|" + checkbox.paint();
    }

    //v1 sem necessidade - pode excluir
    public String usandoFactory(UIFactory uiFactory){
        IButton button = uiFactory.createButton();
        String paint1 = button.paint();

        ICheckbox checkbox = uiFactory.createCheckbox();
        String paint2 = checkbox.paint();

        return paint1 + paint2;
    }
}
