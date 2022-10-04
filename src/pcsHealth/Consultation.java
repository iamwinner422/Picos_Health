/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pcsHealth;

/**
 *
 * @author Artémix
 */
public class Consultation {
    private int numConsult;
    private String DateConsult;
    private String heureString;
     private int numMedecin;
    private int numPatient;
    private String motifConsult;

    public Consultation() {
    }

    public Consultation(int numConsult, String DateConsult, String heureString, int numMedecin, int numPatient, String motifConsult) {
        this.numConsult = numConsult;
        this.DateConsult = DateConsult;
        this.heureString = heureString;
        this.numPatient = numPatient;
        this.numMedecin = numMedecin;
        this.motifConsult = motifConsult;
    }

    public String getDateConsult() {
        return DateConsult;
    }

    public String getHeureString() {
        return heureString;
    }

    public String getMotifConsult() {
        return motifConsult;
    }

    public int getNumConsult() {
        return numConsult;
    }

    public int getNumPatient() {
        return numPatient;
    }
    public int getNumMedecin() {
        return numMedecin;
    }
    public void setDateConsult(String DateConsult) {
        this.DateConsult = DateConsult;
    }

    public void setHeureString(String heureString) {
        this.heureString = heureString;
    }

    public void setMotifConsult(String motifConsult) {
        this.motifConsult = motifConsult;
    }

    public void setNumConsult(int numConsult) {
        this.numConsult = numConsult;
    }

    public void setNumPatient(int numPatient) {
        this.numPatient = numPatient;
    }

    public void setNumMedecin(int numMedecin) {
        this.numMedecin = numMedecin;
    }
    
}
