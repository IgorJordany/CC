
package br.ufmt.ic.alg3.funeraria.persistencia.arquivo;

import br.ufmt.ic.alg3.funeraria.model.entidades.Generica;
import br.ufmt.ic.alg3.funeraria.persistencia.GenericaPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GenericaPersistenciaArquivo
        implements GenericaPersistencia {

    private String arq = "Generica.db";
    private List lista = new ArrayList();
    
    public GenericaPersistenciaArquivo(){
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
    
    public void inserir(Generica generica) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Generica ultimo = (Generica) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        generica.setId(ultimoId + 1);
        lista.add(generica);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Generica generica) {
        for (int i = 0; i < lista.size(); i++) {
            Generica elem = (Generica) lista.get(i);
            if(generica.getId() == elem.getId()){
                lista.set(i, generica);
            }
        }
        gravar();
    }

    public void remover(Generica generica) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Generica elemento = (Generica) lista.get(posicao);
            if (elemento.getId() == generica.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Generica> getAll() {
        return lista;
    }

}

			
			