
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Inventario;
import java.util.List;

public interface InventarioPersistencia {
    
    public void inserir(Inventario inventario);
    
    public void alterar(Inventario inventario);
    
    public void remover(Inventario inventario);
    
    public List<Inventario> getAll();
    
}
			
			