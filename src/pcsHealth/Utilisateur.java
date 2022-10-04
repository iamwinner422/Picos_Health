
package pcsHealth;

/**
 *
 * @author INITIATION
 */
public class Utilisateur {
    private int numUtilisateur;
    private String login;
    private String password;

    public Utilisateur() {
    }

    public Utilisateur(int numUtilisateur, String login, String password) {
        this.numUtilisateur = numUtilisateur;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public int getNumUtilisateur() {
        return numUtilisateur;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNumUtilisateur(int numUtilisateur) {
        this.numUtilisateur = numUtilisateur;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}
