
package Doctor.online.appointment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hdoctordetail extends JFrame implements ActionListener {
    JTextField nameTextField ,ageTextField,patientTextField ,stateTextField ,pincodeTextField;
    //JButton next;
    //JRadioButton syes,sno,eyes,eno;
    JComboBox doctor,departement,checkup,amount,Appointment,Time;
     //String password;
     JButton submit,clear;
    Hdoctordetail(){   
         //this.password = password; 
         ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/app.png"));
       Image i2 = i1.getImage().getScaledInstance(200,160,Image.SCALE_DEFAULT);
       //Image.setFont(new Font("RALEWAY",Font.BOLD,14));
       ImageIcon i3 =new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(85,10,170,100);
        add(label);
         
        JLabel form= new JLabel("Doctor Appointment Details");
        form.setFont(new Font("Raleway",Font.BOLD,38));
        form.setBounds(280,20,780,40);
        add(form);
        
        
        setLayout(null);
        setTitle("APPOLO HOSPITALS GROUPS FORM PAGE-2"); 
        
        JLabel additionalDetails = new JLabel("Page 2: Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,24));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel  Doctor = new JLabel("Doctor Name:");
       Doctor.setFont(new Font("Raleway",Font.BOLD,22));
        Doctor.setBounds(82,140,150,30);
        add(Doctor);
        
        String valDoctor[] = {"NULL","Vinit Kumar(CC)","Mukhti Kanta Senapati(RC)","Kumar Vijay Anand(NS)","Ujjwal Sinha(O)","Kailash Mohity(IMT)"};
        doctor = new JComboBox(valDoctor);
        doctor.setBounds(325,140,400,30);
        doctor.setBackground(Color.WHITE);
        add(doctor);
        
        
        JLabel Departement = new JLabel("Doctor Departement:");
       Departement.setFont(new Font("Raleway",Font.BOLD,22));
       Departement.setBounds(82,190,250,30);
        add(Departement);
        
        String valdepartement[] = {"NULL","Cardiac Care","Renal Care","Neurosciences","Orthopaedics","Internal Medicine Team"};
        departement = new JComboBox(valdepartement);
        departement.setBounds(325,190,400,30);
        departement.setBackground(Color.WHITE);
        add(departement);
        
        JLabel time = new JLabel("Appointment Time:");
        time.setFont(new Font("Raleway",Font.BOLD,22));
        time.setBounds(82,240,260,30);
        add(time);
        
       String valAppointments[] = {"NULL","09am-11am","11am-12pm","1:30pm-03pm","03pm-05pm","04pm-06pm"};
       Time = new JComboBox(valAppointments);
       Time.setBounds(325,240,400,30);
       Time.setBackground(Color.WHITE);
        add(Time);
        
  
        JLabel day = new JLabel("Appointment Day:");
        day.setFont(new Font("Raleway",Font.BOLD,22));
        day.setBounds(82,290,200,30);
        add(day);
        
       String Appointmentday[] = {"NULL","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Appointment= new JComboBox(Appointmentday);
       Appointment.setBounds(325,290,400,30);
       Appointment.setBackground(Color.WHITE);
        add(Appointment); 
        
        //JLabel email = new JLabel("Qualification:");
        //email.setFont(new Font("Raleway",Font.BOLD,22));
        //email.setBounds(100,315,200,30);
        //add(email);
        
       JLabel report = new JLabel("Report Checkup Time:");
        report.setFont(new Font("Raleway",Font.BOLD,22));
        report.setBounds(82,340,250,30);
        add(report);
        
       String Checkuptime[] = {"NULL","12pm-01pm","04:30pm-05:30pm"};
       checkup = new JComboBox(Checkuptime);
       checkup.setBounds(325,340,400,30);
       checkup.setBackground(Color.WHITE);
        add(checkup); 
        
        JLabel fee = new JLabel("Appointment Fee:");
        fee.setFont(new Font("Raleway",Font.BOLD,22));
        fee.setBounds(82,390,250,30);
        add(fee);
        
       String amountValue[] = {"NULL","600","700","750","800","850"};
       amount = new JComboBox(amountValue);
       amount.setBounds(325,390,400,30);
       amount.setBackground(Color.WHITE);
        add(amount); 
       
        JLabel name = new JLabel("Patient Name:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(82,440,250,30);
        add(name);
        
        nameTextField  = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14 ));
        nameTextField.setBounds(325,440,400,30);
        add(nameTextField );
        
        JLabel age = new JLabel("Patient Age:");
        age.setFont(new Font("Raleway",Font.BOLD,22));
        age.setBounds(82,490,250,30);
        add(age);
        
        ageTextField = new JTextField();
        ageTextField .setFont(new Font("Raleway",Font.BOLD,14 ));
        ageTextField .setBounds(325,490,400,30);
        add(ageTextField );
        
         
        
         submit = new JButton("Submit and pay");
         submit.setBackground(Color.GREEN);
         submit.setForeground(Color.WHITE);
         submit.setFont(new Font("Raleway",Font.BOLD,14));
         submit.setBounds(250,560,150,30);
         submit.addActionListener(this);
         add(submit);
         
         clear = new JButton("CLEAR");
         clear.setBackground(Color.RED);
         clear.setForeground(Color.WHITE);
         clear.setFont(new Font("Raleway",Font.BOLD,14));
         clear.setBounds(420,560,100,30);
         clear.addActionListener(this);
         add(clear);
        
        getContentPane().setBackground(Color.PINK);
        setSize(850,700);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            nameTextField.setText("");
            ageTextField.setText("");
            
        }
         if(ae.getSource()==submit){
        String sdoctor =(String)doctor.getSelectedItem();
        if(sdoctor.equals("NULL")){
            JOptionPane.showMessageDialog(this, "Doctor Name is required. Please select a Doctor Name from the list and other detail.", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
       // System.out.println(ae);String sreligion = (String)religion.getSelectedItem();
        //String sdoctor =(String)doctor.getSelectedItem();
        String sdepartement =(String)departement.getSelectedItem();
        String sTime = (String)Time.getSelectedItem();
        String sDay = (String)Appointment.getSelectedItem();
        String sCheckup = (String)checkup.getSelectedItem();
        String samount = (String)amount.getSelectedItem();
        String sname = nameTextField .getText();
        String sage =ageTextField .getText();
        //String spaddress = patientTextField.getText();
       // String sstate = stateTextField.getText();
       // String spincode = pincodeTextField.getText();
        try{
            if(sdoctor.equals("NULL") ){
               JOptionPane.showMessageDialog(this, "Please fill all the required fields", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
             
               Hospitalconn hc = new Hospitalconn();
                 String query1 = "insert into hospitalpatient2 values('"+sdoctor+"',+'"+sdepartement+"','"+sTime+"','"+sDay+"','"+sCheckup+"','"+samount+"','"+sname+"','"+sage+"')";
                 hc.s.executeUpdate(query1);
                setVisible(false);
                new Hpaymenting().setVisible(true);
             
        }
        }catch(Exception e){
            System.out.println(e);
            
        }

      }
   }
  }

    
    public static void main(String args[]) {
        new Hdoctordetail();
    }
}
