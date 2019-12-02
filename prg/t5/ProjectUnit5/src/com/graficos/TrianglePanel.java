package com.graficos;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
 
public class TrianglePanel extends JPanel implements ActionListener{
     
    protected JLabel inputLabel, inputSide1, inputSide2, inputSide3;
    protected JTextField side1, side2, side3;
    protected JButton inputButton;
    protected JTextArea result;
    public TrianglePanel()
             
    {   
         
        JPanel firstPanel = new JPanel(); 
        TitledBorder inputTitle = BorderFactory.createTitledBorder
        ("Input Area");
        inputTitle.setTitleJustification(TitledBorder.LEFT);
        inputTitle.setBorder(new LineBorder(Color.BLACK,5));
        setBorder(inputTitle);
        inputLabel =new JLabel("Please enter 3 sides of a triangle and click"
                +" on the input button");
        inputSide1 =new JLabel("SIDE A");
        side1 = new JTextField(3);
        inputSide2 =new JLabel("SIDE B");
        side2 = new JTextField(3);
        inputSide3 =new JLabel("SIDE C");
        side3 = new JTextField(3);
        inputButton = new JButton("Input");        
        inputButton.addActionListener(this);
        result = new JTextArea(20,30);
        JScrollPane scrollPaneCreation = new JScrollPane(result);
         
        add(inputLabel);
        add(inputSide1);
        add(side1);
        add(inputSide2);
        add(side2);
        add(inputSide3);
        add(side3);
        add(result);
        add(inputButton);
        setPreferredSize(new Dimension(650,400));
         
        JPanel secondPanel = new JPanel();
        TitledBorder inputTitle2 = BorderFactory.createTitledBorder
        ("Describe");
        inputTitle2.setTitleJustification(TitledBorder.LEFT);
        inputTitle2.setBorder(new LineBorder(Color.BLACK,5));
        secondPanel.setBorder(inputTitle2);
     
         
    }
     
    public void actionPerformed(ActionEvent event){
         
        result.append("Side A is " + side1.getText() + ", Side B is " +
                side2.getText() + ", Side C" + side3.getText() +"\n");     
        }
     
     
    public static void main(String[]args){
      JFrame frame = new JFrame("My first GUI");
         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TrianglePanel());    
        frame.pack();      
        frame.setVisible(true);
       
    }
}