package com.google.ar.core;

import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.lang.ref.WeakReference;
import java.util.function.BiConsumer;

public class ResolveAnchorOnRooftopFuture extends FutureImpl {

    static class CallbackWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f67714a;

        /* renamed from: b  reason: collision with root package name */
        private final long f67715b;

        /* renamed from: c  reason: collision with root package name */
        private final BiConsumer f67716c;

        public CallbackWrapper(Session session, BiConsumer biConsumer) {
            this.f67714a = new WeakReference(session);
            this.f67715b = session.nativeSymbolTableHandle;
            this.f67716c = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(long j10, int i10) {
            Session session = (Session) this.f67714a.get();
            if (session != null) {
                this.f67716c.accept(ResolveAnchorOnRooftopFuture.makeAnchor(j10, session), Anchor.RooftopAnchorState.forNumber(i10));
                return;
            }
            this.f67716c.accept((Object) null, Anchor.RooftopAnchorState.ERROR_INTERNAL);
            if (j10 != 0) {
                Anchor.nativeReleaseAnchor(this.f67715b, j10);
            }
        }
    }

    ResolveAnchorOnRooftopFuture(Session session, long j10, long j11) {
        super(session, j10, j11);
    }

    /* access modifiers changed from: private */
    public static Anchor makeAnchor(long j10, Session session) {
        if (j10 != 0) {
            return new Anchor(j10, session);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public Anchor getResultAnchor() {
        return makeAnchor(nativeGetResultAnchor(this.session.nativeWrapperHandle, this.nativeFuture), this.session);
    }

    public Anchor.RooftopAnchorState getResultRooftopAnchorState() {
        return Anchor.RooftopAnchorState.forNumber(nativeGetResultRooftopAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    /* access modifiers changed from: package-private */
    public native long nativeGetResultAnchor(long j10, long j11);

    /* access modifiers changed from: package-private */
    public native int nativeGetResultRooftopAnchorState(long j10, long j11);
}
