package model;

import java.util.Observable;

/**
 * Created by christianjurt on 2017-10-26.
 */

public class HSVModel extends Observable {

    // CLASS VARIABLES
    public static final Integer MAX_Hue = 360;
    public static final Integer MIN_Hue = 0;
    public static final int MAX_HSV = 100;
    public static final float MAX_SAURATION = 1;
    public static final float MAX_BRIGHTNESS = 1;
    public static final float MIN_HSV = 0;

    // INSTANCE VARIABLES
    private Integer hue;
    private float saturation;
    private float brightness;

    /**
     * No argument constructor.
     * <p>
     * Instantiate a new instance of this class, and
     */
    public HSVModel() {
        this(MAX_Hue, MAX_HSV, MAX_HSV);
    }

    /**
     * Convenience constructor.
     *
     * @param hue        - starting red value
     * @param saturation - starting green value
     * @param brightness - starting blue value
     */
    public HSVModel(Integer hue, float saturation, float brightness) {
        super();

        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;
    }


    //setting the HSV values for all my color buttons

    public void asBlack() {
        this.setHSV(MIN_Hue, MIN_HSV, MIN_HSV);
    }

    public void asRed() {
        this.setHSV(MIN_Hue, MAX_SAURATION, MAX_BRIGHTNESS);
    }

    public void asLime() {
        this.setHSV(120, MAX_SAURATION, MAX_BRIGHTNESS);
    }

    public void asBlue() {
        this.setHSV(240, MAX_SAURATION, MAX_BRIGHTNESS);
    }

    public void asYellow() {
        this.setHSV(60, MAX_SAURATION, MAX_BRIGHTNESS);
    }

    public void asCyan() {
        this.setHSV(180, MAX_SAURATION, MAX_BRIGHTNESS);
    }

    public void asMagenta() {
        this.setHSV(300, MAX_SAURATION, MAX_BRIGHTNESS);
    }

    public void asSilver() {
        this.setHSV(MIN_Hue, MIN_HSV, 0.75f);
    }

    public void asGrey() {
        this.setHSV(MIN_Hue, MIN_HSV, .5f);
    }

    public void asMaroon() {
        this.setHSV(0, MAX_SAURATION, 0.5f);
    }

    public void asOlive() {
        this.setHSV(60, MAX_SAURATION, 0.0f);
    }

    public void asGreen() {
        this.setHSV(120, MAX_SAURATION, 0.5f);
    }

    public void asPurple() {
        this.setHSV(300, MAX_SAURATION, 0.5f);
    }

    public void asTeal() {
        this.setHSV(180, MAX_SAURATION, 0.5f);
    }

    public void asNavy() {
        this.setHSV(240, MAX_SAURATION, 0.5f);
    }


    // GETTERS
    public Integer getHue() {
        return hue;
    }

    public float getSaturation() {
        return saturation;
    }

    public float getBrightness() {
        return brightness;
    }


    // SETTERS
    public void setHue(Integer hue) {
        this.hue = hue;

        this.updateObservers();
    }

    public void setSaturation(float saturation) {
        this.saturation = saturation;

        this.updateObservers();
    }

    public void setBrightness(float brightness) {
        this.brightness = brightness;

        this.updateObservers();
    }

    // Convenient setter: set H, S, V
    public void setHSV(Integer hue, float saturation, float brightness) {
        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;

        this.updateObservers();
    }

    // the model has changed!
    // broadcast the update method to all registered observers
    private void updateObservers() {
        this.setChanged();
        this.notifyObservers();
    }

}



