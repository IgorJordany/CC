
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Historia;
import br.ufmt.ic.alg3.viks.persistencia.HistoriaPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class HistoriaPersistenciaArquivo
        implements HistoriaPersistencia {

    private String arq = "Historia.db";
    private List lista = new ArrayList();
    
    public HistoriaPersistenciaArquivo(){
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
    
    public void inserir(Historia historia) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Historia ultimo = (Historia) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        historia.setId(ultimoId + 1);
        lista.add(historia);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Historia historia) {
        for (int i = 0; i < lista.size(); i++) {
            Historia elem = (Historia) lista.get(i);
            if(historia.getId() == elem.getId()){
                lista.set(i, historia);
            }
        }
        gravar();
    }

    public void remover(Historia historia) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Historia elemento = (Historia) lista.get(posicao);
            if (elemento.getId() == historia.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Historia> getAll() {
        return lista;
    }

}

			
			