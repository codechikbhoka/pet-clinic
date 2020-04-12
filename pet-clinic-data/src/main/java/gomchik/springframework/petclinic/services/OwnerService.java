package gomchik.springframework.petclinic.services;

import gomchik.springframework.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
