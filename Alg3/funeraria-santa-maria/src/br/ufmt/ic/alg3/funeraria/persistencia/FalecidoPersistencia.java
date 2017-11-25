
package br.ufmt.ic.alg3.funeraria.persistencia;

import br.ufmt.ic.alg3.funeraria.model.entidades.Falecido;
import java.util.List;

public interface FalecidoPersistencia {
    
    public void inserir(Falecido falecido);
    
    public void alterar(Falecido falecido);
    
    public void remover(Falecido falecido);
    
    public List<Falecido> getAll();
    
}
			
			