public class App {
    public static void main(String[] args) throws Exception {
        Membro membro1 = new Membro("Luiz Gustavo", "BP", 125659);
        Membro membro2 = new Membro("Rosalvo", "BP", 126666);
        Membro membro3 = new Membro("Talita", "BP", 3009756);
        Membro membro4 = new Membro("Josias", "BP", 8776553);
        

        Comissao comissaoCEIC = new Comissao( "Portaria n° 5560 de 24 de Maio de 2022");

        comissaoCEIC.adicionaMembro(membro1);
        comissaoCEIC.adicionaMembro(membro2);
        comissaoCEIC.adicionaMembro(membro3);
        comissaoCEIC.adicionaMembro(membro4);

    Membro resultadoBusca = comissaoCEIC.pesquisarMembroPorNome("Ro");
    if(resultadoBusca != null){

    System.out.println(resultadoBusca);
} else {
    System.out.println( "Não foi encontrado nenhum resultado!");
    
}
    }
}
