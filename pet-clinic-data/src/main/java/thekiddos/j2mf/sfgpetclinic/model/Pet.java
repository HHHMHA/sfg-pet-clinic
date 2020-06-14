package thekiddos.j2mf.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate dateOfBirth;

}
