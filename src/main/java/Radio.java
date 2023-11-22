public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations = 10;
    private int maxStation = numberOfStations - 1;

    public Radio() {

    }

    public Radio(int newNumberOfStations) {
        numberOfStations = newNumberOfStations;
        maxStation = numberOfStations - 1;
    }

    public void next() {
        if (currentStation < maxStation){
            currentStation ++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0){
            currentStation --;
        } else {
            currentStation = maxStation;
        }
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 && newStation <= maxStation) {
            currentStation = newStation;
        } else {
            return;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void addVolume() {
        if (currentVolume < 100) {
            currentVolume ++;
        } else {
            return;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= 100 && currentVolume > 0) {
            currentVolume --;
        } else {
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            currentVolume = newVolume;
        } else {
            return;
        }
    }
}
