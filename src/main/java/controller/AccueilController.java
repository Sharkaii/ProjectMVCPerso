package controller;

import model.organisateurs.Organisateur;
import vue.WindowAccueil;
import vue.WindowConnexion;

import javax.swing.*;

public class AccueilController {
    public static void start(Organisateur organisateur) {
        SwingUtilities.invokeLater(() -> {
            WindowAccueil windowAccueil = new WindowAccueil(organisateur);
            windowAccueil.setVisible(true);

            }
        );
    }
}
