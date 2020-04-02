package hu.agocsi.movie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String givenName;
    private String familyName;

    @ManyToMany(mappedBy = "persons")
    Set <Movie> movie = new HashSet<>();

    public Person() {
    }

    public Person(String givenName, String familyName, Set<Movie> movie) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.movie = movie;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Set<Movie> getMovie() {
        return movie;
    }

    public void setMovie(Set<Movie> movie) {
        this.movie = movie;
    }
}
