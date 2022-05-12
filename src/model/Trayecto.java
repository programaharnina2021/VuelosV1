package model;

import java.time.LocalTime;
import java.util.List;

public class Trayecto {
	private Recorrido recorrido;
	private LocalTime horario;
	private String aerolinea;
	private float precio;
	private final int periodoEnTiempoEnMinutos=120;
	private List<CategoriaAsientos> categoriaAsientos;
	private boolean vueloDirecto;
}
