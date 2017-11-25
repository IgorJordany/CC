
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Inventario;
import br.ufmt.ic.alg3.viks.persistencia.InventarioPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class InventarioPersistenciaArquivo
        implements InventarioPersistencia {

    private String arq = "Inventario.db";
    private List lista = new ArrayList();
    
    public InventarioPersistenciaArquivo(){
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
    
    public void inserir(Inventario inventario) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Inventario ultimo = (Inventario) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        inventario.setId(ultimoId + 1);
        lista.add(inventario);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Inventario inventario) {
        for (int i = 0; i < lista.size(); i++) {
            Inventario elem = (Inventario) lista.get(i);
            if(inventario.getId() == elem.getId()){
                lista.set(i, inventario);
            }
        }
        gravar();
    }

    public void remover(Inventario inventario) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Inventario elemento = (Inventario) lista.get(posicao);
            if (elemento.getId() == inventario.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Inventario> getAll() {
        return lista;
    }

}

			
			