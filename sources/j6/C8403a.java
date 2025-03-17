package j6;

import GK.C15786e;
import dI.C17164e;
import g6.C7881i;
import g6.C7887o;
import g6.C7889q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;
import nI.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0001\u0003\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lj6/a;", "Lg6/i;", "LGK/e$a;", "callFactory", "c", "(LGK/e$a;)LGK/e$a;", "T", "Lg6/o;", "request", "Lkotlin/Function2;", "Lg6/q;", "LdI/e;", "", "block", "e", "(LGK/e$a;Lg6/o;LnI/p;LdI/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGK/e$a;", "coil-network-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C17604b
/* renamed from: j6.a  reason: case insensitive filesystem */
public final class C8403a implements C7881i {

    /* renamed from: a  reason: collision with root package name */
    private final C15786e.a f54044a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "utils.kt", l = {24, 24, 25}, m = "executeRequest-impl")
    /* renamed from: j6.a$a  reason: collision with other inner class name */
    static final class C0857a<T> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f54045c;

        /* renamed from: d  reason: collision with root package name */
        Object f54046d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f54047e;

        /* renamed from: f  reason: collision with root package name */
        int f54048f;

        C0857a(C17164e<? super C0857a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f54047e = obj;
            this.f54048f |= Integer.MIN_VALUE;
            return C8403a.e((C15786e.a) null, (C7887o) null, (p) null, this);
        }
    }

    private /* synthetic */ C8403a(C15786e.a aVar) {
        this.f54044a = aVar;
    }

    public static final /* synthetic */ C8403a b(C15786e.a aVar) {
        return new C8403a(aVar);
    }

    public static C15786e.a c(C15786e.a aVar) {
        return aVar;
    }

    public static boolean d(C15786e.a aVar, Object obj) {
        return (obj instanceof C8403a) && C17542s.e(aVar, ((C8403a) obj).h());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: nI.p<? super g6.q, ? super dI.e<? super T>, ? extends java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> java.lang.Object e(GK.C15786e.a r8, g6.C7887o r9, nI.p<? super g6.C7889q, ? super dI.C17164e<? super T>, ? extends java.lang.Object> r10, dI.C17164e<? super T> r11) {
        /*
            boolean r0 = r11 instanceof j6.C8403a.C0857a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            j6.a$a r0 = (j6.C8403a.C0857a) r0
            int r1 = r0.f54048f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f54048f = r1
            goto L_0x0018
        L_0x0013:
            j6.a$a r0 = new j6.a$a
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f54047e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f54048f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r8 = r0.f54045c
            java.io.Closeable r8 = (java.io.Closeable) r8
            XH.y.b(r11)     // Catch:{ all -> 0x0034 }
            goto L_0x008d
        L_0x0034:
            r9 = move-exception
            goto L_0x0095
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            java.lang.Object r8 = r0.f54045c
            nI.p r8 = (nI.p) r8
            XH.y.b(r11)
            goto L_0x0077
        L_0x0046:
            java.lang.Object r8 = r0.f54046d
            GK.e$a r8 = (GK.C15786e.a) r8
            java.lang.Object r9 = r0.f54045c
            r10 = r9
            nI.p r10 = (nI.p) r10
            XH.y.b(r11)
            goto L_0x0063
        L_0x0053:
            XH.y.b(r11)
            r0.f54045c = r10
            r0.f54046d = r8
            r0.f54048f = r5
            java.lang.Object r11 = j6.e.h(r9, r0)
            if (r11 != r1) goto L_0x0063
            return r1
        L_0x0063:
            GK.B r11 = (GK.C15774B) r11
            GK.e r8 = r8.b(r11)
            r0.f54045c = r10
            r0.f54046d = r6
            r0.f54048f = r4
            java.lang.Object r11 = j6.C8404b.a(r8, r0)
            if (r11 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r8 = r10
        L_0x0077:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            GK.D r10 = (GK.C15776D) r10     // Catch:{ all -> 0x0091 }
            g6.q r10 = j6.e.g(r10)     // Catch:{ all -> 0x0091 }
            r0.f54045c = r9     // Catch:{ all -> 0x0091 }
            r0.f54048f = r3     // Catch:{ all -> 0x0091 }
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch:{ all -> 0x0091 }
            if (r11 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r8 = r9
        L_0x008d:
            jI.C17416c.a(r8, r6)
            return r11
        L_0x0091:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x0095:
            throw r9     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r10 = move-exception
            jI.C17416c.a(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.C8403a.e(GK.e$a, g6.o, nI.p, dI.e):java.lang.Object");
    }

    public static int f(C15786e.a aVar) {
        return aVar.hashCode();
    }

    public static String g(C15786e.a aVar) {
        return "CallFactoryNetworkClient(callFactory=" + aVar + ')';
    }

    public <T> Object a(C7887o oVar, p<? super C7889q, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super T> eVar) {
        return e(this.f54044a, oVar, pVar, eVar);
    }

    public boolean equals(Object obj) {
        return d(this.f54044a, obj);
    }

    public final /* synthetic */ C15786e.a h() {
        return this.f54044a;
    }

    public int hashCode() {
        return f(this.f54044a);
    }

    public String toString() {
        return g(this.f54044a);
    }
}
