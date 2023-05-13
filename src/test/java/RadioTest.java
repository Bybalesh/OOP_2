import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.OOP2.Radio;

public class RadioTest {

    @Test //уст. номера радио
    public void setRadioStationTest() {
        Radio radio = new Radio();
        radio.setRadioStation(1);
        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test//установка выше 9
    public void setRadioStationWr() {
        Radio radio = new Radio();
        radio.setRadioStation(12);
        int expexted = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expexted, actual);
    } @Test//установка ниже 0
    public void setRadioStationFl() {
        Radio radio = new Radio();
        radio.setRadioStation(-2);
        int expexted = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expexted, actual);
    }

    @Test//перекл. с 9 вперед
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test//след. радио
    public void nextRadioStationOnes() {
        Radio radio = new Radio();
        radio.setRadioStation(2);
        radio.nextRadioStation();
        int expected = 3;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test//переключ. с 0 назад
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test//предыдущ. радио
    public void prevRadioStationOnes() {
        Radio radio = new Radio();
        radio.setRadioStation(8);
        radio.prevRadioStation();
        int expected = 7;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test//установ. любой ур-нь громкости
    public void setVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(73);
        int expected = 73;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test//установка ниже 0
    public void setVolumeTestWr() {
        Radio radio = new Radio();
        radio.setVolume(-2);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test//установка выше 100
    public void setVolumeTestFl() {
        Radio radio = new Radio();
        radio.setVolume(135);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test//увеличение на 1
    public void plusVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(29);
        radio.PlusVolume();
        int expected = 30;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test//выше 100 нельзя
    public void plusVolumeTestOnes() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.PlusVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test//уменьшение на 1
    public void minusVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(29);
        radio.minusVolume();
        int expected = 28;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test//ниже 0 нельзя
    public void minusVolumeTestOnes() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}

