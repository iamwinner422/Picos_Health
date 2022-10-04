/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pcsHealth;

/**
 *
 * @author Artémix
 */
public class Medecin {
    private int numMedecin;
    private String nomMedecin;
    private String prenomMedecin;
    private String numTelMedecin;
    private String loginMedecin;
    private String passMedecin;

    public Medecin() {
    }

    public Medecin(int numMedecin, String nomMedecin, String prenomMedecin, String numTelMedecin, String loginMedecin, String passMedecin) {
        this.numMedecin = numMedecin;
        this.nomMedecin = nomMedecin;
        this.prenomMedecin = prenomMedecin;
        this.numTelMedecin = numTelMedecin;
        this.loginMedecin = loginMedecin;
        this.passMedecin = passMedecin;
    }

    public String getLoginMedecin() {
        return loginMedecin;
    }

    public String getNomMedecin() {
        return nomMedecin;
    }

    public int getNumMedecin() {
        return numMedecin;
    }

    public String getNumTelMedecin() {
        return numTelMedecin;
    }

    public String getPassMedecin() {
        return passMedecin;
    }

    public String getPrenomMedecin() {
        return prenomMedecin;
    }

    public void setLoginMedecin(String loginMedecin) {
        this.loginMedecin = loginMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    public void setNumMedecin(int numMedecin) {
        this.numMedecin = numMedecin;
    }

    public void setNumTelMedecin(String numTelMedecin) {
        this.numTelMedecin = numTelMedecin;
    }

    public void setPassMedecin(String passMedecin) {
        this.passMedecin = passMedecin;
    }

    public void setPrenomMedecin(String prenomMedecin) {
        this.prenomMedecin = prenomMedecin;
    }

   

}
