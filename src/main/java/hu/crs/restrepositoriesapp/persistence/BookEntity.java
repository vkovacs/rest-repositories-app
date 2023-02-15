package hu.crs.restrepositoriesapp.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Entity
@RepositoryRestResource
public class BookEntity {
    @Id
    @GeneratedValue
    public int id;

    @Column
    public String title;
}
