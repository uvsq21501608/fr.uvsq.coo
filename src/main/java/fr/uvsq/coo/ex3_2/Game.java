package fr.uvsq.coo.ex3_2;
import junit.framework.TestCase;
public class Game 
{
	private int pins;
	private int scoreTotale;
	public Game (int pins,int scoreTotale)
	{
		this.pins=pins;
		this.scoreTotale=scoreTotale;
		
	}
	public void roll (int pins)
	{
		
	}
	public int score ()
	{
		return scoreTotale;
	}
	public class BowlingGameTest extends TestCase
	{
		public void testGutterGame() throws Exception {
		Game g = new Game(pins,scoreTotale);
		for (int i=0; i<20; i++)
		g.roll(0);
		assertEquals(0, g.score());
		}
	}
	
}


