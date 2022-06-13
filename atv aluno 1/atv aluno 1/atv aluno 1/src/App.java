
public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1; 
        livro1 = new Livro(1952, "Cristianismo Puro e Simples", "C.S. Lewis");
        System.out.println("Ano de lançamento: " +livro1.getAno());
        System.out.println("Autor: " +livro1.getAutor());
        System.out.println("Titulo: " +livro1.getTitulo());

        Livro livro2;
        livro2 = new Livro(2012, "A Seleção", "Kierra Cass");
        System.out.println("Ano de lançamento: " +livro2.getAno());
        System.out.println("Autor: " +livro2.getAutor());
        System.out.println("Titulo: " +livro2.getTitulo());
    }
}
