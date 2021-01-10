package test23;

interface Remocon{
	void on();
	void off();
}
class TVRemocon implements Remocon{
	public void volumeUp() {
		System.out.println("볼륨을 높입니다.");
	}
	@Override
	public void on() {
		System.out.println("TV를 킵니다.");
	}
	@Override
	public void off() {
		System.out.println("TV를 끕니다.");
	}
}
class AirconRemocon implements Remocon{
	@Override
	public void on() {
		System.out.println("에어컨을 킵니다.");
	}
	@Override
	public void off() {
		System.out.println("에어컨을 끕니다.");
	}
}
public class Test {

	public static void main(String[] args) {
		Remocon r = new AirconRemocon();
		r.on();
		r.off();
		r = new TVRemocon();
		r.on();
		r.off();
	}
}
