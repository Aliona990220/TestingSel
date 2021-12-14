import javax.swing.*;
import java.awt.*;

public class TextFieldTest extends JFrame{
    JTextField smallField, bigField;

    public TextFieldTest()
    {
        super("Текстові поля");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        smallField = new JTextField(15);
        smallField.setToolTipText("Коротке поле");
        bigField = new JTextField("Текст поля", 25);
        bigField.setToolTipText("Довге поле");

        bigField.setFont(new Font("Dialog", Font.PLAIN, 14));
        bigField.setHorizontalAlignment(JTextField.RIGHT);

        smallField.addActionListener(e -> JOptionPane.showMessageDialog(TextFieldTest.this,
                "Ваше слово: " + smallField.getText()));

        JPasswordField password = new JPasswordField(12);
        password.setEchoChar('*');

        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(smallField);
        contents.add(bigField  );
        contents.add(password  );
        setContentPane(contents);

        setSize(400, 130);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TextFieldTest();
    }
}

