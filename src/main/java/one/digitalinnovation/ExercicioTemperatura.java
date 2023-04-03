package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioTemperatura {

    public static void main(String[] args) {


        System.out.println("Digite as temperaturas dos 6 primeiros meses do ano");

        List<Integer> temperatura = new ArrayList<>();
        temperatura.add(36);
        temperatura.add(28);
        temperatura.add(32);
        temperatura.add(34);
        temperatura.add(28);
        temperatura.add(30);

        Iterator<Integer> iterator = temperatura.iterator();
        int soma=0;
        while(iterator.hasNext()){
           int next = iterator.next();
           soma += next;
        }

        int media = soma / temperatura.size();
        System.out.println(media);

        Iterator<Integer> iterator1 = temperatura.iterator();
            while(iterator1.hasNext()){
                int next = iterator.next();
                if (next > media) iterator1.
                }



        }


    }
}
