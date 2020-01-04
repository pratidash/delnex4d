package delnex4d;

public class Books {
	String bName;
	String publication;
	int copies;
	
	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public Books(String bName, String publication, int copies) {
		super();
		this.bName = bName;
		this.publication = publication;
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Book [Name=" + bName + ", Publication=" + publication + ", No. of Copies=" + copies + "]";
	}
	
}
