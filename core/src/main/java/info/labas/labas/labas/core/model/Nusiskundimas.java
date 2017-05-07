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
@Table(name = "nusiskundimas")
public class Nusiskundimas {

    @Id
    private String nusiskundimo_id;

    @Column(name = "pradzios_data")
    private Date pradzios_data;

    @Column(name = "bukle")
    private String bukle;

    @Column(name = "pasikartojimas")
    private String pasikartojimas;

    @Column(name = "sezoniskumas")
    private boolean sezoniskumas;

    @Column(name = "aprasymas")
    private String aprasymas;

    @Column(name = "ligos_korteles_eilutes_id")
    private int ligos_korteles_eilutes_id;

    public String getNusiskundimo_id() {
        return nusiskundimo_id;
    }

    public void setNusiskundimo_id(String nusiskundimo_id) {
        this.nusiskundimo_id = nusiskundimo_id;
    }

    public Date getPradzios_data() {
        return pradzios_data;
    }

    public void setPradzios_data(Date pradzios_data) {
        this.pradzios_data = pradzios_data;
    }

    public String getBukle() {
        return bukle;
    }

    public void setBukle(String bukle) {
        this.bukle = bukle;
    }

    public String getPasikartojimas() {
        return pasikartojimas;
    }

    public void setPasikartojimas(String pasikartojimas) {
        this.pasikartojimas = pasikartojimas;
    }

    public boolean isSezoniskumas() {
        return sezoniskumas;
    }

    public void setSezoniskumas(boolean sezoniskumas) {
        this.sezoniskumas = sezoniskumas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public int getLigos_korteles_eilutes_id() {
        return ligos_korteles_eilutes_id;
    }

    public void setLigos_korteles_eilutes_id(int ligos_korteles_eilutes_id) {
        this.ligos_korteles_eilutes_id = ligos_korteles_eilutes_id;
    }
}
