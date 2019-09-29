package com.zzb.ipfs.filestore.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 序列化，反序列化工具类
 * 用于转换byte[]和对象
 * Author : YongBo Xie </br>
 * File Name: SerializeUtil.java </br>
 * Created Date: 2018年3月29日 下午6:36:49 </br>
 * Modified Date: 2018年3月29日 下午6:36:49 </br>
 * Version: 1.0 </br>
 */

public class SerializeUtil {

    public static byte[] serialize(Object object) {
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        try {
            // 序列化
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            byte[] bytes = baos.toByteArray();
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(oos);
            close(baos);
        }
        return null;
    }

    public static Object unserialize(byte[] bytes) {
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            // 反序列化
            bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(bais);
            close(ois);
        }
        return null;
    }

    /**
     * 序列化 list 集合
     *
     * @param list
     * @return
     */
    public static byte[] serializeList(List<?> list) {

        if (list == null || list.size() <= 0) {
            return null;
        }
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        byte[] bytes = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            for (Object obj : list) {
                oos.writeObject(obj);
            }
            bytes = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(oos);
            close(baos);
        }
        return bytes;
    }

    /**
     * 反序列化 list 集合
     *
     * @param
     * @return
     */
    public static List<?> unserializeList(byte[] bytes) {
        if (bytes == null) {
            return null;
        }

        List<Object> list = new ArrayList<Object>();
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            // 反序列化
            bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);
            while (bais.available() > 0) {
                Object obj = (Object) ois.readObject();
                if (obj == null) {
                    break;
                }
                list.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(bais);
            close(ois);
        }
        return list;
    }

    /**
     * 关闭io流对象
     *
     * @param closeable
     */
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * Title: toBytes
     * Description:序列化对象
     * @author zhengzx
     * @throws Exception
     */
    public static byte[] toBytes(Object out) throws Exception {
        //用于序列化后存储对象
        ByteArrayOutputStream byteArrayOutputStream = null;
        //java序列化API
        ObjectOutputStream objectOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            //将out对象进行序列化
            objectOutputStream.writeObject(out);
            //测试验证输入（获取字节数组）
            byte[] bs = byteArrayOutputStream.toByteArray();
            //将数组转化为字符串输入
            System.out.println(Arrays.toString(bs));
            return bs;

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭最外层的流（内部流会自动关闭）
            objectOutputStream.close();
        }
        return null;
    }

    /*
     * Title: toPlay
     * Description:反序列化对象
     * @author zhengzx
     * @throws Exception
     */
    public static void toPlay(byte[] bs) throws Exception {
        //创建存放二进制数据的API
        ByteArrayInputStream byteArrayInputStream = null;
        //创建反序列化对象
        ObjectInputStream objectInputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bs);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);

            //校验测试
            /*Player player = (Player) objectInputStream.readObject();
            System.out.println(player.toString());*/
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            objectInputStream.close();
        }
    }
}
