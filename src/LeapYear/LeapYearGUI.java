package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;


public LeapYearGUI() {
    btnCheckYear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
                try {

                    int year;

                    year = Integer.parseInt(tfYear.getText());
                    if (year % 400 == 0) {
                        JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
                    } else if  (year % 100 == 0) {
                        JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");
                    } else if  (year % 4 == 0) {
                        JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");

                    }

                } catch  (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid Not a Year");
                }
            }
     });

    }
        public  static void main(String[] args) {

             LeapYearGUI lpchecker = new LeapYearGUI();

             lpchecker.setContentPane(lpchecker.panel1);

             lpchecker.setTitle("Leap Year Checker");

            lpchecker.setSize(420,380);

            lpchecker.setVisible(true);

            lpchecker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

