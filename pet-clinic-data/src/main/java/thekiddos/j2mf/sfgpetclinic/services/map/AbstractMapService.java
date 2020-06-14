package thekiddos.j2mf.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<TYPE, ID_TYPE> {
    protected Map<ID_TYPE, TYPE> map = new HashMap<>();

    Set<TYPE> findAll() {
        return new HashSet<>( map.values() );
    }

    TYPE findById( ID_TYPE id ) {
        return map.get( id );
    }

    TYPE save( ID_TYPE id, TYPE entity ) {
        map.put( id, entity );

        return entity;
    }

    void deleteById( ID_TYPE id ) {
        map.remove( id );
    }

    void delete( TYPE entity ) {
        map.entrySet().removeIf( entry -> entry.getValue().equals( entity ) );
    }
}
