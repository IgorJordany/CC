
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Npc;
import br.ufmt.ic.alg3.viks.persistencia.NpcPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class NpcPersistenciaArquivo
        implements NpcPersistencia {

    private String arq = "Npc.db";
    private List lista = new ArrayList();
    
    public NpcPersistenciaArquivo(){
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
    
    public void inserir(Npc npc) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Npc ultimo = (Npc) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        npc.setId(ultimoId + 1);
        lista.add(npc);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Npc npc) {
        for (int i = 0; i < lista.size(); i++) {
            Npc elem = (Npc) lista.get(i);
            if(npc.getId() == elem.getId()){
                lista.set(i, npc);
            }
        }
        gravar();
    }

    public void remover(Npc npc) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Npc elemento = (Npc) lista.get(posicao);
            if (elemento.getId() == npc.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Npc> getAll() {
        return lista;
    }

}

			
			