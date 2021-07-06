package com.company;
public class Main {
    public static void main(String[] args) {
    numberToWords(0);
    }

    public static void numberToWords(int number) {
        if(number==0){
            System.out.println("Zero");}
        else if(number<0){
            System.out.println("Invalid Value");} else {
            int equiv = reverse(number);
            int zeros = getDigitCount(number) - getDigitCount(equiv);
            String words = "";
            while (equiv > 0) {
                int translation = equiv % 10;
                equiv /= 10;
                switch (translation) {
                    case 1:
                        words += "One ";
                        continue;
                    case 2:
                        words += "Two ";
                        continue;
                    case 3:
                        words += "Three ";
                        continue;
                    case 4:
                        words += "Four ";
                        continue;
                    case 5:
                        words += "Five ";
                        continue;
                    case 6:
                        words += "Six ";
                        continue;
                    case 7:
                        words += "Seven ";
                        continue;
                    case 8:
                        words += "Eight ";
                        continue;
                    case 9:
                        words += "Nine ";
                        continue;
                    case 0:
                        words += "Zero ";
                        continue;
                }
            }
            for (int i = 0; i < zeros; i++) {
                words += "Zero ";
            }
            words = words.substring(0, words.length() - 1);
            System.out.println(words);
        }
}

public static int reverse(int number){
        if(number==0){return 0;}
        int reversal = 0;
        if(number>=0){
        while(number>=1){
            reversal*=10;
            reversal+= number%10;
            number/=10;
}
        return reversal;}

         if(number<0){
            while(number<=-1){
                reversal*=10;
                reversal+= number%10;
                number/=10;
            }
        return reversal;}
        return 0;}


    public static int getDigitCount(int number){
        if(number==0){return 1;}
        if(number<0){return -1;}
        int digits = 0;
        while(number>=1){
            digits++;
            number/=10;
        }
        return digits;
    }

}






//        if (number < 0) {System.out.println("Invalid value");}
//    int reverse = 0;
//    String words = "";
//        while(number>10){
//        reverse *= 10;
//        reverse+=number%10;
//        number=(int)Math.floor(number/10);
//    } reverse*=10;
//    reverse+=number;
//        while(reverse>0){
//        int translation = reverse%10;
//        reverse/=10;
//        switch(translation){
//            case 1: words+="One ";continue;
//            case 2: words+="Two ";continue;
//            case 3: words+="Three ";continue;
//            case 4: words+="Four ";continue;
//            case 5: words+="Five ";continue;
//            case 6: words+="Six ";continue;
//            case 7: words+="Seven ";continue;
//            case 8: words+="Eight ";continue;
//            case 9: words+="Nine ";continue;
//            case 0: words+="Zero ";continue;
//        }
//    } words = words.substring(0, words.length()-1);
//        System.out.println(words);
//}