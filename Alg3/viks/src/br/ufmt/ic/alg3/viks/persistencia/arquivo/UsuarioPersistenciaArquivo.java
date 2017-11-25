package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades.Usuario;
import br.ufmt.ic.alg3.viks.persistencia.UsuarioPersistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UsuarioPersistenciaArquivo
        implements UsuarioPersistencia {

    private final String arq = "Usuario.db";
    private List lista = new ArrayList();
    
    public UsuarioPersistenciaArquivo(){
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
    
    public void inserir(Usuario usuario) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Usuario ultimo = (Usuario) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        usuario.setId(ultimoId + 1);
        lista.add(usuario);
        System.out.println(lista.size());
        gravar();
    }

    public void alterar(Usuario usuario) {
        for (int i = 0; i < lista.size(); i++) {
            Usuario elem = (Usuario) lista.get(i);
            if(usuario.getId() == elem.getId()){
                lista.set(i, usuario);
            }
        }
        gravar();
    }

    public void remover(Usuario usuario) {
        int posicao = 0;
        while (posicao < lista.size()) {
            Usuario elemento = (Usuario) lista.get(posicao);
            if (elemento.getId() == usuario.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<Usuario> getAll() {
        return lista;
    }

}		