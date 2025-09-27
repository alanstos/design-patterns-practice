package com.dev.alan.patterns.structural.proxy;

//Proxy

public class ProxyVideo implements Video {

    private final String filename;
    private RealVideo realVideo;

    public ProxyVideo(String filename) {
        this.filename = filename;
    }


    @Override
    public void play() {
        if (realVideo == null){
            realVideo = createRealVideo();
        }
        realVideo.play();
    }

    // Hook protegida para permitir testes / extensão
    // essa mudança é pequena e melhora testabilidade (boa prática).
    protected RealVideo createRealVideo() {
        return new RealVideo(filename);
    }
}
