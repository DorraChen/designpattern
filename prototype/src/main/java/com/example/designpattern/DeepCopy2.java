package com.example.designpattern;

import java.io.*;

/**
 * @author dorra
 * @date 2021/06/12 13:30
 * @description 深拷贝方法2:
 *         先将对象序列化，然后再反序列化成新的对象
 */
public class DeepCopy2 {
    public Object deepCopy(Object object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(object);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);

        return oi.readObject();
    }
}
