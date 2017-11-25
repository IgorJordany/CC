
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Historia;
import java.util.List;

public interface HistoriaPersistencia {
    
    public void inserir(Historia historia);
    
    public void alterar(Historia historia);
    
    public void remover(Historia historia);
    
    public List<Historia> getAll();
    
}
			
			