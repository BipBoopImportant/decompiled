package com.google.ar.core;

import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.util.function.BiConsumer;

public class HostCloudAnchorFuture extends FutureImpl {

    static class CallbackWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final BiConsumer f67672a;

        public CallbackWrapper(BiConsumer biConsumer) {
            this.f67672a = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(String str, int i10) {
            this.f67672a.accept(str, Anchor.CloudAnchorState.forNumber(i10));
        }
    }

    HostCloudAnchorFuture(Session session, long j10, long j11) {
        super(session, j10, j11);
    }

    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public String getResultCloudAnchorId() {
        return nativeGetResultCloudAnchorId(this.session.nativeWrapperHandle, this.nativeFuture);
    }

    public Anchor.CloudAnchorState getResultCloudAnchorState() {
        return Anchor.CloudAnchorState.forNumber(nativeGetResultCloudAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    /* access modifiers changed from: package-private */
    public native String nativeGetResultCloudAnchorId(long j10, long j11);

    /* access modifiers changed from: package-private */
    public native int nativeGetResultCloudAnchorState(long j10, long j11);
}
