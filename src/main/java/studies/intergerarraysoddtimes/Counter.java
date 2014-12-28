package studies.intergerarraysoddtimes;

public class Counter {

	private int counting;

	public void inc() {
		this.counting++;
	}

	public boolean isEven() {
		return counting % 2 == 0;
	}

}
