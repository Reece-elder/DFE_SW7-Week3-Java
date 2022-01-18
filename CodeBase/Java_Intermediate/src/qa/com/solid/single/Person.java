package qa.com.solid.single;

public class Person {
	
	public String name;
	public int age;
	public String musicTaste;
	
	public Person(String name, int age, String musicTaste) {
		super();
		this.name = name;
		this.age = age;
		this.musicTaste = musicTaste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMusicTaste() {
		return musicTaste;
	}

	public void setMusicTaste(String musicTaste) {
		this.musicTaste = musicTaste;
	}
	
//	Method to play music 
//	TO play music will probably be controlled by something different, like an iPod / phone
	
//	public String playMusic(String music, String name) {
//		return(name + " listening to " + music);
//	}
	
	

}
