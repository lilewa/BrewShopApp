package com.brew.brewshop.storage.recipes;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private static final int VERSION = 1;

    private int id;
    private String name;
    private BeerStyle style;
    private double batchVolume;
    private double boilVolume;
    private double boilTime;
    private double efficiency;
    private int version = VERSION;

    private List<MaltAddition> malts;
    private List<HopAddition> hops;
    private Yeast yeast;
    private String notes;

    public Recipe() {
        name = "New Recipe";
        style = new BeerStyle();
        batchVolume = 5;
        boilVolume = 6.5;
        boilTime = 60;
        efficiency = 70;

        malts = new ArrayList<MaltAddition>();
        malts.add(new MaltAddition());

        hops = new ArrayList<HopAddition>();
        hops.add(new HopAddition());
        yeast = new Yeast();
        notes = "";
    }

    public int getId() { return id; }
    public void setId(int value) { id = value; }

    public String getName() { return name; }
    public void setName(String value) { name = value; }

    public BeerStyle getStyle() { return style; }
    public void setStyle(BeerStyle value) { style = value; }

    public double getBatchVolume() { return batchVolume; }
    public void setBatchVolume(double value) { batchVolume = value; }

    public double getBoilVolume() { return boilVolume; }
    public void setBoilVolume(double value) { boilVolume = value; }

    public double getBoilTime() { return boilTime; }
    public void setBoilTime(double value) { boilTime = value; }

    public double getEfficiency() { return efficiency; }
    public void setEfficiency(double value) { efficiency = value; }

    public String getNotes() { return notes; }
    public void setNotes(String value) { notes = value; }

    public double getGravity() { return 1.050; }
    public int getSrm() { return 10; }
    public int getIbu() { return 10; }
}