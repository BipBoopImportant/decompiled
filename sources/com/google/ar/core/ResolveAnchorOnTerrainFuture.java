package com.google.ar.core;

import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.lang.ref.WeakReference;
import java.util.function.BiConsumer;

public class ResolveAnchorOnTerrainFuture extends FutureImpl {

    static class CallbackWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f67717a;

        /* renamed from: b  reason: collision with root package name */
        private final long f67718b;

        /* renamed from: c  reason: collision with root package name */
        private final BiConsumer f67719c;

        public CallbackWrapper(Session session, BiConsumer biConsumer) {
            this.f67717a = new WeakReference(session);
            this.f67718b = session.nativeSymbolTableHandle;
            this.f67719c = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(long j10, int i10) {
            Session session = (Session) this.f67717a.get();
            if (session != null) {
                this.f67719c.accept(ResolveAnchorOnTerrainFuture.makeAnchor(j10, session), Anchor.TerrainAnchorState.forNumber(i10));
                return;
            }
            this.f67719c.accept((Object) null, Anchor.TerrainAnchorState.ERROR_INTERNAL);
            if (j10 != 0) {
                Anchor.nativeReleaseAnchor(this.f67718b, j10);
            }
        }
    }

    ResolveAnchorOnTerrainFuture(Session session, long j10, long j11) {
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

    public Anchor.TerrainAnchorState getResultTerrainAnchorState() {
        return Anchor.TerrainAnchorState.forNumber(nativeGetResultTerrainAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    /* access modifiers changed from: package-private */
    public native long nativeGetResultAnchor(long j10, long j11);

    /* access modifiers changed from: package-private */
    public native int nativeGetResultTerrainAnchorState(long j10, long j11);
}
