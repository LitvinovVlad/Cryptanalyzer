//package gui;
//import constants.Constants;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//public class GUI extends JFrame{
//    private JButton button = new JButton("Caesar cipher");
//    private JTextField input = new JTextField("", 10);
//    private JLabel label = new JLabel(Constants.fileName);
//    private JRadioButton radio1 = new JRadioButton("Шифратор");
//    private JRadioButton radio2 = new JRadioButton("Расшифратор");
//    private JRadioButton radio3 = new JRadioButton("Метод расшифровки - \"BruteForce\"");
//    private JCheckBox check = new JCheckBox("Данная программа - это криптоанализатор, который работает с вашим текстом, а именно шифрует и расшифровывает по методу Цезаря. \n" +
//            "Шифр Цезаря — это вид шифра подстановки, в котором каждый символ в открытом тексте заменяется символом находящимся на некотором постоянном числе позиций левее или правее него в алфавите.\n" +
//            " Например, в шифре со сдвигом 3 А была бы заменена на Г, Б станет Д, и так далее.");
//
//    public GUI(){
//        super("Caesar cipher");
//        this.setBounds(100, 100, 250, 100);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        Container container = this.getContentPane();
//        container.setLayout(new GridLayout(3, 2, 2, 2));
//        container.add(label);
//        container.add(input);
//        ButtonGroup group = new ButtonGroup();
//        group.add(radio1);
//        group.add(radio2);
//        container.add(radio1);
//        radio1.setSelected(true);
//        container.add(radio2);
//        container.add(check);
//        button.addActionListener(new ButtonEventListener ());
//        container.add(button);
//    }
//    class ButtonEventListener implements ActionListener{
//        public void actionPerformed(ActionEvent e){
//
//        }
//    }
//}
