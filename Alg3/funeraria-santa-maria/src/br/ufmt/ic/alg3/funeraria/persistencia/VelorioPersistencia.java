
package br.ufmt.ic.alg3.funeraria.persistencia;

import br.ufmt.ic.alg3.funeraria.model.entidades.Velorio;
import java.util.List;

public interface VelorioPersistencia {
    
    public void inserir(Velorio velorio);
    
    public void alterar(Velorio velorio);
    
    public void remover(Velorio velorio);
    
    public List<Velorio> getAll();
    
}
			
			