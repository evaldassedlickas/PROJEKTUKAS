package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "diagnoze")
public class Diagnoze {

    @Id
    private String TLK_kodas;

    @Column(name = "pavadinimas")
    private String pavadinimas;

    @Column(name = "tipas")
    private String tipas;

    @Column(name = "aprasymas")
    private String aprasymas;

    @Column(name = "ligos_korteles_eilutes_id")
    private int ligos_korteles_eilutes_id;

    public String getTLK_kodas() {
        return TLK_kodas;
    }

    public void setTLK_kodas(String TLK_kodas) {
        this.TLK_kodas = TLK_kodas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public int getLigos_korteles_eilutes_id() {
        return ligos_korteles_eilutes_id;
    }

    public void setLigos_korteles_eilutes_id(int ligos_korteles_eilutes_id) {
        this.ligos_korteles_eilutes_id = ligos_korteles_eilutes_id;
    }
}
