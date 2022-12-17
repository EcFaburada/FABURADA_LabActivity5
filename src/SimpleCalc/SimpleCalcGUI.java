package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;
    private JTextField tfNumber1;
    private JTextField tfNumber2;

    public SimpleCalcGUI() {
    btnCompute.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            try {

                int num1;
                int num2;
                int total;

                num1 = Integer.parseInt(tfNumber1.getText());
                num2 = Integer.parseInt(tfNumber2.getText());

                if (cbOperations.getSelectedItem().equals("+")) {

                    total = (Integer.parseInt(tfNumber1.getText()) + Integer.parseInt(tfNumber2.getText()));

                    lblResult.setText(Integer.toString(total));


                } else if (cbOperations.getSelectedItem().equals("-")) {

                    total = (Integer.parseInt(tfNumber1.getText()) - Integer.parseInt(tfNumber2.getText()));

                    lblResult.setText(Integer.toString(total));


                } else if (cbOperations.getSelectedItem().equals("*")) {

                    total = (Integer.parseInt(tfNumber1.getText()) * Integer.parseInt(tfNumber2.getText()));

                    lblResult.setText(Integer.toString(total));


                } else if (cbOperations.getSelectedItem().equals("/")) {

                    total = (Integer.parseInt(tfNumber1.getText()) / Integer.parseInt(tfNumber2.getText()));

                    lblResult.setText(Integer.toString(total));
                }
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(null, "Error It is not a Number");

            }
        }
    });
    }


    public static void main(String[] args) {

        SimpleCalcGUI simcal = new SimpleCalcGUI();

        simcal.setContentPane(simcal.panel1);

        simcal.setTitle("Simple Calculator");

        simcal.setSize(900,420);

        simcal.setVisible(true);

        simcal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        simcal.cbOperations.addItem("+");

        simcal.cbOperations.addItem("-");

        simcal.cbOperations.addItem("*");

        simcal.cbOperations.addItem("/");

    }
}