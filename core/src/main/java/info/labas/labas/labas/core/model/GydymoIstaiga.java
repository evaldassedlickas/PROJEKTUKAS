package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "gydymo_istaiga")
public class GydymoIstaiga {

    @Id
    private int Jar_kodas;

    @Column(name = "pavadinimas")
    private String pavadinimas;

    @Column(name = "tipas")
    private String tipas;

    @Column(name = "adresas")
    private String adresas;


    public int getJar_kodas() {
        return Jar_kodas;
    }

    public void setJar_kodas(int jar_kodas) {
        Jar_kodas = jar_kodas;
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

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }
}


