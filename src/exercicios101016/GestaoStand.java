package exercicios101016;

import java.util.ArrayList;

public class GestaoStand {
	
	private ArrayList _transacoes;
	private ArrayList _automoveis;
	private ArrayList _clientes;
	
	public GestaoStand() {
		
		
		
		Automovel newauto = criarCarro();
		_automoveis.add(newauto);
		
		Cliente c = new Cliente("Alberto Matos", "Seixal", "963845197", 982344522);
		Cliente c2 = new Cliente("Amilcar Alto", "Setubal", "963865497", 982394422);
		_clientes.add(c);
		_clientes.add(c2);
		
		Transacao crenault = new Transacao(Transacao.COMPRA, newauto, c, 2300.0);
		
		_transacoes.add(crenault);
		
		Transacao Vrenault = new Transacao(Transacao.VENDA, newauto, c2, 2700.0);
		
		
	}
	
	public Automovel criarCarro() {
		
		Automovel a = new Automovel(2500.00, 1600, "Renault", "Megane", 120000, 2002);
		Automovel a2 = new Automovel(1750.00, 1200, "Ford", "Focus", 205000, 1998);
		
		return a;
	}
	
	public Cliente criarCliente() {
		
		Cliente c = new Cliente("Alberto Matos", "Seixal", "963845197", 982344522);
		Cliente c2 = new Cliente("Amilcar Alto", "Setubal", "963865497", 982394422);
		
		return c;
		
	}
	
	public Transacao comprarCarro(Automovel carro, Cliente c) {
		
		return null;
		
	}
	
	public Transacao venderCarro(Automovel carro, Cliente c) {
		
		return null;
		
	}

	public ArrayList get_transacoes() {
		return _transacoes;
	}
	
}
