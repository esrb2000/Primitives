public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        for (int i = 1040; i <= 1125; i++) {
            if ( !(i == 1104) && !((i >= 1106) && (i <= 1124))) {
                char c = (char) i;
                System.out.println(i + "-" + c);
            }
        }
    }
}
//1025-Ё
//1040
//1103
//1105-ё