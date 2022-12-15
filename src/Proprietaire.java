import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("76243e82-aa60-4ee8-84ae-48b10f979f33")
public class Proprietaire {
    @mdl.prop
    @objid("ec32bcdf-3eec-4712-a8c1-4604af684659")
    private String idProprietaire;

    @mdl.propgetter
    private String getIdProprietaire() {
        // Automatically generated method. Please do not modify this code.
        return this.idProprietaire;
    }

    @mdl.propsetter
    private void setIdProprietaire(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.idProprietaire = value;
    }

    @mdl.prop
    @objid("383f5561-e41c-4237-aa31-0f89cedb053b")
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
    @objid("b7a65550-240a-4140-8975-00738ffb19e1")
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
    @objid("9831a978-7b95-437f-9606-667156eca690")
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
    @objid("56370256-ffa3-42bc-9842-6feed2f9426b")
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
    @objid("519c137c-eb28-4ed4-b272-b23245b9d43f")
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
    @objid("ea364b55-6a4d-4cb4-9364-928447c0b6a0")
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

    @objid("f80e9eee-521b-4314-9df7-df23345c3bdb")
    private String lieuResidence;

    @objid("fc89f0d4-bc2f-45b6-9a0c-8411a5c7d048")
    public static List<Proprietaire> listeProprietaire = new ArrayList<Proprietaire>();

    @objid("ac146440-962a-406d-808a-521326b817b1")
    private List<Bien> Posseder = new ArrayList<Bien>();

    @objid ("af9a8837-4927-43d7-b90c-9dbf51f20765")
    public static boolean modifierProprietaire(final String idProprietaire, final String nom, final String prenom, final String email, final String telephone, final Date dateNaiss, final String lieuNaiss, final String lieuResidence) {
        // TODO Auto-generated return
        foreach(Proprietaire elem :listeProprietaire){
            if (elem.idProprietaire.equals(idProprietaire)) {
                elem.nom = nom;
                elem.prenom = prenom;
                elem.email = email;
                elem.telephone = telephone;
                elem.dateNaiss = dateNaiss;
                elem.lieuNaiss = lieuNaiss;
                elem.lieuResidence = lieuResidence;
                return true;
            }
        }
        return false;
    }

    @objid ("98018b08-2453-48d0-bd3a-a9fa279028df")
    public static boolean supprimer(final String idProprietaire) {
        // TODO Auto-generated return
        foreach(Proprietaire elem:listeProprietaire){
            if (elem.idProprietaire.equals(idProprietaire)) {
               elem.finalize();
                return true;
            }
        }
        
        return false;
    }

    @objid("46fc69f2-4532-4dc7-b211-4d03d4ce16d6")
    public static void consulter(final String idProprietaire) {
        foreach(Proprietaire elem:listeProprietaire){
            if (elem.idProprietaire.equals(idProprietaire)) {
                System.out.print(elem.idProprietaire);
                System.out.print(elem.nom);
                System.out.print(elem.prenom);
                System.out.print(elem.email);
                System.out.print(elem.telephone);
                System.out.println(elem.lieuNaiss);
                System.out.println(elem.lieuResidence);
                System.out.println(elem.dateNaiss);
                System.out.println(elem.Posseder.toString());
            }
        }
    }

    @objid("ccc2c219-c70c-4aed-9829-b57c6383863c")
    public Proprietaire(final String idProprietaire, final String nom, final String prenom, final String email,
            final String telephone, final Date dateNaiss, final String lieuNaiss, final String lieuResidence) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.dateNaiss = dateNaiss;
        this.lieuNaiss = lieuNaiss;
        this.lieuResidence = lieuResidence;
        listeProprietaire.add(this);

    }

    @objid("845e6600-7aa5-467c-ade2-95e7069c79dc")
    protected void finalize() {
        System.out.println("Objet Detruit");
    }

}
