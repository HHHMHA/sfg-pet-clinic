package thekiddos.j2mf.sfgpetclinic.services.map;

import thekiddos.j2mf.sfgpetclinic.model.Vet;
import thekiddos.j2mf.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet findById( Long id ) {
        return super.findById( id );
    }

    @Override
    public Vet save( Vet entity ) {
        return super.save( entity.getId(), entity );
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById( Long id ) {
        super.deleteById( id );
    }

    @Override
    public void delete( Vet entity ) {
        super.delete( entity );
    }
}
