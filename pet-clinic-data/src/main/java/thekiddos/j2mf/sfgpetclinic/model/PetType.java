package thekiddos.j2mf.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "types" )
public class PetType extends BaseEntity {
    @Column( name = "name" )
    private String name;
}
