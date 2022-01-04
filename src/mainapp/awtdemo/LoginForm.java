package mainapp.awtdemo;

import java.awt.*;

public class LoginForm extends Frame {
    private Label lblusername,lblpassword;
    private TextField txtuser,txtpassword;
    private Button btnlogin;

    public LoginForm(){
        lblusername=new Label("Username:");
        lblpassword=new Label("Passowrd:");
        txtuser=new TextField();
        txtpassword=new TextField();
        btnlogin=new Button("Login");

        setVisible(true);
        setTitle("User Login");
        setSize(300,200);
        setResizable(true);
        setLayout(null);

        add(lblusername);
        lblusername.setBounds(20,30,80,30);
        add(txtuser);
        txtuser.setBounds(120,30,150,30);

        add(lblpassword);
        lblpassword.setBounds(20,80,80,30);
        add(txtpassword);
        txtpassword.setBounds(120,80,150,30);

        add(btnlogin);
        btnlogin.setBounds(120,130,50,30);

    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
