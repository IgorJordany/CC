
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Habilidades;
import br.ufmt.ic.alg3.viks.persistencia.HabilidadesPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class HabilidadesPersistenciaArquivo
        implements HabilidadesPersistencia {

    private String arq = "Habilidades.db";
    private List lista = new ArrayList();
    
    public HabilidadesPersistenciaArquivo(){
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
    
    public void inserir(Habilidades habilidades) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Habilidades ultimo = (Habilidades) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        habilidades.setId(ultimoId + 1);
        lista.add(habilidades);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Habilidades habilidades) {
        for (int i = 0; i < lista.size(); i++) {
            Habilidades elem = (Habilidades) lista.get(i);
            if(habilidades.getId() == elem.getId()){
                lista.set(i, habilidades);
            }
        }
        gravar();
    }

    public void remover(Habilidades habilidades) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Habilidades elemento = (Habilidades) lista.get(posicao);
            if (elemento.getId() == habilidades.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Habilidades> getAll() {
        return lista;
    }

}

			
			