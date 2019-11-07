
public class WordCounter {
	
	
	public static int[] allNums(String[] A, String[] B){
		int BLength = B.length;
		int ALength = A.length;
		int counter = 0;
		int[] intArray = new int[BLength];
		//if statement saying which one is larger
		int longLength;
		int shortLength;
		if(ALength >= BLength){
			for(int i = 0; i < BLength; i++){
				counter = 0;
				for(int j = 0; j <ALength; j++){
				if(B[i].equals(A[j])){
					counter++;
				}
				intArray[i] = counter;
				
				
				}
			}
		/*	for(int f = 0; f< intArray.length; f++){
				System.out.println(intArray[f]);
			}*/
			return intArray;
		}else{
			longLength = BLength;
			shortLength = ALength;
		}
		for(int i = 0; i < longLength; i++){
			counter = 0;
			for(int j = 0; j < shortLength; j++){
			if(B[i].equals(A[j])){
				counter++;
			}
			intArray[i] = counter;
			
			
			}
		}
		/*for(int f = 0; f< intArray.length; f++){
			System.out.println(intArray[f]);
		}*/
		return intArray;
	}

	// Do not run this until you are sure it works!!!
	public static void runWordCounterAcceptanceTest(){
		(new WordCounterTester()).generateCasesAndRun();
	}
	public static void main(String[] args) {
		runWordCounterAcceptanceTest();
		/*String[] B = {"yeet", "boi", "sas", "yeet"};
		String[] A ={"rip", "life", "sas", "sas","poop"};
		
		allNums(A, B);*/
	}
	/**
	 * @param args
	 */

}
