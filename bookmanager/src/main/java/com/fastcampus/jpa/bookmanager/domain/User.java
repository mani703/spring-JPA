package com.fastcampus.jpa.bookmanager.domain;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Data
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue()
    private Long id;

//    @NotNull
    private String name;

//    @NotNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
