package orders;

public class GST {

	int hsncode;
	int gst;

	public GST(int hsncode, int gst) {
		this.hsncode = hsncode;
		this.gst = gst;
	}

	public GST() {

	}

	public int getHsncode() {
		return hsncode;
	}

	public int getGst() {
		return gst;
	}

	public void setHsncode(int hsncode) {
		this.hsncode = hsncode;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

}
