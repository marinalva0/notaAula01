import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produtos p1 = new Produtos();
        Pagamento p2 = new Pagamento();
        CotroleEstoque c = new CotroleEstoque();

        System.out.println("informe o codigo!");
        p1.setCodigo(sc.nextInt());
        System.out.println("Quantos produtos tem no Estoque?");
        p1.setQuantidadeEstoque(sc.nextInt());
        System.out.println("Informe o nome do Produto");
        p1.setNome(sc.next());
        System.out.println("Informe a cor!");
        p1.setCor(sc.next());
        System.out.println("Qual o tamanho");
        p1.setTamanho(sc.nextDouble());
        System.out.println("informe o valor");
        p1.setValor(sc.nextDouble());
        System.out.println("Vai pagar no pix?");
        p2.setPix(sc.next());
        System.out.println("vai pagar com especie?");
        p2.setEspecie(sc.next());
        System.out.println("Ja esta  pagor?");
        p2.setTrasferencia(sc.next());
        System.out.println("vou pagar no Debito?");
        p2.setDebito(sc.next());
        System.out.println("Vamos fazer o Cadastro?");
        c.setCadastros(sc.next());


        System.out.println(p1.getCodigo());
        System.out.println(p1.getQuantidadeEstoque());
        System.out.println(p1.getNome());
        System.out.println(p1.getCor());
        System.out.println(p1.getTamanho());
        System.out.println(p1.getValor());
        System.out.println(p2.getPix());
        System.out.println(p2.getEspecie());
        System.out.println(p2.getTrasferencia());
        System.out.println(p2.getDebito());
        System.out.println(c.getCadastros());

    }
}