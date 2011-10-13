
public class ValorSalarioTotal {

	public static double calculo(double horasTrabalhadasMes,
			double salarioPorHora) {
		
		double totalHorasSemana;
		double totalSalarioExtra;
		double totalSalarioComum = (40 * salarioPorHora) * 4;
		double totalSalario;
		
		if(horasTrabalhadasMes > 160){
			
			totalHorasSemana = (horasTrabalhadasMes / 4);
			totalSalarioExtra = (totalHorasSemana - 40) * (salarioPorHora * 2)* 4;
			totalSalario = totalSalarioExtra + totalSalarioComum;
		
		}else{
			totalSalario = totalSalarioComum;
		}
		return totalSalario;
	}

}
