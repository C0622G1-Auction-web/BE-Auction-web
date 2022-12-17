package com.project.model.guide;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    @Column(columnDefinition = "boolean default true")
    private Boolean deleteStatus;
    @OneToMany(mappedBy = "guide")
    private Set<ImgUrlGuide> images;

    public Guide() {
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<ImgUrlGuide> getImages() {
        return images;
    }

    public void setImages(Set<ImgUrlGuide> images) {
        this.images = images;
    }
}
