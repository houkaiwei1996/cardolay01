package util;


import java.io.*;
import java.net.Socket;

public class ScoketClient {

    private Socket socket;

    public ScoketClient(String addr, int port) throws IOException {
            this.socket = new Socket(addr,port);
    }

    public String sendMsg(String msg) throws IOException {
        String mess = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedWriter bw = null;
        try {
            is = socket.getInputStream();
            os = socket.getOutputStream();

            bw = new BufferedWriter(new OutputStreamWriter(os));
            //向服务器端发送一条消息
            bw.write(msg);
            bw.flush();

            mess = read(is);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        } finally {
            is.close();
            os.close();
            bw.close();
        }
        return mess;
    }

    public  String read(InputStream is) throws IOException {
        String returnBuff = null;
        try {
            byte[] buf = new byte[512];

            int len = is.read(buf);
            returnBuff = new String(buf, 0, len);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        } finally {
        }
        return returnBuff;
    }

    public static void main(String[] args) {
        ScoketClient scoketClient = null;
        String res = null;
        try {
            scoketClient = new ScoketClient("riseworlds.51vip.biz",8000);
            res = scoketClient.sendMsg("{\"card_xj\":\"dAAKQT99876655443\",\"card_sj\":\"0\",\"play\":\"8\",\"landlord\":\"2\",\"to_play\":\"1\",\"board_list\":\"2,8\",\"xj_count\":\"17\",\"ddz_playcard\":\"1002\",\"card_array\":\"22AKKKQJJT9987654\",\"othercard\":\"dx22AAAKQQQJJTTT99887776665554443333\",\"activeplay\":\"0\",\"player\":\"2\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(res);
    }

}
