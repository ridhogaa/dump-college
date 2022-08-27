/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum6_1402020069;

import java.awt.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import javax.swing.*;

/**
 *
 * @author Ridho Gymnastiar Al Rasyid 1402020069
 */
public class Praktikum6_1402020069 extends JFrame{
    // instance variable
    private final JPanel panel;
    private final JLabel label_DBP, label_Mulai, label_Sampai, label_Bilangan;
    private final JTextField text_Mulai, text_Sampai;
    private final JButton button_Random, button_Periksa;
    private final JRadioButton rb_SwingWorker, rb_WithoutSwingWorker;
    private final ButtonGroup groupSW = new ButtonGroup();
    private final Random random = new Random();
    private long angka = 0, tampung = 0;
    private SwingWorker<String, Object> threadCalculatePrima; // SwingWorker
    
    public Praktikum6_1402020069() {
        super("Bilangan Prima");
        // instansiasi
        panel = new JPanel();
        label_DBP = new JLabel("DERETAN BILANGAN PRIMA");
        label_Mulai = new JLabel("Mulai");
        text_Mulai = new JTextField();
        label_Sampai = new JLabel("Sampai");
        text_Sampai = new JTextField();
        label_Bilangan = new JLabel("");
        button_Random = new JButton("Random");
        rb_SwingWorker = new JRadioButton("Periksa dengan SwingWorker");
        rb_WithoutSwingWorker = new JRadioButton("Periksa tanpa SwingWorker");
        button_Periksa = new JButton("Periksa");
        
        // set component
        panel.setLayout(null);
        
        label_DBP.setFont(new Font("Consolas", 0, 17));
        label_DBP.setHorizontalAlignment(JLabel.CENTER);
        label_DBP.setBounds(400, 10, 200, 50);
        
        label_Mulai.setBounds(310, 70, 50, 25);
        
        text_Mulai.setBounds(355, 70, 280, 25);
        
        label_Sampai.setBounds(302, 118, 50, 25);
        
        text_Sampai.setBounds(355, 118, 280, 25);
        text_Sampai.setEditable(false);
        text_Sampai.setBackground(Color.WHITE);
        
        label_Bilangan.setBounds(0, 240, 1000, 25);
        label_Bilangan.setHorizontalAlignment(JLabel.CENTER);
        
        button_Random.setBounds(645, 118, 85, 25);
        button_Random.setFont(new Font("Consolas", 0, 15));
        button_Random.setVerticalAlignment(JLabel.CENTER);
        button_Random.setHorizontalAlignment(JLabel.CENTER);
        button_Random.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_Random.addActionListener((e) -> {
            try {
                angka = Long.parseLong(text_Mulai.getText());
                if (angka < 1_000_000) {
                    JOptionPane.showMessageDialog(null, "TextField mulai harus lebih besar dari 1.000.000!", "Warning", JOptionPane.ERROR_MESSAGE);
                    text_Mulai.setText(null);
                    text_Sampai.setText(null);
                    label_Bilangan.setText(null);
                    groupSW.clearSelection();
                } else {
                    tampung = (angka + random.nextInt(101) + 100);
                    text_Sampai.setText("" + tampung);
                    label_Bilangan.setText(null);
                }
            } catch (HeadlessException | NumberFormatException error) {
                if (text_Mulai.getText().matches("^$")) {
                    JOptionPane.showMessageDialog(null, "Input Text Field mulai terlebih dahulu!", "Warning", JOptionPane.ERROR_MESSAGE);
                    text_Mulai.setText(null);
                    text_Sampai.setText(null);
                    label_Bilangan.setText(null);
                    groupSW.clearSelection();
                } else if (!text_Mulai.getText().matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "Input Text Field mulai harus Angka!", "Warning", JOptionPane.ERROR_MESSAGE);
                    text_Mulai.setText(null);
                    text_Sampai.setText(null);
                    label_Bilangan.setText(null);
                    groupSW.clearSelection();
                }
            }
        });
        
        groupSW.add(rb_SwingWorker);
        groupSW.add(rb_WithoutSwingWorker);
        
        rb_SwingWorker.setBounds(297, 160, 210, 25);
        rb_SwingWorker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb_SwingWorker.setOpaque(false);
        
        rb_WithoutSwingWorker.setBounds(535, 160, 210, 25);
        rb_WithoutSwingWorker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb_WithoutSwingWorker.setOpaque(false);
        
        button_Periksa.setBounds(460, 200, 85, 25);
        button_Periksa.setFont(new Font("Consolas", 0, 13));
        button_Periksa.setVerticalAlignment(JLabel.CENTER);
        button_Periksa.setHorizontalAlignment(JLabel.CENTER);
        button_Periksa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_Periksa.addActionListener((e) -> {
            if (text_Mulai.getText().matches("^$")) {
                JOptionPane.showMessageDialog(null, "Lengkapi masukan terlebih dahulu!", "Warning", JOptionPane.ERROR_MESSAGE);
                text_Mulai.setText(null);
                text_Sampai.setText(null);
                label_Bilangan.setText(null);
                groupSW.clearSelection();
            } else {
                if (rb_SwingWorker.isSelected()) {
                    doIt(Praktikum6_1402020069.getBilanganPrima(angka, tampung), label_Bilangan, button_Periksa, threadCalculatePrima);
                }
                if (rb_WithoutSwingWorker.isSelected()) {
                    doIt(Praktikum6_1402020069.getBilanganPrima(angka, tampung), label_Bilangan);
                }
            }
        });
        
        // add component to panel
        panel.add(label_DBP);
        panel.add(label_Mulai);
        panel.add(text_Mulai);
        panel.add(label_Sampai);
        panel.add(text_Sampai);
        panel.add(button_Random);
        panel.add(rb_SwingWorker);
        panel.add(rb_WithoutSwingWorker);
        panel.add(button_Periksa);
        panel.add(label_Bilangan);
        
        // Container frame
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);
        this.setSize(1000, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
    
    public static String getBilanganPrima(long a, long b){
        String temp = "";
        long i, j, flag;
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                temp += i + ", ";
        }
        return temp.substring(0, temp.length() - 2);
    }
    
    public void doIt(String bilanganPrima, JLabel bilangan, JButton button, SwingWorker<String, Object> tcp){
        bilangan.setText("Mencari...");
        tcp = new SwingWorker<String, Object>() {
            @Override
            protected String doInBackground(){
                button.setEnabled(false);
                return bilanganPrima;
            }
            @Override
            protected void done(){
                try {
                    Thread.sleep(1200);
                    bilangan.setText(get());
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("ERROR INTERRUPT OR EXECUTION!");
                }
                button.setEnabled(true);
            }
        };
        tcp.execute();
    }
    
    public void doIt(String bilanganPrima, JLabel bilangan){
        bilangan.setText(bilanganPrima);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Praktikum6_1402020069().setVisible(true);
        });
    }
    
}
