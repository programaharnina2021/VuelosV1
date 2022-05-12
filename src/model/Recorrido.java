package model;

public class Recorrido {
	
	private String ciudadOrigen;
	private String ciudadDestino;
	
	public Recorrido(String ciudadOrigen, String ciudadDestino) {
		super();
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudadDestino == null) ? 0 : ciudadDestino.hashCode());
		result = prime * result + ((ciudadOrigen == null) ? 0 : ciudadOrigen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recorrido other = (Recorrido) obj;
		if (ciudadDestino == null) {
			if (other.ciudadDestino != null)
				return false;
		} else if (!ciudadDestino.equals(other.ciudadDestino))
			return false;
		if (ciudadOrigen == null) {
			if (other.ciudadOrigen != null)
				return false;
		} else if (!ciudadOrigen.equals(other.ciudadOrigen))
			return false;
		return true;
	}
	
	
}
