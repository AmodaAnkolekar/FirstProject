package com.scaler.firstclass.modules;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Category extends BaseModel{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


/////////////////////////////////////////////////////

//@Getter
//@Setter
//public class Category {
//    private Long id;
//    private String title;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Category() {
//    }
//
//    public Category(Long id, String title) {
//        this.id = id;
//        this.title = title;
//    }
//}
