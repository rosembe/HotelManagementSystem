package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    String passkey;
    JMenuItem addRooms,addDrivers,addEmployee;
    Dashboard(String passkey){
        this.passkey=passkey;

        setBounds(0,0,1300,700);
        setLayout(null);
        ImageIcon i1 = new ImageIcon("src/icons/meritgood.jpg");
        Image i2 = i1.getImage().getScaledInstance(1300,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1300,700);
        add(image);

        JLabel text = new JLabel("THE MERIT GROUP WELCOMES YOU");
        text.setBounds(280,80,1000,50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma",Font.PLAIN,46));
        image.add(text);

        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);

        JMenu hotelManagement = new JMenu("Hotel Management");
        hotelManagement.setForeground(Color.RED);
        mb.add(hotelManagement);

        JMenuItem reception = new JMenuItem("Reception");
        hotelManagement.add(reception);


        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);

        addEmployee = new JMenuItem("Add Employee");
        admin.add(addEmployee);

        addRooms = new JMenuItem("Add Rooms");
        admin.add(addRooms);

        addDrivers = new JMenuItem("Add Drivers");
        admin.add(addDrivers);


        setVisible(true);
    }
    public static void main(String[] args) {
        new Dashboard("");
    }
}
