package com.google.ar.core;

import android.graphics.Rect;
import android.media.Image;
import com.google.ar.core.dependencies.b;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

class ArImage extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Session f67666a;

    /* renamed from: b  reason: collision with root package name */
    private final long f67667b;

    /* renamed from: c  reason: collision with root package name */
    long f67668c;

    ArImage(Session session, long j10) {
        this.f67666a = session;
        this.f67668c = j10;
        this.f67667b = session.nativeSymbolTableHandle;
    }

    private native void nativeClose(long j10, long j11);

    /* access modifiers changed from: private */
    /* renamed from: nativeGetBuffer */
    public native ByteBuffer e(long j10, long j11, int i10);

    private native int nativeGetFormat(long j10, long j11);

    private native int nativeGetHeight(long j10, long j11);

    private native int nativeGetNumberOfPlanes(long j10, long j11);

    /* access modifiers changed from: private */
    /* renamed from: nativeGetPixelStride */
    public native int d(long j10, long j11, int i10);

    /* access modifiers changed from: private */
    /* renamed from: nativeGetRowStride */
    public native int c(long j10, long j11, int i10);

    private native long nativeGetTimestamp(long j10, long j11);

    private native int nativeGetWidth(long j10, long j11);

    static native void nativeLoadSymbols();

    public final void close() {
        nativeClose(this.f67667b, this.f67668c);
        this.f67668c = 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Session f() {
        return this.f67666a;
    }

    public final Rect getCropRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    public final int getFormat() {
        int nativeGetFormat = nativeGetFormat(this.f67666a.nativeWrapperHandle, this.f67668c);
        if (nativeGetFormat != -1) {
            return nativeGetFormat;
        }
        throw new FatalException("Unknown error in ArImage.getFormat().");
    }

    public final int getHeight() {
        int nativeGetHeight = nativeGetHeight(this.f67666a.nativeWrapperHandle, this.f67668c);
        if (nativeGetHeight != -1) {
            return nativeGetHeight;
        }
        throw new FatalException("Unknown error in ArImage.getHeight().");
    }

    public final Image.Plane[] getPlanes() {
        int nativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.f67666a.nativeWrapperHandle, this.f67668c);
        if (nativeGetNumberOfPlanes != -1) {
            M[] mArr = new M[nativeGetNumberOfPlanes];
            for (int i10 = 0; i10 < nativeGetNumberOfPlanes; i10++) {
                mArr[i10] = new M(this, this.f67668c, i10);
            }
            return mArr;
        }
        throw new FatalException("Unknown error in ArImage.getPlanes().");
    }

    public final long getTimestamp() {
        long nativeGetTimestamp = nativeGetTimestamp(this.f67666a.nativeWrapperHandle, this.f67668c);
        if (nativeGetTimestamp != -1) {
            return nativeGetTimestamp;
        }
        throw new FatalException("Unknown error in ArImage.getTimestamp().");
    }

    public final int getWidth() {
        int nativeGetWidth = nativeGetWidth(this.f67666a.nativeWrapperHandle, this.f67668c);
        if (nativeGetWidth != -1) {
            return nativeGetWidth;
        }
        throw new FatalException("Unknown error in ArImage.getWidth().");
    }

    public final void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    public final void setTimestamp(long j10) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}
