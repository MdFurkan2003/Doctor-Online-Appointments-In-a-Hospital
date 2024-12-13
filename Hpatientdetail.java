
package Doctor.online.appointment;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Hpatientdetail extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField,MnameTextField,phonenoTextField,userTextField,passwordTextField;
    JButton submit,exit;
    JRadioButton male,female;
    JDateChooser dateChooser;
    Hpatientdetail(){
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L)+1000L);
        setTitle("APOLLO HOSPITALS GROUPS ");
        //setLayout(null);
        setLayout(null);
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/app.png"));
        Image i2 = i1.getImage().getScaledInstance(200,160,Image.SCALE_DEFAULT);
       //Image.setFont(new Font("RALEWAY",Font.BOLD,14));
        ImageIcon i3 =new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(90,10,170,100);
        add(label);
        
        JLabel formno = new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(280,20,780,40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1:Pateint Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,24));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        JLabel name = new JLabel("Pateint Name:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,130,200,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        nameTextField.setBounds(300,130,400,30);
        add(nameTextField);
        
        JLabel date = new JLabel(" Pateint Date Of Births:");
        date.setFont(new Font("Raleway",Font.BOLD,22));
        date.setBounds(50,172,400,30);
        add(date);
        
         
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,172,400,30);
        dateChooser.setForeground(new Color(105,200,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Patient Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(95,223,200,30);
        add(gender);
        
        male =new JRadioButton("Male");
        male.setBounds(300,223,100,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female =new JRadioButton("Female");
        female.setBounds(450,223,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup =new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel fname = new JLabel(" Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(95,270,200,30);
        add(fname);
        
         fnameTextField = new JTextField();
         fnameTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
         fnameTextField.setBounds(300,270,400,30);
         add(fnameTextField);
        
         JLabel Mname = new JLabel(" Mother Name:");
         Mname.setFont(new Font("Raleway",Font.BOLD,22));
         Mname.setBounds(95,315,200,30);
         add(Mname);
        
         MnameTextField = new JTextField();
         MnameTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
         MnameTextField.setBounds(300,315,400,30);
         add(MnameTextField);
        
         JLabel phoneno = new JLabel(" Mobile NO:");
         phoneno.setFont(new Font("Raleway",Font.BOLD,22));
         phoneno.setBounds(100,360,200,30);
         add(phoneno);
         
         phonenoTextField = new JTextField();
         phonenoTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
         phonenoTextField.setBounds(300,360,400,30);
         add(phonenoTextField);
         
        
        
         JLabel email = new JLabel("Email Address:");
         email.setFont(new Font("Raleway",Font.BOLD,22));
         email.setBounds(100,410,200,30);
         add(email);
        
         emailTextField = new JTextField();
         emailTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
         emailTextField.setBounds(300,410,400,30);
         add(emailTextField);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,460,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        addressTextField.setBounds(300,460,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,505,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        cityTextField.setBounds(300,505,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,552,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        stateTextField.setBounds(300,552,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,595,200,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        pincodeTextField.setBounds(300,595,400,30);
        add(pincodeTextField);
        
        JLabel user = new JLabel("Create user-id:");
        user.setFont(new Font("Raleway",Font.BOLD,22));
        user.setBounds(100,640,200,30);
        add(user);
        
        userTextField = new JTextField();
        userTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        userTextField.setBounds(300,640,400,30);
        add(userTextField);
        
        JLabel password = new JLabel("Create password:");
        password.setFont(new Font("Raleway",Font.BOLD,22));
        password.setBounds(100,690,200,30);
        add(password);
        
        passwordTextField = new JTextField();
        passwordTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        passwordTextField.setBounds(300,690,400,30);
        add(passwordTextField);
        
        ///next = new JButton("Next");
       ///next.setBackground(Color.BLUE);
        ///next.setForeground(Color.WHITE);
        //next.setFont(new Font("Raleway",Font.BOLD ,14));
        //next.setBounds(620,720,80,30);
        //next.addActionListener(this);
        //add(next);
         submit = new JButton("Submit");
         submit.setBackground(Color.GREEN);
         submit.setForeground(Color.WHITE);
         submit.setFont(new Font("Raleway",Font.BOLD,14));
         submit.setBounds(450,740,100,30);
         submit.addActionListener(this);
         add(submit);
         
         exit = new JButton("Exit");
         exit.setBackground(Color.RED);
         exit.setForeground(Color.WHITE);
         exit.setFont(new Font("Raleway",Font.BOLD,14));
         exit.setBounds(620,740,100,30);
         exit.addActionListener(this);
         add(exit);
        
        getContentPane().setBackground(Color.PINK);
        setSize(1100,900);
        setLocation(350,10);
        setVisible(true);


        
    }
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==exit){
             System.exit(0);
         }
         String formno = ""+ random;
         String name = nameTextField.getText();
         String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
         String fname = fnameTextField.getText();
         String Mname = MnameTextField.getText();
         String phoneno = phonenoTextField.getText();
         String gender = null;
         if(male.isSelected()){
         gender = "Male";
     }else if(female.isSelected()){
         gender = "female";
       }
         String email = emailTextField.getText();
         String address = addressTextField.getText();
         String city = cityTextField.getText();
         String state = stateTextField.getText();
         String pin = pincodeTextField.getText();
         String user = userTextField.getText();
         String password = passwordTextField.getText();
         
         
         try{
             if (name.equals("")){
                 JOptionPane.showMessageDialog(null,"all detail are required");
                 

                     //if(name.equals("")){
                      //JOptionPane.showMessageDialog(null,"Registration Sucessfull");  
                      //setVisible(false);
                       //new Hospitallogin().setVisible(true);
                    // }
                 
             }else{
                 Hospitalconn hc = new Hospitalconn();
                 String query = "insert into hospitalpatient1 values('"+formno+"','"+name+"','"+dob+"','"+gender+"','"+fname+"','"+Mname+"','"+phoneno+"','"+email+"','"+address+"','"+city+"','"+state+"','"+pin+"','"+user+"','"+password+"')";
                 hc.s.executeUpdate(query);
                 
                 JOptionPane.showMessageDialog(null,"Registration Sucessfull");
               //setVisible(false);
                //new Hdoctordetail(formno).setVisible(true);
              
             }
             
         }catch(Exception e){
             System.out.println(e);
         }
     }

     
    
    public static void main(String args[]) {
        new Hpatientdetail();
    }
}
