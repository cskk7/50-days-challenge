package JavaApps.TrainTiming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.String;

public class Train1 extends JFrame implements ItemListener {
    static JFrame frame;
    static JButton[] functionButtons;

    static JComboBox combo1,combo2;

    static JLabel selectedLabel1,cityLabel1,selectedLabel2,cityLabel2;

    public static void main(String[] args) {

        functionButtons = new JButton[20];

        JButton t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20;
        Font myFont = new Font("Times", Font.BOLD, 30);
        Font selectFont = new Font("Times",Font.PLAIN,20);

        frame = new JFrame("MRTS Coastal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);


//        String s1[] = { "Chintadripet","Chepauk","Tiruvallikeni",
//        "Light House","MundakaKanniAmman Koil","Thirumayilai",
//        "Mandaveli","Greenways Road","Kotturpuram","Kasturibai Nagar",
//         "Indira Nagar","Tiruvanmiyur","Taramani","Perungudi","Velachery"
//        };

        String s1_tamil[] = { "சிந்தாதிரிப்பேட்டை","சேப்பாக்கம்","திருவல்லிக்கேணி",
                "கல்ங்கரை விளக்கம்","முண்டக்கண்ணியம்மன் கோயில்","திருமயிலை",
                "மந்தவெளி","பசுமைவழிச்சாலை","கோட்டூர்புரம்","கஸ்தூரிபாய் நகர்",
                "இந்திரா நகர்","திருவான்மியூர்","தரமணி","பெருங்குடி","வேளச்சேரி"
        };

//        String s2[] = new String[s1.length];
//        int j = 0;
//        for(int i = s1.length-1; i >= 0; i--){
//            s2[j] = s1[i];
//            j++;
//        }
        String s2_tamil[] = new String[s1_tamil.length];
        int k = 0;
        for(int i = s1_tamil.length-1; i >= 0; i--){
            s2_tamil[k] = s1_tamil[i];
            k++;
        }

        cityLabel1 = new JLabel("FROM station");
        cityLabel1.setForeground(Color.black);
        cityLabel1.setFont(selectFont);
        cityLabel1.setBounds(50, 25, 150, 20);
        cityLabel1.setVisible(true);

        combo1 = new JComboBox(s1_tamil);
        combo1.setBounds(50, 70, 300, 30);
        combo1.setFont(selectFont);
        combo1.addItemListener(new Train1());

        selectedLabel1 = new JLabel("சிந்தாதிரிப்பேட்டை selected");
        selectedLabel1.setForeground(Color.blue);
        selectedLabel1.setFont(selectFont);
        selectedLabel1.setBounds(50, 100, 350, 25);
        selectedLabel1.setVisible(true);

        cityLabel2 = new JLabel("TO station");
        cityLabel2.setForeground(Color.black);
        cityLabel2.setFont(selectFont);
        cityLabel2.setBounds(450, 25, 150, 20);
        cityLabel2.setVisible(true);

        combo2 = new JComboBox(s2_tamil);
        combo2.setBounds(450, 70, 300, 30);
        combo2.setFont(selectFont);
        combo2.addItemListener(new Train1());

        selectedLabel2 = new JLabel("வேளச்சேரி selected");
        selectedLabel2.setForeground(Color.blue);
        selectedLabel2.setFont(selectFont);
        selectedLabel2.setBounds(450, 100, 350, 25);
        selectedLabel2.setVisible(true);



        t1 = new JButton("41001");
        t2 = new JButton("41003");
        t3 = new JButton("41005");
        t4 = new JButton("41007");
        t5 = new JButton("41009");
        t6 = new JButton("41002");
        t7 = new JButton("41004");
        t8 = new JButton("41006");
        t9 = new JButton("41008");
        t10 = new JButton("41010");
        t11 = new JButton("41011");
        t12 = new JButton("41013");
        t13 = new JButton("41015");
        t14 = new JButton("41017");
        t15 = new JButton("41019");
        t16 = new JButton("41012");
        t17 = new JButton("41014");
        t18 = new JButton("41016");
        t19 = new JButton("41018");
        t20 = new JButton("41020");


        functionButtons[0] = t1;
        functionButtons[1] = t2;
        functionButtons[2] = t3;
        functionButtons[3] = t4;
        functionButtons[4] = t5;
        functionButtons[5] = t6;
        functionButtons[6] = t7;
        functionButtons[7] = t8;
        functionButtons[8] = t9;
        functionButtons[9] = t10;
        functionButtons[10] = t11;
        functionButtons[11] = t12;
        functionButtons[12] = t13;
        functionButtons[13] = t14;
        functionButtons[14] = t15;
        functionButtons[15] = t16;
        functionButtons[16] = t17;
        functionButtons[17] = t18;
        functionButtons[18] = t19;
        functionButtons[19] = t20;


        for (int i = 0; i < 20; i++) {
            functionButtons[i].setFont(selectFont);
            functionButtons[i].setFocusable(false);
        }

        t1.setBounds(50,150 , 100, 30);
        t2.setBounds(50,190 , 100, 30);
        t3.setBounds(50,230 , 100, 30);
        t4.setBounds(50,270 , 100, 30);
        t5.setBounds(50,310 , 100, 30);
        t11.setBounds(50,350 , 100, 30);
        t12.setBounds(50,390 , 100, 30);
        t13.setBounds(50,430 , 100, 30);
        t14.setBounds(50,470 , 100, 30);
        t15.setBounds(50,510 , 100, 30);

        t6.setBounds(450,150 , 100, 30);
        t7.setBounds(450,190 , 100, 30);
        t8.setBounds(450,230 , 100, 30);
        t9.setBounds(450,270 , 100, 30);
        t10.setBounds(450,310 , 100, 30);
        t16.setBounds(450,350 , 100, 30);
        t17.setBounds(450,390 , 100, 30);
        t18.setBounds(450,430 , 100, 30);
        t19.setBounds(450,470 , 100, 30);
        t20.setBounds(450,510 , 100, 30);

        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
        frame.add(t6);
        frame.add(t7);
        frame.add(t8);
        frame.add(t9);
        frame.add(t10);
        frame.add(t11);
        frame.add(t12);
        frame.add(t13);
        frame.add(t14);
        frame.add(t15);
        frame.add(t16);
        frame.add(t17);
        frame.add(t18);
        frame.add(t19);
        frame.add(t20);

        frame.add(combo1);
        frame.add(cityLabel1);
        frame.add(selectedLabel1);

        frame.add(combo2);
        frame.add(cityLabel2);
        frame.add(selectedLabel2);

        frame.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // if the state combobox is changed
        if (e.getSource() == combo1) {

            selectedLabel1.setText(combo1.getSelectedItem() + " selected");
        }
        if (e.getSource() == combo2) {

            selectedLabel2.setText(combo2.getSelectedItem() + " selected");
        }
    }
}