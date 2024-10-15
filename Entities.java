package Entities;

public class Entities {
    public int x1;
    public int y1;
    public int x2;
    public int y2;


    public Entities(){

    }
    

    public void DDA(int x1, int x2, int y1, int y2){
        int deltax = Math.abs(x2-x1);
        int deltay = Math.abs(y2-y1);

        float m = (float)deltay/(float)deltax;
        System.out.println(m);
        int n = deltax;

        if(deltay > deltax){
            n = deltay;

        }

        for(int i = 1; i<=n; i++){
            int x = x1+i;
            int y = Math.round(y1 + (i*m));
            System.out.printf("X%d = %d, y%d= %d\n", i, x, i, y);
        }


    }

    public void MidpointLine(int x1, int y1, int x2, int y2){
        int a = y2 - y1;
        int b = x1 - x2;
        int V = 2 * a+ b;
        int incrE = 2 * a;
        int incrNE = 2*(a+b);
        int x = x1;
        int y= y1;

        System.out.printf("Initial point: (X = %d, Y = %d)\n", x, y);

        while(x< x2){
            if(V<=0){
                V += incrE;

            }else{
                y++;
                V+= incrNE;
            }
          x++;
          System.out.printf("Current point: (X = %d, Y = %d)\n", x, y);
        }
        

    }


    
}
