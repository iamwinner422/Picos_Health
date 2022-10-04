/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pcsHealth;

/**
 *
 * @author Artémix
 */
public class Medicament {
    private String codeMedoc;
    private String nomMedoc;
    private String typeMedoc;

    public Medicament() {
    }

    public Medicament(String codeMedoc, String nomMedoc, String typeMedoc) {
        this.codeMedoc = codeMedoc;
        this.nomMedoc = nomMedoc;
        this.typeMedoc = typeMedoc;
    }

    public void setCodeMedoc(String codeMedoc) {
        this.codeMedoc = codeMedoc;
    }

    public void setNomMedoc(String nomMedoc) {
        this.nomMedoc = nomMedoc;
    }

    public void setTypeMedoc(String typeMedoc) {
        this.typeMedoc = typeMedoc;
    }

    public String getCodeMedoc() {
        return codeMedoc;
    }

    public String getNomMedoc() {
        return nomMedoc;
    }

    public String getTypeMedoc() {
        return typeMedoc;
    }

    
}
