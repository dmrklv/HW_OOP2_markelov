import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //vybor radio
    @Test
    public void setRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //valid max
    @Test
    public void setMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //valid 0
    @Test
    public void setMinRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //- vyshe limita ne valid
    @Test
    public void notSetAboveMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //+ pered limitom valid
    @Test
    public void setBeforeMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //-- limit
    @Test
    public void setAboveMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //- nizhe limita
    @Test
    public void notSetBeforeMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //+ stancia
    @Test
    public void setNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.nextRadioStation();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //- stancia
    @Test
    public void setPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.prevRadioStation();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // validniy -zvuk
    @Test
    public void downValidVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        volume.downVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //zvuk + valid
    @Test
    public void increaseValidVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        volume.increaseVolume();

        int expected = 51;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // - s max limita
    @Test
    public void downMaxLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        volume.downVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //valid maximalnaya gromkost
    @Test
    public void increaseMaxLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //- nizhe limita
    @Test
    public void downMinLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.downVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //+ gromkost s min
    @Test
    public void increaseMinLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //- gromkost s pre limita valid
    @Test
    public void downBeforeMaxLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);
        volume.downVolume();

        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //+ do limita valid
    @Test
    public void increaseBeforeMaxLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //valid zvuk 0
    @Test
    public void downAboveMinLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);
        volume.downVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //+ zvuk s 1 granica valid
    @Test
    public void increaseAboveMinLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);
        volume.increaseVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //limit ++ vyshe granicy ne valid
    @Test
    public void notSetAboveMaxLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //- otric limit -- ne valid
    @Test
    public void notSetBeforeMinLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //++ limit vyshe 9 stancii ne valid
    @Test
    public void setNextMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //- s max limita
    @Test
    public void setPrevMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //s 0 minmalnaya valid
    @Test
    public void setNextMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //min -stanciya vozvrat na max limit s minimuma
    @Test
    public void setPrevMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //+max sled
    @Test
    public void setNextBeforeMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //- pered limitom
    @Test
    public void setPrevBeforeMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.prevRadioStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // sled s min stancii
    @Test
    public void setNextAboveMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.nextRadioStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // pred s 1 limit
    @Test
    public void setPrevAboveMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}