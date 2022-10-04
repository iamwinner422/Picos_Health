/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pcsHealth;

/**
 *
 * @author INITIATION
 */
public class Prescription {
    private int numConsult;
    private String codeMedoc;
    private String posologie;

    public Prescription() {
    }

    public Prescription(int numConsult, String codeMedoc, String posologie) {
        this.numConsult = numConsult;
        this.codeMedoc = codeMedoc;
        this.posologie = posologie;
    }

    public String getCodeMedoc() {
        return codeMedoc;
    }

    public int getNumConsult() {
        return numConsult;
    }

    public String getPosologie() {
        return posologie;
    }

    public void setCodeMedoc(String codeMedoc) {
        this.codeMedoc = codeMedoc;
    }

    public void setNumConsult(int numConsult) {
        this.numConsult = numConsult;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }
    


}
