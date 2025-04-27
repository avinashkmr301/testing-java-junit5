package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class OwnerSDJpaServiceTest {

    private OwnerSDJpaService jpaService;

    @BeforeEach
    void setUp() {
        jpaService = new OwnerSDJpaService(null,null,null);
    }

    @Disabled
    @Test
    void findByLastName() {
        Owner doe = jpaService.findByLastName("Doe");
    }

    @Test
    void findAllByLastNameLike() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}