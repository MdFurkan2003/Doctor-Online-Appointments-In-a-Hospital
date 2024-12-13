
package Doctor.online.appointment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Hospitallogin extends JFrame implements ActionListener{
    JButton login,clear,signup;
    JTextField userTextField;
    JPasswordField pinTextField;
    Hospitallogin(){
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
        
        JLabel text = new JLabel("WELCOME TO APOLLO HOSPITALS GROUPS");
        text.setFont(new Font("RALEWAY",Font.BOLD,38));
        text.setBounds(280,50,860,40);
        text.setBackground(Color.GREEN);
        add(text);
        
        JLabel username = new JLabel("User ID");
         username.setFont(new Font("RALEWAY",Font.BOLD,25));
         username.setBounds(120,150,190,30);
        add( username);
        
         userTextField =new JTextField();
        userTextField.setBounds(300,150,240,30);
        userTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(userTextField);
        
        
        JLabel pin = new JLabel("Password");
        pin.setFont(new Font("osward",Font.BOLD,25));
        pin.setBounds(120,220,250,30); 
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
         login = new JButton("SIGN IN");
        login.setBounds(200,300,100,30);
        login.setBackground(Color.BLUE);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.GREEN);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
         signup = new JButton("NEW REGISTER");
        signup.setBounds(260,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        getContentPane().setBackground(Color.PINK);
        setSize(1150,600);
        setVisible(true);
        setLocation(400,200);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            userTextField.setText("");
            pinTextField.setText("");
            
        }else if(ae.getSource()==login){
             Hospitalconn hc = new Hospitalconn();
            String username = userTextField.getText();
            String password = pinTextField.getText();
            String query = "select *from hospitalpatient1 where users ='"+username+"'and passwords = '"+password+"'"; 
            try{
                ResultSet rs = hc.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Hdoctordetail().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect user name or Password");
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
        }else if(ae.getSource()==signup){
            setVisible(false);
            new Hpatientdetail().setVisible(true);
            
        }
        
    }
    public static void main(String args[]) {
        new Hospitallogin();
    }
}
