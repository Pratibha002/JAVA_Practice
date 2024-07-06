package JAVA_Practice.String;

public class CountTypeOfCharacter {
    public static void main(String[] args) {
        String s ="#GeeKs01fOr@gEEks07";
       int uppercaseCount=0;
       int lowercaseCount=0;
       int numbersCount=0;
       int specialCharacterCount=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                uppercaseCount++;

            }else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                lowercaseCount++;

            }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                numbersCount++;

            }else{
                specialCharacterCount++;

            }
        }System.out.println("uppercase characters : "+uppercaseCount);
        System.out.println("lowercase characters : "+ lowercaseCount);
        System.out.println("numeric characters : "+ numbersCount);
        System.out.println("special characters : "+specialCharacterCount);
    }
}

/*

class Sol
{
    int[] count (String s)
    {
        int [] charCount =new int[4];
          for(int i=0; i<s.length(); i++){
              if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                charCount[0]++;

              }else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                    charCount[1]++;

              }else if(s.charAt(i)>='0' && s.charAt(i)<='9' ){
                  charCount[2]++;
              }else{
                   charCount[3]++;
              }
          } return charCount;
    }
}
 */
