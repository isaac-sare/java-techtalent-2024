import java.util.Date;
import java.text.SimpleDateFormat;

public class UD5CondicionalIfApp {

	public static void main(String[] args) {
		Date fecha = new Date();
		SimpleDateFormat formatoHora = new SimpleDateFormat("h");
		int horaNum = Integer.parseInt(formatoHora.format(fecha));
		
		String saludo;
		
		switch (horaNum) {
			case 10:
				saludo = "Buenos días, son las 10";
			break;
			case 11:
				saludo = "Buenos días, son las 11";
			break;
			default:
				saludo = "Que tenga un buen día!";
		}
		System.out.println(saludo);
	}

}
