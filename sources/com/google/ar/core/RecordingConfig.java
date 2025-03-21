package com.google.ar.core;

import android.net.Uri;

public class RecordingConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected RecordingConfig() {
        this.session = null;
        this.nativeHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    private native void nativeAddTrack(long j10, long j11, long j12);

    private static native long nativeCreateRecordingConfig(long j10);

    private static native void nativeDestroyRecordingConfig(long j10, long j11);

    private native boolean nativeGetAutoStopOnPause(long j10, long j11);

    private native String nativeGetMp4DatasetFilePath(long j10, long j11);

    private native String nativeGetMp4DatasetUri(long j10, long j11);

    private native int nativeGetRecordingRotation(long j10, long j11);

    private native void nativeSetAutoStopOnPause(long j10, long j11, boolean z10);

    private native void nativeSetMp4DatasetFilePath(long j10, long j11, String str);

    private native void nativeSetMp4DatasetUri(long j10, long j11, String str);

    private native void nativeSetRecordingRotation(long j10, long j11, int i10);

    public RecordingConfig addTrack(Track track) {
        nativeAddTrack(this.session.nativeWrapperHandle, this.nativeHandle, track.nativeHandle);
        return this;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyRecordingConfig(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public boolean getAutoStopOnPause() {
        return nativeGetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public String getMp4DatasetFilePath() {
        return nativeGetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Uri getMp4DatasetUri() {
        String nativeGetMp4DatasetUri = nativeGetMp4DatasetUri(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetMp4DatasetUri == null) {
            return null;
        }
        return Uri.parse(nativeGetMp4DatasetUri);
    }

    public int getRecordingRotation() {
        return nativeGetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public RecordingConfig setAutoStopOnPause(boolean z10) {
        nativeSetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle, z10);
        return this;
    }

    @Deprecated
    public RecordingConfig setMp4DatasetFilePath(String str) {
        nativeSetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    public RecordingConfig setMp4DatasetUri(Uri uri) {
        nativeSetMp4DatasetUri(this.session.nativeWrapperHandle, this.nativeHandle, uri.toString());
        return this;
    }

    public RecordingConfig setRecordingRotation(int i10) {
        nativeSetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle, i10);
        return this;
    }

    public RecordingConfig(Session session2) {
        this.session = session2;
        this.nativeHandle = nativeCreateRecordingConfig(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
