public class kata {
    public static void main(String[] args) {

        kata ku = new kata();
        System.out.println(  ku.solution(7986));

    }


    public String solution(int n) {
        String s ="";
        if (n<10){

        switch (n){
            case 1:  s += "I";
                break;
            case 2:  s += "II";
                break;
            case 3:  s += "III";
                break;
            case 4:  s += "IV";
                break;
            case 5:  s += "V";
                break;
            case 6:  s += "VI";
                break;
            case 7:  s += "VII";
                break;
            case 8:  s += "VIII";
                break;
            case 9:  s += "IX";
                break;
                default: s+="";

        }System.out.println(s);

        return s;}

        else if (n>=10 && n<100 )  {
                       switch (n/10){
                           case 1:  s += "X";
                               break;
                           case 2:  s += "XX";
                               break;
                           case 3:  s += "XXX";
                               break;
                           case 4:  s += "XL";
                               break;
                           case 5:  s += "L";
                               break;
                           case 6:  s += "LX";
                               break;
                           case 7:  s += "LXX";
                               break;
                           case 8:  s += "LXXX";
                               break;
                           case 9:  s += "XC";
                               break;
                           default: s+=""; }
            System.out.println(s);
                           return s + solution(n%10);
                   }

            else if (n>=100 && n<1000){

                    switch (n/100){
                        case 1:  s += "C";
                            break;
                        case 2:  s += "CC";
                            break;
                        case 3:  s += "CCC";
                            break;
                        case 4:  s += "CD";
                            break;
                        case 5:  s += "D";
                            break;
                        case 6:  s += "DC";
                            break;
                        case 7:  s += "DCC";
                            break;
                        case 8:  s += "DCCC";
                            break;
                        case 9:  s += "CM";
                            break;
                        default: s+=""; }
            System.out.println(s);
            return s + solution(n%100);}

            else {
                switch (n/1000){
            case 1:  s += "M";
                break;
            case 2:  s += "MM";
                break;
            case 3:  s += "MMM";
                break;
            case 4:  s += "MMMM";
                break;
            case 5:  s += "MMMMM";
                break;
            case 6:  s += "MMMMMM";
                break;
            case 7:  s += "MMMMMMM";
                break;
            case 8:  s += "MMMMMMMM";
                break;
            case 9:  s += "MMMMMMMMMM";
                break;
            default: s+=""; }


            return s + solution(n%1000);
        }

        }
}


