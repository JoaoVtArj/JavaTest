// Área do Círculo
public class AreaCirculo {

    public static void main(String[] args) {
        double raio = Double.parseDouble(System.console().readLine());
        double pi = 3.14159;
        double area = pi * raio * raio;

              System.out.println("A= " + String.format("%.4f", area));
    }

}
