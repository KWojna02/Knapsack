package org.example;

import javax.swing.*;
import java.awt.*;

public class UserInterface {

    private JTextField nField;
    private JLabel nLabel;
    private JTextField seedField;
    private JPanel panel1;
    private JScrollPane itemPane;
    private JTextField capacityField;
    private JLabel seedLabel;
    private JLabel solutionLabel;
    private JLabel capacityLabel;
    private JTextArea itemsList;
    private JTextField upperBoundField;
    private JTextField lowerBoundField;
    private JLabel lowerBoundLabel;
    private JLabel upperBoundLabel;
    private JButton buttonSolve;
    private JLabel itemsListLabel;
    private JTextArea solutionList;

    public UserInterface() {
        buttonSolve.addActionListener(e -> {
            onButtonClick();
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("KnapsackGUI");
        frame.setContentPane(new UserInterface().panel1);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void onButtonClick() {
        try {
            int n = Integer.parseInt(nField.getText());
            int seed = Integer.parseInt(seedField.getText());
            int capacity = Integer.parseInt(capacityField.getText());
            int lowerBound = Integer.parseInt(lowerBoundField.getText());
            int upperBound = Integer.parseInt(upperBoundField.getText());

            if (n <= 0 || seed <= 0 || capacity <= 0 || upperBound <= 0 || lowerBound <= 0) {
                JOptionPane.showMessageDialog(panel1, "All values must be positive.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Problem problem = new Problem(n, seed, lowerBound, upperBound);
            itemsList.setText(problem.toString());

            Result solution = problem.solve(capacity);
            solutionList.setText(solution.toString());


        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(panel1, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(panel1, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        nLabel = new JLabel();
        nLabel.setText("Number of items:");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel1.add(nLabel, gbc);
        nField = new JTextField();
        nField.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 5, 5, 5);
        panel1.add(nField, gbc);
        seedLabel = new JLabel();
        seedLabel.setText("Seed:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel1.add(seedLabel, gbc);
        seedField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 5, 5, 5);
        panel1.add(seedField, gbc);
        itemPane = new JScrollPane();
        itemPane.setAlignmentX(0.5f);
        itemPane.setEnabled(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridheight = 11;
        gbc.weightx = 0.07;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel1.add(itemPane, gbc);
        itemsList = new JTextArea();
        itemsList.setDisabledTextColor(new Color(-16777216));
        itemsList.setEditable(false);
        itemsList.setEnabled(false);
        itemPane.setViewportView(itemsList);
        capacityField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 5, 5, 5);
        panel1.add(capacityField, gbc);
        capacityLabel = new JLabel();
        capacityLabel.setText("Capacity:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel1.add(capacityLabel, gbc);
        upperBoundField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 5, 5, 5);
        panel1.add(upperBoundField, gbc);
        lowerBoundField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 5, 5, 5);
        panel1.add(lowerBoundField, gbc);
        lowerBoundLabel = new JLabel();
        lowerBoundLabel.setText("Lower bound:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel1.add(lowerBoundLabel, gbc);
        upperBoundLabel = new JLabel();
        upperBoundLabel.setText("Upper bound:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel1.add(upperBoundLabel, gbc);
        buttonSolve = new JButton();
        buttonSolve.setLabel("Solve");
        buttonSolve.setText("Solve");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel1.add(buttonSolve, gbc);
        final JScrollPane scrollPane1 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 3;
        gbc.weightx = 0.025;
        gbc.weighty = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel1.add(scrollPane1, gbc);
        solutionList = new JTextArea();
        solutionList.setEditable(false);
        solutionList.setEnabled(true);
        scrollPane1.setViewportView(solutionList);
        solutionLabel = new JLabel();
        solutionLabel.setText("Solution");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(5, 5, 5, 25);
        panel1.add(solutionLabel, gbc);
        itemsListLabel = new JLabel();
        itemsListLabel.setText("Generated items:");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel1.add(itemsListLabel, gbc);
        nLabel.setLabelFor(nField);
        seedLabel.setLabelFor(seedField);
        capacityLabel.setLabelFor(capacityField);
        lowerBoundLabel.setLabelFor(lowerBoundField);
        upperBoundLabel.setLabelFor(upperBoundField);
        solutionLabel.setLabelFor(itemPane);
        itemsListLabel.setLabelFor(itemsList);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
