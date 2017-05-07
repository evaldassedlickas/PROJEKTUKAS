package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Timer;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "pertrauka")
public class Pertrauka {

    @Id
    private int pertraukos_id;

    @Column(name = "laikas_nuo")
    private Date laikas_nuo;

    @Column(name = "laikas_iki")
    private Date laikas_iki;

    @Column(name = "laiko_lenteles_antrastes_id")
    private int laiko_lenteles_antrastes_id;

    public int getPertraukos_id() {
        return pertraukos_id;
    }

    public void setPertraukos_id(int pertraukos_id) {
        this.pertraukos_id = pertraukos_id;
    }

    public Date getLaikas_nuo() {
        return laikas_nuo;
    }

    public void setLaikas_nuo(Date laikas_nuo) {
        this.laikas_nuo = laikas_nuo;
    }

    public Date getLaikas_iki() {
        return laikas_iki;
    }

    public void setLaikas_iki(Date laikas_iki) {
        this.laikas_iki = laikas_iki;
    }

    public int getLaiko_lenteles_antrastes_id() {
        return laiko_lenteles_antrastes_id;
    }

    public void setLaiko_lenteles_antrastes_id(int laiko_lenteles_antrastes_id) {
        this.laiko_lenteles_antrastes_id = laiko_lenteles_antrastes_id;
    }
}
