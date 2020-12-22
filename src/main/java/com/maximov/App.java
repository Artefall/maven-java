package com.maximov;

import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.TableCellRenderer;
import javax.swing.*;


public class App implements ActionListener{

    private String status = "";
    private String action = "";

    JButton sumButton = new JButton("+");
    JButton substractButton = new JButton("-");
    JButton multiplyButton = new JButton("*");
    JButton divideButton = new JButton("/");

    JButton n0Button = new JButton("0");
    JButton n1Button = new JButton("1");
    JButton n2Button = new JButton("2");
    JButton n3Button = new JButton("3");
    JButton n4Button = new JButton("4");
    JButton n5Button = new JButton("5");
    JButton n6Button = new JButton("6");
    JButton n7Button = new JButton("7");
    JButton n8Button = new JButton("8");
    JButton n9Button = new JButton("9");
    JButton equalsButton = new JButton("=");

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel labelPanel = new JPanel();
    JLabel resultLabel = new JLabel("..........");

    public App(){
        
        frame.setSize(300,300);

        //Buttons 


        sumButton.setActionCommand("+");
        substractButton.setActionCommand("-");
        multiplyButton.setActionCommand("*");
        divideButton.setActionCommand("/");
        n0Button.setActionCommand("0");
        n1Button.setActionCommand("1");
        n2Button.setActionCommand("2");
        n3Button.setActionCommand("3");
        n4Button.setActionCommand("4");
        n5Button.setActionCommand("5");
        n6Button.setActionCommand("6");
        n7Button.setActionCommand("7");
        n8Button.setActionCommand("8");
        n9Button.setActionCommand("9");
        equalsButton.setActionCommand("=");
        
        //Panel

        panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        panel.setLayout(new GridLayout(3,3));
        panel.add(sumButton);
        panel.add(substractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(n0Button);
        panel.add(n1Button);
        panel.add(n2Button);
        panel.add(n3Button);
        panel.add(n4Button);
        panel.add(n5Button);
        panel.add(n6Button);
        panel.add(n7Button);
        panel.add(n8Button);
        panel.add(n9Button);
        panel.add(equalsButton);

        labelPanel.add(resultLabel);

        //Events

        sumButton.addActionListener(this);
        substractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        n0Button.addActionListener(this);
        n1Button.addActionListener(this);
        n2Button.addActionListener(this);
        n3Button.addActionListener(this);
        n4Button.addActionListener(this);
        n5Button.addActionListener(this);
        n6Button.addActionListener(this);
        n7Button.addActionListener(this);
        n8Button.addActionListener(this);
        n9Button.addActionListener(this);
        equalsButton.addActionListener(this);
        

        //Frame

        frame.add(labelPanel, BorderLayout.NORTH);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main( String[] args ){
        new App();   
    }

    public void actionPerformed(ActionEvent e){
        String command = ((JButton) e.getSource()).getActionCommand();

        switch(command){
            case "+":
                action = "\\+";
                status += command;
                resultLabel.setText(status);
                break;
            case "-":
                action = "-";
                status += command;
                resultLabel.setText(status);
                break;
            case "*":
                action = "\\*";
                status += command;
                resultLabel.setText(status);
                break;
            case "/":
                action = "/";
                status += command;
                resultLabel.setText(status);
                break;
            case "=":
                String[] values = status.split(action);

                System.out.println(values[0]);
                System.out.println(values[1]);
                int result = 0;

                switch(action){
                    case "\\+":
                        result = Calculator.sum(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                        System.out.println(result);
                        break;
                    case "-":
                        result = Calculator.substract(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                        break;
                    case "\\*":
                        result = Calculator.multiply(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                        break;
                    case "/":
                        result = Calculator.divide(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                        break;
                }

                resultLabel.setText(String.valueOf(result));
                
                status = "";
                action = "";
                break;    
            default:
                status += command;
                resultLabel.setText(status);
                break;
        }
    }
}
