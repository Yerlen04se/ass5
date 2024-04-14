public class TextDataProcessor implements DataProcessor {
    @Override
    public void process(Data data) {
        // Process text data here
        System.out.println("Processing text data: " + data.getContent());
    }
}