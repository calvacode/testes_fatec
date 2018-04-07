package br.emprestimo.testeUnitario.Modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import br.emprestimo.modelo.Usuario;

public class UsuarioTest {

	private static Usuario usuario;

	@Before
	public void setUpBefore() throws Exception {
		usuario = new Usuario();
	}
	
	@Test
	public void UC01CT01_testa_usuario_com_nome_valido() {
		usuario.setNome("nome");
	}
	
	@Test(expected = RuntimeException.class)
	public void UC01CT01_testa_usuario_com_nome_invalido_null() {
		usuario.setNome(null);
	}
	
	@Test(expected = RuntimeException.class)
	public void UC01CT01_testa_usuario_com_nome_invalido_vazio() {
		usuario.setNome("");
	}
	
	@Test
	public void UC01CT01_testa_usuario_com_ra_valido() {
		usuario.setRa("ra");
	}
	
	@Test(expected = RuntimeException.class)
	public void UC01CT01_testa_usuario_com_ra_invalido_null() {
		usuario.setRa(null);
	}
	
	@Test(expected = RuntimeException.class)
	public void UC01CT01_testa_usuario_com_ra_invalido_vazio() {
		usuario.setRa("");
	}
	
	@Test
	public void UC01CT01_testa_usuario_com_ra_get() {
		usuario.setRa("ra");
		assertEquals(usuario.getRa(), "ra");
	}
	
	@Test
	public void UC01CT01_testa_usuario_com_nome_get() {
		usuario.setNome("ra");
		assertEquals(usuario.getNome(), "nome");
	}
	
	


}
