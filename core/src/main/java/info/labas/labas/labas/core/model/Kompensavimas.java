package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "kompensavimas")
public class Kompensavimas {

    @Id
    private int kompensavimo_id;

    @Column(name = "kompensavimo_rusis")
    private String kompensavimo_rusis;

    @Column(name = "kompensacijos_procentas")
    private  String kompensacijos_procentas;

    public int getKompensavimo_id() {
        return kompensavimo_id;
    }

    public void setKompensavimo_id(int kompensavimo_id) {
        this.kompensavimo_id = kompensavimo_id;
    }

    public String getKompensavimo_rusis() {
        return kompensavimo_rusis;
    }

    public void setKompensavimo_rusis(String kompensavimo_rusis) {
        this.kompensavimo_rusis = kompensavimo_rusis;
    }

    public String getKompensacijos_procentas() {
        return kompensacijos_procentas;
    }

    public void setKompensacijos_procentas(String kompensacijos_procentas) {
        this.kompensacijos_procentas = kompensacijos_procentas;
    }
}

