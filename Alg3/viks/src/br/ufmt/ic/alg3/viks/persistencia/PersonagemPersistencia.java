
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Personagem;
import java.util.List;

public interface PersonagemPersistencia {
    
    public void inserir(Personagem personagem);
    
    public void alterar(Personagem personagem);
    
    public void remover(Personagem personagem);
    
    public List<Personagem> getAll();
    
}
			
			