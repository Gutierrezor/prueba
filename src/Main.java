import java.util.Scanner;
public class Main {
    static int saldo=3000,retiro,deposito;
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int opc;
        do {
            opc = menu();
            switch (opc){
                case 1:
                    retirarsaldo();
                    break;
                case 2:
                    depositarsaldo();
                    break;
                case 3:
                    consultarsaldo();
                    break;
                default:
                    salir();
            }
        }while (opc !=4);
    }
    public static int menu(){
        int opc =0;
        System.out.println("bienvenido al cajero automatico");
        System.out.println("================================");
        System.out.println("presione 1 para returar su saldo");
        System.out.println("presione 2 para depositar su saldo");
        System.out.println("presione 3 para consutaltar su saldo");
        System.out.println("presione 4 para salir");
        System.out.println("================================");
        System.out.println("por favor seleccionar la operacion que sea reaizar");
        opc=s.nextInt();

        return opc;
    }
    public static void  retirarsaldo(){
        System.out.println(("\nIngrese la cantidad que desea el retiro"));
        retiro=s.nextInt();
        if(saldo>=retiro);{
            saldo=saldo-retiro;
            System.out.println("\nDinero retirado exitosa mente");
        }
        System.out.println("\nBalance retiro exitoso");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
    }
    public static void depositarsaldo(){
        System.out.println("\nIngrese la cantidad que quiere depositar");
        deposito=s.nextInt();
        saldo=saldo+deposito;
        System.out.println("\nSu dinero ha sido depositado existosamente");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
    }
    public static void consultarsaldo(){
        System.out.println("saldo:$"+saldo);
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
    }
    public static void salir() {
        System.out.println("gracias por utilizar el cajero");
        System.exit(0);
    }
}