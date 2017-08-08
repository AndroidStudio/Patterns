package patterns.module.decorator;

public class BlueText implements Text {
    @Override
    public String getText() {
        return "<font color='blue'>blue text</font>";
    }
}
