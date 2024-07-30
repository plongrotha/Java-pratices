
public class ExecuteMian {

	private static ILanguage thai;
	private static ILanguage italy;
	private static ILanguage chinese;
	private static ILanguage khmer;
	private static ILanguage english;
	
	public static ILanguage getKhmer() {
		return khmer;
	}
	public static void setKhmer(ILanguage khmer) {
		ExecuteMian.khmer = khmer;
	}
	public static ILanguage getThai() {
		return thai;
	}
	public static void setThai(ILanguage thai) {
		ExecuteMian.thai = thai;
	}
	public static ILanguage getChinese() {
		return chinese;
	}
	public static void setChinese(ILanguage chinese) {
		ExecuteMian.chinese = chinese;
	}
	public static ILanguage getItaly() {
		return italy;
	}
	public static void setItaly(ILanguage italy) {
		ExecuteMian.italy = italy;
	}
	public static ILanguage getEnglish() {
		return english;
	}
	public static void setEnglish(ILanguage english) {
		ExecuteMian.english = english;
	}
	
	public static void main(String[] args) {
		setEnglish(new English());
		setChinese(new Chinese());
		setItaly(new Italy()); 
		setKhmer(new Khmer());
		setThai(new Thai());
		Greet person = new Greet(khmer);
		person.greet();
	}



	

}
