/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pcsHealth;

/**
 *
 * @author Artémix
 */
public class Patient {
    private int numPatient;
    private String nomPatient;
    private String prenomsPatient;
    private String grpeSanguin;
    private String numTelPatient;

    public Patient() {
    }

    public Patient(int numPatient, String nomPatient, String prenomsPatient, String grpeSanguin, String numTelPatient) {
        this.numPatient = numPatient;
        this.nomPatient = nomPatient;
        this.prenomsPatient = prenomsPatient;
        this.grpeSanguin = grpeSanguin;
        this.numTelPatient = numTelPatient;
    }

    public String getGrpeSanguin() {
        return grpeSanguin;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public int getNumPatient() {
        return numPatient;
    }

    public String getNumTelPatient() {
        return numTelPatient;
    }

    public String getPrenomsPatient() {
        return prenomsPatient;
    }

    public void setGrpeSanguin(String grpeSanguin) {
        this.grpeSanguin = grpeSanguin;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public void setNumPatient(int numPatient) {
        this.numPatient = numPatient;
    }

    public void setNumTelPatient(String numTelPatient) {
        this.numTelPatient = numTelPatient;
    }

    public void setPrenomsPatient(String prenomsPatient) {
        this.prenomsPatient = prenomsPatient;
    }
    

}
