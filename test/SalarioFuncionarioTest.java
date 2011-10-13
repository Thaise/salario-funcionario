import static org.junit.Assert.*;

import org.junit.Test;


public class SalarioFuncionarioTest {

	@Test
	public void test() {
		double horasTrabalhadasMes = 180;
		double salarioPorHora = 3.75;
		double resultado = ValorSalarioTotal.calculo(horasTrabalhadasMes, salarioPorHora);
		assertEquals(750, resultado, 0);
		
	}

}
