
package br.ufmt.ic.alg3.funeraria.persistencia;

import br.ufmt.ic.alg3.funeraria.model.entidades.Caixao;
import java.util.List;

public interface CaixaoPersistencia {
    
    public void inserir(Caixao caixao);
    
    public void alterar(Caixao caixao);
    
    public void remover(Caixao caixao);
    
    public List<Caixao> getAll();
    
}
			
			