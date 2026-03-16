import javax.swing.*;
import java.awt.event.*;

public class LoginGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");

        JLabel label = new JLabel("Login Screen");
        label.setBounds(120,50,200,30);

        JButton btn = new JButton("Login");
        btn.setBounds(120,120,100,30);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Login button clicked");
            }
        });

        frame.add(label);
        frame.add(btn);

        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
