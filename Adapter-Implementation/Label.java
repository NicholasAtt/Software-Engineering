public class Label implements ILabel {
    private LabelServer ls;
    private String p;

    public Label(String prefix) {
        p = prefix;
    }

    public String getNextLabel() {
        if (ls == null)
            ls = new LabelServer(p);
        return ls.serveNextLabel();
    }
}