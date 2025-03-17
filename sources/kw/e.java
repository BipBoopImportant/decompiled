package kw;

import android.net.Uri;
import dI.C17164e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007HB¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lkw/e;", "Lkw/d;", "", "LZl/a;", "appLinkMappers", "<init>", "(Ljava/util/Set;)V", "Landroid/net/Uri;", "appLink", "", "a", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "Ljava/util/Set;", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Zl.a> f25221a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.messaging.impl.domain.GetContentUriUseCaseImpl", f = "GetContentUriUseCase.kt", l = {20}, m = "invoke")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f25222c;

        /* renamed from: d  reason: collision with root package name */
        Object f25223d;

        /* renamed from: e  reason: collision with root package name */
        Object f25224e;

        /* renamed from: f  reason: collision with root package name */
        Object f25225f;

        /* renamed from: g  reason: collision with root package name */
        Object f25226g;

        /* renamed from: h  reason: collision with root package name */
        Object f25227h;

        /* renamed from: i  reason: collision with root package name */
        int f25228i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f25229j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ e f25230k;

        /* renamed from: l  reason: collision with root package name */
        int f25231l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f25230k = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f25229j = obj;
            this.f25231l |= Integer.MIN_VALUE;
            return this.f25230k.a((Uri) null, this);
        }
    }

    public e(Set<Zl.a> set) {
        C17542s.j(set, "appLinkMappers");
        this.f25221a = set;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(android.net.Uri r9, dI.C17164e<? super java.lang.String> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kw.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kw.e$a r0 = (kw.e.a) r0
            int r1 = r0.f25231l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f25231l = r1
            goto L_0x0018
        L_0x0013:
            kw.e$a r0 = new kw.e$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f25229j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f25231l
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004a
            if (r3 != r5) goto L_0x0042
            java.lang.Object r9 = r0.f25227h
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r9 = r0.f25226g
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.f25225f
            Zl.a r9 = (Zl.a) r9
            java.lang.Object r9 = r0.f25224e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f25223d
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.Object r9 = r0.f25222c
            kw.e r9 = (kw.e) r9
            XH.y.b(r1)
            goto L_0x0086
        L_0x0042:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004a:
            XH.y.b(r1)
            java.util.Set<Zl.a> r1 = r8.f25221a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r3 = r1.iterator()
        L_0x0055:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0069
            java.lang.Object r6 = r3.next()
            r7 = r6
            Zl.a r7 = (Zl.a) r7
            boolean r7 = r7.a(r9)
            if (r7 == 0) goto L_0x0055
            goto L_0x006a
        L_0x0069:
            r6 = r4
        L_0x006a:
            Zl.a r6 = (Zl.a) r6
            if (r6 == 0) goto L_0x008e
            r0.f25222c = r8
            r0.f25223d = r9
            r0.f25224e = r10
            r0.f25225f = r6
            r0.f25226g = r1
            r0.f25227h = r3
            r10 = 0
            r0.f25228i = r10
            r0.f25231l = r5
            java.lang.Object r1 = r6.b(r9, r0)
            if (r1 != r2) goto L_0x0086
            return r2
        L_0x0086:
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L_0x008e
            java.lang.String r4 = r1.toString()
        L_0x008e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kw.e.a(android.net.Uri, dI.e):java.lang.Object");
    }
}
