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
@Table(name = "pacientas")
public class Pacientas {

    @Id
    private int paciento_id;

    @Column(name = "korteles_numeris")
    private String korteles_numeris;

    @Column(name = "privalomo_draudimo_nr")
    private String privalomo_draudimo_nr;

    @Column(name = "papildomo_draudimo_nr")
    private String papildomo_draudimo_nr;

    @Column(name = "darboviete")
    private String darboviete;

    @Column(name = "paciento_draustumas")
    private boolean paciento_draustumas;

    @Column(name = "nedarbingumo_lapelis_galioja_nuo")
    private Date nedarbingumo_lapelis_galioja_nuo;

    @Column(name = "nedarbingumo_lapelis_galioja_iki")
    private String nedarbingumo_lapelis_galioja_iki;

    @Column(name = "fk_ASMUOasmens_kodas")
    private String asmens_kodas;

    @Column(name = "fk_GYDYMO_ISTAIGAJAR_kodas")
    private int JAR_kodas;

    @Column(name = "fk_GYDYTOJASgydytojo_id")
    private int gydytojo_id;

    public int getPaciento_id() {
        return paciento_id;
    }

    public void setPaciento_id(int paciento_id) {
        this.paciento_id = paciento_id;
    }

    public String getKorteles_numeris() {
        return korteles_numeris;
    }

    public void setKorteles_numeris(String korteles_numeris) {
        this.korteles_numeris = korteles_numeris;
    }

    public String getPrivalomo_draudimo_nr() {
        return privalomo_draudimo_nr;
    }

    public void setPrivalomo_draudimo_nr(String privalomo_draudimo_nr) {
        this.privalomo_draudimo_nr = privalomo_draudimo_nr;
    }

    public String getPapildomo_draudimo_nr() {
        return papildomo_draudimo_nr;
    }

    public void setPapildomo_draudimo_nr(String papildomo_draudimo_nr) {
        this.papildomo_draudimo_nr = papildomo_draudimo_nr;
    }

    public String getDarboviete() {
        return darboviete;
    }

    public void setDarboviete(String darboviete) {
        this.darboviete = darboviete;
    }

    public boolean isPaciento_draustumas() {
        return paciento_draustumas;
    }

    public void setPaciento_draustumas(boolean paciento_draustumas) {
        this.paciento_draustumas = paciento_draustumas;
    }

    public Date getNedarbingumo_lapelis_galioja_nuo() {
        return nedarbingumo_lapelis_galioja_nuo;
    }

    public void setNedarbingumo_lapelis_galioja_nuo(Date nedarbingumo_lapelis_galioja_nuo) {
        this.nedarbingumo_lapelis_galioja_nuo = nedarbingumo_lapelis_galioja_nuo;
    }

    public String getNedarbingumo_lapelis_galioja_iki() {
        return nedarbingumo_lapelis_galioja_iki;
    }

    public void setNedarbingumo_lapelis_galioja_iki(String nedarbingumo_lapelis_galioja_iki) {
        this.nedarbingumo_lapelis_galioja_iki = nedarbingumo_lapelis_galioja_iki;
    }

    public String getAsmens_kodas() {
        return asmens_kodas;
    }

    public void setAsmens_kodas(String asmens_kodas) {
        this.asmens_kodas = asmens_kodas;
    }

    public int getJAR_kodas() {
        return JAR_kodas;
    }

    public void setJAR_kodas(int JAR_kodas) {
        this.JAR_kodas = JAR_kodas;
    }

    public int getGydytojo_id() {
        return gydytojo_id;
    }

    public void setGydytojo_id(int gydytojo_id) {
        this.gydytojo_id = gydytojo_id;
    }
}
