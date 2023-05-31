import java.util.Random;

public class Main {
  public static void main(String[] args) {
    PostoSaude postoSaude = new PostoSaude();
    Random random = new Random();

    for (int i = 1; i <= 10; i++) {
      postoSaude.adicionarPessoa(new Pessoa(i, "M", random.nextInt(60), false, false, false)); // Prioridade Normal
    }

    for (int i = 11; i <= 20; i++) {
      postoSaude.adicionarPessoa(new Pessoa(i, "F", random.nextInt(60), false, false, false)); // Prioridade Normal
    }

    for (int i = 21; i <= 30; i++) {
      postoSaude.adicionarPessoa(new Pessoa(i, "M", random.nextInt(60), false, false, true)); // Necessidade Especial
    }

    for (int i = 31; i <= 33; i++) {
      postoSaude.adicionarPessoa(new Pessoa(i, "F", random.nextInt(60), true, false, false)); // Gestante
    }

    for (int i = 34; i <= 36; i++) {
      postoSaude.adicionarPessoa(new Pessoa(i, "F", random.nextInt(60), false, true, false)); // Lactante
    }

    for (int i = 37; i <= 39; i++) {
      postoSaude.adicionarPessoa(new Pessoa(i, "M", random.nextInt(60) + 60, false, false, false)); // Acima de 60 anos
    }

    postoSaude.atenderPessoas();
  }
}
