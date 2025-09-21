package com.dev.alan.patterns.structural.adapter;

public class Application {

    private DataProcessor dataProcessor;

    public Application(DataProcessor dataProcessor){
        this.dataProcessor = dataProcessor;
    }

    public String usar(){
        String dataRetornoJson = this.dataProcessor.process();
        return dataRetornoJson;
    }
}
