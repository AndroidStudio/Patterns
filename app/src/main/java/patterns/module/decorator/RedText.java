package patterns.module.decorator;

class RedText implements Text {

    @Override
    public String getText() {
        return "<font color='red'>red text</font>";
    }

}
