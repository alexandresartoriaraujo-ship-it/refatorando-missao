void main() {


    Veiculo moto = new Moto("F800",3);
    Carro carro = new Carro("Fusca",4);

    SistemaAluguel aluguel = new SistemaAluguel();
    aluguel.calcularAluguel(moto);
    aluguel.calcularAluguel(carro);
}
