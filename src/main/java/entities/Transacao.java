package entities;

import enums.TipoTransacao;

import java.time.LocalDateTime;

public class Transacao {
    private LocalDateTime data;
    private TipoTransacao tipo;
    private double valor;

    public Transacao(LocalDateTime data, TipoTransacao tipo, double valor) {
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return data + " | " + tipo.getDescricao() + " | R$ " + valor;
    }
}
