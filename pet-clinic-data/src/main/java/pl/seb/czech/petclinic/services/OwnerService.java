package pl.seb.czech.petclinic.services;

import pl.seb.czech.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    
    Owner findByLastName(String lastName);
}
