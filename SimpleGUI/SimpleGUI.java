/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplegui;

import javax.swing.*;

/**
 *
 * @author user
 */
public class SimpleGUI {

    public static void main(String[] args) {
        
        // creat a new window (JFrame)
        JFrame frame = new JFrame("My simple GUI");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // absolute positioning
               
        // text field
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 200, 25);
        
        // button
        JButton button = new JButton("Click Me");
        button.setBounds(230, 20, 120, 25);
        
        JButton refreshButton = new JButton("Refresh");
        refreshButton.setBounds(360, 20, 120, 25);
        
        // label
        JLabel label = new JLabel("Hello! type your name in the textbox above and click the button.");
        label.setBounds(20, 60, 500, 40);
        
        // add components to the frame
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.add(refreshButton);
        
        // event handling
        button.addActionListener(e -> {
           String name = textField.getText();
           label.setText("Welcome " + name + "! 😎");
        });
        
        refreshButton.addActionListener(e -> {
           textField.setText("");
           label.setText("Hello! type your name in the textbox above and click the button.");
        });
        
        frame.setVisible(true);
        
    }
}
