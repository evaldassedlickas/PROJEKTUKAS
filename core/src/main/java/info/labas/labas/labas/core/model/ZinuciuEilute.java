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
@Table(name = "zinuciu_eilute")
public class ZinuciuEilute {

    @Id
    private int zinuciu_eilutes_id;

    @Column(name = "siuntejo_id")
    private int siuntejo_id;

    @Column(name = "zinutes_tekstas")
    private String zinutes_tekstas;

    @Column(name = "laikas")
    private Date laikas;

    @Column(name = "zinuciu_antrastes_id")
    private int zinuciu_antrastes_id;

    public int getZinuciu_eilutes_id() {
        return zinuciu_eilutes_id;
    }

    public void setZinuciu_eilutes_id(int zinuciu_eilutes_id) {
        this.zinuciu_eilutes_id = zinuciu_eilutes_id;
    }

    public int getSiuntejo_id() {
        return siuntejo_id;
    }

    public void setSiuntejo_id(int siuntejo_id) {
        this.siuntejo_id = siuntejo_id;
    }

    public String getZinutes_tekstas() {
        return zinutes_tekstas;
    }

    public void setZinutes_tekstas(String zinutes_tekstas) {
        this.zinutes_tekstas = zinutes_tekstas;
    }

    public Date getLaikas() {
        return laikas;
    }

    public void setLaikas(Date laikas) {
        this.laikas = laikas;
    }

    public int getZinuciu_antrastes_id() {
        return zinuciu_antrastes_id;
    }

    public void setZinuciu_antrastes_id(int zinuciu_antrastes_id) {
        this.zinuciu_antrastes_id = zinuciu_antrastes_id;
    }
}
