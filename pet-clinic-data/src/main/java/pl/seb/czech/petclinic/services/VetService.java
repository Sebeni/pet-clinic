package pl.seb.czech.petclinic.services;

import pl.seb.czech.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet Save(Vet vet);

    Set<Vet> findAll();
}
