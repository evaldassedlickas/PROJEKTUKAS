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
@Table(name = "vizitu_registras")
public class VizituRegistras {

    @Id
    private String vizito_id;

    @Column(name = "registracijos_data")
    private Date registracijos_data;

    @Column(name = "laikas")
    private Date laikas;

    @Column(name = "atvykimas")
    private boolean atvykimas;

    @Column(name = "paciento_id")
    private int paciento_id;

    @Column(name = "korteles_numeris")
    private String korteles_numeris;

    @Column(name = "gydytojo_id")
    private int gydytojo_id;

    @Column(name = "laiko_lenteles_eilutes_id")
    private int laiko_lenteles_eilutes_id;

    public String getVizito_id() {
        return vizito_id;
    }

    public void setVizito_id(String vizito_id) {
        this.vizito_id = vizito_id;
    }

    public Date getRegistracijos_data() {
        return registracijos_data;
    }

    public void setRegistracijos_data(Date registracijos_data) {
        this.registracijos_data = registracijos_data;
    }

    public Date getLaikas() {
        return laikas;
    }

    public void setLaikas(Date laikas) {
        this.laikas = laikas;
    }

    public boolean isAtvykimas() {
        return atvykimas;
    }

    public void setAtvykimas(boolean atvykimas) {
        this.atvykimas = atvykimas;
    }

    public int getPaciento_id() {
        return paciento_id;
    }

    public void setPaciento_id(int paciento_id) {
        this.paciento_id = paciento_id;
    }

    public int getGydytojo_id() {
        return gydytojo_id;
    }

    public void setGydytojo_id(int gydytojo_id) {
        this.gydytojo_id = gydytojo_id;
    }

    public String getKorteles_numeris() {
        return korteles_numeris;
    }

    public void setKorteles_numeris(String korteles_numeris) {
        this.korteles_numeris = korteles_numeris;
    }

    public int getLaiko_lenteles_eilutes_id() {
        return laiko_lenteles_eilutes_id;
    }

    public void setLaiko_lenteles_eilutes_id(int laiko_lenteles_eilutes_id) {
        this.laiko_lenteles_eilutes_id = laiko_lenteles_eilutes_id;
    }
}
