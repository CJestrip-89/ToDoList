package com.chrisestiplet.ToDoList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

//Button Functions
public class ButtonPanel extends JPanel{
    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

//    Constructor
    ButtonPanel()
    {
        this.setPreferredSize(new Dimension(500,60));
//        this.setBackground(Color.red);

        addTask = new JButton(("Add Task"));
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
//        addTask.setVerticalAlignment();
        this.add(addTask);

//        Add a gap between the Buttons
        this.add(Box.createHorizontalStrut(20));

        clear = new JButton(("Clear Completed Tasks"));
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(clear);
    }

//    Button Functions
    public JButton getAddTask()
    {
        return addTask;
    }

    public JButton getClear()
    {
        return clear;
    }

}
