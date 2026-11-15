package modelo;



public class Cliente extends PerfilUsuario{
  public Cliente(String login ,String senha,String nome ){
    super(login,senha,nome); // quanto tem parametros , tem usar esse super , construtor sem parametros java chama o comando.
  }
  @Override
  public String getPerfil(){
    return "CLIENTE";
  }
  // terminar as permissoes , no tp









}