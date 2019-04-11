package funciones;

import java.time.LocalDate;
import java.util.Calendar;

import java.util.GregorianCalendar;


public class Funciones {

	/*
	 * public static int traerAnio (GregorianCalendar f){ return
	 * f.get(Calendar.YEAR);}
	 */
	/*
	 * public static String traerFechaCorta(GregorianCalendar f){ String fechaCorta
	 * = " "; return fechaCorta;}
	 */

	public static boolean esBisiesto(int anio) {
		boolean resultado;
		if (anio % 400 == 0) {
			resultado = true;
		}

		if (anio % 4 == 0 && anio % 100 != 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

	public static int traerAnio(GregorianCalendar fecha) {
		return fecha.get(Calendar.YEAR);
	}

	public static int traerMes(GregorianCalendar fecha) {
		return (fecha.get(Calendar.MONTH) + 1);

	}

	public static int traerDia(GregorianCalendar fecha) {
		return fecha.get(Calendar.DAY_OF_MONTH);

	}

	public static boolean esFechaValida(int dia, int mes, int anio) {
		int dia1 = 0, mes1 = 0, anio1 = 0;

		if (anio >= 1900) {
			anio1 = 1;
		}

		if (mes >= 1 && mes <= 12) {
			mes1 = 1;

			if (dia >= 1 && dia <= 31) {
				if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
						&& (dia <= 31)) {
					dia1 = 1;
				}

				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 30)) {
					dia1 = 1;
				}

				if ((mes == 2) && (dia <= 28)) {
					dia1 = 1;
				}

				if (esBisiesto(anio) == true && dia <= 29) {
					dia1 = 1;
				}
			}
		}
		return (dia1 + anio1 + mes1 == 3);

	}

	public static GregorianCalendar traerFecha(int dia, int mes, int anio) {
		GregorianCalendar f = new GregorianCalendar();
		if (esFechaValida(dia, mes, anio)) {

			f.set(anio, mes + 1, dia);
		} else {
			f = null;
		}

		return f;
	}

	public static GregorianCalendar traerFecha(String fecha) {
		String diaS, mesS, anioS;
		int dia = 0, mes = 0, anio = 0;
		String dias[] = fecha.split("/");
		diaS = dias[0];
		mesS = dias[1];
		anioS = dias[2];

		dia = Integer.parseInt(diaS);
		mes = Integer.parseInt(mesS);
		anio = Integer.parseInt(anioS);

		GregorianCalendar f = new GregorianCalendar(anio, mes, dia);

		return f;
	}

	public static String traerFechaCorta(LocalDate fecha) {
		int dia = 0, mes = 0, anio = 0;
		dia = fecha.getDayOfMonth();
		mes = fecha.getMonthValue();
		anio = fecha.getYear();

//		dia = fecha.get(Calendar.DAY_OF_MONTH);
//		mes = fecha.get(Calendar.MONTH) + 1;
//		anio = fecha.get(Calendar.YEAR);

		return (dia + "/" + mes + "/" + anio);

	}

	public static String traerFechaCortaBD(GregorianCalendar fecha) {
		int dia = 0, mes = 0, anio = 0;
		dia = fecha.get(Calendar.DAY_OF_MONTH);
		mes = fecha.get(Calendar.MONTH);
		anio = fecha.get(Calendar.YEAR);

		return (anio + "/" + mes + "/" + dia);
	}

	public static String traerFechaCortaHora(GregorianCalendar fecha){
		if (fecha == null){
			return null;
			}
		else{
		int dia = 0, mes = 0, anio = 0, hora = 0, minuto = 0, segundo = 0;
		dia = fecha.get(Calendar.DAY_OF_MONTH);
		mes = fecha.get(Calendar.MONTH) + 1;
		anio = fecha.get(Calendar.YEAR);
		hora = fecha.get(Calendar.HOUR_OF_DAY);
		minuto = fecha.get(Calendar.MINUTE);
		segundo = fecha.get(Calendar.SECOND);

		return (dia + "/" + mes + "/" + anio + " " + hora + ":" + minuto + ":" + segundo);
		}
	}

	public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha, int cantDias) {
		GregorianCalendar faux = (GregorianCalendar) fecha.clone();

		faux.add(Calendar.DAY_OF_MONTH, cantDias);

		return faux;

	}

	public static boolean esDiaHabil(GregorianCalendar fecha) {
		boolean conf;
		System.out.println("--> " + fecha.get(Calendar.DAY_OF_WEEK));

		if (fecha.get(Calendar.DAY_OF_WEEK) >= 2 && fecha.get(Calendar.DAY_OF_WEEK) <= 6) { // 2= Lunes / 6= Viernes 7=
																							// Sabado
			conf = true;

		} else {
			conf = false;
		}

		return conf;

	}

	public static String traerDiaDeLaSemana(GregorianCalendar fecha) {
		int dia = fecha.get(Calendar.DAY_OF_WEEK);
		String diaS = "";

		switch (dia) {
		case 1:
			diaS = "Domingo";
			break;
		case 2:
			diaS = "Lunes";
			break;
		case 3:
			diaS = "Martes";
			break;
		case 4:
			diaS = "Miercoles";
			break;
		case 5:
			diaS = "Jueves";
			break;
		case 6:
			diaS = "Viernes";
			break;
		case 7:
			diaS = "Sabado";
			break;
		}

		return diaS;
	}

	public static String traerMesEnLetras(GregorianCalendar fecha) {
		int mes = fecha.get(Calendar.MONTH) + 1;
		System.out.println("Mes: " + mes);
		String mesS = "";

		switch (mes) {
		case 1:
			mesS = "Enero";
			break;
		case 2:
			mesS = "Febrero";
			break;
		case 3:
			mesS = "Marzo";
			break;
		case 4:
			mesS = "Abril";
			break;
		case 5:
			mesS = "Mayo";
			break;
		case 6:
			mesS = "Junio";
			break;
		case 7:
			mesS = "Julio";
			break;
		case 8:
			mesS = "Agosto";
			break;
		case 9:
			mesS = "Septiembre";
			break;
		case 10:
			mesS = "Octubre";
			break;
		case 11:
			mesS = "Noviembre";
			break;
		case 12:
			mesS = "Diciembre";
			break;
		}

		return mesS;
	}

	
	public static String traerFechaLarga(GregorianCalendar fecha) {
		return (traerDiaDeLaSemana(fecha)+" "+traerDia(fecha)+" de "+traerMesEnLetras(fecha)+" de "+traerAnio(fecha));
		
	}
	
	
	public static boolean sonFechasIguales(GregorianCalendar fecha,GregorianCalendar fecha1) {
		return (traerAnio(fecha)==traerAnio(fecha1) && traerMes(fecha) == traerMes(fecha1) && traerDia(fecha) == traerDia(fecha1));
	}
	
	public static boolean sonFechasHorasIguales(GregorianCalendar fecha,GregorianCalendar fecha1) {
		return (sonFechasIguales(fecha,fecha1) && fecha.get(Calendar.HOUR) == fecha1.get(Calendar.HOUR) && 
				fecha.get(Calendar.MINUTE) == fecha1.get(Calendar.MINUTE));
	}
	
	
	
	public static int traerCantDiasDeUnMes(int anio, int mes) {
		int dias=0;
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			dias =31; 
		}
		
		if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
			dias=30;
		}
		
		if (esBisiesto(anio) && mes == 2) {
			dias=29;}
		
		if (esBisiesto(anio)== false && mes == 2) {
			dias=28;
		}
		
		return dias;

	}

	 public static double aproximar2Decimal(double valor) {
		 double valorAux = valor * 1000;
		 if (valorAux % 10 >=5)
			 valorAux = valorAux - valorAux % 10 + 10;
		 else
			 valorAux = valorAux - valorAux % 10;
		 return valorAux / 1000.0;
	 }

	public static boolean esNumero(char c) {
		boolean conf;

		if (esLetra(c)) {
			conf = false;
		} else {
			conf = true;
		}

		return conf;
	}

	public static boolean esLetra(char c) {
		return Character.isLetter(c);
	}

	public static boolean esCadenaNros(String cadena) {
		return (cadena.matches("[0-9]+"));
	}

	public static boolean esCadenaLetras(String cadena) {
		return (cadena.matches("[a-zA-Z]+"));

	}

	
	public static double convertirADouble(int n) {
		return ((double) n);
		
	}

}

