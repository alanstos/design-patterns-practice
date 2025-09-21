package com.dev.alan.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystemComponent fileSystemComponent){
        children.add(fileSystemComponent);
    }

    public void add(FileSystemComponent... fileSystemComponent){
        for (FileSystemComponent f : fileSystemComponent){
            this.add(f);
        }
    }

    public void remove(FileSystemComponent fileSystemComponent){
        children.remove(fileSystemComponent);
    }

    public List<FileSystemComponent> getChildren(){
        return this.children;
    }

    @Override
    public String showDetails() {
        String details = " | " + this.name + " >>";
        for (FileSystemComponent child: this.getChildren()){
            details += " / " + child.showDetails();
        }
        return details;
    }
}
