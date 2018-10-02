package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void showHoroscope(Zodiac z) {
		switch(z) {
		case AQUARIUS: 
			System.out.println("The real name of Jackie Chan is Chan Kong-Sang. It is time to call things by their real name instead of avoiding it and trying to hide from their true colors and consequences over time. The sooner you accept what ... ");
			break;
		case PISCES:
			System.out.println("There is a lot of love in the air, and even if you aren’t aware where it is coming from, you can feel it is here. Stay inspired and do something with your hands, creating what needs to get out ...");
			break;
		case ARIES: 
		System.out.println("You don’t have much trouble keeping a secret hidden, for as long as you understand that it doesn’t endanger anyone in your path. You need some stability to sense what is going on around you and separate your experiences in ... ");
		break;
		case TAURUS: 
			System.out.println("Prior to WWI people didn’t need passports. When you think about some newfound limitations they could frustrate you, but they are there for your own safety and protection and it is best to keep this in mind too. There are ... ");
			break;
		case GEMINI:
			System.out.println("Some emotions seem to be standing in your way, but they are really something to strive for and something to attend to. You need your energy invested in things that will lead to your liberation, not those that your surroundings ... ");
			break;
		case CANCER:
			System.out.println("Some changes are becoming realistic and you can feel them in your surroundings and your every day life. It is time to regain control, but with enough empathy for others and your own inner world. The deeper you connect, the ...");
			break;
		case LEO :
			System.out.println("Whatever you say to Siri is stored by Apple. Be very careful of your words spoken around other people. You don’t know how someone might react if an outburst takes the best of you and makes you vulnerable to projections ...");
			break;
		case VIRGO:
			System.out.println("You have a way to unveil secrets that have been hidden for a long time and bring pearls of wisdom to people around you if you open your heart to their emotional states. Your experiences are meant to serve you ... ");
			break;
		case LIBRA:
			System.out.println("Some things need to be worked on and your physiology might suffer if you push yourself too far. Make sure you are getting enough sleep, eat a healthy meal and do something your body will be thankful for. This will ... ");
			break;
		case SCORPIO:
			System.out.println("People born under the Scorpio sign are very dedicated and loyal, when it comes to working");
			break;
		case SAGITTARIUS:
			System.out.println("Sagittarius is very fun and always surrounded by friends. Sagittarius-born love to laugh and enjoy the diversity of life and culture, so they will easily acquire many friends around the world.");
			break;
		case CAPRICORN:
			System.out.println("Some turnouts might not be that positive, but they will turn out to be extremely useful and positioning for your future. This is a good moment to act on certain impulses, going deep into your world of desires to see ...");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope h = new _00_Horoscope();
		Zodiac p = Zodiac.PISCES;
		Zodiac ca = Zodiac.CANCER;
		h.showHoroscope(ca);
		h.showHoroscope(p);
	}
}
