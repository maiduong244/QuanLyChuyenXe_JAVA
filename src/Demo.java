public class Demo {
	private int data = 5;

	public int getData() {
		return this.data;
	}

	public int getData(int value) {
		return (data + 1);
	}

	public int getData(int... value) {
		return (data + 2);
	}

	public static void main(String[] args) {
		Demo temp = new Demo();
		System.out.println(temp.getData(7, 8, 12));
	}
}