package org.wenbin.console.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by quwb on 2018/1/5.
 */
public class FileOpt {
    public void run(FileType fileType){
        switch (fileType){
            case File:
                accessFile();
                break;
        }
    }

    private void accessFile(){
        try {
            RandomAccessFile accessFile = new RandomAccessFile("data/nio-data.txt", "rw");
            FileChannel inChannel = accessFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(48);
            try{
                int bytesRead = inChannel.read(buf);
                while (bytesRead != -1){
                    System.out.println("Read " + bytesRead);
                    buf.flip();

                    while (buf.hasRemaining()){
                        System.out.println((char)buf.get());
                    }

                    buf.clear();
                    bytesRead = inChannel.read(buf);
                }
                accessFile.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
