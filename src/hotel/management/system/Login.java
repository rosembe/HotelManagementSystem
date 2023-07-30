package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton login,cancel;
    JTextField username;
    JPasswordField pass;

    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel user = new JLabel("Username");
        user.setBounds(40,20,74,30);
        add(user);

        JLabel password = new JLabel("Password");
        password.setBounds(40,70,74,30);
        add(password);

        username = new JTextField();
        username.setBounds(150,20,150,30);
        add(username);

        pass = new JPasswordField();
        pass.setBounds(150,70,150,30);
        add(pass);

        login = new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(180,140,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon("src/icons/second.jpg");
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(350,10,200,200);
        add(image2);









        setBounds(500,200,600,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            String user = username.getText();
            String passkey= pass.getText();
            try {
                Conn c = new Conn();
                String query = "select * from login where username = '"+user+"'and password= '"+passkey+"'";
               ResultSet rs = c.s.executeQuery(query);
               if(rs.next()){
                    setVisible(false);
                    new Dashboard(passkey).setVisible(true);
               }else {
                   JOptionPane.showMessageDialog(null,"Invalid password or username");
                   setVisible(false);
               }
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==cancel){
            setVisible(false);

        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
