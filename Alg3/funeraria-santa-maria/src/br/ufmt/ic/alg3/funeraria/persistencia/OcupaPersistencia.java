
package br.ufmt.ic.alg3.funeraria.persistencia;

import br.ufmt.ic.alg3.funeraria.model.entidades.Ocupa;
import java.util.List;

public interface OcupaPersistencia {
    
    public void inserir(Ocupa ocupa);
    
    public void alterar(Ocupa ocupa);
    
    public void remover(Ocupa ocupa);
    
    public List<Ocupa> getAll();
    
}
			
			