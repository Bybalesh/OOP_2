package ru.netology.OOP2;

public class Radio {

    private int radioStation;
    private int volume;

    public int getRadioStation() {    //1
        return radioStation;
    }

    public int getVolume() {  //2
        return volume;
    }

    public void setRadioStation(int newRadioStation) {  //3
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void nextRadioStation() {   //4
        if (radioStation == 9) {
            setRadioStation(0);
        } else {
            radioStation++;
        }
    }

    public void prevRadioStation() {  //5
        if (radioStation == 0) {
            setRadioStation(9);
        } else {
            radioStation--;
        }
    }

    public void setVolume(int newVolume) {  //6
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void PlusVolume() {   //7
        if (volume < 100) {
            setVolume(volume + 1);
        }
    }

    public void minusVolume() {  //8
        if (volume > 0) {
            setVolume(volume - 1);
        }
    }
}


