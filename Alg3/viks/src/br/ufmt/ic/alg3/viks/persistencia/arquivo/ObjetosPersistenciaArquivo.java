
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Objetos;
import br.ufmt.ic.alg3.viks.persistencia.ObjetosPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjetosPersistenciaArquivo
        implements ObjetosPersistencia {

    private String arq = "Objetos.db";
    private List lista = new ArrayList();
    
    public ObjetosPersistenciaArquivo(){
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
    
    public void inserir(Objetos objetos) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Objetos ultimo = (Objetos) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        objetos.setId(ultimoId + 1);
        lista.add(objetos);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Objetos objetos) {
        for (int i = 0; i < lista.size(); i++) {
            Objetos elem = (Objetos) lista.get(i);
            if(objetos.getId() == elem.getId()){
                lista.set(i, objetos);
            }
        }
        gravar();
    }

    public void remover(Objetos objetos) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Objetos elemento = (Objetos) lista.get(posicao);
            if (elemento.getId() == objetos.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Objetos> getAll() {
        return lista;
    }

}

			
			