package data;

public class Address {
	//
	String vorname;
	String nachname;
	String ort;
	String PLZ;
	String Stra�e;

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

	public String getStra�e() {
		return Stra�e;
	}

	public void setStra�e(String stra�e) {
		Stra�e = stra�e;
	}

	//
	@Override
	public String toString() {
		return getVorname() + "," + getNachname() + "," + getOrt() + "," + getPLZ() + "," + getStra�e();
	}
}
