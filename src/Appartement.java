import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("5a2c3ab4-5fba-41c5-8493-699687733e61")
public class Appartement extends Bien {
    @mdl.prop
    @objid("25e0d35d-d40a-4eac-b735-a15f0be3c328")
    private int nbDePiece;

    @mdl.propgetter
    private int getNbDePiece() {
        // Automatically generated method. Please do not modify this code.
        return this.nbDePiece;
    }

    @mdl.propsetter
    private void setNbDePiece(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbDePiece = value;
    }

    @mdl.prop
    @objid("0748e3b1-9c4d-491b-bed2-941764b36e60")
    private int nbPlace;

    @mdl.propgetter
    private int getNbPlace() {
        // Automatically generated method. Please do not modify this code.
        return this.nbPlace;
    }

    @mdl.propsetter
    private void setNbPlace(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbPlace = value;
    }

    @mdl.prop
    @objid("1a1960bf-5db9-4c70-9701-10a4041bf2ee")
    private String Standing;

    @mdl.propgetter
    private String getStanding() {
        // Automatically generated method. Please do not modify this code.
        return this.Standing;
    }

    @mdl.propsetter
    private void setStanding(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Standing = value;
    }

    @objid("19dd422c-753b-4780-b24f-1991a62c8e9f")
    public static List<Appartement> listesAppartement = new ArrayList<Appartement>();

    @objid("094afa0b-9479-43e7-8ea0-ad39a8ac6fc8")
    public Appartement(final String id, final String descrip, final String quartier, final String ville,
            final String rue, final String image, final double prix, final double surperficie, final int nbDepiece,
            final int nbDePlace, final String standing) {
        super(id, descrip, quartier, ville, rue, image, prix, surperficie);
        this.nbDePiece = nbDepiece;
        ths.nbPlace = nbDePlace;
        this.Standing = standing;
        listesAppartement.add(this);
    }

    @objid ("a9d08ab0-d680-4297-b2cb-4489c09bdd38")
    protected void finalize() {
    }

}
