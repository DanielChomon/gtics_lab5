package main.java.com.example.L5.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "Categories")
public class Location {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "CategoryID")
private int id;
@Column(nullable = false)
private String categoryname;
private String description;
@Lob
private byte[] picture;
        }