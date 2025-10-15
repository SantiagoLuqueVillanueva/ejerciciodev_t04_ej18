public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo (de 5 cifras como máximo): "));
        int primero = 0;

        if (num < 10){
            primero = num;
        } else if ((num >= 10) && (num < 100)) {
            primero = num/10;
        } else if ((num >= 100) && (num < 1000)) {
            primero = num/100;
        } else if ((num >= 1000) && (num < 10000)) {
            primero = num/1000;
        } else if ((num >= 10000) && (num < 100000)) {
            primero = num/10000;
        } 

        System.out.printf("La primera cifra del número introducido es el %d.", primero);
    }
}
