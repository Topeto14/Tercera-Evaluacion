import javax.xml.stream.events.Characters;

public class ejercicioopcion2Palotes {
    public static void convierteEnpalotes(int n){String[]palotes ={"|","||","|||","||||","|||||","||||||","|||||||","||||||||","|||||||||"};
  String num = Integer.toString(n);
  for(int i=0; i < num.length();i++){
    int digit = Character.getNumericValue(num.charAt(i));
    if (digit ==0){
      System.out.println("*");
    }else {
      System.out.print(palotes[digit-1]+"|");
    }
  } 
    

          

    }
    public static void main(String[] args) {
       

        }
    }
    

