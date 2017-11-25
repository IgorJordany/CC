
package br.ufmt.ic.alg3.funeraria.persistencia;

import br.ufmt.ic.alg3.funeraria.model.entidades.Espaco;
import java.util.List;

public interface EspacoPersistencia {
    
    public void inserir(Espaco espaco);
    
    public void alterar(Espaco espaco);
    
    public void remover(Espaco espaco);
    
    public List<Espaco> getAll();
    
}
			
			