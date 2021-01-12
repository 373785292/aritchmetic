import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * @description:
 * @author: hbh
 * @time: 2020/12/30 15:15
 */

public class linux_cmd {
        public static void main(String[] args) throws IOException {
            //String cmd = "echo 2333 2333 2333";
            //String[] cmd={"cmd","/C","echo 233 && echo 233"};
            //String cmd="cmd /C"+"echo 233 && echo 233";
            //String cmd = "echo 2333 2333 2333 && echo 2333 2333 2333";
            String cmd="cmd /C java -version";
            InputStream in = Runtime.getRuntime().exec(cmd).getInputStream();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int a = -1;

            while ((a = in.read(b)) != -1) {
                baos.write(b, 0, a);
            }

            System.out.println(new String(baos.toByteArray()));
        }
    }

