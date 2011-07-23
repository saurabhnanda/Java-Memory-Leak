public class CrashClass {
    static byte[] buf=new byte [1000000];
    private static ThreadLocal<byte[]> t=new ThreadLocal<byte[]>();

    public CrashClass() {
	t.set(buf);
    }



}