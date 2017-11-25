package br.ufmt.ic.alg3.funeraria.persistencia.lista;

import br.ufmt.ic.alg3.funeraria.model.entidades.Responsavel;
import br.ufmt.ic.alg3.funeraria.persistencia.ResponsavelPersistencia;
import java.util.ArrayList;
import java.util.List;

public class ResponsavelPersistenciaLista
        implements ResponsavelPersistencia {

    protected List lista = new ArrayList();

    public void inserir(Responsavel responsavel) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Responsavel ultimo = (Responsavel) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        responsavel.setId(ultimoId + 1);
        lista.add(responsavel);
        System.out.println(lista.size());
    }

    public void alterar(Responsavel responsavel) {
        for (int i = 0; i < lista.size(); i++) {
            Responsavel elem = (Responsavel) lista.get(i);
            if(responsavel.getId() == elem.getId()){
                lista.set(i, responsavel);
            }
        }
    }

    public void remover(Responsavel responsavel) {
        int posicao = 0;

        while (posicao < lista.size()) {
            Responsavel elemento = (Responsavel) lista.get(posicao);
            if (elemento.getId() == responsavel.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
    }


    public Responsavel buscar(int id, String cpf, String nome) {
        for (int i = 0; i < lista.size(); i++) {
            Responsavel elem = (Responsavel) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
            if(elem.getCpf().equals(cpf)){
                return elem;
            }
            if(elem.getNome().equals(nome)){
                return elem;
            }
        }
        return null;
    }

    public List<Responsavel> getAll(){
        return lista;
    }
    
}
