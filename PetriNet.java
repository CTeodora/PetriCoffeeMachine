import java.util.ArrayList;


public abstract class PetriNet {

	ArrayList<Transition> transitions = new ArrayList<Transition>();
	ArrayList<Transition> validTrans = new ArrayList<Transition>();
	
	public void execute(String action)
	{
		for(Transition transition : transitions)
		{
			if(transition.tag == action && transition.isValid())
			{
				validTrans.add(transition);
			}
		}
	}	
}
