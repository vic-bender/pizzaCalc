/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaservingscalculator;

import javax.swing.*; // imports
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Victor A. Bender
 */
public class PizzaServingsCalculator extends JFrame {
    JPanel line1 = new JPanel(); // variable setup
    JPanel line2 = new JPanel();
    JPanel line3 = new JPanel();
    JPanel line4 = new JPanel();
    
    
    JLabel title = new JLabel("Pizza Servings Calculator"); // text fields
    JLabel pizzaPrompt = new JLabel("Enter the size of the pizza in inches: ");
    JLabel result = new JLabel();
    
    JTextField inInput = new JTextField(5); // input area
    
    JButton calcButton = new JButton("Calculate Servings"); // button
    
    private class calcHandler implements ActionListener { // handler for the button
        @Override
        public void actionPerformed(ActionEvent event)
        {
            Double ans = Math.pow((Double.parseDouble(inInput.getText()) / 8), 2);
            result.setText("A " + inInput.getText() + " inch pizza will serve " + ans.toString() + " People");
        }
    }
    
    public PizzaServingsCalculator() {
        super("Pizza Servings Calculator"); // initial steps
        setLayout(new GridLayout(4, 1));
        
        
        title.setForeground(Color.red); // set title
        line1.add(title);
        
        line2.add(pizzaPrompt); // set input line
        line2.add(inInput);
        
        line3.add(calcButton); // set button
        calcHandler calc = new calcHandler();
        calcButton.addActionListener(calc);
        
        line4.add(result); // set result string
        
        add(line1); // add all to the grid and therefore frame
        add(line2);
        add(line3);
        add(line4);
        
    }
    
    public static void main(String[] args) {
        PizzaServingsCalculator testCalc = new PizzaServingsCalculator(); // testing setup
        testCalc.setSize(350, 300);
        testCalc.setVisible(true);
        
    }
}
