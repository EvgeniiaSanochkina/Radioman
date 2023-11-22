import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchStationToNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetNumberOfStationsAndSwitchToNext() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(33);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 34;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetNumberOfStationsAndSwitchToPrev() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(33);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 32;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetNumberOfStationsAndSwitchFromMaxToNext() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(34);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetNumberOfStationsAndSwitchFromMinToPrev() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 34;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSwitchStationToNextIfStationDoesNotExist() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSwitchStationToNextIfStationDoesNotExist2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSwitchStationToNextZeroIfCurrentNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSwitchStationToPrev(){
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSwitchStationToPrevNineIfCurrentZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldAddVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.addVolume();
        int actual = radio.getCurrentVolume();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotAddVolumeIfCurVolumeIsMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.addVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotReduceVolumeIfVolumeIsOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotReduceVolumeIfVolumeIsLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotReduceVolumeIfCurVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

   /* @Test
    public void shouldNotReduceVolumeIfCurVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }*/
}
