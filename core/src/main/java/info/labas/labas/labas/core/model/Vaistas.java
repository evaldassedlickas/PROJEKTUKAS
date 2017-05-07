package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "vaistas")
public class Vaistas {

    @Id
    private String ATC_kodas;

    @Column(name = "bendrinis_pavadinimas")
    private String bendrinis_pavadinimas;

    @Column(name = "stiprumas")
    private String stiprumas;

    @Column(name = "farmacine_forma")
    private String farmacine_forma;

    @Column(name = "veiklioji_medziaga")
    private String veiklioji_medziaga;

    public String getATC_kodas() {
        return ATC_kodas;
    }

    public void setATC_kodas(String ATC_kodas) {
        this.ATC_kodas = ATC_kodas;
    }

    public String getBendrinis_pavadinimas() {
        return bendrinis_pavadinimas;
    }

    public void setBendrinis_pavadinimas(String bendrinis_pavadinimas) {
        this.bendrinis_pavadinimas = bendrinis_pavadinimas;
    }

    public String getStiprumas() {
        return stiprumas;
    }

    public void setStiprumas(String stiprumas) {
        this.stiprumas = stiprumas;
    }

    public String getFarmacine_forma() {
        return farmacine_forma;
    }

    public void setFarmacine_forma(String farmacine_forma) {
        this.farmacine_forma = farmacine_forma;
    }

    public String getVeiklioji_medziaga() {
        return veiklioji_medziaga;
    }

    public void setVeiklioji_medziaga(String veiklioji_medziaga) {
        this.veiklioji_medziaga = veiklioji_medziaga;
    }
}
