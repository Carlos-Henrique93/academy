package br.com.academy.Enums;

public enum Status {
    ATIVO(0),
    INATIVO(1),
    PENDENTE(2),
    CONCLUIDO(3),
    CANCELADO(4),
    EM_ANDAMENTO(5);

    private final int codigo;

    Status(int codigo) {
        this.codigo = codigo;
    }

    public static Status fromCodigo(int codigo) {
        for (Status status : Status.values()) {
            if (status.codigo == codigo) {
                return status;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}
