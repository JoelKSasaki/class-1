import java.util.Scanner;
public class combutivel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float horas;
        float velmed = 0;
        float litros;
        float dist;

        System.out.println("Digite o tempo em horas: ");
        horas = Float.parseFloat(scanner.nextLine());
        System.out.println("Digite a velocidade média do veículo: ");
        velmed = Float.parseFloat(scanner.nextLine());

        dist = velmed*horas;
        litros = dist/12;

        System.out.format("Quantia de combustível: %.3f ", litros);
    }
}
