public class IfaprobadoAsignatura {
    public static void main(String[] args) {
        
        int mates = 4, lengua = 5;

            if (mates>5){
            if (lengua>=5) {
                
                 System.out.println("Has aprobado las dos asignaturas");
        }   else {
                System.out.println("Has aprobado solo matematicas");
        }
        }   else if(lengua>=5){
            System.out.println("Has aprobado lengua ");
        }   else {
            System.out.println("No has aprobado ninguna asignatura");
        }

    }


}
    

