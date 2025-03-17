package oy;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import py.b;
import ry.C15006a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Loy/a;", "Lry/a;", "Lpy/b;", "roomRemoteDataSource", "<init>", "(Lpy/b;)V", "", "roomId", "LXH/x;", "Lsy/c;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lpy/b;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oy.a  reason: case insensitive filesystem */
public final class C14901a implements C15006a {

    /* renamed from: a  reason: collision with root package name */
    private final b f130163a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.room.impl.data.RoomRepositoryImpl", f = "RoomRepositoryImpl.kt", l = {21}, m = "getRoom-gIAlu-s")
    /* renamed from: oy.a$a  reason: collision with other inner class name */
    static final class C3205a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f130164c;

        /* renamed from: d  reason: collision with root package name */
        Object f130165d;

        /* renamed from: e  reason: collision with root package name */
        Object f130166e;

        /* renamed from: f  reason: collision with root package name */
        Object f130167f;

        /* renamed from: g  reason: collision with root package name */
        Object f130168g;

        /* renamed from: h  reason: collision with root package name */
        int f130169h;

        /* renamed from: i  reason: collision with root package name */
        int f130170i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f130171j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C14901a f130172k;

        /* renamed from: l  reason: collision with root package name */
        int f130173l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3205a(C14901a aVar, C17164e<? super C3205a> eVar) {
            super(eVar);
            this.f130172k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f130171j = obj;
            this.f130173l |= Integer.MIN_VALUE;
            Object a10 = this.f130172k.a((String) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C14901a(b bVar) {
        C17542s.j(bVar, "roomRemoteDataSource");
        this.f130163a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super XH.x<sy.c>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof oy.C14901a.C3205a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            oy.a$a r0 = (oy.C14901a.C3205a) r0
            int r1 = r0.f130173l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f130173l = r1
            goto L_0x0018
        L_0x0013:
            oy.a$a r0 = new oy.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f130171j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f130173l
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r6 = r0.f130168g
            oy.a r6 = (oy.C14901a) r6
            java.lang.Object r6 = r0.f130167f
            oy.a r6 = (oy.C14901a) r6
            java.lang.Object r6 = r0.f130166e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f130165d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f130164c
            oy.a r6 = (oy.C14901a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x0068
        L_0x003d:
            r6 = move-exception
            goto L_0x0073
        L_0x003f:
            r6 = move-exception
            goto L_0x007e
        L_0x0041:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0049:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            py.b r1 = r5.f130163a     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f130164c = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f130165d = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f130166e = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f130167f = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f130168g = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r7 = 0
            r0.f130169h = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f130170i = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f130173l = r4     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r1 = r1.a(r6, r0)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            com.ingka.ikea.room.impl.data.remote.RoomRemote r1 = (com.ingka.ikea.room.impl.data.remote.RoomRemote) r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            sy.c r6 = r1.b()     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x007d
        L_0x0073:
            XH.x$a r7 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x007d:
            return r6
        L_0x007e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oy.C14901a.a(java.lang.String, dI.e):java.lang.Object");
    }
}
