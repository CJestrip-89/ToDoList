package com.chrisestiplet.ToDoList;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    private JLabel index;
    private JTextField taskName;
    private JButton done;

    private boolean checked;
//    Constructor
    Task(){
        this.setPreferredSize(new Dimension(40, 200));
        this.setBackground(Color.red);
        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,30));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Your task here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.red);

        this.add(taskName, BorderLayout.CENTER);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());

        this.add(done, BorderLayout.EAST);





    }
}