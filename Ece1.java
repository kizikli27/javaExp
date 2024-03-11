import java.util.Scanner;
public class Ece1 {
    
    public static void main( String args[] ) 
    {
        Scanner scanner=new Scanner(System.in);
        String word,firstWord,secondWord;
        System.out.println("Kelime giriniz");
        word=scanner.nextLine();
        if(!word.equals("exit")){
            firstWord=word;
            word=scanner.nextLine();
            if(firstWord.compareTo(word)<0){
                secondWord=word;
            }
            else{
                secondWord=firstWord;
                firstWord=word;
                
            }


            if(firstWord.equals(secondWord) && word.equals("exit")){
                System.out.println("Hata yeterli veri yok");
                System.exit(0);
            }
            while(!word.equals("exit")){
                 word=scanner.nextLine();
                 if(word.equals("exit")) {
                    break;
                }
                if(firstWord.compareTo(word)<0 && word.compareTo(secondWord)<0){
                    secondWord=word;
                }
                else if(word.compareTo(firstWord)<0){
                    secondWord=firstWord;
                    firstWord=word;
                }               
            }
            System.out.println(secondWord);
        }
        else{
            System.out.println("Hata yeterli veri yok");
            System.exit(0);

        }
    }
}
