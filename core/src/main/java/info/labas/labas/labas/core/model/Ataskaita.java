package info.labas.labas.labas.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ataskaita")
public class Ataskaita {
    @Id
    private int ataskaitos_id;

    @Column(name = "sukurimo_data")
    private Date sukurimo_data;

    @Column(name = "sistemos_gydytoju_skaicius")
    private int sistemos_gydytoju_skaicius;

    @Column(name = "sistemos_pacientu_skaicius")
    private int sistemos_pacientu_skaicius;

    @Column(name = "vizitu_skaicius")
    private int vizitu_skaicius;

    @Column(name = "data_nuo")
    private Date data_nuo;

    @Column(name = "data_iki")
    private Date data_iki;

    public int getAtaskaitos_id() {
        return ataskaitos_id;
    }

    public void setAtaskaitos_id(int ataskaitos_id) {
        this.ataskaitos_id = ataskaitos_id;
    }

    public Date getSukurimo_data() {
        return sukurimo_data;
    }

    public void setSukurimo_data(Date sukurimo_data) {
        this.sukurimo_data = sukurimo_data;
    }

    public int getSistemos_gydytoju_skaicius() {
        return sistemos_gydytoju_skaicius;
    }

    public void setSistemos_gydytoju_skaicius(int sistemos_gydytoju_skaicius) {
        this.sistemos_gydytoju_skaicius = sistemos_gydytoju_skaicius;
    }

    public int getSistemos_pacientu_skaicius() {
        return  sistemos_pacientu_skaicius;
    }

    public void setSistemos_pacientu_skaicius(int sistemos_pacientu_skaicius) {
        this.sistemos_pacientu_skaicius = sistemos_pacientu_skaicius;
    }

    public int getVizitu_skaicius() {
        return vizitu_skaicius;
    }

    public void setVizitu_skaicius(int vizitu_skaicius) {
        this.vizitu_skaicius = vizitu_skaicius;
    }

    public Date getData_nuo() {
        return data_nuo;
    }

    public void setData_nuo(Date data_nuo) {
        this.data_nuo = data_nuo;
    }

    public Date getData_iki() {
        return data_iki;
    }

    public void setData_iki(Date data_iki) {
        this.data_iki = data_iki;
    }
}

