package thekiddos.j2mf.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "specialities" )
public class Speciality extends BaseEntity {
    @Column( name = "description" )
    private String description;
}
