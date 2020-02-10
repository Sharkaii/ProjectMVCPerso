package vue;

import com.mysql.cj.xdevapi.JsonArray;
import model.organisateurs.Organisateur;

import javax.swing.*;
import java.awt.*;

public class WindowAccueil extends JFrame {

    public WindowAccueil(Organisateur organisateur) {
        setTitle("Accueil");
        setMinimumSize(new Dimension(600,600));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("resources/vegeta.png");
        setIconImage(icon.getImage());

        String[] columnNames = {
                "id",
                "typeCompte",
                "mail",
                "password",
                "parrain"
        };

        Object[][] data = {
                {organisateur.getId(), organisateur.getTypeCompteId(), organisateur.getMail(), organisateur.getPassword(), organisateur.getParrainId()},
        };

        JTable tableOrganisateur = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(tableOrganisateur);

        JPanel pane = (JPanel) getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createParallelGroup()
                .addGroup(gl.createSequentialGroup()
                        .addComponent(scrollPane)
                )
        );
        gl.setVerticalGroup(gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup()
                        .addComponent(scrollPane)
                )
        );
        pack();

    }

}
