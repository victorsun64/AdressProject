package data;

public class Address {
	//
	String vorname;
	String nachname;
	String ort;
	String PLZ;
	String Straﬂe;

	//
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPLZ() {
		return PLZ;
	}

	public void setPLZ(String pLZ) {
		PLZ = pLZ;
	}

	public String getStraﬂe() {
		return Straﬂe;
	}

	public void setStraﬂe(String straﬂe) {
		Straﬂe = straﬂe;
	}

	//
	@Override
	public String toString() {
		return getVorname() + "," + getNachname() + "," + getOrt() + "," + getPLZ() + "," + getStraﬂe();
	}
}
