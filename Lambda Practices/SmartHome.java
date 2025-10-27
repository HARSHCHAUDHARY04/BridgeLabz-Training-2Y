// Functional Interface
interface LightPattern {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {
        LightPattern motionTrigger = () -> System.out.println("Activating security lights (high brightness).");
        LightPattern timeTrigger = () -> System.out.println("Activating evening ambient lights (warm, low brightness).");
        LightPattern voiceTrigger = () -> System.out.println("Activating party mode (color cycle).");

        System.out.println("Motion detected:");
        motionTrigger.activate();

        System.out.println("\nTime is 7:00 PM:");
        timeTrigger.activate();
        
        System.out.println("\nVoice command 'Party Time':");
        voiceTrigger.activate();
    }
}