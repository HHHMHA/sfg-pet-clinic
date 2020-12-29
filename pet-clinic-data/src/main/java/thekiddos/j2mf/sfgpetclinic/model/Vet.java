package thekiddos.j2mf.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table( name = "vets" )
public class Vet extends Person {
    @ManyToMany( fetch = FetchType.EAGER )
    @JoinTable( name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id")
    @inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();
}
