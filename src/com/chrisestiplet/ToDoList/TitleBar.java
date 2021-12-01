package com.chrisestiplet.ToDoList;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
//    Constructor
    TitleBar(){
        this.setPreferredSize(new Dimension(400, 80));
//        this.setBackground(Color.red);

        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200,80));
        titleText.setFont(new Font("Sans-Serif", Font.BOLD,20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);

    }
}
