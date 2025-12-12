public class pattern2 {
    public static void halfpyramid(int n ){
        //outer
        for(int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                // atards
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void halfpyramidno(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }



    public static void floydtri(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        } 
    }


    public static void trianglezero(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i + j)% 2 == 0 ){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){
        //1st half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("$");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("$");
            }
            System.out.println();
        }


        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("$");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfpyramid(5);
        halfpyramidno(9);
        floydtri(19);
        trianglezero(6);
        butterfly(6);
    }
}
