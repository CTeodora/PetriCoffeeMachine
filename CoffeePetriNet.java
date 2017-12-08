
public class CoffeePetriNet extends PetriNet{

	public  CoffeePetriNet()
	{
		 Location zero = new Location("0", 1);
         Location cinci = new Location("5", 0);
         Location zece = new Location("10", 0);
         Location cincisprezece = new Location("15", 0);
         
         Arc ZeroOutToFive = new Arc(1,"out",zero);
         Arc ZeroOutToTen = new Arc(1,"out",zero);
         Arc ZeroInFromC1 = new Arc(1,"in",zero);

         Arc FiveOutToFifteen = new Arc(1,"out",cinci);
         Arc FiveOutToTen= new Arc(1,"out",cinci);
         Arc FiveInFromZero = new Arc(1,"in",cinci);

         Arc TenInFromFive = new Arc(1,"in",zece);
         Arc TenInFromZero = new Arc(1,"in",zece);
         Arc TenOutToFifteen = new Arc(1,"out",zece);

         Arc FifteenInFromFive = new Arc(1,"in",cincisprezece);
         Arc FifteenInFromTen = new Arc(1,"in",cincisprezece);
         Arc FifteenOutToZero = new Arc(1,"out",cincisprezece);
         
         
         Transition tranCinci = new Transition("5");
         tranCinci.arc.add(ZeroOutToFive);
         tranCinci.arc.add(FiveInFromZero);
         tranCinci.arc.add(FiveOutToTen);
         tranCinci.arc.add(TenInFromFive);
         tranCinci.arc.add(TenOutToFifteen);
         tranCinci.arc.add(FifteenInFromTen);

         Transition tranZece = new Transition("10");
         tranZece.arc.add(ZeroOutToTen);
         tranZece.arc.add(TenInFromZero);
         tranZece.arc.add(FiveOutToFifteen);
         tranZece.arc.add(FifteenInFromFive);

         Transition tranCoffee = new Transition("C1");
         tranCoffee.arc.add(FifteenOutToZero);
         tranCoffee.arc.add(ZeroInFromC1);

         transitions.add(tranCinci);
         transitions.add(tranZece);
         transitions.add(tranCoffee);
	}
	

}
