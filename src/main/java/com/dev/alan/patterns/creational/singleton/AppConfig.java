package com.dev.alan.patterns.creational.singleton;

public class AppConfig {

    private static AppConfig instance;

    private String theme;
    private String language;

    private AppConfig(String language, String theme){
        this.language = language;
        this.theme = theme;
    };

    public static AppConfig getInstance(){
        if (instance == null){
            instance = new AppConfig("pt-br", "light");
        }
        return instance;
    }

    public String getLanguage() {
        return language;
    }

    public String getTheme() {
        return theme;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}