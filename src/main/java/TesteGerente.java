public class TesteGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Marcos");
        gerente.setCpf("1245677786");
        gerente.setSalario(5000);
        gerente.setSenha(12345);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        boolean autenticou = gerente.autentica(12345);
        System.out.println(autenticou);

        System.out.println(gerente.getBonificacao());
    }
}
