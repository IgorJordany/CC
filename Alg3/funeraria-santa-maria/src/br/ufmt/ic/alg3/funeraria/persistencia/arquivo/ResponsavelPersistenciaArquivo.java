
package br.ufmt.ic.alg3.funeraria.persistencia.arquivo;

import br.ufmt.ic.alg3.funeraria.model.entidades.Responsavel;
import br.ufmt.ic.alg3.funeraria.persistencia.ResponsavelPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ResponsavelPersistenciaArquivo
        implements ResponsavelPersistencia {

    private String arq = "Responsavel.db";
    private List lista = new ArrayList();
    
    public ResponsavelPersistenciaArquivo(){
        ler();
    }
    
    private void ler() {
        try {
            ObjectInputStream ois;
            FileInputStream fis;
            fis = new FileInputStream(arq);
            ois = new ObjectInputStream(fis);
            lista = (List) ois.readObject();
            ois.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
    
    private void gravar(){
        try{
            ObjectOutputStream oos;
            FileOutputStream fos;
            fos = new FileOutputStream(arq);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
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
        gravar();
    }

    public void alterar(Responsavel responsavel) {
        for (int i = 0; i < lista.size(); i++) {
            Responsavel elem = (Responsavel) lista.get(i);
            if(responsavel.getId() == elem.getId()){
                lista.set(i, responsavel);
            }
        }
        gravar();
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
        gravar();
    }

    public List<Responsavel> getAll() {
        return lista;
    }

}

			
			