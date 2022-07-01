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
        frame.add(panel);
        frame.setVisible(true);

        JPanel container = new JPanel();
        BoxLayout bl = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(bl);



        JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(152,305,1118,500);
        scrollPane.getViewport().setBackground(Color.decode("#ffffff"));
        scrollPane.setForeground(Color.decode("#ffffff"));
        scrollPane.setBorder(null);
        scrollPane.setVisible(true);

        JButton btn1 = new JButton("Button 1");
        btn1.setBackground(Color.decode("#D4AF37"));
        btn1.setMaximumSize(new Dimension(1092, 187));
        btn1.setPreferredSize(new Dimension(1092,187));
        btn1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn1.setVisible(true);

        JPanel btn1_panel = new JPanel();
        //btn1_panel.setLayout(null);
        /*
        JLabel name = new JLabel("Pizzeria");
        name.setFont(new Font("Open Sans",Font.PLAIN, 32));
        name.setBounds(192,340,901,54);



        btn1_panel.add(name,JLayeredPane.PALETTE_LAYER);

         */


        btn1_panel.add(btn1,JLayeredPane.DEFAULT_LAYER);
        btn1_panel.setVisible(true);
        //btn1_panel.setBounds(0,0,1092, 187);

        container.add(btn1_panel);




        container.setVisible(true);
        //container.setAlignmentX(Component.CENTER_ALIGNMENT);
        scrollPane.setViewportView(container);
        panel.add(scrollPane);

        panel.validate();
        panel.repaint();
        panel.revalidate();
    }



}
