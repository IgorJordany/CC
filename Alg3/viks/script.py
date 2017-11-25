#encoding: utf-8
import os

raiz = '/home/kiev/Dropbox/UFMT/7º Semestre UFMT/Alg3/viks/src/br/ufmt/ic/alg3/viks/'

folder = raiz + 'model/entidades'
interface = raiz + 'persistencia'
arquivo = raiz + 'persistencia/arquivo'
for dirname, dirnames, filenames in os.walk(folder):
	for filename in filenames:
		if(filename.endswith('.java')):
			nome = filename[:-5]
			print(nome)
			
			nomeArq = interface+'/'+nome+'Persistencia.java'
			inter = open(nomeArq,'w')
			inter.write("""
package br.ufmt.ic.alg3.viks.persistencia;

import br.ufmt.ic.alg3.viks.model.entidades."""+nome+""";
import java.util.List;

public interface """+nome+"""Persistencia {
    
    public void inserir("""+nome+""" """+nome.lower()+""");
    
    public void alterar("""+nome+""" """+nome.lower()+""");
    
    public void remover("""+nome+""" """+nome.lower()+""");
    
    public List<"""+nome+"""> getAll();
    
}
			
			""")
			inter.close()
			
			nomeArq = arquivo+'/'+nome+'PersistenciaArquivo.java'
			inter = open(nomeArq,'w')
			inter.write("""
package br.ufmt.ic.alg3.viks.persistencia.arquivo;

import br.ufmt.ic.alg3.viks.model.entidades."""+nome+""";
import br.ufmt.ic.alg3.viks.persistencia."""+nome+"""Persistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class """+nome+"""PersistenciaArquivo
        implements """+nome+"""Persistencia {

    private String arq = \""""+nome+""".db";
    private List lista;
    
    public """+nome+"""PersistenciaArquivo(){
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
    
    public void inserir("""+nome+""" """+nome.lower()+""") {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            """+nome+""" ultimo = ("""+nome+""") lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        """+nome.lower()+""".setId(ultimoId + 1);
        lista.add("""+nome.lower()+""");
        System.out.println(lista.size());
        gravar();
    }

    public void alterar("""+nome+""" """+nome.lower()+""") {
        for (int i = 0; i < lista.size(); i++) {
            """+nome+""" elem = ("""+nome+""") lista.get(i);
            if("""+nome.lower()+""".getId() == elem.getId()){
                lista.set(i, """+nome.lower()+""");
            }
        }
        gravar();
    }

    public void remover("""+nome+""" """+nome.lower()+""") {
        int posicao = 0;
        while (posicao < lista.size()) {
            """+nome+""" elemento = ("""+nome+""") lista.get(posicao);
            if (elemento.getId() == """+nome.lower()+""".getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
        gravar();
    }

    public List<"""+nome+"""> getAll() {
        return lista;
    }

}

			
			""")
			inter.close()