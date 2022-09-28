public class ContaCorrente {

    private String numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private String dataNascimento;
    private double saldoConta;

    public boolean sacarValor(double valorSolicitado) {
        return statusOperacao;
    }

    public boolean transferirValor(double valorSolicitado) {
        return statusOperacao;
    }

    public boolean cancelarConta(String justificativa) {
        return statusOperacao;        
    }

    public String consultarExtratoComDatas(String dataInicio, String dataFim) {
        return extrato;
    }

    public double consultarSaldo() {
        return saldo;
    }
}