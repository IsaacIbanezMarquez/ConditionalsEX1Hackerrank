import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

/*  Des d'una discoteca ens demanen un senzill programa que permeti detectar si una persona és menor d'edat o no. El programa escaneja els dni's i ens hauria de retornar la seva edat i dir-nos si està en l'any de la majoria d'edat o no.

Les dades d'entrada d'aquest programa és l'any de naixament i el seu nom. Què podríem fer per saber si és major d'edat o no?

Input Format

Com a Input d'entrada llegirem el nom de la persona i el seu any de naixament.

Per exemple: Joan Maragall 1970

Constraints

No hi ha restriccions

Output Format

La sortida serà la següent frase corresponent a l'exemple anterior: "El Joan Maragall té 50 anys i és major d'edat."

Sample Input 0

Maria Aguil��
2005
Sample Output 0

Maria Aguil�� t�� 15 anys i ��s menor d'edat.

 */





public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int fechnasc = sc.nextInt();
        int edad = 2020 - fechnasc;

        if (edad<18)
        {
            System.out.print(nombre + " t\u00E9 " + edad + " anys i \u00E9s menor d'edat.");
        }
        if (edad>=18)
        {
            System.out.print(nombre + " t\u00E9 " + edad + " anys i \u00E9s major d'edat.");
        }

    }
}
