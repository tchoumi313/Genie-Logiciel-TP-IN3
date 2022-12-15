import java.util.ArrayList;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("37f2c474-18df-4d84-a194-fc1c799a0142")
public class Chambre extends Bien {
    @mdl.prop
    @objid("f01b144c-4368-48f7-8fd5-6487d59176b4")
    private int nbDePlace;

    @mdl.propgetter
    private int getNbDePlace() {
        // Automatically generated method. Please do not modify this code.
        return this.nbDePlace;
    }

    @mdl.propsetter
    private void setNbDePlace(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbDePlace = value;
    }

    @objid("4a5e674f-bd42-43b1-ade0-d293f837a3c6")
    public static List<Chambre> listesChambre = new ArrayList<Chambre>();

    @objid("1af52997-64ef-4fa4-b3d2-a882ff9926c5")
    public Chambre(final String id, final String descrip, final String quartier, final String ville, final String rue,
            final String image, final double prix, final double surperficie, final int nbDePlace) {
        super(id, descrip, quartier, ville, rue, image, prix, surperficie);
        this.nbDePlace = nbDePlace;
    }

    @objid("36b97133-1c90-4bb8-9a5c-f4e1dabb5cea")
    protected void finalize() {
    }

}
