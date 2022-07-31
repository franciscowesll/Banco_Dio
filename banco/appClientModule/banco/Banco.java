package banco;
import java.util.*;
public class Banco {
	
	protected String name;
	private List<Conta> contas;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Conta> getContas(){
		return this.contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
}
