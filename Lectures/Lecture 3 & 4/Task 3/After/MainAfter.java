package After;

import java.util.ArrayList;

class MediaDevice {
    public void displayInfo() {
        System.out.println("This is a media device.");
    }
}

interface VideoRecordable {
    void recordVideo();
}

class SecurityCamera extends MediaDevice implements VideoRecordable {
    @Override
    public void recordVideo() {
        System.out.println("Security Camera is recording video.");
    }
}

class BasicSpeaker extends MediaDevice {
    public void playAudio() {
        System.out.println("Basic Speaker is playing audio.");
    }
}

public class MainAfter {
    public static void main(String[] args) {

        BasicSpeaker speaker = new BasicSpeaker();
        speaker.playAudio();

        SecurityCamera camera1 = new SecurityCamera();
        SecurityCamera camera2 = new SecurityCamera();

        ArrayList<VideoRecordable> devices = new ArrayList<>();

        devices.add(camera1);
        devices.add(camera2);

        for (VideoRecordable device : devices) {
            device.recordVideo();
        }
    }
}