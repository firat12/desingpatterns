package com.firatcapin.desingpatterns.creatianol.factory;

public class Note8 implements Telefon{
    private String model;
    private String batarya;
    private Integer en;
    private Integer boy;

    public Note8(String model, String batarya, Integer en, Integer boy){
        this.model = model;
        this.batarya = batarya;
        this.en = en;
        this.boy = boy;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBatarya() {
        return batarya;
    }

    @Override
    public Integer getEn() {
        return en;
    }

    @Override
    public Integer getBoy() {
        return boy;
    }

    @Override
    public String toString() {
        return "Note8{" +
                "model='" + model + '\'' +
                ", batarya='" + batarya + '\'' +
                ", en=" + en +
                ", boy=" + boy +
                '}';
    }
}
