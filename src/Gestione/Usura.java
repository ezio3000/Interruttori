package Gestione;

import java.time.LocalDate;
import java.time.Period;

public class Usura {
  private LocalDate dataIn;
  private LocalDate dataOut;
  private LocalDate dataCostruzione;
  private int amperaggioMedio;
  private double usuraPrecedente;
  
  
  /**
   * restituisce il valore dell'usura stimata
   * @param dataIn
   * @param dataOut
   * @param dataCostruzione
   * @param amperaggioMedio
   * @return
   */
  public double Stimata() {	
	  
	  int periodo; //periodo dataIn-dataOut
	  int eta;
	  
	  eta=Period.between(LocalDate.now(), dataCostruzione).getDays();
	  periodo=Period.between(dataIn, dataOut).getDays();
	  
	  return (periodo*amperaggioMedio*eta+usuraPrecedente);
  }
}
