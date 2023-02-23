package it.epicode.flaviocirillo.esercizio1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Info i = new Info();
		i.setNome("Flavio");
		i.setCognome("Cirillo");
		i.DataDiNascita(LocalDate.of(1999, 11, 07));
		
		UserData u = new UserData();
		DataSource d = new Adapter(i);
		u.getData(d);

	}

}
