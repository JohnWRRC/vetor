public class Main {
    public static void main(String[] args) {
        Pessoa[ ] vetor_pessoas = new Pessoa[4];
        vetor_pessoas[0] = new Pessoa("João", 20);
        vetor_pessoas[1] = new Pessoa("Maria", 25);
        vetor_pessoas[2] = new Pessoa("Marco", 35);
        vetor_pessoas[3] = new Pessoa("Mariadolores", 15);

        for (int i = 0; i < vetor_pessoas.length; i++) {
            System.out.println(vetor_pessoas[i].nome + " tem " + vetor_pessoas[i].idade + " anos");
        }
    }
}