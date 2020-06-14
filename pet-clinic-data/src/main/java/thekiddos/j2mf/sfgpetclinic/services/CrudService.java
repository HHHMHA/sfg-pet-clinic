package thekiddos.j2mf.sfgpetclinic.services;

import java.util.Optional;
import java.util.Set;

public interface CrudService<TYPE, ID_TYPE> {
    Optional<TYPE> findById( ID_TYPE id );

    <SUBTYPE extends TYPE> SUBTYPE save( SUBTYPE entity );

    Set<TYPE> findAll();

    void delete( TYPE entity );
    void deleteById( ID_TYPE id );
}
