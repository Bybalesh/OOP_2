package ru.netology.OOP2;

public class Radio {
    private int radioStation; //значение 0
    private int totalRadio = 10;
    private int minRadio; // значение 0
    private int maxRadio = 9;
    private int volume; //значение 0
    private int minVolume; // значение 0
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int totalRadio) {
        this.totalRadio = totalRadio;
        this.maxRadio = this.totalRadio - 1;
    }

    public int getTotalRadio() {
        return totalRadio;
    }

    public int getMinRadio() {
        return minRadio;
    }

    public int getMaxRadio() {
        return maxRadio;
    }

    public int getRadioStation() {    //1
        return radioStation;
    }

    public int getVolume() {  //2
        return volume;
    }

    public void setRadioStation(int newRadioStation) {  //3
        if (newRadioStation < getMinRadio()) {
            return;
        }
        if (newRadioStation > getMaxRadio()) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void nextRadioStation() {   //4
        if (radioStation == getMaxRadio()) {
            setRadioStation(getMinRadio());
        } else {
            radioStation++;
        }
    }

    public void prevRadioStation() {  //5
        if (radioStation == getMinRadio()) {
            setRadioStation(getMaxRadio());
        } else {
            radioStation--;
        }
    }

    public void setVolume(int newVolume) {  //6
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void PlusVolume() {   //7
        if (volume < maxVolume) {
            setVolume(volume + 1);
        }
    }

    public void minusVolume() {  //8
        if (volume > minVolume) {
            setVolume(volume - 1);
        }
    }
}


