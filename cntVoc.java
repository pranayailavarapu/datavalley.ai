public class CountVoC {
    public static void main(String args[]){
        String str = "DaTaValleY";
        str.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == 'a'  || str.charAt(i) == 'e'  ||str.charAt(i)=='i'||str.charAt(i) == 'o'|| str.charAt(i) == 'u'){
                vowelCount++;
            }
            else{
                consonantCount++;
            }
        }
        System.out.println("The no.of vowels are "+ vowelCount);
        System.out.println("The no.of consonantCount are "+ consonantCount);
    }
}.