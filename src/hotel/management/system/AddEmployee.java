package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField nameTextField,ageTextField,salaryTextField,phoneTextField,emailTextField,identityTextField;
    JRadioButton female,male;
    JButton submit;
    JComboBox dbjob;
    String passkey;
    AddEmployee(String passkey){
        this.passkey=passkey;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblname = new JLabel("NAME");
        lblname.setBounds(60,30,120,30);
        lblname.setForeground(Color.BLACK);
        lblname.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblname);

        nameTextField = new JTextField();
        nameTextField.setBounds(180,30,150,30);
        add(nameTextField);

        JLabel lbage = new JLabel("AGE");
        lbage.setBounds(60,80,120,30);
        lbage.setForeground(Color.BLACK);
        lbage.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lbage);

        ageTextField = new JTextField();
        ageTextField.setBounds(180,80,150,30);
        add(ageTextField);

        JLabel lbgender = new JLabel("GENDER");
        lbgender.setBounds(60,130,120,30);
        lbgender.setForeground(Color.BLACK);
        lbgender.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lbgender);

        male = new JRadioButton("Male");
        male.setBounds(180,130,70,30);
        male.setBackground(Color.WHITE);
        male.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(260,130,70,30);
        female.setBackground(Color.WHITE);
        female.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(female);

        ButtonGroup genderstatus = new ButtonGroup();
        genderstatus.add(male);
        genderstatus.add(female);


        JLabel lbjob = new JLabel("JOB");
        lbjob.setBounds(60,180,120,30);
        lbjob.setForeground(Color.BLACK);
        lbjob.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lbjob);


        String str[]={"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Chefs","Waiter/Waitress","Manager","Accountant"};
        dbjob =  new JComboBox(str);
        dbjob.setBounds(180,180,150,30);
        dbjob.setBackground(Color.WHITE);
        add(dbjob);

        JLabel lbsalary = new JLabel("SALARY");
        lbsalary.setBounds(60,230,120,30);
        lbsalary.setForeground(Color.BLACK);
        lbsalary.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lbsalary);

        salaryTextField = new JTextField();
        salaryTextField.setBounds(180,230,150,30);
        add(salaryTextField);

        JLabel lbphone = new JLabel("PHONE");
        lbphone.setBounds(60,280,120,30);
        lbphone.setForeground(Color.BLACK);
        lbphone.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lbphone);

        phoneTextField = new JTextField();
        phoneTextField.setBounds(180,280,150,30);
        add(phoneTextField);

        JLabel lbemail = new JLabel("EMAIL");
        lbemail.setBounds(60,330,120,30);
        lbemail.setForeground(Color.BLACK);
        lbemail.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lbemail);

        emailTextField = new JTextField();
        emailTextField.setBounds(180,330,150,30);
        add(emailTextField);

        JLabel lbidentity = new JLabel("IDENDITY NO");
        lbidentity.setBounds(60,380,120,30);
        lbidentity.setForeground(Color.BLACK);
        lbidentity.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lbidentity);

        identityTextField = new JTextField();
        identityTextField.setBounds(180,380,150,30);
        add(identityTextField);

        submit = new JButton("Submit");
        submit.setBounds(180,430,150,35);
        submit.setBackground(Color.BLACK);
        submit.setFont(new Font("Tahoma",Font.PLAIN,17));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        ImageIcon i1 = new ImageIcon("src/icons/tenth.jpg");
        Image i2 = i1.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380,60,450,370);
        add(image);




        setBounds(350,200,850,540);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae){
        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String salary = salaryTextField.getText();
        String phone= phoneTextField.getText();
        String email = emailTextField.getText();
        String identity = identityTextField.getText();

        String gender = null ;
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name should not be empty");
            return;
        }
       if(male.isSelected()){
           gender = "Male";
       }else if(female.isSelected()){
           gender = "Female";
       }
        String job = (String)dbjob.getSelectedItem();

       try {
           Conn c = new Conn();
           String query ="Insert into employees value ('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+identity+"')";

           c.s.executeUpdate(query);

           JOptionPane.showMessageDialog(null,"Employee added succesfully.");
           setVisible(false);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    public static void main(String[] args) {
        new AddEmployee("");
    }

}
