package sky.alien.testlistviewdoggy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NeoGhost on 18.04.2017.
 */

public class Dog {
    private String breed;
    private String desription;
    private int resId;
    private List<Dog> dogList = new ArrayList<>();
    Dog


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }
}
