package com.scaler.firstclass.modules;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class Category {
    private Long id;
    private String titles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }
}
