/**
 * tutorial
 */
public class tutorial {

    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");
        System.out.println("HOLA MUNDO OTRA VEZ");
        int edad = 33;

        for (int i = 0; i < 100; i++) {
            if(edad <= 50){
                edad++;
            }
            else{
                break;
            }
        }
        System.out.println("La edad después del experimento es: " + edad);
        

    }
}