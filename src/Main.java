public class Main {
    public static void main(String[] args) {
        //try {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

        // double d = calc.devideDouble.apply(a, b);
        // calc.printlnDouble.accept(d);

        //} catch (ArithmeticException ae) {
        //    System.out.println("На ноль делить нельзя!");
        //}
    }
}

// Приведенный в задании код работать не будет, программа в ходе исполнения выдает ошибку ArithmeticException,
// поскольку она сталкивается с делением целого числа (int) на 0 (int). BinaryOperator<Integer> devide = (x, y) ->  x / y;
// Способы решения проблемы:
// 1) поймать ошибку и выдать исключение через try catch
// 2) изменить тип переменных с Integer на Double
// 3) использовать тернарный оператор, который в случае, если делитель (y) равен 0,
// выдаст в качестве результата деления, например, 0. BinaryOperator<Integer> devide = (x, y) ->  y != 0 ? x / y : 0;
// 4) использовать блочное лямбда-выражение, внутри которого оператор if (см. описание класса Calculator)
// 5) использовать вместо интерфейса BinaryOperator интерфейс BiFunction и написать отдельный метод для вывода на экран результата типа Double