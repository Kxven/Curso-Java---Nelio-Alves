public class ExerciciosMatrizes{
    //criar uma matriz para calcular a rota de entrega em cidades
    public static void main( String[] args ){
        int[][] distancias = {
                {0,10,15,20},
                {10,0,35,25},
                {15,35,0,30},
                {20,25,30,0}
        };
        //rota C0 > C1 > C3 > C2 > C0

        int custo = 0;

        custo += distancias[0][1];
        custo += distancias[1][3];
        custo += distancias[3][2];
        custo += distancias[2][0];
        System.out.println("Custo total da rota = " + custo);

        int[][] mat = new int[3][3];

        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[0][2] = 3;

        mat[1][0] = 4;
        mat[1][1] = 5;
        mat[1][2] = 6;

        mat[2][0] = 7;
        mat[2][1] = 8;
        mat[2][2] = 9;

        System.out.println();
        for(int i = 0; i < mat.length; i++){
           for ( int j = 0 ; j < mat.length; j++ ){
               System.out.print(mat[i][j] + " ");
           }
            System.out.println();
        }for(int i = 0; i < mat.length; i++){
           for ( int j = 0 ; j < mat.length; j++ ){
               System.out.print(mat[i][j] + " ");
           }
            System.out.println();
            mat[1][2] = 99;
        }


    }
}
