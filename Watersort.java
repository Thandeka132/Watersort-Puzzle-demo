import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Watersort extends StackAsMyArrayList {
    static Character red = 'r';
    static Character green = 'g';
    static Character blue = 'b';

    public static void main(String[] args) {
        //init a List of StackAsMyArrayList to store bottles
        List<StackAsMyArrayList> bottles= new ArrayList<>();
        //everything else will be done in a method

        FillColorRandomly(bottles);
        ShowAll(bottles);

    }
    public static void ShowAll(List<StackAsMyArrayList> stack){// basically shows all the bottles
        for (int i = 0; i < stack.size() ; i++) {
            System.out.println("bottles "+i+": "+ stack.get(i).toString());
        }
    }

    public static List<StackAsMyArrayList> FillColorRandomly(List<StackAsMyArrayList> bottles){
         Character[] inks = {red, blue, green};//

        //initialise the 5 bottles
        StackAsMyArrayList
                bottle1  = new StackAsMyArrayList(),
                bottle2= new StackAsMyArrayList(),
                bottle3= new StackAsMyArrayList(),
                bottle4= new StackAsMyArrayList(),
                bottle5 = new StackAsMyArrayList();

        //Add the 5 bottles on the bottle list
        bottles.add(bottle1);
        bottles.add(bottle2);
        bottles.add(bottle3);
        bottles.add(bottle4);
        bottles.add(bottle5);

        Random rand = new Random();

        //loop over the first 3 bottles
        for (int i = 0; i <3; i++){
            //from the inks array
            for (int j = 0; j <4; j++){
                int rand_int = rand.nextInt(3);//this give a random number which will be used to get a random color

                //you can comment this out to see how the colors are added to different bottles
                //System.out.println("Pouring " +inks[rand_int]+" into bottle "+i );

                //add a random ink to a bottle
                bottles.get(i).push(inks[rand_int]);
            }
        }
        return bottles;
    }
}
