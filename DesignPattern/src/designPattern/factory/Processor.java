package designPattern.factory;

public class Processor {

	public String mHz;
	
	@Override
	public String toString() {
		String res = String.format("Je suis un processeur avec %s Hz", mHz);
		return res;		
	}
	
}
