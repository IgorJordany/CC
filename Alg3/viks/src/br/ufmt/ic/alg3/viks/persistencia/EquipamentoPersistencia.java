
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades.Equipamento;
import java.util.List;

public interface EquipamentoPersistencia {
    
    public void inserir(Equipamento equipamento);
    
    public void alterar(Equipamento equipamento);
    
    public void remover(Equipamento equipamento);
    
    public List<Equipamento> getAll();
    
}
			
			