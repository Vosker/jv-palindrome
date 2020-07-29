package core.basesyntax;

public class Palindrome {

    /**
     * <p>Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
     * Палиндромом называется строка, которая читается одинаково слева направо
     * и справа налево (в том числе пустая).
     * При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы,
     * знаки препинания, а также регистр символов должны игнорироваться.</p>
     *
     * <p>Подсказки (не читайте, если хотите решить сами):
     * для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться
     * регулярным выражением. Найдите в классе String метод, выполняющий замену по
     * регулярному выражению;
     * для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(),
     * который находится в классе StringBuilder;
     * в классе String есть методы для преобразования всей строки в верхний и нижний регистр.</p>
     *
     * <p>Пример: Madam, I'm Adam!</p>
     * <p>Результат: true</p>
     */
    public boolean isPalindrome(String text) {
        String palindrome = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        int helper = palindrome.length();
        char[] charArr = new char[helper / 2];
        char[] revCharArr = new char[helper / 2];
        try {
            palindrome.getChars(0, helper / 2, charArr, 0);
            palindrome.getChars(helper / 2 + helper % 2, helper, revCharArr, 0);
        } catch (Exception ignored) {
            System.out.println("");
        }
        StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(revCharArr));

        return String.valueOf(charArr).equals(stringBuilder1.reverse().toString());
    }
}
