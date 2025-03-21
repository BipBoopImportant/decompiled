package com.google.ar.core;

import com.google.ar.core.exceptions.DeadlineExceededException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class PointCloud implements Closeable {
    private long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected PointCloud() {
        this.nativeHandle = 0;
        this.session = null;
        this.nativeSymbolTableHandle = 0;
    }

    private native ByteBuffer nativeGetData(long j10, long j11);

    private native ByteBuffer nativeGetIds(long j10, long j11);

    private native long nativeGetTimestamp(long j10, long j11);

    private native void nativeReleasePointCloud(long j10, long j11);

    public void close() {
        release();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleasePointCloud(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public IntBuffer getIds() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            return Session.directByteBufferOrDefault(nativeGetIds(this.session.nativeWrapperHandle, j10)).asIntBuffer();
        }
        throw new DeadlineExceededException();
    }

    public FloatBuffer getPoints() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            return Session.directByteBufferOrDefault(nativeGetData(this.session.nativeWrapperHandle, j10)).asFloatBuffer();
        }
        throw new DeadlineExceededException();
    }

    public long getTimestamp() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            return nativeGetTimestamp(this.session.nativeWrapperHandle, j10);
        }
        throw new DeadlineExceededException();
    }

    public void release() {
        nativeReleasePointCloud(this.nativeSymbolTableHandle, this.nativeHandle);
        this.nativeHandle = 0;
    }

    PointCloud(Session session2, long j10) {
        this.session = session2;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
