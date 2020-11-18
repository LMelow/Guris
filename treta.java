import java.util.Scanner;
class Num{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe a quantidade de inteiros: ");
        int t = teclado.nextInt();

        int valor[] = new int[t];

        //valor[i]=teclado.nextInt();

        int maior = 0;
        float menor = 999999999;
        double media = 0;
        double cont =0;
        double f1 = 0;
        
        for (int i= 0; i<valor.length; i++){
            System.out.println("Digite um valor inteiro");
            valor[i]=teclado.nextInt();
            media=media+valor[i];
            cont ++;
            if (valor[i]>=maior){
                maior=valor[i];
            }else if(valor[i]<menor){
                menor=valor[i];
            }
        f1= media/cont;
        }
        int primo = 0;

        for (int j=2; j<valor.length;j++){
            for (int i=0; i<valor.length;i++)
                if (valor[j] % valor[i] == 0){
                    primo +=1;   
            }
        }
        System.out.println("maior = "+maior+" menor = " +menor+ "  media = "+f1+" primos = "+primo);
    }
        
}

