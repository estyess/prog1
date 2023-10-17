
public class goobie {
	public static void main(String[] args) {
		String goob="Hejsan på dejsan";
		int mellanslag = goob.indexOf(' ');
		String gloob = goob.substring(0, mellanslag);
		System.out.println(gloob);
	}
}
