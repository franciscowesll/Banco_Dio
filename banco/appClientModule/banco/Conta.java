package banco;

public class Conta {
	
	private static final int Agencia_Padrao = 1;
	private static int SEQUENCIAL = 1;
	protected int numberConta;
	protected int numberAgencia;
	protected double saldo;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		this.numberAgencia = Agencia_Padrao;
		this.numberConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
	 this.saldo -=  valor;
	}
	
	public void depositar(double valor) {
		this.saldo +=  valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	

	public void Extrato() {
		System.out.println("Cliente: " + cliente.getName() + " CPF: "+cliente.getCpf());
		System.out.println("Agência: "+ this.numberAgencia);
		System.out.println("Conta: "+ this.numberConta);
		System.out.println(this.saldo);
	}
	
	public int getNumberConta() {
		return numberConta;
	}
	
	public int getNumberAgencia() {
		return numberAgencia;
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void imprimirConta() {
		// TODO Auto-generated method stub
		
	}

	

}
