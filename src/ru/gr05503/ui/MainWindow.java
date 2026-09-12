package ru.gr05503.ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final JCheckBox check1;
    private final JCheckBox check2;

    private final ButtonGroup buttonGroup;
    private final JRadioButton rbut1;
    private final JRadioButton rbut2;
    private final JRadioButton rbut3;

    private final JButton btn1;
    private final JButton btn2;
    private final JButton btnExit;

    private final JPanel mainPanel;
    private final JPanel ctrlPanel;

    public MainWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("панорама");
        setMinimumSize(new Dimension(1000,500));
        mainPanel = new JPanel();
        ctrlPanel = new JPanel();
        mainPanel.setBackground(Color.pink);
        add(ctrlPanel,BorderLayout.SOUTH);
        add(mainPanel,BorderLayout.CENTER);

        btn1 = new JButton("кнопка 1");
        btn2 = new JButton("кнопка 2");
        btnExit = new JButton("выход");
        btnExit.addActionListener(e -> {
            dispose();
        });

        check1 = new JCheckBox("опция 1");
        check2 = new JCheckBox("опция 2");

        buttonGroup = new ButtonGroup();
        rbut1 = new JRadioButton("вариант 1");
        rbut2 = new JRadioButton("вариант 2");
        rbut3 = new JRadioButton("вариант 3");
        buttonGroup.add(rbut1);
        buttonGroup.add(rbut2);
        buttonGroup.add(rbut3);


        GroupLayout gl = new GroupLayout(ctrlPanel);
        ctrlPanel.setLayout(gl);
        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addGap(8)
                .addGroup(gl.createParallelGroup()
                        .addComponent(check1)
                        .addComponent(check2)
                )
                .addGap(8)
                .addGroup(gl.createParallelGroup()
                        .addComponent(rbut1)
                        .addComponent(rbut2)
                        .addComponent(rbut3)
                )
                .addGap(9,9,Short.MAX_VALUE)
                .addGroup(gl.createParallelGroup()
                        .addComponent(btn1)
                        .addComponent(btn2)
                )
                .addGap(10)
                .addComponent(btnExit)
                .addGap(10)
        );
        gl.setVerticalGroup(gl.createSequentialGroup()
                .addGap(9)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(GroupLayout.Alignment.LEADING,
                                gl.createSequentialGroup()
                                .addComponent(check1)
                                .addComponent(check2)
                        )
                        .addGroup(gl.createSequentialGroup()
                                .addComponent(rbut1)
                                .addComponent(rbut2)
                                .addComponent(rbut3)
                        )
                        .addGroup(gl.createSequentialGroup()
                                .addComponent(btn1)
                                .addGap(4)
                                .addComponent(btn2)
                        )
                        .addComponent(btnExit)
                )
                .addGap(9)
        );

        pack();
        setLocationRelativeTo(null);
    }
}
