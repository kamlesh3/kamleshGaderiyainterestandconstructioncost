package com.task.intrest;
import java.util.*;
public class Houseconstructioncost {

	public static void main(String[] args) {
		System.out.format("\nVarious type of construction materials:\n\n");
		System.out.format("1.Standard materials \n2.Above Standard materials \n3.High Standard material \n4.zHigh Standard material and fully automated home\n\n");
		Scanner sc=new Scanner(System.in);
		costcalculation c=new costcalculation();
		System.out.println("\nSelect the standard of material used for constructing house:");
		int choice=sc.nextInt();
		System.out.format("\nEnter the total area of house in square feet:\n");
		float housearea=sc.nextFloat();
		float totalamount=c.materialtype(choice,housearea);
		System.out.format("House construction cost,based on selected type of material:\n"+ totalamount+"INR");

	}

}
class costcalculation
{
float materialtype(int choice,float housearea)
{
float totalconstructioncost=0;
if(choice==1)
{
int standardmaterialcostpersquarefeet=1200;
totalconstructioncost=standardmaterialcostpersquarefeet*housearea;
}
else if(choice==2)
{
int abovestandardmaterialcostpersquarefeet=1500;
totalconstructioncost=abovestandardmaterialcostpersquarefeet*housearea;
}
else if(choice==3)
{
int highstandardmaterialcostpersquarefeet=1800;
totalconstructioncost=highstandardmaterialcostpersquarefeet*housearea;
}
else if(choice==4)
{
int highstandardmaterialandfullyautomatedcostpersquarefeet=2500;
totalconstructioncost=highstandardmaterialandfullyautomatedcostpersquarefeet*housearea;
}
else
{
System.out.format("select valid option from given type of materials(1 To 4)\n");
}
return totalconstructioncost;
}
}