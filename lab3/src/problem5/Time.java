package problem5;

public class Time implements Comparable<Time>{
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time() {}
	
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public double getHours() {
		return hours;
	}
	
	public double getMinutes() {
		return minutes;
	}
	
	public double getSeconds() {
		return seconds;
	}

	@Override
	public int compareTo(Time t) {
		if (hours > t.getHours())
			return 1;
		else if (hours < t.getHours())
			return -1;
		else {
			if (minutes > t.getMinutes())
				return 1;
			else if (minutes < t.getMinutes())
				return -1;
			else {
				if (seconds > t.getSeconds())
					return 1;
				else if (seconds < t.getSeconds())
					return -1;
			}
		}
		return 0;
	}
	
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}
	
}
