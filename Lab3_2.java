import javax.swing.*;
import java.awt.*;


public class Lab3_2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab 3 Part 2");
        jFrame.add(new Component());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(400, 100, 550, 400);
    }

    static class Component extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics = (Graphics2D)g;
            Font labelFont = new Font("Times New Roman", Font.ITALIC, 18);
            Font headerFont = new Font("Times New Roman", Font.BOLD, 24);

            graphics.drawLine(40, 30, 40, 300);
            graphics.drawLine(40, 300, 500, 300);

            graphics.setColor(Color.RED);
            graphics.fillRect(70, 100, 80, 200);
            graphics.setColor(Color.GREEN);
            graphics.fillRect(170, 80, 80, 220);
            graphics.setColor(Color.BLUE);
            graphics.fillRect(270, 50, 80, 250);
            graphics.setColor(Color.YELLOW);
            graphics.fillRect(370, 60, 80, 240);

            graphics.setFont(labelFont);
            graphics.setColor(Color.BLUE);
            graphics.drawString("43$ тис.", 80, 90);
            graphics.drawString("51$ тис.", 180, 70);
            graphics.drawString("62.5$ тис.", 280, 40);
            graphics.drawString("60$ тис.", 380, 50);

            graphics.setFont(headerFont);
            graphics.setColor(Color.BLACK);
            graphics.drawString("Дохідність компанії за кварталами", 80, 20);
        }
    }
}
