package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "ligos_korteles_eilute")
public class LigosKortelesEilute {

    @Id
    private int ligos_korteles_eilutes_id;

    @Column(name = "paciento_id")
    private int paciento_id;

    @Column(name = "korteles_numeris")
    private int korteles_numeris;

    public int getLigos_korteles_eilutes_id() {
        return ligos_korteles_eilutes_id;
    }

    public void setLigos_korteles_eilutes_id(int ligos_korteles_eilutes_id) {
        this.ligos_korteles_eilutes_id = ligos_korteles_eilutes_id;
    }

    public int getPaciento_id() {
        return paciento_id;
    }

    public void setPaciento_id(int paciento_id) {
        this.paciento_id = paciento_id;
    }

    public int getKorteles_numeris() {
        return korteles_numeris;
    }

    public void setKorteles_numeris(int korteles_numeris) {
        this.korteles_numeris = korteles_numeris;
    }
}
