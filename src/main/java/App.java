import controller.ConnectionController;
import model.AccesBdd;
import model.organisateurs.Organisateur;
import model.organisateurs.OrganisateurRepository;
import vue.WindowConnexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) throws SQLException {
        ConnectionController.start();

    }
}
