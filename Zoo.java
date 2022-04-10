package revHerançaAnimal;

public class Zoo {

	public static void main(String[] args) {
		Animal a1 = new Animal("camelo", "amarelo", "Deserto", 230, 30, 4);
		Peixe p1 = new Peixe("Tubarão", null, null, 22, 40, 0);
		Mamifero m1 = new Mamifero(null, null, null, 0, 0, 0);
		m1.alteraAlimento("peixe");
		p1.caracteristicas="muitos dentes";
		a1.dados();
p1.alteraCaracteristicas("Calda e barbatanas ");
		p1.dados();
		p1.caracteristica();
		m1.dados();
		m1.mostraAlimento();
	}

}
