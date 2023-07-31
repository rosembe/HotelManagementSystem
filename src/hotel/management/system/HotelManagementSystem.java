package hotel.management.system;

import com.sun.security.auth.module.JndiLoginModule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.CookieManager;

public  class HotelManagementSystem extends JFrame implements ActionListener {

        JButton next;
        HotelManagementSystem(){
          //  setSize(1366,565);
           // setLocation(100,100);
            setBounds(100,0,1200,793);
            setLayout(null);


            ImageIcon i1 = new ImageIcon("src/icons/merit-diamond.jpg");

            JLabel image = new JLabel(i1);
            image.setBounds(0,0,1200,793);

            add(image);

            JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
            text.setBounds(30,620,900,90);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("Serif", Font.PLAIN,50));
            image.add(text);

            // Next butonu oluşturur.
            next = new JButton("NEXT");
            next.setBounds(1000,650,150,50);
            next.setForeground(Color.BLACK);
            next.setBackground(Color.LIGHT_GRAY);
            next.setFont(new Font("Serif", Font.PLAIN,24));
            next.addActionListener(this);
            image.add(next);

            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            while(true){
                text.setVisible(false);
                try {
                    Thread.sleep(500);

                }catch (Exception e){
                    e.printStackTrace();
                }
                text.setVisible(true);
                try {
                    Thread.sleep(500);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }




        }
        public void actionPerformed(ActionEvent ae ){
            if(ae.getSource()==next){
                setVisible(false);
                new Login().setVisible(true);
            }
        }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}
