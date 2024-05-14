package ir;

import scala.collection.immutable.Map;
import scala.collection.immutable.Set;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class GUI {
    public static void main(String[] args) {
        JFrame window = new JFrame("Search Engine");
        window.setSize(400, 500);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // input panel
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.setBorder(new TitledBorder("Query"));
        window.add(inputPanel, BorderLayout.NORTH);
        JTextField input = new JTextField(20);
        inputPanel.add(input, BorderLayout.CENTER);
        JButton submit = new JButton("Search");
        inputPanel.add(submit, BorderLayout.EAST);

        // output panel
        JPanel outputPanel = new JPanel(new BorderLayout());
        outputPanel.setBorder(new TitledBorder("Result"));
        window.add(outputPanel, BorderLayout.CENTER);
        JTextArea output = new JTextArea();
        output.setEditable(false);
        outputPanel.add(output, BorderLayout.CENTER);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = input.getText();
                Map<String, Set<String>> index = BooleanSearch$.MODULE$.loadIndex("index/index.txt");
                Set<String> result = BooleanSearch$.MODULE$.searchQuery(query);
                output.append(result + "\n");
            }
        });
    }
}