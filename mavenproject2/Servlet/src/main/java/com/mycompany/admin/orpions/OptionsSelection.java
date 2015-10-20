package com.mycompany.admin.orpions;

import java.util.HashMap;

public class OptionsSelection {

    private HashMap percentageRatioPriority;
    private HashMap percentageRatioSours;
    private HashMap percentageRatioDates;
    private HashMap percentageRatioLanguage;
    private HashMap percentageRatioCategory;
    private int sizeList;

    /**
     * get options display from same resource
     */
    public OptionsSelection() {
    }

    public HashMap getPercentageRatioPriority() {
        return percentageRatioPriority;
    }

    public HashMap getPercentageRatioSours() {
        return percentageRatioSours;
    }

    public HashMap getPercentageRatioDates() {
        return percentageRatioDates;
    }

    public HashMap getPercentageRatioLanguage() {
        return percentageRatioLanguage;
    }

    public int getSizeList() {
        return sizeList;
    }
}
