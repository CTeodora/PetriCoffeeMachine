
public class Location {

	String tag;
	int jetoane;
	
	public Location(String tag, int jetoane)
    {
        this.tag = tag;
        this.jetoane = jetoane;
    }
	
	public int GetNrJetoane()
	{
		return jetoane;
	}
	
	public String GetTag()
	{
		return tag;
	}
}
