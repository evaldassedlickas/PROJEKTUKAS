package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "tyrimas")
public class Tyrimas {

    @Id
    private String kodas;

    @Column(name = "pavadinimas")
    private String pavadinimas;

    @Column(name = "eminio_pavadinimas")
    private String eminio_pavadinimas;

    @Column(name = "eminio_patikslinimas")
    private String eminio_patikslinimas;

    @Column(name = "aprasymas")
    private String aprasymas;

    @Column(name = "kraujospudis")
    private int kraujospudis;

    @Column(name = "ugis")
    private double ugis;

    @Column(name = "svoris")
    private double svoris;

    @Column(name = "pulsas")
    private String pulsas;

    @Column(name = "ligos_korteles_eilutes_id")
    private String ligos_korteles_eilutes_id;

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

    public String getEminio_pavadinimas() {
        return eminio_pavadinimas;
    }

    public void setEminio_pavadinimas(String eminio_pavadinimas) {
        this.eminio_pavadinimas = eminio_pavadinimas;
    }

    public String getEminio_patikslinimas() {
        return eminio_patikslinimas;
    }

    public void setEminio_patikslinimas(String eminio_patikslinimas) {
        this.eminio_patikslinimas = eminio_patikslinimas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public void setKraujospudis(int kraujospudis) {
        this.kraujospudis = kraujospudis;
    }

    public int getKraujospudis() {
        return kraujospudis;
    }

    public double getUgis() {
        return ugis;
    }

    public void setUgis(double ugis) {
        this.ugis = ugis;
    }

    public double getSvoris() {
        return svoris;
    }

    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    public String getPulsas() {
        return pulsas;
    }

    public void setPulsas(String pulsas) {
        this.pulsas = pulsas;
    }

    public String getLigos_korteles_eilutes_id() {
        return ligos_korteles_eilutes_id;
    }

    public void setLigos_korteles_eilutes_id(String ligos_korteles_eilutes_id) {
        this.ligos_korteles_eilutes_id = ligos_korteles_eilutes_id;
    }
}
