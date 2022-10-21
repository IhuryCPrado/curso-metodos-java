public class MainSobrecarga {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilatero.area(17);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(17,6);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(4,8,12);
        System.out.println("Área do Trapézio: " + areaTrapezio);

        double areaLosango = Quadrilatero.area(17f,3f);
        System.out.println("Área do Losango: " + areaLosango);
    }
}