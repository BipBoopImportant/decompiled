package Yl;

import XH.x;
import android.net.Uri;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LYl/c;", "LTl/c;", "LYl/b;", "linkItRepository", "<init>", "(LYl/b;)V", "Landroid/net/Uri;", "uri", "LXH/x;", "LTl/b;", "a", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "LYl/b;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements Tl.c {

    /* renamed from: a  reason: collision with root package name */
    private final b f89308a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appfoundation.linkit.impl.domain.ResolveLinkItUseCaseImpl", f = "ResolveLinkItUseCaseImpl.kt", l = {16}, m = "invoke-gIAlu-s")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f89309c;

        /* renamed from: d  reason: collision with root package name */
        Object f89310d;

        /* renamed from: e  reason: collision with root package name */
        Object f89311e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f89312f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f89313g;

        /* renamed from: h  reason: collision with root package name */
        int f89314h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f89313g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89312f = obj;
            this.f89314h |= Integer.MIN_VALUE;
            Object a10 = this.f89313g.a((Uri) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public c(b bVar) {
        C17542s.j(bVar, "linkItRepository");
        this.f89308a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(android.net.Uri r6, dI.C17164e<? super XH.x<Tl.b>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Yl.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Yl.c$a r0 = (Yl.c.a) r0
            int r1 = r0.f89314h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89314h = r1
            goto L_0x0018
        L_0x0013:
            Yl.c$a r0 = new Yl.c$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f89312f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f89314h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f89311e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f89310d
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r6 = r0.f89309c
            Yl.c r6 = (Yl.c) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Yl.b r1 = r5.f89308a
            r0.f89309c = r5
            r0.f89310d = r6
            r0.f89311e = r7
            r0.f89314h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            Yl.b$a r1 = (Yl.b.a) r1
            boolean r6 = r1 instanceof Yl.b.a.C1915b
            if (r6 == 0) goto L_0x006d
            XH.x$a r6 = XH.x.f139812b
            Tl.b r6 = new Tl.b
            Yl.b$a$b r1 = (Yl.b.a.C1915b) r1
            android.net.Uri r7 = r1.b()
            android.net.Uri r0 = r1.a()
            r6.<init>(r7, r0)
            java.lang.Object r6 = XH.x.b(r6)
            goto L_0x0086
        L_0x006d:
            boolean r6 = r1 instanceof Yl.b.a.C1914a
            if (r6 == 0) goto L_0x0087
            XH.x$a r6 = XH.x.f139812b
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            Yl.b$a$a r1 = (Yl.b.a.C1914a) r1
            java.lang.String r7 = r1.a()
            r6.<init>(r7)
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0086:
            return r6
        L_0x0087:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Yl.c.a(android.net.Uri, dI.e):java.lang.Object");
    }
}
