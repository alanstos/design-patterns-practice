package com.dev.alan.patterns.structural.composite;

public class Application {

    public static void main(String[] args) {
        File fla = new File("fla");
        File flu = new File("flu");
        File fortaleza = new File("fortaleza");

        Directory rj = new Directory("rj");
        Directory ce = new Directory("ce");
        rj.add(fla);
        rj.add(flu);
        ce.add(fortaleza);

        Directory times = new Directory("diretorio_times_br");
        times.add(rj);
        times.add(ce);

        // Cliente não precisa saber se é arquivo ou diretório
        String details = times.showDetails();
        System.out.println("details=" + details);
    }
}
