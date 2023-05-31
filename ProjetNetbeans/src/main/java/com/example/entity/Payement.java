/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;

/**
 *
 * @author justi
 */
@Entity
@Table(name = "Payement")
public class Payement {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "methode_paiement")
    private String Methodepaie;
    @Column(name = "Date")
    private Date Date;
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    public Payement() {
    }

    public Payement(String Methodepaie, Date Date) {
        this.Methodepaie = Methodepaie;
        this.Date = Date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMethodepaie() {
        return Methodepaie;
    }

    public void setMethodepaie(String Methodepaie) {
        this.Methodepaie = Methodepaie;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    
}
