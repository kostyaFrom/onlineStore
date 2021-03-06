package com.konstantinbulygin.onlinestore.model.data;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pages")
@Data
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, max = 45, message = "Title must be at least 3 characters long")
    private String title;

    private String slug;

    @Size(min = 5, max = 500 ,message = "Content must be at least 5 characters long")
    private String content;

}
