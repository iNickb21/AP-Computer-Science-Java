import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 * Window that converts euros to dollars and dollars to euros given the conversion rate and a currency amount.
 * 
 * 
 * @author Harold Boyett 
 * @version 2/22/2017
 */
public class CurrencyConverterRunner implements ActionListener
{
    public static void main(String[] args)
    {        
       final JFrame frame = new JFrame("Currency Converter");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4,2,4,4));
        initComponents(frame);

        //frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        


    }

    private static void initComponents(JFrame frame)
    {
        final JTextField rate = new JTextField(20);
        final JTextField dollars = new JTextField(20);
        final JTextField euros = new JTextField(20);
        final JLabel rateLabel = new JLabel("Rate");
        final JLabel dollarsLabel = new JLabel("USD");
        final JLabel eurosLabel = new JLabel("Euros");
        final Button convertButton = new Button("Convert");
        
        convertButton.addActionListener(this);

        /*jtf.getDocument().addDocumentListener(new DocumentListener()
        {

            @Override
            public void insertUpdate(DocumentEvent de)
            {
                ta.setText(jtf.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                ta.setText(jtf.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            //Plain text components don't fire these events.
            }
        });*/
        
        /*ta.getDocument().addDocumentListener(new DocumentListener()
        {

            @Override
            public void insertUpdate(DocumentEvent de)
            {
                jtf.setText(ta.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                jtf.setText(ta.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            //Plain text components don't fire these events.
            }
        });*/
        
       
        
        frame.getContentPane().add(rateLabel);
        frame.getContentPane().add(rate);
        frame.getContentPane().add(dollarsLabel);
        frame.getContentPane().add(dollars);
        frame.getContentPane().add(eurosLabel);
        frame.getContentPane().add(euros);
        frame.getContentPane().add(convertButton);
        frame.getContentPane().add(new Button("Reset"));
    }
    public void actionPerformed(ActionEvent e)
    {
       CurrencyConverter converter = new CurrencyConverter(Double.parseDouble(rate.getText));
    }
}
