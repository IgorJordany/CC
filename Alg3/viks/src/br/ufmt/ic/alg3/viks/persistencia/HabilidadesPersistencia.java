
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Habilidades;
import java.util.List;

public interface HabilidadesPersistencia {
    
    public void inserir(Habilidades habilidades);
    
    public void alterar(Habilidades habilidades);
    
    public void remover(Habilidades habilidades);
    
    public List<Habilidades> getAll();
    
}
			
			