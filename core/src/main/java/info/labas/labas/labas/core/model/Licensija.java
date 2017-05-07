package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "licensija")
public class Licensija {

    @Id
    private String licensijos_id;

    @Column(name = "galioja_nuo")
    private Date galioja_nuo;

    @Column(name = "galioja_iki")
    private Date galioja_iki;

    public String getLicensijos_id() {
        return licensijos_id;
    }

    public void setLicensijos_id(String licensijos_id) {
        this.licensijos_id = licensijos_id;
    }

    public Date getGalioja_nuo() {
        return galioja_nuo;
    }

    public void setGalioja_nuo(Date galioja_nuo) {
        this.galioja_nuo = galioja_nuo;
    }

    public Date getGalioja_iki() {
        return galioja_iki;
    }

    public void setGalioja_iki(Date galioja_iki) {
        this.galioja_iki = galioja_iki;
    }
}
