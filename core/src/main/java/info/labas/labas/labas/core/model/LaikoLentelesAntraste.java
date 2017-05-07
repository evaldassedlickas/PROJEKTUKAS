package info.labas.labas.labas.core.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "laiko_lenteles_antraste")
public class LaikoLentelesAntraste {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int laiko_lenteles_antrastes_id;

    @Column(name = "pavadinimas")
    private String pavadinimas;

    @Column(name = "darbo_pradzia")
    @DateTimeFormat(pattern = "HH:mm")
    private Date darbo_pradzia;

    @Column(name = "darbo_pabaiga")
    @DateTimeFormat(pattern = "HH:mm")
    private Date darbo_pabaiga;

    @Column(name = "pacientu_sk_per_diena")
    private int pacientu_sk_per_diena;

    @Column(name = "siuo_metu_naudojamas")
    private int siuo_metu_naudojamas;

    @Column(name = "pirmadienis")
    private int pirmadienis;

    @Column(name = "antradienis")
    private int antradienis;

    @Column(name = "treciadienis")
    private int treciadienis;

    @Column(name = "ketvirtadienis")
    private int ketvirtadienis;

    @Column(name = "penktadienis")
    private int penktadienis;

    @Column(name = "sestadienis")
    private int sestadienis;

    @Column(name = "sekmadienis")
    private int sekmadienis;

    @Column(name = "fk_GYDYTOJASgydytojo_id")
    private int gydytojo_id;

    public int getLaiko_lenteles_antrastes_id() {
        return laiko_lenteles_antrastes_id;
    }

    public void setLaiko_lenteles_antrastes_id(int laiko_lenteles_antrastes_id) {
        this.laiko_lenteles_antrastes_id = laiko_lenteles_antrastes_id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Date getDarbo_pradzia() {
        return darbo_pradzia;
    }

    public void setDarbo_pradzia(Date darbo_pradzia) {
        this.darbo_pradzia = darbo_pradzia;
    }

    public Date getDarbo_pabaiga() {
        return darbo_pabaiga;
    }

    public void setDarbo_pabaiga(Date darbo_pabaiga) {
        this.darbo_pabaiga = darbo_pabaiga;
    }

    public int getPacientu_sk_per_diena() {
        return pacientu_sk_per_diena;
    }

    public void setPacientu_sk_per_diena(int pacientu_sk_per_diena) {
        this.pacientu_sk_per_diena = pacientu_sk_per_diena;
    }

    public int isSiuo_metu_naudojamas() {
        return siuo_metu_naudojamas;
    }

    public void setSiuo_metu_naudojamas(int siuo_metu_naudojamas) {
        this.siuo_metu_naudojamas = siuo_metu_naudojamas;
    }

    public int isPirmadienis() {
        return pirmadienis;
    }

    public void setPirmadienis(int pirmadienis) {
        this.pirmadienis = pirmadienis;
    }

    public int isAntradienis() {
        return antradienis;
    }

    public void setAntradienis(int antradienis) {
        this.antradienis = antradienis;
    }

    public int isTreciadienis() {
        return treciadienis;
    }

    public void setTreciadienis(int treciadienis) {
        this.treciadienis = treciadienis;
    }

    public int isKetvirtadienis() {
        return ketvirtadienis;
    }

    public void setKetvirtadienis(int ketvirtadienis) {
        this.ketvirtadienis = ketvirtadienis;
    }

    public int isPenktadienis() {
        return penktadienis;
    }

    public void setPenktadienis(int penktadienis) {
        this.penktadienis = penktadienis;
    }

    public int isSestadienis() {
        return sestadienis;
    }

    public void setSestadienis(int sestadienis) {
        this.sestadienis = sestadienis;
    }

    public int isSekmadienis() {
        return sekmadienis;
    }

    public void setSekmadienis(int sekmadienis) {
        this.sekmadienis = sekmadienis;
    }

    public int getGydytojo_id() {
        return gydytojo_id;
    }

    public void setGydytojo_id(int gydytojo_id) {
        this.gydytojo_id = gydytojo_id;
    }
}
