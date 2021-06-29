public class exc32 {
    public static void main(String[] args) throws InterruptedException{
    	int ctd = 100;
    	while(ctd<=200) {
    		System.out.println(ctd);
    		Thread.sleep(300);
    		ctd++;
    	}
    }
}