package com.example.cardview2;

//modelo dos clubes, conforme daods do card_view.xml

public class Clubs {

    private int clube_image;
    private String club_description;
    private String club_name;

    public Clubs(int clube_image, String club_description, String club_name) {
        this.clube_image = clube_image;
        this.club_description = club_description;
        this.club_name = club_name;
    }

    public int getClube_image() {
        return clube_image;
    }

    public void setClube_image(int clube_image) {
        this.clube_image = clube_image;
    }

    public String getClub_description() {
        return club_description;
    }

    public void setClub_description(String club_description) {
        this.club_description = club_description;
    }

    public String getClub_name() {
        return club_name;
    }

    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }
}