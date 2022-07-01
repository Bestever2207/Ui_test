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


        JPanel container = new JPanel();
        BoxLayout bl = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(bl);
        container.setBackground(Color.decode("#ffffff"));



        JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(152,305,1133,500);
        scrollPane.getViewport().setBackground(Color.decode("#ffffff"));
        scrollPane.setForeground(Color.decode("#ffffff"));
        scrollPane.setBorder(null);
        scrollPane.setVisible(true);
        scrollPane.getVerticalScrollBar().setBackground(Color.WHITE);

        JButton btn1 = new JButton();
        btn1.setBackground(Color.decode("#ffffff"));

        btn1.setBounds(15,15,1088,187);
        btn1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn1.setVisible(true);
        btn1.setBorder(BorderFactory.createLineBorder(Color.decode("#D4AF37")));

        JLayeredPane btn1_panel = new JLayeredPane();



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

        container.add(btn1_panel);




        container.setVisible(true);
        scrollPane.setViewportView(container);
        panel.add(scrollPane);




        panel.validate();
        panel.repaint();
        panel.revalidate();
    }



}
