package aggregation;

public class AggregationChild {
	int a;
	String str;
	AggregationParent ag;
	public AggregationChild(int a,String str,AggregationParent ag) {
		this.a=a;
		this.str=str;
		this.ag=ag;
	}
	public void aggregationDisplay() {
		System.out.println(a);
		System.out.println(str);
		ag.display();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationParent agg=new AggregationParent(1,"hai");
		AggregationChild c=new AggregationChild(2,"haii",agg);
		c.aggregationDisplay();
		
		

	}

}
