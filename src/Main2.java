import javax.swing.*;

public class Main2 {

    public static void main(String[] argv) {
        JFrame frame = new JFrame();

        frame.add(new JScrollPaneDemo());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
