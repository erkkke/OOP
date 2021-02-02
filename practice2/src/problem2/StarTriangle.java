package problem2;

class StarTriangle {
	int width;
	
	StarTriangle(int width) {
		this.width = width;
	}
	
	public String toString() {
		String triangle = "";
		for (int i = 1; i <= width; i++)
			triangle += "[*]".repeat(i) + "\n";
		return triangle;
	}
}
