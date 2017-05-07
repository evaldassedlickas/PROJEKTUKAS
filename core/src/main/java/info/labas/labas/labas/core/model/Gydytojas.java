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
@Table(name = "gydytojas")
public class Gydytojas {

    @Id
    private int gydytojo_id;

    @Column(name = "licencijos_nr")
    private String licensijos_nr;

    @Column(name = "licencijos_galiojimo_pradzia")
    private Date licensijos_galiojimo_pradzia;

    @Column(name = "licencijos_galiojimo_pabaiga")
    private Date licensijos_galiojimo_pabaiga;

    @Column(name = "administratoriaus_patvirtinimas")
    private boolean administratoriaus_patvirtinimas;

    @Column(name = "specifikacija")
    private String specifikacija;

    @Column(name = "fk_ASMUOasmens_kodas")
    private String asmens_kodas;

    public int getGydytojo_id() {
        return gydytojo_id;
    }

    public void setGydytojo_id(int gydytojo_id) {
        this.gydytojo_id = gydytojo_id;
    }

    public String getLicensijos_nr() {
        return licensijos_nr;
    }

    public void setLicensijos_nr(String licensijos_nr) {
        this.licensijos_nr = licensijos_nr;
    }

    public Date getLicensijos_galiojimo_pradzia() {
        return licensijos_galiojimo_pradzia;
    }

    public void setLicensijos_galiojimo_pradzia(Date licensijos_galiojimo_pradzia) {
        this.licensijos_galiojimo_pradzia = licensijos_galiojimo_pradzia;
    }

    public Date getLicensijos_galiojimo_pabaiga() {
        return licensijos_galiojimo_pabaiga;
    }

    public void setLicensijos_galiojimo_pabaiga(Date licensijos_galiojimo_pabaiga) {
        this.licensijos_galiojimo_pabaiga = licensijos_galiojimo_pabaiga;
    }

    public boolean isAdministratoriaus_patvirtinimas() {
        return administratoriaus_patvirtinimas;
    }

    public void setAdministratoriaus_patvirtinimas(boolean administratoriaus_patvirtinimas) {
        this.administratoriaus_patvirtinimas = administratoriaus_patvirtinimas;
    }

    public String getSpecifikacija() {
        return specifikacija;
    }

    public void setSpecifikacija(String specifikacija) {
        this.specifikacija = specifikacija;
    }

    public String getAsmens_kodas() {
        return asmens_kodas;
    }

    public void setAsmens_kodas(String asmens_kodas) {
        this.asmens_kodas = asmens_kodas;
    }
}
