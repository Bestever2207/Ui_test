import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    /*
    private javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    private javax.swing.JButton[] jButton = new javax.swing.JButton[9];
    public Main() {


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jPanel1.setLayout( new java.awt.GridLayout( 3, 3 ) );


        ButtonListener bl = new ButtonListener();


        for ( int i = 0; i<9; i++ ) {
            jButton[i] = new javax.swing.JButton ( "JButton" + (i+1) );
            jButton[i].addActionListener ( bl );
            jPanel1.add ( jButton[i] );
        }

        this.getContentPane().add ( jPanel1 ) ;

        pack();


    }


    class ButtonListener implements java.awt.event.ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent e) {


            for (int i=0; i<9; i++) {
                if( e.getSource() == jButton[i] ){
                    System.out.println("JButton" + (i+1) + " wurde geklickt.");
                }
            }
        }
    }


    public static void main(String args[]) {
        // Ein Objekt der Klasse erzeugen und sichtbar machen.
        new GridLayoutDemo().setVisible ( true );
    }


     */



    static JFrame frame;

    JPanel statusLine;
    JPanel pixelRaster;
    static JPanel panel;

    static JPanel panel_scrollArea;

    public static void main(String[] args)
    {
        create_Ui();
    }

    public static void create_Ui()
    {
        frame = new JFrame("WoOh");
        frame.setSize(1422,900);
        //frame.setIconImage();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground( Color.decode("#ffffff") );
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        //panel.setBounds(0,0,500,500);
        panel.setVisible(true);
        frame.add(panel);
        frame.setVisible(true);


        JPanel scrollpanel_inhalt = new JPanel();
        BoxLayout bl = new BoxLayout(scrollpanel_inhalt, BoxLayout.Y_AXIS);
        scrollpanel_inhalt.setPreferredSize(new Dimension(1133,823));
        scrollpanel_inhalt.setLayout(bl);
        scrollpanel_inhalt.setBackground(Color.decode("#ffffff"));


        JScrollPane scrollPane = new JScrollPane(scrollpanel_inhalt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(152,305,1133,500);

        scrollPane.getViewport().setBackground(Color.decode("#ffffff"));
        scrollPane.setForeground(Color.decode("#ffffff"));
        scrollPane.setBorder(null);
        scrollPane.setVisible(true);
        scrollPane.getVerticalScrollBar().setUnitIncrement(10);

        scrollPane.getVerticalScrollBar().setBackground(Color.WHITE);

        scrollpanel_inhalt.setVisible(true);
        //scrollPane.setViewportView(scrollpanel_inhalt);









        JLayeredPane btn1_panel = new JLayeredPane();

        JButton btn1 = new JButton();

        btn1.setBackground(Color.decode("#ffffff"));
        btn1.setBounds(15,15,1088,187);
        btn1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn1.setVisible(true);
        btn1.setBorder(BorderFactory.createLineBorder(Color.decode("#D4AF37")));

        JLabel name = new JLabel("Pizzeria Figio");
        name.setFont(new Font("Open Sans",Font.PLAIN, 32));
        name.setBounds(35,35,901,41);

        JLabel essensrichtung = new JLabel("italienisch");
        essensrichtung.setFont(new Font("Open Sans",Font.PLAIN, 24));
        essensrichtung.setBounds(35,94,901,18);


        btn1_panel.add(name,JLayeredPane.PALETTE_LAYER);
        btn1_panel.add(essensrichtung,JLayeredPane.PALETTE_LAYER);

        btn1_panel.add(btn1,JLayeredPane.DEFAULT_LAYER);
        btn1_panel.setVisible(true);




        JLayeredPane btn2_panel = new JLayeredPane();

        JButton btn2 = new JButton();

        btn2.setBackground(Color.decode("#ffffff"));
        btn2.setBounds(15,15,1088,187);
        btn2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn2.setVisible(true);
        btn2.setBorder(BorderFactory.createLineBorder(Color.decode("#D4AF37")));

        JLabel name2 = new JLabel("Pizzeria Figio");
        name2.setFont(new Font("Open Sans",Font.PLAIN, 32));
        name2.setBounds(35,35,901,41);

        JLabel essensrichtung2 = new JLabel("italienisch");
        essensrichtung2.setFont(new Font("Open Sans",Font.PLAIN, 24));
        essensrichtung2.setBounds(35,94,901,18);


        btn2_panel.add(name2,JLayeredPane.PALETTE_LAYER);
        btn2_panel.add(essensrichtung2,JLayeredPane.PALETTE_LAYER);

        btn2_panel.add(btn2,JLayeredPane.DEFAULT_LAYER);
        btn2_panel.setVisible(true);


        JLayeredPane btn3_panel = new JLayeredPane();

        JButton btn3 = new JButton();

        btn3.setBackground(Color.decode("#ffffff"));
        btn3.setBounds(15,15,1088,187);
        btn3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn3.setVisible(true);
        btn3.setBorder(BorderFactory.createLineBorder(Color.decode("#D4AF37")));

        JLabel name3 = new JLabel("Pizzeria Figio");
        name3.setFont(new Font("Open Sans",Font.PLAIN, 32));
        name3.setBounds(35,35,901,41);

        JLabel essensrichtung3 = new JLabel("italienisch");
        essensrichtung3.setFont(new Font("Open Sans",Font.PLAIN, 24));
        essensrichtung3.setBounds(35,94,901,18);


        btn3_panel.add(name3,JLayeredPane.PALETTE_LAYER);
        btn3_panel.add(essensrichtung3,JLayeredPane.PALETTE_LAYER);

        btn3_panel.add(btn3,JLayeredPane.DEFAULT_LAYER);
        btn3_panel.setVisible(true);



        JLayeredPane btn4_panel = new JLayeredPane();

        JButton btn4 = new JButton();

        btn4.setBackground(Color.decode("#ffffff"));
        btn4.setBounds(15,15,1088,187);
        btn4.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn4.setVisible(true);
        btn4.setBorder(BorderFactory.createLineBorder(Color.decode("#D4AF37")));

        JLabel name4 = new JLabel("Pizzeria Figio");
        name4.setFont(new Font("Open Sans",Font.PLAIN, 32));
        name4.setBounds(35,35,901,41);

        JLabel essensrichtung4 = new JLabel("italienisch");
        essensrichtung4.setFont(new Font("Open Sans",Font.PLAIN, 24));
        essensrichtung4.setBounds(35,94,901,18);


        btn4_panel.add(name4,JLayeredPane.PALETTE_LAYER);
        btn4_panel.add(essensrichtung4,JLayeredPane.PALETTE_LAYER);

        btn4_panel.add(btn4,JLayeredPane.DEFAULT_LAYER);
        btn4_panel.setVisible(true);




        scrollpanel_inhalt.add(btn1_panel);
        scrollpanel_inhalt.add(btn2_panel);
        scrollpanel_inhalt.add(btn3_panel);
        scrollpanel_inhalt.add(btn4_panel);



        panel.add(scrollPane);




        panel.validate();
        panel.repaint();
        panel.revalidate();
    }



}
