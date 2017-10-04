package pdf3ejer2;

/**
 *
 * @author Gonzalo
 */
public class PDF3Ejer2 {

    public static void main(String[] args) {
        int numeros[] = new int [10]; // arreglo
        numeros[0] = 5;
        numeros[1] = -9;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = -1;
        numeros[5] = 10;
        numeros[6] = -6;
        numeros[7] = 2;
        numeros[8] = 8;
        numeros[9] = 20;
        
        int pos = 0; //varible
        int SumP = 0;
        int ProP = 0;
        int neg = 0;
        int SumN = 0;
        int ProN = 0;
        
        for(int i =0;i< numeros.length; i++){
        
        if(numeros[i]>0){
            pos++;
            SumP += numeros[i];
        }
        else
        {
            neg++;
            SumN += numeros[i];
        }
        }
        ProP = SumP / pos;
        ProN = SumN / neg;
        System.out.println("Los numeros positivos son : "+pos );
        System.out.println("El Promedio de los positivos es : "+ProP);
        System.out.println("Los numeros negativos son : "+neg);
        System.out.println("El Promedio de los negativos es : "+ProN);
    }
    
}
