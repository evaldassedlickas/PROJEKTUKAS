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
@Table(name = "receptas")
public class Receptas {

    @Id
    private String AAGA_SGAS_kodas;

    @Column(name = "galioja_nuo")
    private Date galioja_nuo;

    @Column(name = "galioja_iki")
    private Date galioja_iki;

    @Column(name = "vartojimo_budas")
    private String vartojimo_budas;

    @Column(name = "vienkartine_doze")
    private String vienkartine_doze;

    @Column(name = "vartojimo_laikas")
    private String vartojimo_laikas;

    @Column(name = "vartojimo_trukme")
    private String vartojimo_trukme;

    @Column(name = "paros_doze")
    private String paros_doze;

    @Column(name = "papildoma_informacija")
    private String papildoma_informacija;

    @Column(name = "ligos_korteles_eilutes_id")
    private int ligos_korteles_eilutes_id;

    @Column(name = "ATC_kodas")
    private String ATC_kodas;

    @Column(name = "kompensavimo_kodas")
    private int kompensavimo_kodas;

    public String getAAGA_SGAS_kodas() {
        return AAGA_SGAS_kodas;
    }

    public void setAAGA_SGAS_kodas(String AAGA_SGAS_kodas) {
        this.AAGA_SGAS_kodas = AAGA_SGAS_kodas;
    }

    public void setGalioja_iki(Date galioja_iki) {
        this.galioja_iki = galioja_iki;
    }

    public Date getGalioja_iki() {
        return galioja_iki;
    }

    public void setGalioja_nuo(Date galioja_nuo) {
        this.galioja_nuo = galioja_nuo;
    }

    public Date getGalioja_nuo() {
        return galioja_nuo;
    }

    public String getVartojimo_budas() {
        return vartojimo_budas;
    }

    public void setVartojimo_budas(String vartojimo_budas) {
        this.vartojimo_budas = vartojimo_budas;
    }

    public String getVienkartine_doze() {
        return vienkartine_doze;
    }

    public void setVienkartine_doze(String vienkartine_doze) {
        this.vienkartine_doze = vienkartine_doze;
    }

    public String getVartojimo_laikas() {
        return vartojimo_laikas;
    }

    public void setVartojimo_laikas(String vartojimo_laikas) {
        this.vartojimo_laikas = vartojimo_laikas;
    }

    public String getVartojimo_trukme() {
        return vartojimo_trukme;
    }

    public void setVartojimo_trukme(String vartojimo_trukme) {
        this.vartojimo_trukme = vartojimo_trukme;
    }

    public String getParos_doze() {
        return paros_doze;
    }

    public void setParos_doze(String paros_doze) {
        this.paros_doze = paros_doze;
    }

    public String getPapildoma_informacija() {
        return papildoma_informacija;
    }

    public void setPapildoma_informacija(String papildoma_informacija) {
        this.papildoma_informacija = papildoma_informacija;
    }

    public String getATC_kodas() {
        return ATC_kodas;
    }

    public void setATC_kodas(String ATC_kodas) {
        this.ATC_kodas = ATC_kodas;
    }

    public int getLigos_korteles_eilutes_id() {
        return ligos_korteles_eilutes_id;
    }

    public void setLigos_korteles_eilutes_id(int ligos_korteles_eilutes_id) {
        this.ligos_korteles_eilutes_id = ligos_korteles_eilutes_id;
    }

    public int getKompensavimo_kodas() {
        return kompensavimo_kodas;
    }

    public void setKompensavimo_kodas(int kompensavimo_kodas) {
        this.kompensavimo_kodas = kompensavimo_kodas;
    }
}
