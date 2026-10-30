//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner lecture= new Scanner (System.in);

    int files=0;
    int columnes=0;

    System.out.println("Escriu-me les dimension de files");
    files = lecture.nextInt();
    System.out.println("Escriu les dimensions de columnes");
    columnes = lecture.nextInt();

    int [][] dimensions = new int[files][columnes];

    System.out.println("Introdueix els valors de la matriu");
    for (int i=0; i <dimensions.length; i++) {
        for (int j=0; j <dimensions.length; j++) {
            System.out.println("Valor [" + i + "][" + j + "]: ");
            dimensions[i][j] = lecture.nextInt();
        }
    }
    int suma = 0;
    for (int i = 0; i < files; i++) {
        for (int j = 0; j < columnes; j++) {
            suma += dimensions[i][j];
        }
    }
    int []
    System.out.println("La suma dels elements és: " + suma);
}
