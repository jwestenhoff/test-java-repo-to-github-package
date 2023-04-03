package test;

public class TestModel {
    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        TestModel testModel = new TestModel();
    }

    public void printStuff() {
        System.out.println("Stuff!!");
    }
}
