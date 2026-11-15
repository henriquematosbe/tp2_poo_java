package modelo;


public abstract class ProdutoFisico extends Produto{
  public double peso;
  public int estoque;
  public ProdutoFisico(String nome,long codigo, String descricao,String categoria,Double preco,Double peso,int estoque) {
    super(nome,codigo,descricao,categoria,preco,peso,estoque);
  }

  @Override
  public String getCategoria(){
    return "Produto Fisico";
  }
  @Override
  public  boolean temEstoque(int quantidade){
    if((estoque-quantidade)>=0)
    return true;
    else return false;
  }
  @Override
  public int getEstoqueDisponivel(int quantidade){
    return estoque;
  }
  @Override
  public double CalcularFrete(int quantidade){
   double frete;
   if(preco>= 300.0) return frete=0;
   else{
   frete=5.0+(2.0*peso);
   return frete*quantidade;
   }
  }
}

