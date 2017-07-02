package org.deziras.io;

import java.io.*;

import static java.io.ObjectOutputStream.*;

/**
 * Created by Glavo on 下午6:35.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface ObjectOutput extends Closeable, Flushable, java.io.ObjectOutput {
    void useProtocolVersion(int version) throws IOException;

    void writeObject(Object obj) throws IOException;

    void writeUnshared(Object obj) throws IOException;

    void defaultWriteObject() throws IOException;

    PutField putFields() throws IOException;

    void writeFields() throws IOException;

    void reset() throws IOException;

    @Override
    void write(int val) throws IOException;

    @Override
    void write(byte[] buf) throws IOException;

    @Override
    void write(byte[] buf, int off, int len) throws IOException;

    @Override
    void flush() throws IOException;

    @Override
    void close() throws IOException;

    @Override
    void writeBoolean(boolean val) throws IOException;

    @Override
    void writeByte(int val) throws IOException;

    @Override
    void writeShort(int val) throws IOException;

    @Override
    void writeChar(int val) throws IOException;

    @Override
    void writeInt(int val) throws IOException;

    @Override
    void writeLong(long val) throws IOException;

    @Override
    void writeFloat(float val) throws IOException;

    @Override
    void writeDouble(double val) throws IOException;

    @Override
    void writeBytes(String str) throws IOException;

    @Override
    void writeChars(String str) throws IOException;

    @Override
    void writeUTF(String str) throws IOException;

}
