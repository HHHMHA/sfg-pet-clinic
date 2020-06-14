package thekiddos.j2mf.sfgpetclinic.model;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {
    @NonNull
    private Long id;
}
