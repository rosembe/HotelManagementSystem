package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class AddRooms  extends JFrame {

    String passkey;
    AddRooms(String passkey){
        this.passkey=passkey;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(320,200,940,470);

        JLabel heading = new JLabel("Add Rooms");
        heading.setBounds(150,20,300,50);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Tahoma",Font.BOLD,18));
        add(heading);


        JLabel lbroomno= new JLabel("Room Number");
        lbroomno.setBounds(50,90,130,30);
        lbroomno.setFont(new Font("Tahoma",Font.PLAIN,18));
        lbroomno.setForeground(Color.BLACK);
        add(lbroomno);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new AddRooms("");
    }
}
