package Optional;


public class SecondClass {

    public static void main(String[] args) {

        int[][] myMatrix = matriceAdiacentaGrafComplet(args);
        afisareMatrice(myMatrix);
        numarulMuchiilor(myMatrix);

        int[][] myMatrix2 = matriceAdiacentaGrafCiclic(args);
        afisareMatrice(myMatrix2);
        numarulMuchiilor(myMatrix2);

        int[][] myMatrix3 = matriceGrafRandom(args);
        afisareMatrice(myMatrix3);
        numarulMuchiilor(myMatrix3);

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
               if (j == i + 1) {
                   matrixCycle[i][j] = 1;
                   matrixCycle[j][i] = 1;
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

        for (int i = 1; i < n; i++)
            for (int j = 1; j < n; j++)
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

    public static void numarulMuchiilor(int[][] myMatrix )
    {
        int n = myMatrix[0].length;
        int edges = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i < j && myMatrix[i][j] == 1) {
                    edges++;
                }

        System.out.println("Graful are " + edges + " muchii. \n");
    }

}





