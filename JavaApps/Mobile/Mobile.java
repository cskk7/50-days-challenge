package JavaApps.Mobile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.String;

public class Mobile implements ActionListener{

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[7];
    JButton hashButton,asterikButton,callButton,endButton,leftButton,rightButton,centerButton;
    JPanel panel;

    Font myFont = new Font("Times",Font.BOLD,30);

    String callingText = "";

    Mobile(){

        frame = new JFrame("Karthikesavan's Mobile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 720);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 150);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        hashButton = new JButton("#");
        asterikButton = new JButton("*");
        callButton = new JButton("CALL");
        endButton = new JButton("END");
        leftButton = new JButton("<");
        rightButton = new JButton(">");
        centerButton = new JButton("-");


        functionButtons[0] = asterikButton;
        functionButtons[1] = hashButton;
        functionButtons[2] = callButton;
        functionButtons[3] = endButton;
        functionButtons[4] = leftButton;
        functionButtons[5] = rightButton;
        functionButtons[6] = centerButton;


        for(int i =0;i<7;i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for(int i =0;i<10;i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        callButton.setBounds(50,235,120,50);
        endButton.setBounds(230,235,120,50);
        leftButton.setBounds(50,180,120,50);
        rightButton.setBounds(230,180,120,50);
        centerButton.setBounds(175,180,50,90);

        panel = new JPanel();
        panel.setBounds(50, 320, 300, 300);
        panel.setLayout(new GridLayout(4,3,12,12));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);

        panel.add(asterikButton);
        panel.add(numberButtons[0]);
        panel.add(hashButton);

        frame.add(panel);
        frame.add(callButton);
        frame.add(endButton);
        frame.add(textfield);
        frame.add(centerButton);
        frame.add(rightButton);
        frame.add(leftButton);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Mobile calc = new Mobile();
    }

    @java.lang.Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        for(int i=0;i<10;i++) {
            if (e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==asterikButton) {
            textfield.setText(textfield.getText().concat("*"));
        }
        if(e.getSource()==hashButton) {
            textfield.setText(textfield.getText().concat("#"));
        }

        if(e.getSource()==endButton) {
            textfield.setText("Call Ended");
        }
        if(e.getSource()==callButton) {
            callingText = textfield.getText();
            textfield.setText("Calling ".concat(callingText));
        }
    }
}