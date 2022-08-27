/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_1402020069;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Ridho Gymnastiar Al Rasyid / 1402020069
 */
public class Praktikum5_1402020069 extends JFrame{
    // instance variable
    private final JPanel panel;
    private final JLabel inputLabel;
    private final JLabel fromLabel;
    private final JLabel toLabel;
    private final JLabel resultLabel;
    private final JTextField input;
    private final JTextField result;
    private final JComboBox mataUang;
    private final JRadioButton idr;
    private final JRadioButton usd;
    private final JRadioButton euro;
    private final JRadioButton dinar;
    private final ButtonGroup pilihanUang;
    private final JButton resultButton;
    private final DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
    private int uang; 
    private int resultUang = 0;
    
    public Praktikum5_1402020069(){
        super("Praktikum5 Ridho");
        
        // menginstansiasi dan mengsetting panel dan komponen
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(107, 185, 240));
        
        inputLabel = new JLabel();
        inputLabel.setText("INPUT");
        inputLabel.setBounds(40, 5, 50, 30);
        
        input = new JTextField();
        input.setHorizontalAlignment(JTextField.CENTER);
        input.setBounds(40, 35, 210, 30);
        input.setBackground(Color.WHITE);
        
        fromLabel = new JLabel();
        fromLabel.setText("FROM");
        fromLabel.setBounds(40, 70, 50, 30);
        
        mataUang = new JComboBox();
        mataUang.setModel(new DefaultComboBoxModel(new String[] {"IDR", "USD", "EURO", "DINAR"}));
        mataUang.setBounds(40, 100, 210, 30);
        dlcr.setHorizontalAlignment(JTextField.CENTER);
        mataUang.setRenderer(dlcr);
        mataUang.setBackground(Color.WHITE);
        mataUang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        toLabel = new JLabel();
        toLabel.setText("TO");
        toLabel.setBounds(40, 130, 50, 30);
        
        idr = new JRadioButton();
        idr.setText("IDR");
        idr.setBounds(40, 155, 45, 30);
        idr.setBackground(new Color(107, 185, 240));
        idr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        usd = new JRadioButton();
        usd.setText("USD");
        usd.setBounds(85, 155, 50, 30);
        usd.setBackground(new Color(107, 185, 240));
        usd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        euro = new JRadioButton();
        euro.setText("EURO");
        euro.setBounds(135, 155, 60, 30);
        euro.setBackground(new Color(107, 185, 240));
        euro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        dinar = new JRadioButton();
        dinar.setText("DINAR");
        dinar.setBounds(195, 155, 65, 30);
        dinar.setBackground(new Color(107, 185, 240));
        dinar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        pilihanUang = new ButtonGroup();
        pilihanUang.add(idr);
        pilihanUang.add(usd);
        pilihanUang.add(euro);
        pilihanUang.add(dinar);
        
        resultButton = new JButton();
        resultButton.setBounds(95, 190, 100, 30);
        resultButton.setIcon(new ImageIcon(getClass().getResource("images/ok.png")));
        resultButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        resultLabel = new JLabel();
        resultLabel.setText("RESULT");
        resultLabel.setBounds(125, 220, 50, 30);
        
        result = new JTextField();
        result.setHorizontalAlignment(JTextField.CENTER);
        result.setBounds(50, 250, 190, 30);
        result.setEditable(false);
        result.setBackground(Color.WHITE);
        result.setForeground(Color.BLACK);
        
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == resultButton) {
                    try {
                        uang = Integer.parseInt(input.getText());
                        if (mataUang.getSelectedItem().equals("IDR")) {
                            convertIDR();
                        }
                        if (mataUang.getSelectedItem().equals("USD")) {
                            convertUSD();
                        }
                        if (mataUang.getSelectedItem().equals("EURO")) {
                            convertEURO();
                        }
                        if (mataUang.getSelectedItem().equals("DINAR")) {
                            convertDINAR();
                        }
                    } catch (NumberFormatException error) {
                        if (input.getText().equals("") || !(input.getText().matches("[0-9]*"))) {
                            JOptionPane.showMessageDialog(null, "ERROR INPUT!", "ERROR", JOptionPane.ERROR_MESSAGE);
                            input.setText("");
                            pilihanUang.clearSelection();
                            result.setText("");
                        }
                    }

                }
            }
        });
        // menambahkan komponen ke dalam panel
        panel.add(inputLabel);
        panel.add(input);
        panel.add(fromLabel);
        panel.add(mataUang);
        panel.add(toLabel);
        panel.add(idr);
        panel.add(usd);
        panel.add(euro);
        panel.add(dinar);
        panel.add(resultLabel);
        panel.add(result);
        panel.add(resultButton);
        
        // Container frame
        this.getContentPane().add(panel);
        this.setSize(300, 340);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Praktikum5_1402020069().setVisible(true);
        });
    }
    // idr to all
    public void convertIDR(){
        if (idr.isSelected()) {
            result.setText("");
            JOptionPane.showMessageDialog(null, "IDR GABISA DICONVERT KE IDR!");
        }
        if (usd.isSelected()) {
            resultUang = (uang / 14513);
            result.setText(resultUang + " $");
        }
        if (euro.isSelected()) {
            resultUang = (uang / 16388);
            result.setText(resultUang + " €");
        }
        if (dinar.isSelected()) {
            resultUang = (uang / 48020);
            result.setText(resultUang + " د.ك"); 
        }
    }
    // usd to all
    public void convertUSD(){
        if (idr.isSelected()) {
            resultUang = uang * 14513;
            result.setText("Rp. " + resultUang);
        }
        if (usd.isSelected()) {
            result.setText("");
            JOptionPane.showMessageDialog(null, "USD GABISA DICONVERT KE USD!");
        }
        if (euro.isSelected()) {
            resultUang = ((uang * 14513) / 16388);
            result.setText(resultUang + " €");
        }
        if (dinar.isSelected()) {
            resultUang = ((uang * 14513) / 48020);
            result.setText(resultUang + " د.ك"); 
        }
    }
    // euro to all
    public void convertEURO(){
        if (idr.isSelected()) {
            resultUang = uang * 16388;
            result.setText("Rp. " + resultUang);
        }
        if (usd.isSelected()) {
            resultUang = ((uang * 16388) / 14513);
            result.setText(resultUang + " $");
        }
        if (euro.isSelected()) {
            result.setText("");
            JOptionPane.showMessageDialog(null, "EURO GABISA DICONVERT KE EURO!");
        }
        if (dinar.isSelected()) {
            resultUang = ((uang * 16388) / 48020);
            result.setText(resultUang + " د.ك"); 
        }
    }
    // dinar to all
    public void convertDINAR(){
        if (idr.isSelected()) {
            resultUang = uang * 48020;
            result.setText("Rp. " + resultUang);
        }
        if (usd.isSelected()) {
            resultUang = ((uang * 48020) / 14513);
            result.setText(resultUang + " $");
        }
        if (euro.isSelected()) {
            resultUang = ((uang * 48020) / 16388);
            result.setText(resultUang + " €");
        }
        if (dinar.isSelected()) {
            result.setText("");
            JOptionPane.showMessageDialog(null, "DINAR GABISA DICONVERT KE DINAR!");
        }
    }
}
