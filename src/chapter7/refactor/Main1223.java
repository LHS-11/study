package chapter7.refactor;

public class Main1223 {
    public static void main(String[] args) {
        Light light = new Light();
        light.setState(new On());
        light.off_button_pushed();
        light.on_button_pushed();
    }
}
