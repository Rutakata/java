import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;

public class Lab4 {
    public static void main(String[] args) {
        JFrame jFrame = createJFrame();
        JPanel jPanel = createJPanel();
        jPanel.setLayout(null);
        jFrame.add(jPanel);
    }

    static JFrame createJFrame() {
        JFrame jFrame = new JFrame("Lab4");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(400, 100, 650, 550);
        jFrame.setResizable(false);

        return jFrame;
    }

    static JPanel createJPanel() {
        JPanel jPanel = new JPanel();
        
        Color background = new ColorUIResource(239, 169, 98);
        JLabel convertion = new JLabel("Конвертація документів");
        JLabel taskLabel = new JLabel("Оберіть завдання");
        JLabel pdfConvert = new JLabel("Конвертувати в PDF");
        JLabel wordConvert = new JLabel("Конвертувати в Microsoft Word");
        JLabel excelConvert = new JLabel("Конвертувати в Microsoft Excel");
        JLabel fileName = new JLabel("Ім'я файлу");
        JTextField filenameField = new JTextField();
        JLabel terms = new JLabel("Я погоджуюсь з Умовами");
        JCheckBox termsBox = new JCheckBox();
        JButton nextButton = new JButton("Далі");

        JLabel pdfIco = new JLabel();
        pdfIco.setIcon(new ImageIcon(new ImageIcon("pdf.png").getImage().getScaledInstance(40, 50, Image.SCALE_DEFAULT)));
        JLabel wordIco = new JLabel();
        wordIco.setIcon(new ImageIcon(new ImageIcon("word.png").getImage().getScaledInstance(40, 50, Image.SCALE_DEFAULT)));
        JLabel excelIco = new JLabel();
        excelIco.setIcon(new ImageIcon(new ImageIcon("excel.png").getImage().getScaledInstance(40, 50, Image.SCALE_DEFAULT)));

        convertion.setForeground(new ColorUIResource(206, 17, 17));
        convertion.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 40));
        convertion.setBounds(20, 20, 600, 70);
        
        taskLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        taskLabel.setBounds(40, 100, 400,30);

        pdfConvert.setFont(new Font("Serif", Font.PLAIN, 20));
        pdfConvert.setBounds(200, 160, 300, 30);

        wordConvert.setFont(new Font("Serif", Font.PLAIN, 20));
        wordConvert.setBounds(200, 220, 300, 30);

        excelConvert.setFont(new Font("Serif", Font.PLAIN, 20));
        excelConvert.setBounds(200, 280, 300, 30);

        fileName.setFont(new Font("Serif", Font.ITALIC, 20));
        fileName.setBounds(60, 360, 100, 30);
        filenameField.setFont(new Font("Serif", Font.PLAIN, 20));
        filenameField.setBounds(160, 360, 300, 40);

        termsBox.setBounds(40, 440, 20, 20);
        terms.setFont(new Font("Serif", Font.PLAIN, 20));
        terms.setBounds(70, 435, 300, 30);

        nextButton.setBounds(500, 400, 100, 40);
        nextButton.setBackground(Color.red);
        nextButton.setForeground(Color.WHITE);
        nextButton.setFont(new Font("Serif", Font.BOLD, 20));

        pdfIco.setBounds(140, 140, 40, 50);
        wordIco.setBounds(140, 200, 40, 50);
        excelIco.setBounds(140, 260, 40, 50);

        jPanel.setBackground(background);
        jPanel.add(convertion);
        jPanel.add(taskLabel);
        jPanel.add(pdfConvert);
        jPanel.add(wordConvert);
        jPanel.add(excelConvert);
        jPanel.add(fileName);
        jPanel.add(filenameField);
        jPanel.add(terms);
        jPanel.add(termsBox);
        jPanel.add(nextButton);
        jPanel.add(pdfIco);
        jPanel.add(wordIco);
        jPanel.add(excelIco);

        

        return jPanel;
    }
}