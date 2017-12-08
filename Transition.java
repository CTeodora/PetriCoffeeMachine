import java.util.ArrayList;

public class Transition {
	
	String tag;
	ArrayList<Arc> arc=new ArrayList<Arc>();
	
	public Transition(String tag)
    {
        this.tag = tag;
        
    }
	
	
	public boolean isValid()
	{
		
		
		for(int i = 0; i <= arc.size();i++)
		{
			if(!arc.get(i).IsValid())
			{
				return false;				
			}			
			
		}
			return true;		
	}
	
	public void Update()
	{
		for(int i = 0; i <= arc.size();i++)
		{
			arc.get(i).Update();
		}
	}
	
	public String GetTag()
	{
		return tag;
	}
}
