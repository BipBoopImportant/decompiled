package h6;

import HJ.C15854t;
import Y5.a;
import dI.C17164e;
import g6.C7886n;
import g6.C7889q;
import g6.C7890r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\tH@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\t*\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u0006*\u00060\u0014j\u0002`\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lg6/n$a;", "", "line", "b", "(Lg6/n$a;Ljava/lang/String;)Lg6/n$a;", "LY5/a$b;", "LXH/N;", "a", "(LY5/a$b;)V", "Lg6/r;", "LWK/e;", "e", "(Lg6/r;LdI/e;)Ljava/lang/Object;", "Lg6/n;", "other", "d", "(Lg6/n;Lg6/n;)Lg6/n;", "Lg6/q;", "f", "(Lg6/q;)Lg6/r;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "c", "(Ljava/lang/AutoCloseable;)V", "coil-network-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: h6.e  reason: case insensitive filesystem */
public final class C7936e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.network.internal.UtilsKt", f = "utils.kt", l = {31}, m = "readBuffer")
    /* renamed from: h6.e$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f51653c;

        /* renamed from: d  reason: collision with root package name */
        Object f51654d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f51655e;

        /* renamed from: f  reason: collision with root package name */
        int f51656f;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f51655e = obj;
            this.f51656f |= Integer.MIN_VALUE;
            return C7936e.e((C7890r) null, this);
        }
    }

    public static final void a(a.b bVar) {
        try {
            bVar.k();
        } catch (Exception unused) {
        }
    }

    public static final C7886n.a b(C7886n.a aVar, String str) {
        int r02 = C15854t.r0(str, ':', 0, false, 6, (Object) null);
        if (r02 != -1) {
            String substring = str.substring(0, r02);
            C17542s.i(substring, "substring(...)");
            String obj = C15854t.z1(substring).toString();
            String substring2 = str.substring(r02 + 1);
            C17542s.i(substring2, "substring(...)");
            aVar.a(obj, substring2);
            return aVar;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    public static final void c(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final C7886n d(C7886n nVar, C7886n nVar2) {
        C7886n.a d10 = nVar.d();
        for (Map.Entry next : nVar2.b().entrySet()) {
            d10.d((String) next.getKey(), (List) next.getValue());
        }
        return d10.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(g6.C7890r r4, dI.C17164e<? super WK.C16770e> r5) {
        /*
            boolean r0 = r5 instanceof h6.C7936e.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            h6.e$a r0 = (h6.C7936e.a) r0
            int r1 = r0.f51656f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51656f = r1
            goto L_0x0018
        L_0x0013:
            h6.e$a r0 = new h6.e$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f51655e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f51656f
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f51654d
            WK.e r4 = (WK.C16770e) r4
            java.lang.Object r0 = r0.f51653c
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            XH.y.b(r5)     // Catch:{ all -> 0x0031 }
            goto L_0x0052
        L_0x0031:
            r4 = move-exception
            goto L_0x005a
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            XH.y.b(r5)
            WK.e r5 = new WK.e     // Catch:{ all -> 0x0057 }
            r5.<init>()     // Catch:{ all -> 0x0057 }
            r0.f51653c = r4     // Catch:{ all -> 0x0057 }
            r0.f51654d = r5     // Catch:{ all -> 0x0057 }
            r0.f51656f = r3     // Catch:{ all -> 0x0057 }
            java.lang.Object r0 = r4.A(r5, r0)     // Catch:{ all -> 0x0057 }
            if (r0 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r4
            r4 = r5
        L_0x0052:
            r5 = 0
            lI.C17553a.a(r0, r5)
            return r4
        L_0x0057:
            r5 = move-exception
            r0 = r4
            r4 = r5
        L_0x005a:
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r5 = move-exception
            lI.C17553a.a(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.C7936e.e(g6.r, dI.e):java.lang.Object");
    }

    public static final C7890r f(C7889q qVar) {
        C7890r c10 = qVar.c();
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("body == null");
    }
}
