package info.labas.labas.labas.core.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "asmuo")
public class Asmuo {
    @Id
    private String asmens_kodas;

    @Column(name = "vardas")
    private String vardas;

    @Column(name = "pavarde")
    private String pavarde;

    @Column(name = "slaptazodis")
    private String slaptazodis;

    @Column(name = "lytis")
    private String lytis;

    @Column(name = "gimimo_data")
    private Date gimimo_data;

    @Column(name = "adresas")
    private String adresas;

    @Column(name = "telefonas")
    private int telefonas;

    public String getAsmens_kodas() {
        return asmens_kodas;
    }

    public void setAsmens_kodas(String asmens_kodas) {
        this.asmens_kodas = asmens_kodas;
    }

    public String getVardas() {
        return  vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return  pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getSlaptazodis() {
        return slaptazodis;
    }

    public void setSlaptazodis(String slaptazodis) {
        this.slaptazodis = slaptazodis;
    }

    public String getLytis() {
        return lytis;
    }

    public void setLytis(String lytis) {
        this.lytis = lytis;
    }

    public Date getGimimo_data() {
        return  gimimo_data;
    }

    public void setGimimo_data(Date gimimo_data) {
        this.gimimo_data = gimimo_data;
    }

    public String getAdresas() {
        return  adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public int getTelefonas() {
        return  telefonas;
    }

    public void setTelefonas(int telefonas) {
        this.telefonas = telefonas;
    }
}
