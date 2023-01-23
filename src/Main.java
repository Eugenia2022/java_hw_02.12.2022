//02.12.2022
//Создать класс ExpressionValidator
//Класс должен содержать статические перегруженные методы boolean parse с  параметрами 
//1) String, 
//2) char[]
//3) String[]
//4) String, Strinh
///5) char

//Каждый раз метод проверяет, что строка или символ либо число (0-9)
//Ваша задача - в проверках применить любые два разных способа. Вот несколько идей:
//Как можно проверить, что символ является числом? 
//1) Использовать Integer.parseInt - если метод бросает исключение, значит, символ не является числом
//2) Можно перебрать все условия ch == '0' и.т.д.
//3) Можно записать массив char[] из символов '0'..  в статическое поле. 

//Можно придумать свой способ.

//В Main вызвать каждый метод два раза: с валидными данными или с невалидными

public class Main {
    public static void main(String[] args){
        ExpressionValidator ev = new ExpressionValidator();

        System.out.println("parse 1 String " + ev.parse("1")) ;
        System.out.println("parse f String " + ev.parse("f")) ;

        System.out.println("parse 1 1 String " + ev.parse("1", "1")) ;
        System.out.println("parse f f String " + ev.parse("f", "f")) ;

        System.out.println("parse [1] String " + ev.parse(new String[] { "1" })) ;
        System.out.println("parse [f] String " + ev.parse(new String[] { "f" })) ;

        System.out.println("parse 1 char " + ev.parse('1')) ;
        System.out.println("parse f char " + ev.parse('f')) ;

        System.out.println("parse [1] char " + ev.parse(new char[] { '1' })) ;
        System.out.println("parse [f] char " + ev.parse(new char[] { 'f' })) ;
    }
}
