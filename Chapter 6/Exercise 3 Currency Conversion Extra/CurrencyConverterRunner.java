import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 * Window that converts euros to dollars and dollars to euros given the conversion rate and a currency amount.
 * 
 * 
 * @author Harold Boyett 
 * @version 2/22/2017
 */
public class CurrencyConverterRunner extends JFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Test");
        frame.setVisible(true);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField euroToDollar = new JTextField(15);
        JTextField dollarToEuro = new JTextField(15);
        JTextField dollars = new JTextField(15); 
        JTextField euros = new JTextField(15);

        JLabel euroToDollarLabel = new JLabel("Euro To Dollar Rate");
        JLabel dollarToEuroLabel = new JLabel("Dollar To Euro Rate");
        JLabel dollarsLabel = new JLabel("Dollars");
        JLabel eurosLabel = new JLabel("Euros");

        JButton button = new JButton();
        button.setSize(new Dimension(100, 100));
        button.setLocation(500, 350);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(euroToDollarLabel);
        panel.add(euroToDollar);
        panel.add(dollarToEuroLabel);
        panel.add(dollarToEuro);
        panel.add(dollarsLabel);
        panel.add(dollars);
        panel.add(eurosLabel);
        panel.add(euros);
        panel.add(button);

        euroToDollarLabel.setLocation(50, 450);
        dollarToEuroLabel.setLocation(50, 400);
        dollarsLabel.setLocation(500, 350);
        eurosLabel.setLocation(500, 350);
    }
}
