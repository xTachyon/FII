package Optional;

public class SecondClass {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        int[][] myMatrix = matriceAdiacentaGrafComplet(args);
        afisareMatrice(myMatrix);
        numarulMuchiilor(myMatrix);
        minimVertexDegree(myMatrix);
        maximVertexDegree(myMatrix);
        sumOfVertexDegrees(myMatrix);

        int[][] myMatrix2 = matriceAdiacentaGrafCiclic(args);
        afisareMatrice(myMatrix2);
        numarulMuchiilor(myMatrix2);
        minimVertexDegree(myMatrix2);
        maximVertexDegree(myMatrix2);
        sumOfVertexDegrees(myMatrix2);

        int[][] myMatrix3 = matriceGrafRandom(args);
        afisareMatrice(myMatrix3);
        numarulMuchiilor(myMatrix3);
        minimVertexDegree(myMatrix3);
        maximVertexDegree(myMatrix3);
        sumOfVertexDegrees(myMatrix3);

        final long duration = System.nanoTime() - startTime;
        System.out.println("Timpul de executie, in nanosecunde, este " + duration);
    }

    public static int readVertex (String[] args)
    {
        int n;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        return 0;
    }


    public static int[][] matriceAdiacentaGrafComplet(String[] args)
    {
        int n = readVertex(args);
        int[][] matrixCompleteGraph = new int[n][n];
        for(int i =0; i<n; i++)
            for(int j=0; j<n; j++)
                if(i==j)
                    matrixCompleteGraph[i][j]=0;
        else
                    matrixCompleteGraph[i][j]=1;
        return matrixCompleteGraph;
    }

    public static int[][] matriceAdiacentaGrafCiclic(String[] args)
    {
        int n = readVertex(args);
        int[][] matrixCycle = new int[n][n];

       for(int i=0;i<n;i++)
           for(int j=0;j<n;j++) {
               if ( j == i + 1) {
                   matrixCycle[i][j] = 1;
                   matrixCycle[j][i] =  matrixCycle[i][j];
               } else
                   matrixCycle[i][j] = 0;
               matrixCycle[0][n - 1] = 1;
               matrixCycle[n - 1][0] = 1;
           }
         return matrixCycle;
    }

    public static int[][] matriceGrafRandom(String[] args)
    {
        int n = readVertex(args);
        int[][] matrixGrafRandom = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            if (i < j)
            {
                matrixGrafRandom[i][j] = (int) (Math.random()*10 % 2);
                matrixGrafRandom[j][i] = matrixGrafRandom[i][j];
            }
        return matrixGrafRandom;
    }

    public static void afisareMatrice(int[][] myMatrix)
    {
        int n = myMatrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }

    public static int numarulMuchiilor(int[][] myMatrix )
    {
        int n = myMatrix[0].length;
        int edges = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i < j && myMatrix[i][j] == 1) {
                    edges++;
                }

        System.out.println("Graful are " + edges + " muchii.");
        return edges;
    }

    public static void minimVertexDegree(int[][] myMatrix )
    {
        int n = myMatrix[0].length;
        int min = n, nr_ap = 0;

        for (int i = 0; i < n; i++) {
            nr_ap = 0;
            for (int j = 0; j < n; j++)
                if (myMatrix[i][j] == 1)
                    nr_ap++;
            if (nr_ap < min)
                min = nr_ap;
        }

        System.out.println("Gradul minim al unui nod in matricea data este: "  + min);
    }

    public static void maximVertexDegree(int[][] myMatrix )
    {
        int n = myMatrix[0].length;
        int max = -1, nr_ap = 0;

        for (int i = 0; i < n; i++) {
            nr_ap = 0;
            for (int j = 0; j < n; j++)
                if (myMatrix[i][j] == 1)
                    nr_ap++;
            if (nr_ap > max)
                max = nr_ap;
        }

        System.out.println("Gradul maxim al unui nod in matricea data este: "  + max);
    }

    public static int sumOfVertexDegrees(int[][] myMatrix )
    {
        int n = myMatrix[0].length;
        int nr_ap = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (myMatrix[i][j] == 1)
                    nr_ap++;

        System.out.println("Suma gradelor nodurilor matricii este " + nr_ap + "\n");
        return nr_ap;
    }

}
