package MainForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainForm {
    // Interface elements
    private JPanel MainPanel;
    private JPanel startPanel;
    private JPanel question1Panel;
    private JButton startButton;
    private JLabel lblWelcome;
    private JLabel lblQuestion1;
    private JButton btnNext1;
    private JPanel question1;
    private JLabel lblQuest1Text;
    private JRadioButton rbQuest1Opt1;
    private JRadioButton rbQuest1Opt2;
    private JRadioButton rbQuest1Opt3;
    private JPanel question2Panel;
    private JButton btnNext2;
    private JLabel lblQuestion2;
    private JPanel question2;
    private JLabel lblQuest2Text;
    private JRadioButton rbQuest2Opt1;
    private JRadioButton rbQuest2Opt2;
    private JPanel question3Panel;
    private JLabel lblQuestion3;
    private JButton btnNext3;
    private JPanel question3;
    private JRadioButton rbQuest3Opt1;
    private JRadioButton rbQuest3Opt2;
    private JLabel lblQuest3Text;
    private JPanel question4Panel;
    private JLabel lblQuestion4;
    private JButton btnNext4;
    private JPanel question4;
    private JRadioButton rbQuest4Opt1;
    private JRadioButton rbQuest4Opt2;
    private JLabel lblQuest4Text;
    private JPanel question5Panel;
    private JLabel lblQuestion5;
    private JButton btnNext5;
    private JPanel question5;
    private JRadioButton rbQuest5Opt1;
    private JRadioButton rbQuest5Opt2;
    private JLabel lblQuest5Text;
    private JPanel resultPanel;
    private JButton btnFinal1;
    private JButton btnFinal2;
    private JLabel lblFinal;
    private JLabel DAW_Logo;

    // Answers
    private int answer1 = 0, answer2 = 0, answer3 = 0, answer4 = 0, answer5 = 0;

    public MainForm() {
        // Disabling "Siguiente" buttons
        btnNext1.setEnabled(false);
        btnNext2.setEnabled(false);
        btnNext3.setEnabled(false);
        btnNext4.setEnabled(false);
        btnNext5.setEnabled(false);

        // Radio buttons group for question 1
        ButtonGroup rbGroup1 = new ButtonGroup();
        rbGroup1.add(rbQuest1Opt1);
        rbGroup1.add(rbQuest1Opt2);
        rbGroup1.add(rbQuest1Opt3);

        // Radio buttons group for question 2
        ButtonGroup rbGroup2 = new ButtonGroup();
        rbGroup2.add(rbQuest2Opt1);
        rbGroup2.add(rbQuest2Opt2);

        // Radio buttons group for question3
        ButtonGroup rbGroup3 = new ButtonGroup();
        rbGroup3.add(rbQuest3Opt1);
        rbGroup3.add(rbQuest3Opt2);

        // Radio buttons group for question 4
        ButtonGroup rbGroup4 = new ButtonGroup();
        rbGroup4.add(rbQuest4Opt1);
        rbGroup4.add(rbQuest4Opt2);

        // Radio buttons group for question 5
        ButtonGroup rbGroup5 = new ButtonGroup();
        rbGroup5.add(rbQuest5Opt1);
        rbGroup5.add(rbQuest5Opt2);

        // Creating a layout
        MainPanel.setLayout(new CardLayout());

        MainPanel.add(startPanel, "startPanel");
        MainPanel.add(question1Panel, "question1Panel");
        MainPanel.add(question2Panel, "question2Panel");
        MainPanel.add(question3Panel, "question3Panel");
        MainPanel.add(question4Panel, "question4Panel");
        MainPanel.add(question5Panel, "question5Panel");
        MainPanel.add(resultPanel, "resultPanel");

        CardLayout layout = (CardLayout)(MainPanel.getLayout());

        // "Empezar" button listener
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(MainPanel, "question1Panel");
            }
        });

        // Question 1 radio button listener
        ItemListener quest1ItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (rbQuest1Opt1.isSelected()) {
                    answer1 = 1;
                    btnNext1.setEnabled(true);
                } else if (rbQuest1Opt2.isSelected()) {
                    answer1 = 2;
                    btnNext1.setEnabled(true);
                } else {
                    answer1 = 3;
                    btnNext1.setEnabled(true);
                }
            }
        };
        rbQuest1Opt1.addItemListener(quest1ItemListener);
        rbQuest1Opt2.addItemListener(quest1ItemListener);
        rbQuest1Opt3.addItemListener(quest1ItemListener);

        // Question 1 "Siguiente" button event listener
        btnNext1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(MainPanel, "question2Panel");
            }
        });

        // Question 2 radio button listener
        ItemListener quest2ItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (rbQuest2Opt1.isSelected()) {
                    answer2 = 1;
                    btnNext2.setEnabled(true);
                } else {
                    answer2 = 2;
                    btnNext2.setEnabled(true);
                }
            }
        };
        rbQuest2Opt1.addItemListener(quest2ItemListener);
        rbQuest2Opt2.addItemListener(quest2ItemListener);

        // Question 2 "Siguiente" button event listener
        btnNext2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbQuest2Opt1.isSelected()) {
                    layout.show(MainPanel, "question3Panel");
                } else {
                    layout.show(MainPanel, "question4Panel");
                }
            }
        });

        // Question 3 radio button listener
        ItemListener quest3ItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (rbQuest3Opt1.isSelected()) {
                    answer3 = 1;
                    btnNext3.setEnabled(true);
                } else {
                    answer3 = 2;
                    btnNext3.setEnabled(true);
                }
            }
        };
        rbQuest3Opt1.addItemListener(quest3ItemListener);
        rbQuest3Opt2.addItemListener(quest3ItemListener);

        // Question 3 "Siguiente" button event listener
        btnNext3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(MainPanel, "question4Panel");
            }
        });

        // Question 4 radio button listener
        ItemListener quest4ItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (rbQuest4Opt1.isSelected()) {
                    answer4 = 1;
                    btnNext4.setEnabled(true);
                } else {
                    answer4 = 2;
                    btnNext4.setEnabled(true);
                }
            }
        };
        rbQuest4Opt1.addItemListener(quest4ItemListener);
        rbQuest4Opt2.addItemListener(quest4ItemListener);

        // Question 4 "Siguiente" button event listener
        btnNext4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(MainPanel, "question5Panel");
            }
        });

        ItemListener quest5ItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (rbQuest5Opt1.isSelected()) {
                    answer5 = 1;
                    btnNext5.setEnabled(true);
                } else {
                    answer5 = 2;
                    btnNext5.setEnabled(true);
                }
            }
        };
        rbQuest5Opt1.addItemListener(quest5ItemListener);
        rbQuest5Opt2.addItemListener(quest5ItemListener);

        // Question 5 "Siguiente" button event listener
        btnNext5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(MainPanel, "resultPanel");

                // Result analyzer
                if (answer1 != 1 && answer3 == 1 && answer4 == 1 && answer5 == 2) {
                    lblFinal.setText("Creo que estás cursando DAW");
                } else if (answer1 == 3 && answer3 == 1 && answer4 == 2 && answer5 == 2) {
                    lblFinal.setText("Parece que estás cursando DAM");
                } else if (answer1 == 3 && answer2 == 2 && answer4 == 1 && answer5 == 2) {
                    lblFinal.setText("Eres de Marketing, ¿no?");
                } else if (answer1 == 1 && answer3 == 2 && answer4 == 2 && answer5 == 2) {
                    lblFinal.setText("Estás estudiando SMR, ¿verdad?");
                } else if (answer1 != 1 && answer2 == 2 && answer4 == 2 && answer5 == 1) {
                    lblFinal.setText("Adivino que eres de Salud");
                } else if (answer1 != 1 && answer3 == 2 && answer4 == 1 && answer5 == 2) {
                    lblFinal.setText("¿No eres de Finanzas?");
                } else {
                    lblFinal.setText("¡Vaya! No puedo adivinar que estás estudiando \uD83D\uDE2D");
                }
            }
        });

        // Final panel buttons event listeners
        btnFinal1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(MainPanel, "startPanel");
                rbGroup1.clearSelection();
                rbGroup2.clearSelection();
                rbGroup3.clearSelection();
                rbGroup4.clearSelection();
                rbGroup5.clearSelection();
            }
        });
        btnFinal2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Adding DAW logo to the DAW_Logo label
        ImageIcon logo = new ImageIcon("logoSite.jpg");

        Image scaledImage = logo.getImage().getScaledInstance(450, 97, Image.SCALE_SMOOTH);
        logo = new ImageIcon(scaledImage);

        DAW_Logo.setIcon(logo);

    }

    public JPanel getMainPanel() {
        return MainPanel;
    }
}
