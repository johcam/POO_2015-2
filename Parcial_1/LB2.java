import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int b=1; b<=n; b++)
        {

            int card, play;
            card=sc.nextInt();
            play=sc.nextInt();
           
            int[] p= new int[play];
            int[] baraja = new int[card];
  //***************************************************************        
            for(int i=0; i<card; i++)
            {
                baraja[i]=sc.nextInt();
            }
//**************************************************************/
            int cardt=0, cardplay=0;
            for(int i=0; i<card; i++)
            {
                int cardh=card-1;
                if(baraja[cardh]>=baraja[cardt])
                {
                    p[cardplay]=p[cardplay]+baraja[cardh];
                    cardh--;
                }
                else
                {
                    p[cardplay]=p[cardplay]+baraja[cardt];
                    cardt++;
                }
                cardplay++;
                if(cardplay>=play)
                {
                    cardplay=0;
                };
                if(cardh<cardt)
                {
                    break;
                }
            }
//*******************************************************************
            int max=0;
            for(int i=0; i<play; i++)
            {
                if(p[i]>max)
                {
                    max=p[i];
                }
            }

            System.out.println("Caso #"+b+":");
//*******************************************************************
            int pack=1;
            for(int k=0; k<play; k++)
            {
                if(p[k]==max)
                {
                    System.out.print(pack+" ");
                }
                pack++;
            }
            System.out.println();
            
        }
    }

}
