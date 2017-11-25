
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Equipamento;
import br.ufmt.ic.alg3.viks.persistencia.EquipamentoPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EquipamentoPersistenciaArquivo
        implements EquipamentoPersistencia {

    private String arq = "Equipamento.db";
    private List lista = new ArrayList();
    
    public EquipamentoPersistenciaArquivo(){
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
    
    public void inserir(Equipamento equipamento) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Equipamento ultimo = (Equipamento) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        equipamento.setId(ultimoId + 1);
        lista.add(equipamento);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Equipamento equipamento) {
        for (int i = 0; i < lista.size(); i++) {
            Equipamento elem = (Equipamento) lista.get(i);
            if(equipamento.getId() == elem.getId()){
                lista.set(i, equipamento);
            }
        }
        gravar();
    }

    public void remover(Equipamento equipamento) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Equipamento elemento = (Equipamento) lista.get(posicao);
            if (elemento.getId() == equipamento.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Equipamento> getAll() {
        return lista;
    }

}

			
			