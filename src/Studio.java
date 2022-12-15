import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("5a378d27-5898-4198-b860-78fc987cfefa")
public class Studio extends Bien {
    @mdl.prop
    @objid("91818d92-2eea-4204-a84a-0709a780deda")
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
    @objid("50a42684-f13d-44d5-8762-bc4627318bc4")
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
    @objid("06063f88-40a4-41e7-9ff8-0e552b81d267")
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

    @objid("898cd652-346b-494d-9c91-12feb2b2faa6")
    public static Studio[] listeStudio;

    @objid("049cd998-bbc2-49d2-8756-b0108ecb40a1")
    public Studio(final String id, final String descrip, final String quartier, final String ville, final String rue,
            final String image, final double prix, final double surperficie, final int nbDePiece, final int nbDePlace,
            final String standing) {

        super(id, descrip, quartier, ville, rue, image, prix, surperficie);
        this.nbDePiece = nbDePiece;
        this.nbPlace = nbDePlace;
        this.Standing = standing;
        listeStudio.add(this);
    }

    @objid("1579e5fc-b83a-47b0-a54a-bb21ac30830c")
    protected void finalize() {
        System.out.println("Objet detruit");

    }

}
