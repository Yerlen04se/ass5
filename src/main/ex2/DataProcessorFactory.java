public class DataProcessorFactory {
    public static DataProcessor createProcessor(String dataType) {
        switch (dataType) {
            case "text":
                return new TextDataProcessor();
            case "audio":
                return new AudioDataProcessor();
            case "video":
                return new VideoDataProcessor();
            default:
                throw new IllegalArgumentException("Unsupported data type: " + dataType);
        }
    }
}