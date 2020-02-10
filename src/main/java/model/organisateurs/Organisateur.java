package model.organisateurs;

import java.sql.Timestamp;

public class Organisateur {
    private int id;
    private int typeCompteId;
    private int parrainId;
    private String mail;
    private String password;
    private Timestamp dateDerniereConnexion;

    public Organisateur() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeCompteId() {
        return typeCompteId;
    }

    public void setTypeCompteId(int typeCompteId) {
        this.typeCompteId = typeCompteId;
    }

    public int getParrainId() {
        return parrainId;
    }

    public void setParrainId(int parrainId) {
        this.parrainId = parrainId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getDateDerniereConnexion() {
        return dateDerniereConnexion;
    }

    public void setDateDerniereConnexion(Timestamp dateDerniereConnexion) {
        this.dateDerniereConnexion = dateDerniereConnexion;
    }

    @Override
    public String toString() {
        return "Organisateur{" +
                "id=" + id +
                ", typeCompteId=" + typeCompteId +
                ", parrainId=" + parrainId +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", dateDerniereConnexion=" + dateDerniereConnexion +
                '}';
    }
}
