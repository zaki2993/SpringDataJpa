package com.example.demo;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jdk.internal.foreign.abi.fallback.FallbackLinker;

@Entity
public class Student {
  @Id
  @SequenceGenerator(
  name = "student_sequence",
  sequenceName = "student_sequence",
  allocationSize = 1
  )
  @GeneratedValue(
  strategy = GenerationType.SEQUENCE,
  generator = "student_sequence"
  )
  @Column(name = "id",updatable = false)
  private Long id;
  @Column(name = "first_name",nullable = false,columnDefinition = "TEXT")
  private String firstName;
  @Column(name = "last_name",nullable = false,columnDefinition = "TEXT")
  private String lastName;
  @Column(name = "email",nullable = false,columnDefinition = "TEXT",unique = true)
  private String email;
  @Column(name = "age")
  private Integer age;


  public Student(Long id, Integer age, String email, String lastName, String firstName) {
    this.id = id;
    this.age = age;
    this.email = email;
    this.lastName = lastName;
    this.firstName = firstName;
  }
  protected Student() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
