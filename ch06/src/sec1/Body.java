package sec1;

public class Body {
	String style;
	String frendar;
	String bumper;
	
	@Override
	public String toString() {
		return "Body [style=" + style + ", frendar=" + frendar + ", bumper="
				+ bumper + "]";
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getFrendar() {
		return frendar;
	}
	public void setFrendar(String frendar) {
		this.frendar = frendar;
	}
	public String getBumper() {
		return bumper;
	}
	public void setBumper(String bumper) {
		this.bumper = bumper;
	}

}
