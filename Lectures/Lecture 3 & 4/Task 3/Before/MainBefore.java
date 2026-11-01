class MediaDevice {
    public void recordVideo() {
        System.out.println("Recording video...");
    }
}

class BasicSpeaker extends MediaDevice {
    @Override
    public void recordVideo() {
        throw new UnsupportedOperationException("Speaker cannot record video.");
    }
}

public class MainBefore {
    public static void main(String[] args) {

        MediaDevice device = new BasicSpeaker();

        device.recordVideo();
    }
}