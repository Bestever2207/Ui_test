import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

class JScrollPaneDemo extends JPanel {

    public JScrollPaneDemo() {
        try {/* w   ww    .d  e    m  o 2   s.  c   o  m */
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    makeGUI();
                }
            });
        } catch (Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }

    private void makeGUI() {

        // Add 400 buttons to a panel.
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20, 20));
        int b = 0;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                jp.add(new JButton("Button " + b));
                ++b;
            }
        }
        // Create the scroll pane.
        JScrollPane jsp = new JScrollPane(jp);

        // Add the scroll pane to the content pane.
        // Because the default border layout is used,
        // the scroll pane will be added to the center.
        add(jsp, BorderLayout.CENTER);
    }
}


