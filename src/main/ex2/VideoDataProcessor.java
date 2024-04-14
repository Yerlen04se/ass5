public class VideoDataProcessor implements DataProcessor {
    @Override
    public void process(Data data) {
        // Process video data here
        System.out.println("Processing video data: " + data.getContent());
    }
}