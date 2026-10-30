public class Main {
    public static void main(String[] args) {
        Dni dni = new Dni(1456698774, 'E');
        System.out.println(dni);
        System.out.println(dni.isCorrect());

        Dni dni2 = new Dni("15646862J");
        System.out.println(dni2);

        System.out.println();
    }
}
