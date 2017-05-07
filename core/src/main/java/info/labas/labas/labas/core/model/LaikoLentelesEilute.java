package info.labas.labas.labas.core.model;

import oracle.sql.DATE;

import javax.persistence.*;
import java.util.Date;
import java.util.Timer;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "laiko_lenteles_eilute")
public class LaikoLentelesEilute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int laiko_lenteles_eilutes_id;

    @Column(name = "laikas_nuo")
    private Date laikas_nuo;

    @Column(name = "laikas_iki")
    private Date laikas_iki;

    @Column(name = "savaites_diena")
    private String savaites_diena;

    @Column(name = "fk_PACIENTASpaciento_id")
    private int paciento_id;

    @Column(name = "fk_PACIENTASkorteles_numeris")
    private String korteles_numeris;

    @Column(name = "fk_LAIKO_LENTELES_ANTRASTElaiko_lenteles_antrastes_id")
    private int laiko_lenteles_antrastes_id;

    public int getLaiko_lenteles_eilutes_id() {
        return laiko_lenteles_eilutes_id;
    }

    public void setLaiko_lenteles_eilutes_id(int laiko_lenteles_eilutes_id) {
        this.laiko_lenteles_eilutes_id = laiko_lenteles_eilutes_id;
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

    public String getSavaites_diena() {
        return savaites_diena;
    }

    public void setSavaites_diena(String savaites_diena) {
        this.savaites_diena = savaites_diena;
    }

    public int getPaciento_id() {
        return paciento_id;
    }

    public void setPaciento_id(int paciento_id) {
        this.paciento_id = paciento_id;
    }

    public String getKorteles_numeris() {
        return korteles_numeris;
    }

    public void setKorteles_numeris(String korteles_numeris) {
        this.korteles_numeris = korteles_numeris;
    }

    public int getLaiko_lenteles_antrastes_id() {
        return laiko_lenteles_antrastes_id;
    }

    public void setLaiko_lenteles_antrastes_id(int laiko_lenteles_antrastes_id) {
        this.laiko_lenteles_antrastes_id = laiko_lenteles_antrastes_id;
    }
}
