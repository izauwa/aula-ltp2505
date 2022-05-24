import java.util.ArrayList;
import java.util.Iterator;
public class Comissao {
    private ArrayList<Membro> membros;
    private String portaria;

    /** Construtor */
    public Comissao(String portaria) {
        this.membros = new ArrayList<>();
        this.portaria = portaria;
    }

    // pesquisar se uma pessoa faz parte dela pelo seu nome;
    public Membro pesquisarMembroPorNome(String nomeBusca){
        Iterator<Membro> it = this.membros.iterator();
        Membro membro = it.next();
        if(membro.getNome().contains(nomeBusca)){
            return membro;

        }
        
        return null;

    }
    // imprimir a lista de todos os membros da comissão; 
    public void listaTodosOsMembros(){
        Iterator<Membro> it = this.membros.iterator();
        while(it.hasNext()){
            Membro membro = it.next();
            System.out.println(membro);
        }
    }
    // adicionar novas pessoas na comissão;
    public void adicionaMembro(Membro novoMembro){
        this.membros.add(novoMembro);
    }

    /** Getters e Setters */
    public String getPortaria() {
        return portaria;
    }    
}
