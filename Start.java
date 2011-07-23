import java.lang.*;

public class Start extends Thread {


    public static void main(String args[]) throws ClassNotFoundException {
	for(int i=0; i<1; ) {
	    Start s=new Start();
	    s.run();
	}
    }

    public void run() {
	try {
	    CrashClassLoader l=new CrashClassLoader();
	    Class c=l.findClass("CrashClass");
	    c.newInstance();
	    c=null;
	    l=null;
	} catch(ClassNotFoundException e) {
	    e.printStackTrace();
	} catch(IllegalAccessException e) {
	    e.printStackTrace();
	} catch(InstantiationException e) {
	    e.printStackTrace();
	}
    }
}