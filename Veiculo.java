package veiculo.java;

public class Veiculo main(String args[]) {
    String marca;
    String modelo;
    String placa;
    String chassi;
    int ano;
    int ano_fabricacao;
    int qtd_passageiros;

    void acelerar() {
        System.out.println("Acelerar o veículo...");
    }

     void frear() {
        System.out.println("Frear o veículo...");
    }
    
}

public class Carro main(String args[]) extends Veiculo {
    int nro_portas;

    void abri_porta() {
        System.out.println("Abrir a Porta...");
    }
}

public class Moto main(String args[]) extends Veiculo {
    int cilindradas;

    void empinar() {
        System.out.println("Empinar a Moto...");
    }
}

