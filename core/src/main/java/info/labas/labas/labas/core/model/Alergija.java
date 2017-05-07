package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "alergija")
public class Alergija {

    @Id
    private String kodas;

    @Column(name = "pavadinimas")
    private String pavadinimas;

    @Column(name = "alergenas")
    private String alergenas;

    @Column(name = "komentaras")
    private String komentaras;

    @Column(name = "fk_LIGOS_KORTELES_EILUTEligos_korteles_eilutes_id")
    private int ligos_korteles_eilutes_id;

    public String getKodas() {
        return kodas;
    }

    public void setKodas(String kodas) {
        this.kodas = kodas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getAlergenas() {
        return alergenas;
    }

    public void setAlergenas(String alergenas) {
        this.alergenas = alergenas;
    }

    public String getKomentaras() {
        return komentaras;
    }

    public void setKomentaras(String komentaras) {
        this.komentaras = komentaras;
    }

    public int getLigos_korteles_eilutes_id() {
        return ligos_korteles_eilutes_id;
    }

    public void setLigos_korteles_eilutes_id(int ligos_korteles_eilutes_id) {
        this.ligos_korteles_eilutes_id = ligos_korteles_eilutes_id;
    }


}
