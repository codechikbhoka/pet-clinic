package gomchik.springframework.petclinic.services;

import gomchik.springframework.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by jt on 7/18/18.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
