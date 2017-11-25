
package br.ufmt.ic.alg3.funeraria.persistencia.arquivo;

import br.ufmt.ic.alg3.funeraria.model.entidades.Ocupa;
import br.ufmt.ic.alg3.funeraria.persistencia.OcupaPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class OcupaPersistenciaArquivo
        implements OcupaPersistencia {

    private String arq = "Ocupa.db";
    private List lista = new ArrayList();
    
    public OcupaPersistenciaArquivo(){
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
    
    public void inserir(Ocupa ocupa) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Ocupa ultimo = (Ocupa) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        ocupa.setId(ultimoId + 1);
        lista.add(ocupa);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Ocupa ocupa) {
        for (int i = 0; i < lista.size(); i++) {
            Ocupa elem = (Ocupa) lista.get(i);
            if(ocupa.getId() == elem.getId()){
                lista.set(i, ocupa);
            }
        }
        gravar();
    }

    public void remover(Ocupa ocupa) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Ocupa elemento = (Ocupa) lista.get(posicao);
            if (elemento.getId() == ocupa.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Ocupa> getAll() {
        return lista;
    }

}

			
			