package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class WindowConnexion extends JFrame {

    private JTextField mailText;
    private JPasswordField pass;
    private JButton connexionButton;

    public WindowConnexion() {
        setTitle("Connexion");
        setMinimumSize(new Dimension(600,600));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("resources/vegeta.png");
        setIconImage(icon.getImage());

        JPanel pane = (JPanel) getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        mailText = new JTextField();
        mailText.setMinimumSize(new Dimension(150,30));
        mailText.setMaximumSize(new Dimension(150,30));
        mailText.setBackground(Color.white);
        add(mailText);

        pass = new JPasswordField();
        pass.setMinimumSize(new Dimension(150,30));
        pass.setMaximumSize(new Dimension(150, 30));
        pass.setBackground(Color.white);
        add(pass);

        JLabel mail = new JLabel("Mail :");
        mail.setForeground(Color.BLACK);
        JLabel mot_de_passe = new JLabel("Mot de passe :");
        mot_de_passe.setForeground(Color.BLACK);

        connexionButton = new JButton("Se connecter");
        connexionButton.setForeground(Color.BLACK);


        gl.setHorizontalGroup(gl.createParallelGroup()
                .addGroup(gl.createSequentialGroup()
                        .addComponent(mail)
                        .addComponent(mailText)
                        .addComponent(mot_de_passe)
                        .addComponent(pass)
                )
                .addGroup(gl.createSequentialGroup()
                        .addComponent(connexionButton)
                )
        );
        gl.setVerticalGroup(gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup()
                        .addComponent(mail)
                        .addComponent(mailText)
                        .addComponent(mot_de_passe)
                        .addComponent(pass)
                )
                .addGroup(gl.createParallelGroup()
                        .addComponent(connexionButton)
                )
        );
        pack();
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
    }

    public JTextField getMailText() {
        return mailText;
    }

    public void setMailText(JTextField mailText) {
        this.mailText = mailText;
    }

    public JPasswordField getPass() {
        return pass;
    }

    public void setPass(JPasswordField pass) {
        this.pass = pass;
    }

    public JButton getConnexionButton() {
        return connexionButton;
    }

    public void setConnexionButton(JButton connexionButton) {
        this.connexionButton = connexionButton;
    }
}
