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
@Table(name = "skiepasRepository")
public class Skiepas {

    @Id
    private String skiepo_kodas;

    @Column(name = "uzkreciama_liga")
    private String uzkreciama_liga;

    @Column(name = "dozes_eiles_numeris")
    private int dozes_eiles_numeris;

    @Column(name = "komentaras")
    private String komentaras;

    @Column(name = "planuojama_data")
    private Date planuojama_data;

    @Column(name = "ligos_korteles_eilutes_id")
    private int ligos_korteles_eilutes_id;

    public String getSkiepo_kodas() {
        return skiepo_kodas;
    }

    public void setSkiepo_kodas(String skiepo_kodas) {
        this.skiepo_kodas = skiepo_kodas;
    }

    public String getUzkreciama_liga() {
        return uzkreciama_liga;
    }

    public void setUzkreciama_liga(String uzkreciama_liga) {
        this.uzkreciama_liga = uzkreciama_liga;
    }

    public int getDozes_eiles_numeris() {
        return dozes_eiles_numeris;
    }

    public void setDozes_eiles_numeris(int dozes_eiles_numeris) {
        this.dozes_eiles_numeris = dozes_eiles_numeris;
    }

    public String getKomentaras() {
        return komentaras;
    }

    public void setKomentaras(String komentaras) {
        this.komentaras = komentaras;
    }

    public Date getPlanuojama_data() {
        return planuojama_data;
    }

    public void setPlanuojama_data(Date planuojama_data) {
        this.planuojama_data = planuojama_data;
    }

    public int getLigos_korteles_eilutes_id() {
        return ligos_korteles_eilutes_id;
    }

    public void setLigos_korteles_eilutes_id(int ligos_korteles_eilutes_id) {
        this.ligos_korteles_eilutes_id = ligos_korteles_eilutes_id;
    }
}
