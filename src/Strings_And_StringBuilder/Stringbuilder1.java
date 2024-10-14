package Strings_And_StringBuilder;

public class Stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // creating object

        for(int i=0;i<26;i++){
            char ch = (char) ('a'+i);
            builder.append(ch);
        }

        System.out.println(builder.toString());


    }
}
