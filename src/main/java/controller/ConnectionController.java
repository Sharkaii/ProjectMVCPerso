package controller;

import model.AccesBdd;
import model.organisateurs.Organisateur;
import model.organisateurs.OrganisateurRepository;
import vue.WindowAccueil;
import vue.WindowConnexion;

import javax.swing.*;

public class ConnectionController {
    public static void start() {
        SwingUtilities.invokeLater(() -> {
            WindowConnexion windowConnexion = new WindowConnexion();
            windowConnexion.setVisible(true);
            windowConnexion.getConnexionButton().addActionListener(e -> {
                Thread monThread = new Thread(() -> {
                    try {
                        String mail = windowConnexion.getMailText().getText();
                        String pass = new String(windowConnexion.getPass().getPassword());
                        if (!mail.equals("") && !pass.equals("")) {
                           Organisateur organisateur = OrganisateurRepository.findOne(mail);
                           if (pass.equals(organisateur.getPassword())) {
                               JOptionPane.showMessageDialog(windowConnexion, "Connexion réussie !");
                               windowConnexion.setVisible(false);
                               AccueilController.start(organisateur);
                           }
                        }
                        else {
                            JOptionPane.showMessageDialog(windowConnexion, "Veuillez remplir tous les champs !");
                        }
                    } catch (Exception e1) {
                        JOptionPane.showMessageDialog(windowConnexion, "Identifiants incorrects !");
                        e1.printStackTrace();
                    }
                });
                monThread.start();
            });
        });
    }
}
