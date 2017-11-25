
package br.ufmt.ic.alg3.funeraria.persistencia;

import br.ufmt.ic.alg3.funeraria.model.entidades.Responsavel;
import java.util.List;

public interface ResponsavelPersistencia {
    
    public void inserir(Responsavel responsavel);
    
    public void alterar(Responsavel responsavel);
    
    public void remover(Responsavel responsavel);
    
    public List<Responsavel> getAll();
    
}
			
			