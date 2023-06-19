package menu;

import metodos.getoption;

public class Inicio {

	public static void inicio() {
		System.out.println("===========================================");
		System.out.println("             SOSAPATO - HOME");
		System.out.println("===========================================");
		System.out.println("         REGISTRAR[1] - BUSCAR[2]");
		System.out.println("          CATALOGO[3] - SAIR[4]");
		System.out.println("===========================================");
		System.out.print("Opção: ");
		switch(getoption.getOption()) {
			case 1:
				Registrar.registrar();
			break;
			case 2:
				Busca.escolhaBusca();
			break;
			case 3:
				Catalogo.listarCatalogo();
			break;
			case 4:
				return;
			default:
				return;
		}
	}
	
}
