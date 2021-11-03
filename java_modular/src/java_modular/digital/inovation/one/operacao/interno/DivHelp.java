package java_modular.digital.inovation.one.operacao.interno;

import java_modular.digital.inovation.one.operacao.Operacao;

public class DivHelp implements Operacao{
	
	@Override
	public int execute(int a, int b) {
		return a / b;
	}
	
}