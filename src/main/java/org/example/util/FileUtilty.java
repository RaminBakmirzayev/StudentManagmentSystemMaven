package org.example.util;

import java.io.*;

public class FileUtilty {


    public static void serialisation(Serializable object,String filename)  {

      try(  FileOutputStream fileOutputStream=new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);){
          objectOutputStream.writeObject(object);
      }catch (Exception ex){
          throw new RuntimeException();
      }

    }
  public static Object deserialisation(String filename) {
        Object object=null;
        try(FileInputStream fileInputStream=new FileInputStream(filename);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)){
            object=objectInputStream.readObject();
        }finally {
            return object;
        }

  }

}
