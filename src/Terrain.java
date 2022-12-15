import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("4e6e46f2-e595-4fa7-ad1b-cfdfe7af12a6")
public class Terrain extends Bien {
    @objid("99ccc9ab-47a4-4e60-b363-d8b5c2f563dc")
    public static Terrain[] listesTerrain;

    @objid("d0b5a4fe-8f76-4772-93b0-685c352b64a0")
    public Terrain(final String id, final String descrip, final String quartier, final String ville, final String rue,
            final String image, final double prix, final double surperficie) {
        super(id, descrip, quartier, ville, rue, image, prix, surperficie);
        listesTerrain.add(this);
    }

    @objid("c5cf536a-bc6c-4015-af46-542674751be7")
    protected void finalize() {
        System.out.println("Objet detruit");
  }

}
