
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Cenario;
import java.util.List;

public interface CenarioPersistencia {
    
    public void inserir(Cenario cenario);
    
    public void alterar(Cenario cenario);
    
    public void remover(Cenario cenario);
    
    public List<Cenario> getAll();
    
}
			
			