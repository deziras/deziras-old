package org.deziras.io;

import org.jetbrains.annotations.NotNull;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

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

    java.io.ObjectOutputStream.PutField putFields() throws IOException;

    void writeFields() throws IOException;

    void reset() throws IOException;

    void write(int val) throws IOException;

    void write(byte[] buf) throws IOException;

    void write(byte[] buf, int off, int len) throws IOException;

    void flush() throws IOException;

    void close() throws IOException;

    void writeBoolean(boolean val) throws IOException;

    void writeByte(int val) throws IOException;

    void writeShort(int val) throws IOException;

    void writeChar(int val) throws IOException;

    void writeInt(int val) throws IOException;

    void writeLong(long val) throws IOException;

    void writeFloat(float val) throws IOException;

    void writeDouble(double val) throws IOException;

    void writeBytes(@NotNull String str) throws IOException;

    void writeChars(@NotNull String str) throws IOException;

    void writeUTF(@NotNull String str) throws IOException;

}
