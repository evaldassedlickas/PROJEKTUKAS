package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "nustatymai")
public class Nustatymai {

    @Id
    private int nustatymo_id;

    @Column(name = "aprasymas")
    private String aprasymas;

    @Column(name = "ivertis_nuo")
    private int ivertis_nuo;

    @Column(name = "ivertis_iki")
    private int ivertis_iki;

    public int getNustatymo_id() {
        return nustatymo_id;
    }

    public void setNustatymo_id(int nustatymo_id) {
        this.nustatymo_id = nustatymo_id;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public int getIvertis_nuo() {
        return ivertis_nuo;
    }

    public void setIvertis_nuo(int ivertis_nuo) {
        this.ivertis_nuo = ivertis_nuo;
    }

    public int getIvertis_iki() {
        return ivertis_iki;
    }

    public void setIvertis_iki(int ivertis_iki) {
        this.ivertis_iki = ivertis_iki;
    }
}
