
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Shutdown {
    public static void main(String[] args) {
        JFrame window = new JFrame("Shutdown");
        JLabel titoloLabel = new JLabel("Spegnimento programmato:"), trentaLabel = new JLabel(" 30 Min:"), unOraLabel = new JLabel("  1 Ora:"), dueOreLabel = new JLabel("  2 Ore:"), treOreLabel = new JLabel("  3 Ore:"), manualLabel = new JLabel("Manuale");
        JButton trentaButton = new JButton("30m"), unOraButton = new JButton("1h"), dueOreButton = new JButton("2h"), treOreButton = new JButton("3h"), manualButton = new JButton("Manuale");
        JTextField manualSecField = new JTextField("0"), manualMinField = new JTextField("0"), manualHouField = new JTextField("0");
        JPanel trentaJPanel = new JPanel(), unOraJPanel = new JPanel(), dueOreJPanel = new JPanel(), treOreJPanel = new JPanel(), predefinitiJPanel = new JPanel();

        window.setSize(700, 600);
        window.setLayout(null);
        window.getContentPane().setBackground(new Color(33, 194, 129));
        window.add(predefinitiJPanel);window.add(titoloLabel);

        titoloLabel.setFont(new Font("Verdana", Font.BOLD, 30));
        titoloLabel.setBounds(105, 40, 500, 60);
        titoloLabel.setForeground(new Color(61, 73, 179));

        predefinitiJPanel.setLayout(null);
        predefinitiJPanel.setBackground(null);
        predefinitiJPanel.setBounds(110, 160, 460, 100);
        predefinitiJPanel.add(trentaJPanel);predefinitiJPanel.add(unOraJPanel);predefinitiJPanel.add(dueOreJPanel);predefinitiJPanel.add(treOreJPanel);

        trentaJPanel.setLayout(new GridLayout(0, 1));
        trentaJPanel.setBackground(null);
        trentaJPanel.setBounds(0, 0, 100, 100);
        trentaJPanel.add(trentaLabel);trentaJPanel.add(trentaButton);
        trentaLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        trentaButton.setFont(new Font("Verdana", Font.PLAIN, 18));

        unOraJPanel.setLayout(new GridLayout(0, 1));
        unOraJPanel.setBackground(null);
        unOraJPanel.setBounds(120, 0, 100, 100);
        unOraJPanel.add(unOraLabel);unOraJPanel.add(unOraButton);
        unOraLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        unOraButton.setFont(new Font("Verdana", Font.PLAIN, 18));

        dueOreJPanel.setLayout(new GridLayout(0, 1));
        dueOreJPanel.setBackground(null);
        dueOreJPanel.setBounds(240, 0, 100, 100);
        dueOreJPanel.add(dueOreLabel);dueOreJPanel.add(dueOreButton);
        dueOreLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        dueOreButton.setFont(new Font("Verdana", Font.PLAIN, 18));

        treOreJPanel.setLayout(new GridLayout(0, 1));
        treOreJPanel.setBackground(null);
        treOreJPanel.setBounds(360, 0, 100, 100);
        treOreJPanel.add(treOreLabel);treOreJPanel.add(treOreButton);
        treOreLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        treOreButton.setFont(new Font("Verdana", Font.PLAIN, 18));

        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
