package model;

import java.time.LocalDate;

public class Vuelo {
	private Long id;
	private Trayecto trayecto;
	private String estado;
	private int asientosLibres;
	private LocalDate fecha;
}
