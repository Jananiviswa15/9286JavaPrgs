package IteratorPattern;

public class NameRepository implements Container {
	public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	private class NameIterator implements Iterator {
		int index; //0 //1 //2
		@Override
		public boolean hasNext() {
			if(index < names.length){
				return true;
			}
			return false;
		}
		@Override
		public Object next() {
			if(this.hasNext()){
				return names[index++];  //names[1++]
			}
			return null;
		}
	}
}