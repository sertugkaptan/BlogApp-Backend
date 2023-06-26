package com.example.BlogApp.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("BlogPost")
@AllArgsConstructor
@NoArgsConstructor
public class BlogPost {

    @Id
    private Long id;
    private User user;
    private String content;
}
