import java.time.LocalDate;
import java.time.DayOfWeek;

public class UtilitarioDatas{
	
	public static LocalDate converterData(Integer dia, Integer mes, Integer ano){
		LocalDate data = LocalDate.of(ano, mes, dia);
		return data;
	}
	
	public static Boolean anoBissexto(Integer ano){
		LocalDate data = LocalDate.of(ano, 1, 1);
		return data.isLeapYear();
	}
	
	public static String diaSemana(Integer dia, Integer mes, Integer ano){
	
		LocalDate data = LocalDate.of(ano, mes, dia);
			DayOfWeek s = data.getDayOfWeek();
			return s.toString();
	}
	
	public static Integer diasParaFimAno(Integer dia, Integer mes, Integer ano){
		
		LocalDate data = LocalDate.of(ano, mes, dia);
		
		if(data.isLeapYear() == true){
			return 366 - data.getDayOfYear();
		}
		else
		return 365 - data.getDayOfYear();
	}
	
}