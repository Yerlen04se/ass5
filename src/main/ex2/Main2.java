public class Main2 {
    public static void main(String[] args) {
        Data data = new Data("text", "Hello, world!");
        DataProcessor processor = DataProcessorFactory.createProcessor(data.getType());
        processor.process(data);
    }
}
