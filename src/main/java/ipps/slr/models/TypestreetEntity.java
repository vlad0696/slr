package ipps.slr.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Gramovich_V on 15.03.2018.
 */
@Entity
@Table(name = "typestreet", schema = "sisslr", catalog = "slr")
public class TypestreetEntity {
    private long id;
    private Timestamp datecreate;
    private Timestamp datelastedit;
    private Long lasteditorid;
    private Long ownerid;
    private Timestamp dateend;
    private Timestamp datestart;
    private Long codetypestreet;
    private String name;
    private String nameshort;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "datecreate", nullable = true)
    public Timestamp getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(Timestamp datecreate) {
        this.datecreate = datecreate;
    }

    @Basic
    @Column(name = "datelastedit", nullable = true)
    public Timestamp getDatelastedit() {
        return datelastedit;
    }

    public void setDatelastedit(Timestamp datelastedit) {
        this.datelastedit = datelastedit;
    }

    @Basic
    @Column(name = "lasteditorid", nullable = true)
    public Long getLasteditorid() {
        return lasteditorid;
    }

    public void setLasteditorid(Long lasteditorid) {
        this.lasteditorid = lasteditorid;
    }

    @Basic
    @Column(name = "ownerid", nullable = true)
    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    @Basic
    @Column(name = "dateend", nullable = true)
    public Timestamp getDateend() {
        return dateend;
    }

    public void setDateend(Timestamp dateend) {
        this.dateend = dateend;
    }

    @Basic
    @Column(name = "datestart", nullable = true)
    public Timestamp getDatestart() {
        return datestart;
    }

    public void setDatestart(Timestamp datestart) {
        this.datestart = datestart;
    }

    @Basic
    @Column(name = "codetypestreet", nullable = true)
    public Long getCodetypestreet() {
        return codetypestreet;
    }

    public void setCodetypestreet(Long codetypestreet) {
        this.codetypestreet = codetypestreet;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 512)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "nameshort", nullable = true, length = 255)
    public String getNameshort() {
        return nameshort;
    }

    public void setNameshort(String nameshort) {
        this.nameshort = nameshort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypestreetEntity that = (TypestreetEntity) o;

        if (id != that.id) return false;
        if (datecreate != null ? !datecreate.equals(that.datecreate) : that.datecreate != null) return false;
        if (datelastedit != null ? !datelastedit.equals(that.datelastedit) : that.datelastedit != null) return false;
        if (lasteditorid != null ? !lasteditorid.equals(that.lasteditorid) : that.lasteditorid != null) return false;
        if (ownerid != null ? !ownerid.equals(that.ownerid) : that.ownerid != null) return false;
        if (dateend != null ? !dateend.equals(that.dateend) : that.dateend != null) return false;
        if (datestart != null ? !datestart.equals(that.datestart) : that.datestart != null) return false;
        if (codetypestreet != null ? !codetypestreet.equals(that.codetypestreet) : that.codetypestreet != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nameshort != null ? !nameshort.equals(that.nameshort) : that.nameshort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (datecreate != null ? datecreate.hashCode() : 0);
        result = 31 * result + (datelastedit != null ? datelastedit.hashCode() : 0);
        result = 31 * result + (lasteditorid != null ? lasteditorid.hashCode() : 0);
        result = 31 * result + (ownerid != null ? ownerid.hashCode() : 0);
        result = 31 * result + (dateend != null ? dateend.hashCode() : 0);
        result = 31 * result + (datestart != null ? datestart.hashCode() : 0);
        result = 31 * result + (codetypestreet != null ? codetypestreet.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nameshort != null ? nameshort.hashCode() : 0);
        return result;
    }
}
