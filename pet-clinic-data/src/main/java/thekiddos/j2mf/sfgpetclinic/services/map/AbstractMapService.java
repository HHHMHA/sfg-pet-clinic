package thekiddos.j2mf.sfgpetclinic.services.map;

import thekiddos.j2mf.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<TYPE extends BaseEntity, ID_TYPE extends Long> {
    protected Map<Long, TYPE> map = new HashMap<>();

    Set<TYPE> findAll() {
        return new HashSet<>( map.values() );
    }

    TYPE findById( ID_TYPE id ) {
        return map.get( id );
    }

    TYPE save( TYPE entity ) {
        if ( entity != null ) {
            if ( entity.getId() == null ) {
                entity.setId( getNextId() );
            }
            map.put( entity.getId(), entity );
        }
        else {
            throw new NullPointerException();
        }

        return entity;
    }

    void deleteById( ID_TYPE id ) {
        map.remove( id );
    }

    void delete( TYPE entity ) {
        map.entrySet().removeIf( entry -> entry.getValue().equals( entity ) );
    }

    private Long getNextId() {
        if ( map.size() == 0 )
            return 1L;
        return Collections.max( map.keySet() ) + 1;
    }
}
