
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Usuario;
import java.util.List;

public interface UsuarioPersistencia {
    
    public void inserir(Usuario usuario);
    
    public void alterar(Usuario usuario);
    
    public void remover(Usuario usuario);
    
    public List<Usuario> getAll();
    
}
			
			