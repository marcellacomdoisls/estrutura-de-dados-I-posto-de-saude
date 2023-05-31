public class Pessoa {
  private int id;
  private String sexo;
  private int idade;
  private boolean gestante;
  private boolean lactante;
  private boolean necessidadeEspecial;

  public Pessoa(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial) {
    this.id = id;
    this.sexo = sexo;
    this.idade = idade;
    this.gestante = gestante;
    this.lactante = lactante;
    this.necessidadeEspecial = necessidadeEspecial;
  }

  public int getId() {
    return id;
  }

  public String getSexo() {
    return sexo;
  }

  public int getIdade() {
    return idade;
  }

  public boolean ehGestante() {
    return gestante;
  }

  public boolean ehLactante() {
    return lactante;
  }

  public boolean ehNecessidadeEspesial() {
    return necessidadeEspecial;
  }
}