package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.function.Consumer;

public class VpsAvailabilityFuture extends FutureImpl {

    static class CallbackWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final Consumer f67732a;

        public CallbackWrapper(Consumer consumer) {
            this.f67732a = consumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(int i10) {
            this.f67732a.accept(VpsAvailability.forNumber(i10));
        }
    }

    VpsAvailabilityFuture(Session session, long j10, long j11) {
        super(session, j10, j11);
    }

    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public VpsAvailability getResult() {
        return VpsAvailability.forNumber(nativeGetResult(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    /* access modifiers changed from: package-private */
    public native int nativeGetResult(long j10, long j11);
}
