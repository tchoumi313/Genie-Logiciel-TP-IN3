import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("c9f6ff80-2274-41bf-822f-83453bf014e5")
public class Visite {
    @mdl.prop
    @objid("751e4e3c-6a05-426a-a78f-17e3f8468a10")
    private String heure;

    @mdl.propgetter
    private String getHeure() {
        // Automatically generated method. Please do not modify this code.
        return this.heure;
    }

    @mdl.propsetter
    private void setHeure(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.heure = value;
    }

    @mdl.prop
    @objid("33a8b751-9969-4f3e-b988-8cd581702189")
    private Date date;

    @mdl.propgetter
    private Date getDate() {
        // Automatically generated method. Please do not modify this code.
        return this.date;
    }

    @mdl.propsetter
    private void setDate(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.date = value;
    }

    @objid("c6c5066a-d8d7-4bf8-afee-550bb2f4237d")
    public Visite(final String heure, final Date date) {
        this.heure = heure;
        this.date = date;
    }

    @objid("261367be-97b4-430a-9e69-4082d57c3cb2")
    protected void finalize() {
        System.out.println("Objet detruit");
    }

}
