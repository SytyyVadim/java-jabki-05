public class TV {
    private int volume;
    private int currentChannel;

    public TV() {
        this.volume = 1;
        this.currentChannel = 1;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Громкость должна быть от 0 до 100.");
        }
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= 1 && currentChannel <= 50) {
            this.currentChannel = currentChannel;
        } else {
            System.out.println("Канал должен быть от 1 до 50.");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public int getCurrentChannel() {
        return this.currentChannel;
    }

    public void nextChannel() {
        if (this.currentChannel < 50) {
            this.currentChannel++;
        } else {
            this.currentChannel = 1;
        }
    }
}
