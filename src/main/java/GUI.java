import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;

public class GUI {
    public static void main(String[] args) {
        JFrame window = new JFrame("My super cool search app");
        window.setSize(400, 500);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // input panel
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.setBorder(new TitledBorder("Query"));
        window.add(inputPanel, BorderLayout.NORTH);
        JTextField input = new JTextField(20);
        inputPanel.add(input, BorderLayout.CENTER);
        JButton submit = new JButton("Submit");
        inputPanel.add(submit, BorderLayout.EAST);

        // output panel
        JPanel outputPanel = new JPanel(new BorderLayout());
        outputPanel.setBorder(new TitledBorder("Result"));
        window.add(outputPanel, BorderLayout.CENTER);
        JTextArea output = new JTextArea();
        output.setEditable(false);
        outputPanel.add(output, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
//        window.add(menuBar, BorderLayout.NORTH);

        // Tạo menu "Tệp"
        JMenu fileMenu = new JMenu("Tệp");
        menuBar.add(fileMenu);

        // Thêm các mục menu vào "Tệp"
        JMenuItem newMenuItem = new JMenuItem("Mới");
        fileMenu.add(newMenuItem);

        JMenuItem openMenuItem = new JMenuItem("Mở");
        fileMenu.add(openMenuItem);

        // Tạo menu "Sửa"
        JMenu editMenu = new JMenu("Sửa");
        menuBar.add(editMenu);

// Thêm các mục menu vào "Sửa"
        JMenuItem copyMenuItem = new JMenuItem("Sao chép");
        editMenu.add(copyMenuItem);

        JMenuItem pasteMenuItem = new JMenuItem("Dán");
        editMenu.add(pasteMenuItem);
    }
}