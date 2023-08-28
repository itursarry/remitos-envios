package com.itu.remitos_envios.dtos;

import java.util.Date;

public class RemitoDto {

    private String numero;
    private String destinatario;
    private Date fechaDeDespacho;
    private Date fechaDeEntrega;
    private String remitente;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Date getFechaDeDespacho() {
        return fechaDeDespacho;
    }

    public void setFechaDeDespacho(Date fechaDeDespacho) {
        this.fechaDeDespacho = fechaDeDespacho;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
}
