import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class BenutzerLogin extends JFrame {
    private static JLabel loginLabel;
    private static JTextField loginField;
    private static JLabel passwordLabel;
    private static JPasswordField passwordField;
    private static JButton button;

    public void LoginPage(){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setTitle("User Sing in programm");
        frame.setSize(300,160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        frame.setLocationRelativeTo(null);


        loginLabel = new JLabel("Login: ");
        loginLabel.setBounds(10,20,80,25);
        panel.add(loginLabel);

        loginField = new JTextField(20);
        loginField.setBounds(100,20,165,25);
        panel.add(loginField);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100,50,165,25);
        panel.add(passwordField);

        button = new JButton("Sing in");
        button.setBounds(10,80,80,25);
        panel.add(button);
        frame.setVisible(true);

        handler handler = new handler();
        loginField.addActionListener(handler);
        passwordField.addActionListener(handler);
        button.addActionListener(handler);
    }

    private class handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String log = loginField.getText();
            char[] psw = passwordField.getPassword();
            String userLog = "Marco";
            char[] userPsw = {'R','i','e','g','e'};

            if(log.equals(userLog)&& Arrays.equals(psw,userPsw) ){
                dispose();
                secretWindow();
                System.out.println();
            }
            else{
                ErrorWindow();
            }
        }
    }

    public void ErrorWindow(){
        JFrame errorWindow = new JFrame();

        errorWindow.setSize(250,150);
        errorWindow.setLayout(null);
        errorWindow.setLocationRelativeTo(null);

        JLabel errorLabel = new JLabel("Wrong login or password, try again.");
        errorLabel.setBounds(10,40,230,25);
        errorWindow.add(errorLabel);
        errorWindow.setVisible(true);

    }
    private void secretWindow(){
        JFrame secretWindow = new JFrame();

        secretWindow.setSize(300,160);
        secretWindow.setLayout(null);
        secretWindow.setLocationRelativeTo(null);
        secretWindow.getContentPane().setBackground(Color.green);
        secretWindow.setTitle("Secret Window");

        JLabel secretLabel = new JLabel("You're inside!");
        secretLabel.setFont(new Font("Arial",Font.BOLD, 30));
        secretLabel.setBounds(40,40,230,25);
        secretWindow.add(secretLabel);
        secretWindow.setVisible(true);

    }



}
