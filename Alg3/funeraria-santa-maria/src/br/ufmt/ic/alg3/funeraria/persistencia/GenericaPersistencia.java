
package br.ufmt.ic.alg3.funeraria.persistencia;

import br.ufmt.ic.alg3.funeraria.model.entidades.Generica;
import java.util.List;

public interface GenericaPersistencia {
    
    public void inserir(Generica generica);
    
    public void alterar(Generica generica);
    
    public void remover(Generica generica);
    
    public List<Generica> getAll();
    
}
			
			