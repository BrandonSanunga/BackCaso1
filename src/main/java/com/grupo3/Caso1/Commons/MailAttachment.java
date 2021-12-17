package com.grupo3.Caso1.Commons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailAttachment {
    private String nombre;
    private String path;

    public MailAttachment() {
    }

    public MailAttachment(String nombre, String path) {
        this.nombre = nombre;
        this.path = path;
    }
}
