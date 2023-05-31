import java.util.ArrayDeque;
import java.util.Deque;

public class PostoSaude {
  private Deque<Pessoa> filaAtendimento;
  private int pessoasAtendidas;

  public PostoSaude() {
    filaAtendimento = new ArrayDeque<>();
    pessoasAtendidas = 0;
  }

  public void adicionarPessoa(Pessoa pessoa) {
    filaAtendimento.add(pessoa);
  }

  public void atenderPessoas() {
    int grupo = 1;
    int contadorGrupo = 0;

    while (!filaAtendimento.isEmpty() && pessoasAtendidas < 100) {
      Pessoa pessoa = filaAtendimento.removeFirst();

      if (grupo <= contadorGrupo) {
        if (pessoa.ehNecessidadeEspesial() || pessoa.ehGestante() || pessoa.ehLactante() || pessoa.getIdade() >= 60) {
          System.out.println("Atendendo pessoa: ID=" + pessoa.getId() + ", Sexo=" + pessoa.getSexo() +
              ", Idade=" + pessoa.getIdade() + ", Gestante=" + pessoa.ehGestante() +
              ", Lactante=" + pessoa.ehLactante() + ", Necessidade Especial=" + pessoa.ehNecessidadeEspesial());
          pessoasAtendidas++;
        }
      }

      contadorGrupo++;
      if (contadorGrupo > grupo) {
        grupo++;
        contadorGrupo = 0;
      }
    }

    System.out.println("Total de pessoas atendidas: " + pessoasAtendidas);
    System.out.println("Pessoas que não foram atendidas: " + filaAtendimento.size());
  }
}