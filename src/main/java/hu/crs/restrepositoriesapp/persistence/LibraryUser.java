package hu.crs.restrepositoriesapp.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@Entity
public class LibraryUser {
    @Id
    @GeneratedValue
    public int id;

    @Column
    public String name;

    @OneToMany
    @Cascade(CascadeType.ALL)
    public Collection<BookEntity> books;
}
