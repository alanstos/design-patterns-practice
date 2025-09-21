package com.dev.alan.patterns.structural.composite;

public class File implements FileSystemComponent{

    private String name;

    public File(String name){
        super();
        this.name = name;
    }

    @Override
    public String showDetails() {
        return this.name;
    }
}
