package io.ktor.utils.io.internal;

import QJ.C16283A;
import dI.C17164e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.C17631a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/internal/a;", "", "<init>", "()V", "Lkotlin/Function0;", "", "sleepCondition", "e", "(LnI/a;LdI/e;)Ljava/lang/Object;", "LXH/N;", "d", "c", "", "cause", "b", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f143725a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "suspension");
    private volatile /* synthetic */ Object suspension = null;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", l = {24}, m = "sleep")
    /* renamed from: io.ktor.utils.io.internal.a$a  reason: collision with other inner class name */
    static final class C3509a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f143726c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f143727d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f143728e;

        /* renamed from: f  reason: collision with root package name */
        int f143729f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3509a(a aVar, C17164e<? super C3509a> eVar) {
            super(eVar);
            this.f143728e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143727d = obj;
            this.f143729f |= Integer.MIN_VALUE;
            return this.f143728e.d((C17631a<Boolean>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", l = {57}, m = "trySuspend")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        int f143730c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f143731d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f143732e;

        /* renamed from: f  reason: collision with root package name */
        int f143733f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f143732e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143731d = obj;
            this.f143733f |= Integer.MIN_VALUE;
            return this.f143732e.e((C17631a<Boolean>) null, this);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(nI.C17631a<java.lang.Boolean> r7, dI.C17164e<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.internal.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.ktor.utils.io.internal.a$b r0 = (io.ktor.utils.io.internal.a.b) r0
            int r1 = r0.f143733f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143733f = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.internal.a$b r0 = new io.ktor.utils.io.internal.a$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f143731d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143733f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            int r7 = r0.f143730c
            XH.y.b(r8)
            goto L_0x005e
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            XH.y.b(r8)
            r8 = 0
            QJ.A r2 = QJ.J0.b(r8, r4, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f143725a
            boolean r8 = androidx.concurrent.futures.b.a(r5, r6, r8, r2)
            if (r8 == 0) goto L_0x005d
            java.lang.Object r7 = r7.invoke()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x005d
            r0.f143730c = r4
            r0.f143733f = r4
            java.lang.Object r7 = r2.j0(r0)
            if (r7 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r7 = r4
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            if (r7 == 0) goto L_0x0061
            r3 = r4
        L_0x0061:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.a.e(nI.a, dI.e):java.lang.Object");
    }

    public final void b(Throwable th2) {
        C16283A a10 = (C16283A) f143725a.getAndSet(this, (Object) null);
        if (a10 != null) {
            if (th2 != null) {
                a10.g(th2);
            } else {
                a10.l();
            }
        }
    }

    public final void c() {
        C16283A a10 = (C16283A) f143725a.getAndSet(this, (Object) null);
        if (a10 != null) {
            a10.l();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(nI.C17631a<java.lang.Boolean> r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.internal.a.C3509a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.ktor.utils.io.internal.a$a r0 = (io.ktor.utils.io.internal.a.C3509a) r0
            int r1 = r0.f143729f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143729f = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.internal.a$a r0 = new io.ktor.utils.io.internal.a$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f143727d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143729f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f143726c
            io.ktor.utils.io.internal.a r5 = (io.ktor.utils.io.internal.a) r5
            XH.y.b(r6)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            XH.y.b(r6)
            r0.f143726c = r4
            r0.f143729f = r3
            java.lang.Object r6 = r4.e(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r5 = r4
        L_0x0044:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x004f
            XH.N r5 = XH.C16807N.f139792a
            return r5
        L_0x004f:
            r5.c()
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.a.d(nI.a, dI.e):java.lang.Object");
    }
}
