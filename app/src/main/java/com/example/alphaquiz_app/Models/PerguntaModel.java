package com.example.alphaquiz_app.Models;

public class PerguntaModel {

    String perguntaName;

    public PerguntaModel(String perguntaName) {
        this.perguntaName = perguntaName;
    }

    public String getPerguntaName() {
        return perguntaName;
    }

    public void setPerguntaName(String perguntaName) {
        this.perguntaName = perguntaName;
    }
}
