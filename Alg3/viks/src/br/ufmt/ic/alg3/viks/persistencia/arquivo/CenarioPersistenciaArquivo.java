
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Cenario;
import br.ufmt.ic.alg3.viks.persistencia.CenarioPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CenarioPersistenciaArquivo
        implements CenarioPersistencia {

    private String arq = "Cenario.db";
    private List lista = new ArrayList();
    
    public CenarioPersistenciaArquivo(){
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
    
    public void inserir(Cenario cenario) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Cenario ultimo = (Cenario) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        cenario.setId(ultimoId + 1);
        lista.add(cenario);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Cenario cenario) {
        for (int i = 0; i < lista.size(); i++) {
            Cenario elem = (Cenario) lista.get(i);
            if(cenario.getId() == elem.getId()){
                lista.set(i, cenario);
            }
        }
        gravar();
    }

    public void remover(Cenario cenario) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Cenario elemento = (Cenario) lista.get(posicao);
            if (elemento.getId() == cenario.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Cenario> getAll() {
        return lista;
    }

}

			
			