
package br.ufmt.ic.alg3.funeraria.persistencia.arquivo;

import br.ufmt.ic.alg3.funeraria.model.entidades.Caixao;
import br.ufmt.ic.alg3.funeraria.persistencia.CaixaoPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CaixaoPersistenciaArquivo
        implements CaixaoPersistencia {

    private String arq = "Caixao.db";
    private List lista = new ArrayList();
    
    public CaixaoPersistenciaArquivo(){
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
    
    public void inserir(Caixao caixao) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Caixao ultimo = (Caixao) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        caixao.setId(ultimoId + 1);
        lista.add(caixao);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Caixao caixao) {
        for (int i = 0; i < lista.size(); i++) {
            Caixao elem = (Caixao) lista.get(i);
            if(caixao.getId() == elem.getId()){
                lista.set(i, caixao);
            }
        }
        gravar();
    }

    public void remover(Caixao caixao) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Caixao elemento = (Caixao) lista.get(posicao);
            if (elemento.getId() == caixao.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Caixao> getAll() {
        return lista;
    }

}

			
			