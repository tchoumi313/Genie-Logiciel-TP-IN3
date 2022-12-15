import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("2a21844b-452a-4f9a-9eed-633801e5c017")
public class Administrateur {
    @mdl.prop
    @objid("3cb0cf95-d87e-475a-82e6-64dcc3235206")
    private String idAdmin;

    @mdl.propgetter
    private String getIdAdmin() {
        // Automatically generated method. Please do not modify this code.
        return this.idAdmin;
    }

    @mdl.propsetter
    private void setIdAdmin(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.idAdmin = value;
    }

    @mdl.prop
    @objid("1de65d87-2add-4375-9060-4677ffe09b97")
    private String nom;

    @mdl.propgetter
    private String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }

    @mdl.propsetter
    private void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

    @mdl.prop
    @objid("732873d6-7cdc-493d-9393-2274030a9f00")
    private String prenom;

    @mdl.propgetter
    private String getPrenom() {
        // Automatically generated method. Please do not modify this code.
        return this.prenom;
    }

    @mdl.propsetter
    private void setPrenom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.prenom = value;
    }

    @mdl.prop
    @objid("85deb950-087a-4666-b5e2-d51f2b07ddfa")
    private String email;

    @mdl.propgetter
    private String getEmail() {
        // Automatically generated method. Please do not modify this code.
        return this.email;
    }

    @mdl.propsetter
    private void setEmail(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.email = value;
    }

    @mdl.prop
    @objid("20de0cd6-c575-4815-bf93-cdf8901df3a0")
    private Date dateNaiss;

    @mdl.propgetter
    private Date getDateNaiss() {
        // Automatically generated method. Please do not modify this code.
        return this.dateNaiss;
    }

    @mdl.propsetter
    private void setDateNaiss(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.dateNaiss = value;
    }

    @mdl.prop
    @objid("e5e012cc-c878-407a-a380-bb81d8dbeb09")
    private String lieuNaiss;

    @mdl.propgetter
    private String getLieuNaiss() {
        // Automatically generated method. Please do not modify this code.
        return this.lieuNaiss;
    }

    @mdl.propsetter
    private void setLieuNaiss(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.lieuNaiss = value;
    }

    @mdl.prop
    @objid("7d0f8653-eefa-4d39-933f-bdb187cb2f26")
    private String telephone;

    @mdl.propgetter
    private String getTelephone() {
        // Automatically generated method. Please do not modify this code.
        return this.telephone;
    }

    @mdl.propsetter
    private void setTelephone(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.telephone = value;
    }

    @mdl.prop
    @objid("8a68bfdb-8491-4dd2-b177-6549ba3249c6")
    private String lieuResidence;

    @mdl.propgetter
    private String getLieuResidence() {
        // Automatically generated method. Please do not modify this code.
        return this.lieuResidence;
    }

    @mdl.propsetter
    private void setLieuResidence(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.lieuResidence = value;
    }

    @mdl.prop
    @objid("7364fee1-4b01-484d-bf8f-c1c86e4e4d7d")
    private String motDePasse;

    @mdl.propgetter
    private String getMotDePasse() {
        // Automatically generated method. Please do not modify this code.
        return this.motDePasse;
    }

    @mdl.propsetter
    private void setMotDePasse(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.motDePasse = value;
    }

    @objid("4d5b6157-7cff-4f23-a6aa-99ab87b7de42")
    public static List<Administrateur> listesAdmin = new ArrayList<Administrateur>();;

    @objid("c09857aa-aeb3-4911-b0f9-bda06857bb1c")
    private List<Bien> Gerer = new ArrayList<Bien>();

    @objid("b65144d1-ad2c-4aa7-90e8-a470ea2c0fd9")
    public Administrateur(final String idAdmin, final String nom, final String prenom, final String email,
            final Date dateNaiss, final String lieuNaiss, final String telephone, final String lieuResidence,
            final String motDePasse) {
        this.idAdmin = idAdmin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaiss = dateNaiss;
        this.lieuNaiss = lieuNaiss;
        this.telephone = telephone;
        this.lieuResidence = lieuResidence;
        this.motDePasse = motDePasse;
        listesAdmin.add(this);
    }

    @objid("489f6c0a-4933-4fa4-89be-6f241ce690b6")
    public static boolean seConnecter(final String email, final String motDePasse) {
        // TODO Auto-generated return
        for (Administrateur elem : listesAdmin) {
            if (elem.email.equals(email) && elem.motDePasse.equals(motDePasse))
                return true;
        }

        return false;
    }

    @objid("33067315-1764-4783-b4ee-7edd11277368")
    public void remplirFormulaire() {
    }

    @objid("57cdbafa-ed7c-4fed-91b1-a7b0625125c6")
    public static boolean modifierAdmin(final String idAdmin, final String nom, final String prenom,
            final Date dateNaiss, final String lieuNaiss, final String tel, final String lieuResi,
            final String motDePasse, final String email) {
        // TODO Auto-generated return
        for (Administrateur administrateur : listesAdmin) {
            if (administrateur.idAdmin.equals(idAdmin)) {
                administrateur.nom = nom;
                administrateur.prenom = prenom;
                administrateur.email = email;
                administrateur.dateNaiss = dateNaiss;
                administrateur.lieuNaiss = lieuNaiss;
                administrateur.telephone = tel;
                administrateur.lieuResidence = lieuResi;
                administrateur.motDePasse = motDePasse;
                return true;
            }
        }

        return false;
    }

}
