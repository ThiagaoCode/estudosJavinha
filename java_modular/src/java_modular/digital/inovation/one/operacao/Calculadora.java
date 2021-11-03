package java_modular.digital.inovation.one.operacao;

import java_modular.digital.inovation.one.operacao.interno.DivHelp;
import java_modular.digital.inovation.one.operacao.interno.Multihelp;
import java_modular.digital.inovation.one.operacao.interno.Subhelp;
import java_modular.digital.inovation.one.operacao.interno.Sunhelp;

public class Calculadora {

	private Sunhelp sunhelp;
	private Subhelp subhelp;
	private Multihelp multihelp;
	private DivHelp divhelp;

	public Calculadora() {
		sunhelp = new Sunhelp();
		subhelp = new Subhelp();
		multihelp = new Multihelp();
		divhelp = new DivHelp();

	}

	public int soma(int a, int b) {

		return sunhelp.execute(a, b);

	}

	public int sub(int a, int b) {

		return subhelp.execute(a, b);

	}

	public int multi(int a, int b) {

		return multihelp.execute(a, b);

	}

	public int div(int a, int b) {

		return divhelp.execute(a, b);

	}

}
