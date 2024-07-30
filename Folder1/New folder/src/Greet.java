
public class Greet implements IGreeting {
    private ILanguage language;
    public Greet(ILanguage language) {
         this.language = language;
    }
	@Override
	public void greet() {
		// TODO Auto-generated method stub
		this.language.speak();
	}

}
