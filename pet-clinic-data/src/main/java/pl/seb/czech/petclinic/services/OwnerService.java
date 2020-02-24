package pl.seb.czech.petclinic.services;

import pl.seb.czech.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    
    Owner findByLastName(String lastName);
    
    Owner findById(Long id);
    
    Owner Save(Owner owner);
    
    Set<Owner> findAll();
    
}
