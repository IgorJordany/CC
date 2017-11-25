
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Personagem;
import br.ufmt.ic.alg3.viks.persistencia.PersonagemPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PersonagemPersistenciaArquivo
        implements PersonagemPersistencia {

    private String arq = "Personagem.db";
    private List lista = new ArrayList();
    
    public PersonagemPersistenciaArquivo(){
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
    
    public void inserir(Personagem personagem) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Personagem ultimo = (Personagem) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        personagem.setId(ultimoId + 1);
        lista.add(personagem);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Personagem personagem) {
        for (int i = 0; i < lista.size(); i++) {
            Personagem elem = (Personagem) lista.get(i);
            if(personagem.getId() == elem.getId()){
                lista.set(i, personagem);
            }
        }
        gravar();
    }

    public void remover(Personagem personagem) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Personagem elemento = (Personagem) lista.get(posicao);
            if (elemento.getId() == personagem.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Personagem> getAll() {
        return lista;
    }

}

			
			