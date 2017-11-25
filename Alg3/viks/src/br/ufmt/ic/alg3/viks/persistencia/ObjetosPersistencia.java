
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Objetos;
import java.util.List;

public interface ObjetosPersistencia {
    
    public void inserir(Objetos objetos);
    
    public void alterar(Objetos objetos);
    
    public void remover(Objetos objetos);
    
    public List<Objetos> getAll();
    
}
			
			