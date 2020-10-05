import java.lang.StringBuilder;

public class Sarcasm {


public static void main(String[]args){
    String text = "this does not align with our core values";
        
    StringBuilder builder = new StringBuilder();


    for (int i = 0; i < text.length(); i++){
            if ( i % 2 == 0){
                builder.append(returnUppercase(text.charAt(i)));
            }
            else{
                builder.append(returnLowercase(text.charAt(i)));
            }

    }
    String result = builder.toString();
    System.out.println(result);
}

public static char returnUppercase(char c){

    return Character.toUpperCase(c);
}

public static char returnLowercase(char c){
    return Character.toLowerCase(c);
}
}
