package com.google.ar.core;

class FutureImpl implements Future {
    final long nativeCallbackContext;
    final long nativeFuture;
    final long nativeSymbolTableHandle;
    final Session session;

    FutureImpl(Session session2, long j10, long j11) {
        this.session = session2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        this.nativeFuture = j10;
        this.nativeCallbackContext = j11;
    }

    static native void nativeReleaseFuture(long j10, long j11);

    public boolean cancel() {
        return nativeCancel(this.session.nativeWrapperHandle, this.nativeFuture, this.nativeCallbackContext);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeReleaseFuture(this.nativeSymbolTableHandle, this.nativeFuture);
        super.finalize();
    }

    public FutureState getState() {
        return FutureState.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    /* access modifiers changed from: package-private */
    public native boolean nativeCancel(long j10, long j11, long j12);

    /* access modifiers changed from: package-private */
    public native int nativeGetState(long j10, long j11);
}
