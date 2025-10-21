public class QuadradoMagico {
    public static boolean ehQuadradoMagico(int[][] m) {
        int n = m.length;
        for (int[] linha : m) {
            if (linha.length != n) return false;
        }

        boolean[] usados = new boolean[n * n + 1];
        int somaRef = 0;

        for (int j = 0; j < n; j++) {
            int val = m[0][j];
            if (val < 1 || val > n * n || usados[val]) return false;
            usados[val] = true;
            somaRef += val;
        }

        for (int i = 1; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                int val = m[i][j];
                if (val < 1 || val > n * n || usados[val]) return false;
                usados[val] = true;
                somaLinha += val;
            }
            if (somaLinha != somaRef) return false;
        }

        for (int j = 0; j < n; j++) {
            int somaCol = 0;
            for (int i = 0; i < n; i++) {
                somaCol += m[i][j];
            }
            if (somaCol != somaRef) return false;
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += m[i][i];
            diag2 += m[i][n - 1 - i];
        }

        return diag1 == somaRef && diag2 == somaRef;
    }
}
