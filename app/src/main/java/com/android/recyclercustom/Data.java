package com.android.recyclercustom;

/**
 * Created by kumar on 4/1/17.
 */

public class Data {

    private int image;
    private  String name;

    Data(int image, String name){
        this.setImage(image);
        this.setName(name);
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
