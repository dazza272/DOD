package dungeonsofdoom;
import java.io.*;

public class Main {


    public static void main(String[] args) {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String cmd = "";

        world w = new world();
        player p = new player();

        p.newLoc = w.babblingBrook;

        System.out.println("You are currently in  " + p.newLoc + " location");

        while(true){
            try {
                cmd = r.readLine();
            } catch (Exception ex) {
            }

            System.out.println(cmd);

            if(cmd.equals("north")){

                System.out.println("YOU HAVE MOVED NORTH!!!!!!");
                System.out.println("YOU ARE NOW IN LOCATION " + "");

            }

        }

    }

}
