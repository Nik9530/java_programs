//A programme to accept a character from user and check it is vowel or not using switch case.

import java.util.*;
class vowels_or_not
{
    public static void main(String args[])
    {
        char ch; //iniciating variable
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your character: ");
        ch=sc.next().charAt(0);
        switch(ch) // applying Switch case
        {
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case'A':
            case'E':
            case'I':
            case'O':
            case'U':
                System.out.println(ch+" is a vowel");
            break;
            default:
            System.out.println(ch+" is a consonant");

            
        }
    }
}