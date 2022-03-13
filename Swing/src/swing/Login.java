
package swing;

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame{
    JLabel user = new JLabel("Username: ");
    JLabel pw = new JLabel("Password: ");
    JTextField formUser = new JTextField();
    JPasswordField formPw = new JPasswordField();
    JButton login = new JButton("Login");
    JButton cancel = new JButton("Cancel");
    
    public Login(){
        setTitle("Belajar Swing PBO");
        setSize(205,140);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(null);
        add(user);
        add(formUser);
        add(pw);
        add(formPw);
        add(login);
        add(cancel);
        
        user.setBounds(10, 10, 70, 20);
        formUser.setBounds(80, 10, 100, 20);
        pw.setBounds(10, 35, 70, 20);
        formPw.setBounds(80, 35, 100, 20);
        login.setBounds(10, 70, 80, 20);
        cancel.setBounds(100, 70, 80, 20);
    }
}
