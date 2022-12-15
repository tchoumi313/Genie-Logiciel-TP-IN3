import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("a0596199-e661-43a5-89ee-559099e6a9a4")
public class Louer {
    @mdl.prop
    @objid("a6b035a1-fe0d-4ece-adeb-71c6bea399b0")
    private Date dateDebut;

    @mdl.propgetter
    private Date getDateDebut() {
        // Automatically generated method. Please do not modify this code.
        return this.dateDebut;
    }

    @mdl.propsetter
    private void setDateDebut(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.dateDebut = value;
    }

    @mdl.prop
    @objid("da47c291-c3fd-4cf4-ae1f-2b420fdc6787")
    private Date dateFin;

    @mdl.propgetter
    private Date getDateFin() {
        // Automatically generated method. Please do not modify this code.
        return this.dateFin;
    }

    @mdl.propsetter
    private void setDateFin(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.dateFin = value;
    }

    @mdl.prop
    @objid("6dc5ca51-34e2-4ba2-bdc1-a82acbb0c0d7")
    private double prix;

    @mdl.propgetter
    private double getPrix() {
        // Automatically generated method. Please do not modify this code.
        return this.prix;
    }

    @mdl.propsetter
    private void setPrix(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.prix = value;
    }

    @objid("68cf673f-3d30-403f-bd01-7ea9530b71ca")
    public Louer(final Date dateDebut, final Date dateFin, final double prix) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prix = prix;
    }

    @objid("39f28350-541c-4702-91e7-a022996fd1c9")
    protected void finalize() {
        System.out.println("Objet detruit");
    }

}
