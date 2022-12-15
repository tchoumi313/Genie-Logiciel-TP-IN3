import java.util.Date;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("7a0bc99f-0ef1-494a-b34b-c2218289455b")
public abstract class Bien {
    @mdl.prop
    @objid("0317e83b-a56d-46fb-9d03-0025a3ad1cf4")
    private String idBien;

    @mdl.propgetter
    protected String getIdBien() {
        // Automatically generated method. Please do not modify this code.
        return this.idBien;
    }

    @mdl.prop
    @objid("529cebd9-28f6-4e80-963e-4f567d104379")
    private String description;

    @mdl.propgetter
    protected String getDescription() {
        // Automatically generated method. Please do not modify this code.
        return this.description;
    }

    @mdl.propsetter
    protected void setDescription(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.description = value;
    }

    @mdl.prop
    @objid("3a33b583-3684-4b8b-8a17-83cd42c9968a")
    private String quartier;

    @mdl.propgetter
    protected String getQuartier() {
        // Automatically generated method. Please do not modify this code.
        return this.quartier;
    }

    @mdl.propsetter
    protected void setQuartier(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.quartier = value;
    }

    @mdl.prop
    @objid("6ce3f6b1-1edb-4379-af03-3949a4ad2cb3")
    private String ville;

    @mdl.propgetter
    protected String getVille() {
        // Automatically generated method. Please do not modify this code.
        return this.ville;
    }

    @mdl.propsetter
    protected void setVille(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.ville = value;
    }

    @mdl.prop
    @objid("58a4d182-668c-429f-8ef6-1f6e0e9d630c")
    private String rue;

    @mdl.propgetter
    protected String getRue() {
        // Automatically generated method. Please do not modify this code.
        return this.rue;
    }

    @mdl.propsetter
    protected void setRue(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.rue = value;
    }

    @mdl.prop
    @objid("68a69bc7-c3f3-4d88-b23a-32f0f43f4ab1")
    private String image;

    @mdl.propgetter
    protected String getImage() {
        // Automatically generated method. Please do not modify this code.
        return this.image;
    }

    @mdl.propsetter
    protected void setImage(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.image = value;
    }

    @mdl.prop
    @objid("4b28d3c8-5151-42e5-9051-5495e1e94bdf")
    private double prix;

    @mdl.propgetter
    protected double getPrix() {
        // Automatically generated method. Please do not modify this code.
        return this.prix;
    }

    @mdl.propsetter
    protected void setPrix(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.prix = value;
    }

    @mdl.prop
    @objid("ee3f0263-ce02-40d4-85c2-b31fcd87c8bd")
    private double superficie;

    @mdl.propgetter
    protected double getSuperficie() {
        // Automatically generated method. Please do not modify this code.
        return this.superficie;
    }

    @mdl.propsetter
    protected void setSuperficie(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.superficie = value;
    }

    @mdl.prop
    @objid("588c8e45-bef9-4b35-ab35-02de0f303b1c")
    private String status;

    @mdl.propgetter
    public String getStatus() {
        // Automatically generated method. Please do not modify this code.
        return this.status;
    }

    @mdl.propsetter
    public void setStatus(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.status = value;
    }

    @objid("80f09ea7-b063-42de-beef-b0a523bd1a98")
    public static void consulterBien(final String idBien) {
    }

    @objid("ffbac97b-3d52-448d-995a-71038cffcd5a")
    public Bien(final String idBien, final String description, final String quartier, final String ville,
            final String rue, final String image, final double prix, final double surperficie) {
        this.idBien = idBien;
        this.description = description;
        this.quartier = quartier;
        this.ville = ville;
        this.rue = rue;
        this.image = image;
        this.prix = prix;
        this.superficie = surperficie;
    }

    @objid("da3e2e95-efeb-4e09-89a9-eb15b65c61b5")
    public boolean modifierBien(final String idBien, final String description, final String image,
            final double prix) {
        // TODO Auto-generated return

        if (this.idBien.equals(idBien)) {
            this.description = description;
            this.image = image;
            this.prix = prix;
            return true;
        }
        return false;
    }

    @objid("4b8feda3-654f-4c37-89b4-fdac874f7216")
    public boolean supprimerBien(final String idBien) {
        // TODO Auto-generated return
        if (this.idBien.equals(idBien)) {
            this.finalize();
        }
        return false;
    }

    @objid("10fb347f-951f-4d3f-8a22-5ce0050ce377")
    public boolean louerBien(final String idBien, final double prix, final Date dateDebut, final Date dateFin) {
        // TODO Auto-generated return
        if (this.idBien.equals(idBien) && this.prix <= prix) {
            Louer louer = new Louer(dateDebut, dateFin, prix);
            this.status = "Louer";
            return true;
        }
        return false;
    }

    @objid("b6b51e0b-97e4-4b1e-a173-c1908b024408")
    public static boolean reserver(final String idBien, final double prix) {
        // TODO Auto-generated return
        return false;
    }

    @objid("67bc0d78-1a12-4b3c-839e-4726a853b844")
    protected void finalize() {
        System.out.println("Objet detruit");
    }

}
