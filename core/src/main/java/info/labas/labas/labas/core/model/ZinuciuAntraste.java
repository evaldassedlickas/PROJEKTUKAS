package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Justas on 4/22/2017.
 */
@Entity
@Table(name = "zinuciu_antraste")
public class ZinuciuAntraste {

    @Id
    private int zinuciu_antrastes_id;

    @Column(name = "siuntejo_id")
    private int siuntejo_id;

    @Column(name = "gavejo_id")
    private int gavejo_id ;

    @Column(name = "antraste")
    private String antraste;

    @Column(name = "suntejo_asmens_kodas")
    private String suntejo_asmens_kodas;

    @Column(name = "gavejo_asmens_kodas")
    private String gavejo_asmens_kodas;

    public int getZinuciu_antrastes_id() {
        return zinuciu_antrastes_id;
    }

    public void setZinuciu_antrastes_id(int zinuciu_antrastes_id) {
        this.zinuciu_antrastes_id = zinuciu_antrastes_id;
    }

    public int getSiuntejo_id() {
        return siuntejo_id;
    }

    public void setSiuntejo_id(int siuntejo_id) {
        this.siuntejo_id = siuntejo_id;
    }

    public int getGavejo_id() {
        return gavejo_id;
    }

    public void setGavejo_id(int gavejo_id) {
        this.gavejo_id = gavejo_id;
    }

    public String getAntraste() {
        return antraste;
    }

    public void setAntraste(String antraste) {
        this.antraste = antraste;
    }

    public String getSuntejo_asmens_kodas() {
        return suntejo_asmens_kodas;
    }

    public void setSuntejo_asmens_kodas(String suntejo_asmens_kodas) {
        this.suntejo_asmens_kodas = suntejo_asmens_kodas;
    }

    public String getGavejo_asmens_kodas() {
        return gavejo_asmens_kodas;
    }

    public void setGavejo_asmens_kodas(String gavejo_asmens_kodas) {
        this.gavejo_asmens_kodas = gavejo_asmens_kodas;
    }
}
