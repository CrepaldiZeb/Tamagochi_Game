package games;

import java.util.Random;

//pedra papel e tesoura
public class jkp {

    public void jkp(){
        int min = 0;
        int max = 3;
        Random ran = new Random();
        for(int i=0; i < 100; i++){
            int randomInt = min+ ran.nextInt(max-min+1);
            System.out.println(randomInt);

        }
    }
    
 

}


