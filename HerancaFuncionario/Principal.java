public class Principal {
    public static void main(String[] args) {
        Funcionario p1 = new Pessoa1("Maria", "Auxiliar administrativo", 1200, true);
        Funcionario p2 = new Pessoa2("João", "Vendedor", 1200, true);

        p1.auxilioFamilia();

        System.out.println(p1.getSalario());

        p2.comissao(200);
        p2.auxilioTransporte();

        System.out.println(p2.getSalario());
    }
}
