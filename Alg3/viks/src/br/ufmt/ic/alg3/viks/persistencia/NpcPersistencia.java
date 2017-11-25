
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Npc;
import java.util.List;

public interface NpcPersistencia {
    
    public void inserir(Npc npc);
    
    public void alterar(Npc npc);
    
    public void remover(Npc npc);
    
    public List<Npc> getAll();
    
}
			
			