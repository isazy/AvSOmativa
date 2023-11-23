package AvSom;

public class PrincipalPedido {

public static void main(String[] args) {
		
		Pedido algm = new Pedido (1, "num sei", 3);
		
		System.out.println(algm.getId());
		System.out.println(algm.getProduto());
		System.out.println(algm.getQuantidade());
		
}
}
