import javax.swing.*;

public class Lab13 {
    private JSlider slider1;
    private JTextField текстовоеПолеTextField;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Вариант 4");
        frame.setContentPane(new Lab13().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,320);

    }
}
