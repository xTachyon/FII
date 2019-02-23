package Optional;


public class SecondClass {

    public static void main(String[] args) {
        matriceAdiacentaGrafComplet(args);
        matriceAdiacentaGrafCiclic(args);
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


    public static void matriceAdiacentaGrafComplet(String[] args)
    {
        int n = readVertex(args);
        int[][] matrixCompleteGraph = new int[n][n];
        for(int i =0; i<n; i++)
            for(int j=0; j<n; j++)
                if(i==j)
                    matrixCompleteGraph[i][j]=0;
        else
                    matrixCompleteGraph[i][j]=1;

        for(int i =0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixCompleteGraph[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("\n");
    }

    public static void matriceAdiacentaGrafCiclic(String[] args)
    {
        int n = readVertex(args);
        int[][] matrixCycle = new int[n][n];

       for(int i=1;i<n;i++)
           for(int j=1;j<n;j++) {
               if (j == i + 1) {
                   matrixCycle[i][j] = 1;
                   matrixCycle[j][i] = 1;
               } else
                   matrixCycle[i][j] = 0;
               matrixCycle[0][n - 1] = 1;
               matrixCycle[n - 1][0] = 1;
           }

           for(int i =0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixCycle[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

}





