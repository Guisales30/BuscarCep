import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args)   {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o cep que deseja buscar");
        String cep = in.next();

        BuscadorDeCep buscadorDeCep = new BuscadorDeCep();

        try {
            Endereco novoEndereco = buscadorDeCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }


    }
}
