package br.emprestimo.testeUnitario.Modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.emprestimo.modelo.Emprestimo;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

public class EmprestimoTest {
	
	private static Emprestimo emprestimo;
	
	@Before
	public void setUpBefore() throws Exception {
		emprestimo = new Emprestimo();
	}
	
	@Test
	public void UC01CT01_testa_emprestimo_com_usuario_valido() {
		emprestimo.setUsuario(new Usuario());
	}
	
	@Test(expected = RuntimeException.class)
	public void UC01CT01_testa_emprestimo_com_usuario_invalido() {
		emprestimo.setUsuario(null);
	}
	
	@Test
	public void UC01CT01_testa_emprestimo_com_livro_valido() {
		emprestimo.setLivro(new Livro());
	}
	
	@Test(expected = RuntimeException.class)
	public void UC01CT01_testa_emprestimo_com_livro_invalido() {
		emprestimo.setLivro(null);
	}
	
	@Test
	public void UC01CT01_testa_emprestimo_com_dataEmprestimo_valida() {
		emprestimo.setDataEmprestimo("10/02/2018");
	}
	
	@Test(expected = RuntimeException.class)
	public void UC01CT01_testa_emprestimo_com_dataEmprestimo_invalida() {
		emprestimo.setDataEmprestimo("10/02/");
	}
	
	@Test
	public void UC01CT01_testa_emprestimo_com_dataDevolucao_valida() {
		emprestimo.setDataDevolucao("10/02/2018");
	}
	
	@Test(expected = RuntimeException.class)
	public void UC01CT01_testa_emprestimo_com_dataDevolucao_invalida() {
		emprestimo.setDataDevolucao("10/02/");
	}
	
	@Test
	public void UC01CT01_testa_emprestimo_get_livro() {
		Livro livro = new Livro();
		emprestimo.setLivro(livro);
		assertEquals(emprestimo.getLivro(), livro);
	}
	
	@Test
	public void UC01CT01_testa_emprestimo_get_usuario() {
		Usuario usuario = new Usuario();
		emprestimo.setUsuario(usuario);
		assertEquals(emprestimo.getUsuario(), usuario);
	}
	
	
}
