//interface ou classe abstract , nesse caso vai ser abstract pq interface nao pode guardar algo em comum nas classes.

package modelo;


public abstract class PerfilUsuario{
  private final String login;
  private final String senha;
  private final String nome;
  public PerfilUsuario(String login,String senha, String nome) {
    this.login = login;
    this.senha = senha;
    this.nome = nome;
  }//construtor
  public boolean autenticar(String senhaDigitada) {
    return senha.equals(senhaDigitada);
    //confere senha


  }
  public abstract String getPerfil(); //obrigando as filhas a implementar , retorna se e administrador ou Cliente

  public String getLogin(){
    return login;
  }
  public String getNome(){
    return nome;
  }








}