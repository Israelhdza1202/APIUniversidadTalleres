package com.ibm.academia.restapi.universidad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApiUniversidadMApplicationTests {

	Calcular calculadora = new Calcular();

	@Test
	@DisplayName("Test: Suma de valores a y b")
	void sumarValores()
	{
		//GWT

		//GIVEN
		Integer valorA=7;
		Integer valorB=15;
		//WHEN
		Integer expected = calculadora.sumar(valorA, valorB);
		//THEN
		Integer resultadoEsperado= 22;
		assertThat(expected).isEqualTo(resultadoEsperado);
	}

	class Calcular{
		Integer sumar(Integer valorA, Integer valorB){
			return valorA+valorB;
		}
	}

}
