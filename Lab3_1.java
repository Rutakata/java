import javax.swing.*;
import java.awt.*;


public class Lab3_1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab 3 Part 1");
        jFrame.add(new Component());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(400, 100, 550, 300);
        jFrame.setResizable(false);
    }

    static class Component extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics = (Graphics2D)g;
            Font font = new Font("Times New Roman", Font.PLAIN, 16);

            int xPol[] = {340, 400, 440, 340};
            int yPol[] = {30, 30, 130, 130};

            graphics.setFont(font);
            graphics.setColor(Color.DARK_GRAY);
            graphics.drawString("Червоний круг", 100, 20);
            graphics.drawString("Синій квадрат", 220, 20);
            graphics.drawString("Зелена трапеція", 340, 20);

            graphics.setColor(Color.RED);
            graphics.fillOval(100, 30, 100, 100);

            graphics.setColor(Color.BLUE);
            graphics.fillRect(220, 30, 100, 100);

            graphics.setColor(Color.GREEN);
            graphics.fillPolygon(xPol, yPol, 4);

            graphics.setColor(Color.DARK_GRAY);
            graphics.drawString("Пелішенко В. ПП-42", 380, 250);
        }
    }
}