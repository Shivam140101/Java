package Digital_Clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class My_Window extends JFrame
{


    private JLabel heading;

    private JLabel clocklabel;


    private  Font font = new Font("", Font.BOLD,35);

    My_Window()
    {
        super.setTitle("My Clock");
        super.setSize(400,400);
        super.setLocation(400,50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);

    }

    public void createGUI()
    {
        heading = new JLabel("My clock");

        clocklabel = new JLabel("clock");
        heading.setFont(font);
        clocklabel.setFont(font);

        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clocklabel);

    }


    public void startClock()
    {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//               String dateTime = new Date().toLocaleString();

                Date d = new Date();
                SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss a ");

                String dateTime = sfd.format(d);

                clocklabel.setText(dateTime);
            }
        });

        timer.start();

    }
}
