public class SistemaAluguel {

    public void calcularAluguel(Veiculo veiculo){
        IO.println("Veiculo: "+ veiculo.getModelo());
        IO.println("Total do aluguel: R$:" + veiculo.alugar());
        // o " \n " serve para pular linha
        IO.println("[LOG] Aluguel do veiculo processado com sucesso.  \n");
    }

}
