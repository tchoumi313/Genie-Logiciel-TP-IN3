import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("80872682-f3d4-41b5-914e-0a20cafc5f96")
public class Client {
    @mdl.prop
    @objid("50a33397-4824-4afe-a71e-ee2578c137a2")
    private String idClient;

    @mdl.propgetter
    private String getIdClient() {
        // Automatically generated method. Please do not modify this code.
        return this.idClient;
    }

    @mdl.propsetter
    private void setIdClient(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.idClient = value;
    }

    @mdl.prop
    @objid("ade70224-ebf3-4fb7-b265-ea9f864c4e2b")
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
    @objid("68851236-23e7-4d5a-a1a5-712cbcc1e8e7")
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
    @objid("e3c59703-0976-4dd0-9994-62e9ba2df391")
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
    @objid("fe1e034a-a827-47a7-83e6-8011095e1918")
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

    @objid("1cbebb07-378f-4161-95b8-f80838edf317")
    public static List<Client> listesClient = new ArrayList<Client>();

    @objid("ac2ccf6c-2080-42ee-a6ab-36f63ea68370")
    private List<Bien> Visiter = new ArrayList<Bien>();

    @objid("fe1f4f00-67d7-431a-8ad7-afe7ea3b6109")
    private List<Bien> louer = new ArrayList<Bien>();

    @objid("cbf795d6-6c43-4692-bb52-f9ab889a559b")
    public static boolean modifierClient(final String idClient, final String nom, final String prenom,
            final String email, final String telephone) {
        // TODO Auto-generated return
        
        foreach(Client elem :listesClient){
            if (elem.idClient.equals(idClient)) {
                elem.nom = nom;
                elem.prenom = prenom;
                elem.email = email;
                elem.telephone = telephone;
                return true;
            }
        }
        return false;
     
    }

    @objid ("d75

    db1c-5292-446a-95c7-f6296b54c87c")
    public static boolean supprimerClient(final String idClient) {
        // TODO Auto-generated return
        foreach(Client elem:listesClient){
            if (elem.idClient.equals(idClient)) {
               elem.finalize();
                return true;
            }
        }
        return false;
    }

    public Client(final String idClient, final String nom, final String prenom, final String email,
            final String telephone) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        listesClient.add(this);
    }

    @objid ("13e3f6d0-53f7-4cb4-b625-db9de0941e22")
    public static void consulter(final String idClient) {
        foreach(Client elem:listesClient){
            if (elem.idClient.equals(idClient)) {
                System.out.print(elem.idClient);
                System.out.print(elem.nom);
                System.out.print(elem.prenom);
                System.out.print(elem.email);
                System.out.print(elem.telephone);
                System.out.println(elem.Visiter.toString());
                System.out.println(elem.Louer.toString());
            }
        }
        
    }

    @objid ("7c910553-cc85-4680-96a2-d0900bea781d")
    protected void finalize() {
        System.out.print("Objet detruit");
    }

}
