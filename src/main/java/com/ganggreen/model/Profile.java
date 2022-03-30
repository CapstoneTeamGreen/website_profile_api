package com.ganggreen.model;


import javax.persistence.*;
import javax.validation.constraints.Size;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Jason MacKeigan
 */


@Entity(name = "Project")
@Table(schema = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column (name = "id", unique = true, updatable = false, nullable = false)
    private int id;

    @Column(name = "authorName", nullable = false)
    @Size(max = 64)
    private String authorName;

    @Column(name = "developerType", nullable = false)
    @Size(max = 64)
    private String developerType;

    @Column(name = "aboutMe", nullable = false)
    @Size(max = 512)
    private String aboutMe;

    @Column(name = "email", nullable = false)
    @Size(max = 320)
    private String email;

    public Profile() {
    }

    public Profile(int id, String authorName, String developerType, String aboutMe, String email) {
        this.id = id;
        this.authorName = authorName;
        this.developerType = developerType;
        this.aboutMe = aboutMe;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDeveloperType() {
        return developerType;
    }

    public void setDeveloperType(String developerType) {
        this.developerType = developerType;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
