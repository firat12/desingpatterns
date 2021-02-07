package com.firatcapin.desingpatterns.behavioarol.strategy;

public enum EnumDers {
    TURKCE("Türkçe"),
    MATEMATIK("Matematik"),
    FEN("Fen"),
    SOSYAL("Sosyal");

    private String ders;

    EnumDers(String ders) {
        this.ders = ders;
    }


    @Override
    public String toString() {
        return "EnumDers{" +
                "ders='" + ders + '\'' +
                '}';
    }
}
