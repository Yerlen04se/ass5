public class AudioDataProcessor implements DataProcessor {
    @Override
    public void process(Data data) {
        // Process audio data here
        System.out.println("Processing audio data: " + data.getContent());
    }
}