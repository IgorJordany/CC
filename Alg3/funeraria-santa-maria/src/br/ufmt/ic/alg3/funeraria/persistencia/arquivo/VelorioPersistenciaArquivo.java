
package br.ufmt.ic.alg3.funeraria.persistencia.arquivo;

import br.ufmt.ic.alg3.funeraria.model.entidades.Velorio;
import br.ufmt.ic.alg3.funeraria.persistencia.VelorioPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class VelorioPersistenciaArquivo
        implements VelorioPersistencia {

    private String arq = "Velorio.db";
    private List lista = new ArrayList();
    
    public VelorioPersistenciaArquivo(){
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
    
    public void inserir(Velorio velorio) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Velorio ultimo = (Velorio) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        velorio.setId(ultimoId + 1);
        lista.add(velorio);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Velorio velorio) {
        for (int i = 0; i < lista.size(); i++) {
            Velorio elem = (Velorio) lista.get(i);
            if(velorio.getId() == elem.getId()){
                lista.set(i, velorio);
            }
        }
        gravar();
    }

    public void remover(Velorio velorio) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Velorio elemento = (Velorio) lista.get(posicao);
            if (elemento.getId() == velorio.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Velorio> getAll() {
        return lista;
    }

}

			
			