import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String name = br.readLine();
        
        if(name.equals("java")){
            bw.write(String.valueOf("1"));
        }else{
            bw.write(String.valueOf("0"));
        }
        
        bw.flush();
    }
 
}