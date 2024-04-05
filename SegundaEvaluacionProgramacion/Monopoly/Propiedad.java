package SegundaEvaluacionProgramacion.Monopoly;

public class Propiedad {
   //--Propiedades--
   private int coste;
   private int alquiler;
   private String propietario;

   //--Constructor--


   public Propiedad(int coste, int alquiler) {
      this.coste = coste;
      this.alquiler = alquiler;
   }

   public Propiedad(int coste, int alquiler, String propietario) {
      this.coste = coste;
      this.alquiler = alquiler;
      this.propietario = propietario;
   }
}
