
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.text.NumberFormatter;

public class Shutdown {
    public static void main(String[] args) {
        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        NumberFormatter numberFormatter = new NumberFormatter(intFormat);
        numberFormatter.setValueClass(Integer.class);
        numberFormatter.setAllowsInvalid(false);
        numberFormatter.setMinimum(0);

        JFrame window = new JFrame("Shutdown");
        JLabel titoloLabel = new JLabel("Spegnimento programmato:"), trentaLabel = new JLabel(" 30 Min:"), unOraLabel = new JLabel("  1 Ora:"), dueOreLabel = new JLabel("  2 Ore:"), treOreLabel = new JLabel("  3 Ore:"), manualLabel = new JLabel("Manuale:"), secLabel = new JLabel("Seconds:"), minLabel = new JLabel("Minutes:"), houLabel = new JLabel("Hours:");
        JButton trentaButton = new JButton("30m"), unOraButton = new JButton("1h"), dueOreButton = new JButton("2h"), treOreButton = new JButton("3h"), manualButton = new JButton("Send");
        JFormattedTextField manualSecField = new JFormattedTextField(numberFormatter), manualMinField = new JFormattedTextField(numberFormatter), manualHouField = new JFormattedTextField(numberFormatter);
        JPanel trentaJPanel = new JPanel(), unOraJPanel = new JPanel(), dueOreJPanel = new JPanel(), treOreJPanel = new JPanel(), predefinitiJPanel = new JPanel(), textFieldJPanel = new JPanel(), minJPanel = new JPanel(), secJPanel = new JPanel(), houJPanel = new JPanel();

        //Graphic part

        window.setSize(700, 600);
        window.setLayout(null);
        window.getContentPane().setBackground(new Color(33, 194, 129));
        window.setResizable(false);
        window.add(predefinitiJPanel);window.add(titoloLabel);window.add(textFieldJPanel);window.add(manualLabel);window.add(manualButton);

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

        manualLabel.setBounds(270, 300, 150, 60);
        manualLabel.setFont(new Font("Verdana", Font.BOLD, 25));

        textFieldJPanel.setLayout(null);
        textFieldJPanel.setBackground(null);
        textFieldJPanel.setBounds(170, 350, 460, 100);
        textFieldJPanel.add(minJPanel);textFieldJPanel.add(houJPanel);textFieldJPanel.add(secJPanel);

        secJPanel.setLayout(new GridLayout(0, 1));
        secJPanel.setBackground(null);
        secJPanel.setBounds(0, 0, 100, 50);
        secJPanel.add(secLabel);secJPanel.add(manualSecField);

        minJPanel.setLayout(new GridLayout(0, 1));
        minJPanel.setBackground(null);
        minJPanel.setBounds(120, 0, 100, 50);
        minJPanel.add(minLabel);minJPanel.add(manualMinField);

        houJPanel.setLayout(new GridLayout(0, 1));
        houJPanel.setBackground(null);
        houJPanel.setBounds(240, 0, 100, 50);
        houJPanel.add(houLabel);houJPanel.add(manualHouField);

        manualButton.setBounds(260, 450, 150, 60);
        manualButton.setFont(new Font("Verdana", Font.PLAIN, 18));

        //Action part
        // https://stackoverflow.com/questions/11093326/restricting-jtextfield-input-to-integers
        // 

        Runtime runTime = Runtime.getRuntime();

        trentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    runTime.exec(Timing.shutTime('m', 0, 30, 0));
                } catch (IOException ex) {
                }
                window.dispose();
            }
        });

        unOraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    runTime.exec(Timing.shutTime('h', 0, 0, 1));
                } catch (IOException ex) {
                }
                window.dispose();
            }
        });

        dueOreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    runTime.exec(Timing.shutTime('h', 0, 0, 2));
                } catch (IOException ex) {
                }
                window.dispose();
            }
        });

        treOreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    runTime.exec(Timing.shutTime('h', 0, 0, 3));
                } catch (IOException ex) {
                }
                window.dispose();
            }
        });

        manualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sec = manualSecField.getText(), min = manualMinField.getText(), hou = manualHouField.getText();
                if(sec.isBlank())
                    sec = "0";

                if(min.isBlank())
                    min = "0";

                if(hou.isBlank())
                    hou = "0";
                
                try {
                    runTime.exec(Timing.shutTime('h', Integer.parseInt(sec), Integer.parseInt(min), Integer.parseInt(hou)));
                } catch (NumberFormatException | IOException e1) {
                    e1.printStackTrace();
                }
                window.dispose();
            }
        });

        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
