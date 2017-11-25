
package br.ufmt.ic.alg3.funeraria.persistencia.arquivo;

import br.ufmt.ic.alg3.funeraria.model.entidades.Espaco;
import br.ufmt.ic.alg3.funeraria.persistencia.EspacoPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EspacoPersistenciaArquivo
        implements EspacoPersistencia {

    private String arq = "Espaco.db";
    private List lista = new ArrayList();
    
    public EspacoPersistenciaArquivo(){
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
    
    public void inserir(Espaco espaco) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Espaco ultimo = (Espaco) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        espaco.setId(ultimoId + 1);
        lista.add(espaco);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Espaco espaco) {
        for (int i = 0; i < lista.size(); i++) {
            Espaco elem = (Espaco) lista.get(i);
            if(espaco.getId() == elem.getId()){
                lista.set(i, espaco);
            }
        }
        gravar();
    }

    public void remover(Espaco espaco) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Espaco elemento = (Espaco) lista.get(posicao);
            if (elemento.getId() == espaco.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Espaco> getAll() {
        return lista;
    }

}

			
			