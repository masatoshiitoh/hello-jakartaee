/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.dressingroom;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author b-itoh
 */
@Entity
@Table(name = "MST_CAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstCar.findAll", query = "SELECT m FROM MstCar m"),
    @NamedQuery(name = "MstCar.findById", query = "SELECT m FROM MstCar m WHERE m.id = :id"),
    @NamedQuery(name = "MstCar.findByManufacturer", query = "SELECT m FROM MstCar m WHERE m.manufacturer = :manufacturer"),
    @NamedQuery(name = "MstCar.findByName", query = "SELECT m FROM MstCar m WHERE m.name = :name")})
public class MstCar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MANUFACTURER")
    private short manufacturer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NAME")
    private String name;

    public MstCar() {
    }

    public MstCar(Long id) {
        this.id = id;
    }

    public MstCar(Long id, short manufacturer, String name) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(short manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstCar)) {
            return false;
        }
        MstCar other = (MstCar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jp.dressingroom.MstCar[ id=" + id + " ]";
    }
    
}
