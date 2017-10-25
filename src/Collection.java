
public class Collection {
	
	private boolean[] collection;
	private int howMany = 0;
	
	public boolean[] getCollection() {
		return collection;
	}
	public void setCollection(boolean[] collection) {
		this.collection = collection;
	}
	
	Variables v = new Variables();

	public Collection() {
		
		int n = v.getN();
		
		collection = new boolean[n];
	}
	public void howMany(){
		for(int i=0; i<collection.length; i++){
			if((i+1)%v.getX() != 0 && (i+1)%v.getY() != 0 && (i+1)%v.getZ() != 0 ){
				collection[i] = true;
			}
		}
		for(int j=0; j<collection.length; j++){
			if(collection[j]){
				howMany += 1;
			}
		}
		System.out.println("The result is: " + howMany);
		
		
	}
	
	

}
