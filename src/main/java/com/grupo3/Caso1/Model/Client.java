package com.grupo3.Caso1.Model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Client {

    @Id
    private String cedulaClient;

    private String nombresClient;
    private String apellidosClient;
    private Date nacimientoClient;
    private String emailClient;
    private String celularClient;
    private String direccionClient;
    private String passwordClient;

    public Client(String cedulaClient, String nombresClient, String apellidosClient, Date nacimientoClient,
            String emailClient, String celularClient, String direccionClient, String passwordClient) {
        this.cedulaClient = cedulaClient;
        this.nombresClient = nombresClient;
        this.apellidosClient = apellidosClient;
        this.nacimientoClient = nacimientoClient;
        this.emailClient = emailClient;
        this.celularClient = celularClient;
        this.direccionClient = direccionClient;
        this.passwordClient = passwordClient;
    }

    public Client() {
    }

    /**
     * @return String return the cedulaClient
     */
    public String getCedulaClient() {
        return cedulaClient;
    }

    /**
     * @param cedulaClient the cedulaClient to set
     */
    public void setCedulaClient(String cedulaClient) {
        this.cedulaClient = cedulaClient;
    }

    /**
     * @return String return the nombresClient
     */
    public String getNombresClient() {
        return nombresClient;
    }

    /**
     * @param nombresClient the nombresClient to set
     */
    public void setNombresClient(String nombresClient) {
        this.nombresClient = nombresClient;
    }

    /**
     * @return String return the apellidosClient
     */
    public String getApellidosClient() {
        return apellidosClient;
    }

    /**
     * @param apellidosClient the apellidosClient to set
     */
    public void setApellidosClient(String apellidosClient) {
        this.apellidosClient = apellidosClient;
    }

    /**
     * @return Date return the nacimientoClient
     */
    public Date getNacimientoClient() {
        return nacimientoClient;
    }

    /**
     * @param nacimientoClient the nacimientoClient to set
     */
    public void setNacimientoClient(Date nacimientoClient) {
        this.nacimientoClient = nacimientoClient;
    }

    /**
     * @return String return the emailClient
     */
    public String getEmailClient() {
        return emailClient;
    }

    /**
     * @param emailClient the emailClient to set
     */
    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    /**
     * @return String return the celularClient
     */
    public String getCelularClient() {
        return celularClient;
    }

    /**
     * @param celularClient the celularClient to set
     */
    public void setCelularClient(String celularClient) {
        this.celularClient = celularClient;
    }

    /**
     * @return String return the direccionClient
     */
    public String getDireccionClient() {
        return direccionClient;
    }

    /**
     * @param direccionClient the direccionClient to set
     */
    public void setDireccionClient(String direccionClient) {
        this.direccionClient = direccionClient;
    }

    /**
     * @return String return the passwordClient
     */
    public String getPasswordClient() {
        return passwordClient;
    }

    /**
     * @param passwordClient the passwordClient to set
     */
    public void setPasswordClient(String passwordClient) {
        this.passwordClient = passwordClient;
    }

}