package pe.edu.upc.donfy.dtos;

import jakarta.persistence.Column;

public class DonationTypeDTO {
    private int idTipoDonation;
    private String nombreTipoDonation;

    public int getIdTipoDonation() {
        return idTipoDonation;
    }

    public void setIdTipoDonation(int idTipoDonation) {
        this.idTipoDonation = idTipoDonation;
    }

    public String getNombreTipoDonation() {
        return nombreTipoDonation;
    }

    public void setNombreTipoDonation(String nombreTipoDonation) {
        this.nombreTipoDonation = nombreTipoDonation;
    }
}
