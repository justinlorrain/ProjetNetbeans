/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author justi
 */
@Entity
@Table(name = "Facture")
public class Facture {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantité")
    private Double Quantité;
     @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "User", nullable = false)
    private User user;
    public Facture() {
    }

    public Facture(Double Quantité) {
        this.Quantité = Quantité;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantité() {
        return Quantité;
    }

    public void setQuantité(Double Quantité) {
        this.Quantité = Quantité;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
