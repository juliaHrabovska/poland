package com.test.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Buffers {
    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("src/com/test/nio_test.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        //create buffer	with capacity of 48	bytes
        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf); //write into buffer.
        while (bytesRead != -1) {
            buf.flip(); //make buffer ready for read from
            while (buf.hasRemaining()) {
                System.out.print((char) buf.get()); // read 1 byte at a time
            }

            buf.clear(); //make buffer ready for writing into
            bytesRead = inChannel.read(buf);
        }

        aFile.close();
    }
}
