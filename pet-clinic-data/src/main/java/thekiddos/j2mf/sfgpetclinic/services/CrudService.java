package thekiddos.j2mf.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<TYPE, ID_TYPE> {
    TYPE findById( ID_TYPE id );

    TYPE save( TYPE entity );

    Set<TYPE> findAll();

    void delete( TYPE entity );
    void deleteById( ID_TYPE id );
}
