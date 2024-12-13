
package Doctor.online.appointment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Hpaymenting extends JFrame implements ActionListener{
    JTextField nameTextField,numberTextField,cvvnumberTextField,dateTextField,feeTextField,phoneTextField,otpTextField;
    JButton submit,exit,clear;
    Hpaymenting(){
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
        
         JLabel form= new JLabel("Payment Details");
        form.setFont(new Font("Raleway",Font.BOLD,37));
        form.setBounds(280,20,790,50);
        add(form);
        
        JLabel name = new JLabel("CardHolder Name:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,130,350,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        nameTextField.setBounds(300,130,350,30);
        add(nameTextField);
        
        JLabel number = new JLabel("Card Number:");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(100,190,350,30);
        add(number);
        
        numberTextField = new JTextField();
        numberTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        numberTextField.setBounds(300,190,350,30);
        add(numberTextField);
        
        JLabel cvvnumber = new JLabel("Cvv Number:");
        cvvnumber.setFont(new Font("Raleway",Font.BOLD,22));
        cvvnumber.setBounds(100,250,350,30);
        add(cvvnumber);
        
        cvvnumberTextField = new JTextField();
        cvvnumberTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        cvvnumberTextField.setBounds(300,250,350,30);
        add(cvvnumberTextField);
        
        JLabel date = new JLabel("CardeExpiry Date:");
        date.setFont(new Font("Raleway",Font.BOLD,22));
        date.setBounds(100,310,350,30);
        add(date);
        
        dateTextField = new JTextField();
        dateTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        dateTextField.setBounds(300,310,350,30);
        add(dateTextField);
        
        JLabel fee = new JLabel("Fee Payment:");
        fee.setFont(new Font("Raleway",Font.BOLD,22));
        fee.setBounds(100,370,350,30);
        add(fee);
        
        feeTextField = new JTextField();
        feeTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        feeTextField.setBounds(300,370,350,30);
        add(feeTextField);
        
        JLabel phone= new JLabel("Phone Number:");
        phone.setFont(new Font("Raleway",Font.BOLD,22));
        phone.setBounds(100,430,350,30);
        add(phone);
        
        phoneTextField = new JTextField();
        phoneTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        phoneTextField.setBounds(300,430,350,30);
        add(phoneTextField);
        
        JLabel otp= new JLabel("Enter OTP:");
        otp.setFont(new Font("Raleway",Font.BOLD,22));
        otp.setBounds(100,490,350,30);
        add(otp);
        
        otpTextField = new JTextField();
        otpTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        otpTextField.setBounds(300,490,350,30);
        add(otpTextField);
        
         submit = new JButton("Submit");
         submit.setBackground(Color.GREEN);
         submit.setForeground(Color.WHITE);
         submit.setFont(new Font("Raleway",Font.BOLD,14));
         submit.setBounds(200,600,100,30);
         submit.addActionListener( this);
         add(submit);
         
         exit = new JButton("Exit");
         exit.setBackground(Color.RED);
         exit.setForeground(Color.WHITE);
         exit.setFont(new Font("Raleway",Font.BOLD,14));
         exit.setBounds(340,600,100,30);
         exit.addActionListener( this);
         add(exit);
         clear = new JButton("CLEAR");
         clear.setBackground(Color.RED);
         clear.setForeground(Color.WHITE);
         clear.setFont(new Font("Raleway",Font.BOLD,14));
         clear.setBounds(490,600,100,30);
         clear.addActionListener(this);
         add(clear);

        
        
        getContentPane().setBackground(Color.PINK);
        setSize(850,750);
        setLocation(350,10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
             System.exit(1);
          }
        if(ae.getSource()==clear){
            nameTextField.setText("");
            cvvnumberTextField.setText("");
            dateTextField.setText("");
            feeTextField.setText("");
            phoneTextField.setText("");
            otpTextField.setText("");
        }
           String name = nameTextField.getText();
           String number = numberTextField.getText();
           String cvvnumber = cvvnumberTextField.getText();
           String date = dateTextField.getText();
           String fee = feeTextField.getText();
           String phone = phoneTextField.getText();
           String otp = otpTextField.getText();
           
           try{
            Hospitalconn hc = new Hospitalconn();
                 String query = "insert into hospitalpayment value('"+name+"'.'"+number+"'.'"+cvvnumber+"','"+date+"','"+fee+"','"+phone+"','"+otp+"')";
     }catch(Exception e){
             System.out.println(e);
    }
    }

        public static void main(String args[]) {
            new Hpaymenting();
        
    }
}
