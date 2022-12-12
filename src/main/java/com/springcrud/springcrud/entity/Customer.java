package com.springcrud.springcrud.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
@Getter
@Setter
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Bu alan boş geçilemez")
    @Size(max = 255, message = "En fazla 255 karakter yazılabilir")
    private String name;

    @NotEmpty(message = "Bu alan boş geçilemez")
    @Size(max = 255, message = "En fazla 255 karakter yazılabilir")
    private String surname;

    @Email(message = "Email formatına uygun değil")
    private String email;

}
