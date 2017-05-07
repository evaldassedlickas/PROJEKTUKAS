package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "klaida")
public class Klaida {

    @Id
    private int klaidos_id;

    @Column(name = "aprasymas")
    private String aprasymas;

    public int getKlaidos_id() {
        return klaidos_id;
    }

    public void setKlaidos_id(int klaidos_id) {
        this.klaidos_id = klaidos_id;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }
}
