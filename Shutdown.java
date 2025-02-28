
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Shutdown {
    public static void main(String[] args) {
        JFrame window = new JFrame("Shutdown");
        JLabel titoloLabel = new JLabel("Spegnimento programmato:"), trentaLabel = new JLabel("30 Minuti:"), unOraLabel = new JLabel("1 Ora:"), dueOreLabel = new JLabel("2 Ore:"), treOreLabel = new JLabel("3 Ore:"), manualLabel = new JLabel("Manuale");
        JButton trentaButton = new JButton("30m"), unOraButton = new JButton("1h"), dueOreButton = new JButton("2h"), treOreButton = new JButton("3h"), manualButton = new JButton("Manuale");
        JTextField manualField = new JTextField("*solo numeri senza virgola*");
        JPanel predefinitiJPanel = new JPanel();

        window.setSize(550, 700);
        predefinitiJPanel.add(trentaLabel);predefinitiJPanel.add(trentaButton);
        predefinitiJPanel.add(unOraLabel);predefinitiJPanel.add(unOraButton);
        predefinitiJPanel.add(dueOreLabel);predefinitiJPanel.add(dueOreButton);
        predefinitiJPanel.add(treOreLabel);predefinitiJPanel.add(treOreButton);

    }
}
