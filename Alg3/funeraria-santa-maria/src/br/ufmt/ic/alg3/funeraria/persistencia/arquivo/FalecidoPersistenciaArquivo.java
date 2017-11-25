
package br.ufmt.ic.alg3.funeraria.persistencia.arquivo;

import br.ufmt.ic.alg3.funeraria.model.entidades.Falecido;
import br.ufmt.ic.alg3.funeraria.persistencia.FalecidoPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FalecidoPersistenciaArquivo
        implements FalecidoPersistencia {

    private String arq = "Falecido.db";
    private List lista = new ArrayList();
    
    public FalecidoPersistenciaArquivo(){
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
    
    public void inserir(Falecido falecido) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Falecido ultimo = (Falecido) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        falecido.setId(ultimoId + 1);
        lista.add(falecido);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Falecido falecido) {
        for (int i = 0; i < lista.size(); i++) {
            Falecido elem = (Falecido) lista.get(i);
            if(falecido.getId() == elem.getId()){
                lista.set(i, falecido);
            }
        }
        gravar();
    }

    public void remover(Falecido falecido) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Falecido elemento = (Falecido) lista.get(posicao);
            if (elemento.getId() == falecido.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Falecido> getAll() {
        return lista;
    }

}

			
			