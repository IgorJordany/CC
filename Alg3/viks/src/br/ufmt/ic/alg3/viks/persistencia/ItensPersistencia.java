
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Itens;
import java.util.List;

public interface ItensPersistencia {
    
    public void inserir(Itens itens);
    
    public void alterar(Itens itens);
    
    public void remover(Itens itens);
    
    public List<Itens> getAll();
    
}
			
			