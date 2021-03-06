package gomchik.springframework.petclinic.model;

import java.time.LocalDate;

/**
 * @author vbbharga on 12/04/20
 */
public class Pet extends BaseEntity {

    private PetType petType;

    private Owner owner;

    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
