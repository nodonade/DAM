package com.graficos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
// ww w. j  av  a  2s  .c  o  m
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {
  static void createFrameAtLocation(Point p) {
    JFrame frame = new JFrame();
    frame.setTitle("Test frame on two screens");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel(new BorderLayout());
    JTextArea textareaA = new JTextArea(24, 80);
    textareaA.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
    panel.add(textareaA, BorderLayout.CENTER);
    frame.setLocation(p);
    frame.add(panel);
    frame.pack();
    frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Point p1 = null;
    Point p2 = null;
    for (GraphicsDevice gd : GraphicsEnvironment.getLocalGraphicsEnvironment()
        .getScreenDevices()) {
      if (p1 == null) {
        p1 = gd.getDefaultConfiguration().getBounds().getLocation();
      } else if (p2 == null) {
        p2 = gd.getDefaultConfiguration().getBounds().getLocation();
      }
    }
    if (p2 == null) {
      p2 = p1;
    }
    createFrameAtLocation(p1);
    createFrameAtLocation(p2);
  }

}