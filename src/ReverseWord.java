public class ReverseWord {
    public static void main(String[] args) {
        reverseString();
    }

    public static void reverseString(){
        String s= "Sydney";//input string
        String str ="";//empty variable to store reversed string
        char character;

        System.out.print("initial word===> ");
        System.out.println(s);

        for (int i=0; i<s.length(); i++)
        {
            character= s.charAt(i); //get every character from initial string
            str= character+str; //adds character one by one in front of the existing string
        }


        String spaceString = str.replace("", " ");//replaces with space
        System.out.println("Reversed word with space===> "+ spaceString);
        //System.out.println("Reversed word ===> "+ str);
    }
    }
