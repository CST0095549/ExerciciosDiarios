package exercicios101016;

import java.util.ArrayList;

public class BigBoss {
	
	ArrayList _stands;
	
	public BigBoss() {
		
		_stands = new ArrayList<GestaoStand>();
		
		GestaoStand raminhos = new GestaoStand();
		
		_stands.add(raminhos);
		
		lucrosStand(raminhos);
		
	}
	
	private void lucrosStand(GestaoStand stand){
		
		ArrayList tr = stand.get_transacoes();
		
		double lucro = 0,
				vendas = 0,
				compras = 0;
		
		for (int i = 0; i < tr.size(); i++) {
			Transacao t = (Transacao) tr.get(i);
			
			if (t.getTipo() == Transacao.COMPRA)
				compras = compras + t.getPreco();
			else if (t.getTipo() == Transacao.VENDA)
				vendas = vendas + t.preco;
			
		}
		
	}
	
}
