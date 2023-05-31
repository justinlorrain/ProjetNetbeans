/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;

/**
 *
 * @author justi
 */
@Entity
@Table(name = "Reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero")
    private Double numero;
    @Column(name = "prix")
    private Double Prix;
    @Column(name = "email")
    private String email;
    @Column(name = "adresse")
    private String Adresse;
    @Column(name = "telephone")
    private String Telephone;
    @Column(name = "date")
    private Date Date;
    @Enumerated(EnumType.STRING)
    private StatutReservation Status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Restaurant", nullable = false)
    private Restaurant restaurant;

    public Reservation() {
    }

    public Reservation(Double numero, Double Prix, String email, String Adresse, String Telephone, Date Date, StatutReservation Status) {
        this.numero = numero;
        this.Prix = Prix;
        this.email = email;
        this.Adresse = Adresse;
        this.Telephone = Telephone;
        this.Date = Date;
        this.Status = Status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double getPrix() {
        return Prix;
    }

    public void setPrix(Double Prix) {
        this.Prix = Prix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public StatutReservation getStatus() {
        return Status;
    }

    public void setStatus(StatutReservation Status) {
        this.Status = Status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
  
}
