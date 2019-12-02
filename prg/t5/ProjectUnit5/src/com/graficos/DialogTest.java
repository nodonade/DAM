package com.graficos;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DialogTest {

    public static void main(String[] args) {
        new DialogTest();
    }

    public DialogTest() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                GraphicsDevice device = ge.getDefaultScreenDevice();
                GraphicsConfiguration gc = device.getDefaultConfiguration();
                Rectangle bounds = gc.getBounds();
                Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(gc);

                bounds.x += insets.left;
                bounds.y += insets.top;
                bounds.width -= (insets.left + insets.right);
                bounds.height -= (insets.top + insets.bottom);


                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new TestPane());
                frame.pack();
                frame.setLocation(bounds.x + ((bounds.width / 2) - frame.getWidth()),
                        bounds.y + ((bounds.height / 2) - frame.getHeight()));
                frame.setVisible(true);

                JFrame frame2 = new JFrame("Testing");
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.add(new TestPane());
                frame2.pack();
                frame2.setLocation(bounds.x + ((bounds.width / 2)),
                        bounds.y + ((bounds.height / 2) - frame2.getHeight()));
                frame2.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        public TestPane() {
            setLayout(new GridBagLayout());
            JButton popup = new JButton("Popup");
            add(popup);

            popup.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JDialog dialog = new JDialog(SwingUtilities.windowForComponent(TestPane.this));
                    dialog.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);

                    JPanel panel = new JPanel(new GridBagLayout());
                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.gridwidth = GridBagConstraints.REMAINDER;
                    panel.add(new JLabel("I'll be your dialog today"), gbc);
                    JButton close = new JButton("Close");
                    close.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            SwingUtilities.windowForComponent(close).dispose();
                        }
                    });
                    panel.add(close, gbc);
                    dialog.add(panel);
                    dialog.pack();
                    dialog.setLocationRelativeTo(TestPane.this);
                    dialog.setVisible(true);
                }
            });
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

    }

}