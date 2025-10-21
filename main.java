public class main {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(1, 0, 0);
        Tempo t2 = new Tempo(2, 30, 0);
        System.out.println("Tempo 1: " + t1);
        System.out.println("Tempo 2: " + t2);
        System.out.println("Diferenca em segundos: " + t1.diferencaSegundos(t2));

        int[][] matriz = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };
        boolean resultado = QuadradoMagico.ehQuadradoMagico(matriz);
        System.out.println("Eh quadrado magico? " + resultado);

        System.out.println("1 metro cubico em litros: " + ConversaoDeUnidadesDeVolume.metro3ParaLitros(1));
        System.out.println("2 galoes em litros: " + ConversaoDeUnidadesDeVolume.galaoParaLitros(2));
    }
}
