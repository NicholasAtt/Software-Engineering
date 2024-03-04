public class LabelServer { // Adaptee
    private int labelNum = 1;
    private String labelPrefix;

    public LabelServer(String prefix) {
        labelPrefix = prefix;
    }

    public String serveNextLabel() {
        return labelPrefix + labelNum++;
    }
}