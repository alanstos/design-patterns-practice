package com.dev.alan.patterns.behavioral.chain;

// Request

public class SupportRequest {
    private final String type;

    public SupportRequest(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
