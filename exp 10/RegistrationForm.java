import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {

    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton registerButton;

    private JLabel nameError, emailError, passwordError, confirmPasswordError, successMessage;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 3, 5, 5));

        
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        nameError = new JLabel();
        nameError.setForeground(Color.RED);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        emailError = new JLabel();
        emailError.setForeground(Color.RED);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        passwordError = new JLabel();
        passwordError.setForeground(Color.RED);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        confirmPasswordError = new JLabel();
        confirmPasswordError.setForeground(Color.RED);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        successMessage = new JLabel();
        successMessage.setForeground(new Color(0, 128, 0));

        // Add components
        add(nameLabel);
        add(nameField);
        add(nameError);

        add(emailLabel);
        add(emailField);
        add(emailError);

        add(passwordLabel);
        add(passwordField);
        add(passwordError);

        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(confirmPasswordError);

        add(new JLabel()); 
        add(registerButton);
        add(new JLabel()); 

        add(new JLabel()); 
        add(successMessage);
        add(new JLabel()); 

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Clear previous messages
        nameError.setText("");
        emailError.setText("");
        passwordError.setText("");
        confirmPasswordError.setText("");
        successMessage.setText("");

        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        boolean valid = true;

        if (name.isEmpty()) {
            nameError.setText("Name required");
            valid = false;
        }

        if (email.isEmpty()) {
            emailError.setText("Email required");
            valid = false;
        } else if (!email.contains("@")) {
            emailError.setText("Invalid email");
            valid = false;
        }

        if (password.isEmpty()) {
            passwordError.setText("Password required");
            valid = false;
        }

        if (confirmPassword.isEmpty()) {
            confirmPasswordError.setText("Confirm password");
            valid = false;
        } else if (!password.equals(confirmPassword)) {
            confirmPasswordError.setText("Passwords do not match");
            valid = false;
        }

        if (valid) {
            successMessage.setText("Registration successful!");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
