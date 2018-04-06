package com.example.android.tourguideapp;

public class Chosen {

    private static final int NO_IMAGE_PROVIDED = -1;

    // fragment
    private String fragmentHere;

    //name
    private String nameHere;

    //info
    private String infoHere;

    //web page
    private String webHere;

    // quote
    private String quoteHere;

    // Id for proper picture
    private int imageHere = NO_IMAGE_PROVIDED;

    /**
     * Create new object in fragment
     *
     * @param fragmentHere   name of fragment
     * @param nameHere       name of place
     * @param infoHere       info text
     * @param webHere        web address
     * @param imageResourceId image ID
     */
    public Chosen(String fragmentHere, String nameHere, String infoHere, String webHere, String quoteHere, int imageResourceId) {
        this.fragmentHere = fragmentHere;
        this.nameHere = nameHere;
        this.infoHere = infoHere;
        this.webHere = webHere;
        this.quoteHere = quoteHere;
        imageHere = imageResourceId;
    }

    public Chosen(String namePlace) {
        nameHere = namePlace;
    }

    //get fragment of place
    public String getCurrentChoice() {
        return fragmentHere;
    }

    //get name of place
    public String getCurrentName() {
        return nameHere;
    }

    // get Info of place
    public String getCurrentInfo() {
        return infoHere;
    }

    // get web page address
    public String getCurrentWeb() {
        return webHere;
    }

    // get address of place
    public String getCurrentQuote() {
        return quoteHere;
    }

    // get image ID
    public Integer getImageResourceId() {
        return imageHere;
    }

    // returns whether ot not there is an image for fragment
    public boolean hasImage() {
        return imageHere != NO_IMAGE_PROVIDED;
    }
}