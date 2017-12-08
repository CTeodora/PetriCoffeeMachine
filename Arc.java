
public class Arc
    {
        int capacitate;
        int nrJetoane = 0;
        String direction;
        Location location;
     
        
        public Arc(int capacitate,String direction,Location location)
        {
            this.capacitate=capacitate;
            this.direction=direction;
            this.location=location;
        }
        
        boolean IsValid()
        {
            if(location.GetNrJetoane() >= capacitate)
                return true;
            else
                return false;
        }
        
        public void Update()
        {
        	 nrJetoane = location.GetNrJetoane();
        	
        	if(direction == "in")
        	{
        		nrJetoane -= capacitate;
        	}
        	else if(direction == "out")
        	{
        		nrJetoane += capacitate;
        	}
        }
        
        public Location GetLocatie()
    	{
    		return location;
    	}
    }