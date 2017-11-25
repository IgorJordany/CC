
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Itens;
import br.ufmt.ic.alg3.viks.persistencia.ItensPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ItensPersistenciaArquivo
        implements ItensPersistencia {

    private String arq = "Itens.db";
    private List lista = new ArrayList();
    
    public ItensPersistenciaArquivo(){
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
    
    public void inserir(Itens itens) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Itens ultimo = (Itens) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        itens.setId(ultimoId + 1);
        lista.add(itens);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Itens itens) {
        for (int i = 0; i < lista.size(); i++) {
            Itens elem = (Itens) lista.get(i);
            if(itens.getId() == elem.getId()){
                lista.set(i, itens);
            }
        }
        gravar();
    }

    public void remover(Itens itens) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Itens elemento = (Itens) lista.get(posicao);
            if (elemento.getId() == itens.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Itens> getAll() {
        return lista;
    }

}

			
			