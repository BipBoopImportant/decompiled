package oK;

import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00072\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"LoK/n;", "T", "", "", "resources", "<init>", "(Ljava/util/List;)V", "R", "Lkotlin/Function2;", "LdI/e;", "handler", "a", "(LnI/p;LdI/e;)Ljava/lang/Object;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LSJ/j;", "LSJ/j;", "channel", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.n  reason: case insensitive filesystem */
final class C17721n<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<T> f145409a;

    /* renamed from: b  reason: collision with root package name */
    private final C16434j<T> f145410b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "me.saket.telephoto.subsamplingimage.internal.ResourcePool", f = "PooledImageRegionDecoder.kt", l = {77, 79, 81, 81}, m = "borrow")
    /* renamed from: oK.n$a */
    static final class a<R> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f145411c;

        /* renamed from: d  reason: collision with root package name */
        Object f145412d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f145413e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17721n<T> f145414f;

        /* renamed from: g  reason: collision with root package name */
        int f145415g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17721n<T> nVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f145414f = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f145413e = obj;
            this.f145415g |= Integer.MIN_VALUE;
            return this.f145414f.a((p) null, this);
        }
    }

    public C17721n(List<? extends T> list) {
        C17542s.j(list, "resources");
        this.f145409a = list;
        C16434j<T> b10 = C16437m.b(Integer.MAX_VALUE, (C16428d) null, (C17642l) null, 6, (Object) null);
        for (Object k10 : list) {
            b10.k(k10);
        }
        this.f145410b = b10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> java.lang.Object a(nI.p<? super T, ? super dI.C17164e<? super R>, ? extends java.lang.Object> r10, dI.C17164e<? super R> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof oK.C17721n.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            oK.n$a r0 = (oK.C17721n.a) r0
            int r1 = r0.f145415g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f145415g = r1
            goto L_0x0018
        L_0x0013:
            oK.n$a r0 = new oK.n$a
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f145413e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f145415g
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r7) goto L_0x0055
            if (r2 == r6) goto L_0x0046
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0037
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            java.lang.Object r10 = r0.f145411c
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            XH.y.b(r11)
            goto L_0x00a5
        L_0x0040:
            java.lang.Object r10 = r0.f145411c
            XH.y.b(r11)
            goto L_0x0094
        L_0x0046:
            java.lang.Object r10 = r0.f145412d
            java.lang.Object r2 = r0.f145411c
            oK.n r2 = (oK.C17721n) r2
            XH.y.b(r11)     // Catch:{ all -> 0x0050 }
            goto L_0x0084
        L_0x0050:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x0096
        L_0x0055:
            java.lang.Object r10 = r0.f145412d
            nI.p r10 = (nI.p) r10
            java.lang.Object r2 = r0.f145411c
            oK.n r2 = (oK.C17721n) r2
            XH.y.b(r11)
            goto L_0x0074
        L_0x0061:
            XH.y.b(r11)
            SJ.j<T> r11 = r9.f145410b
            r0.f145411c = r9
            r0.f145412d = r10
            r0.f145415g = r7
            java.lang.Object r11 = r11.j(r0)
            if (r11 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r2 = r9
        L_0x0074:
            r0.f145411c = r2     // Catch:{ all -> 0x0095 }
            r0.f145412d = r11     // Catch:{ all -> 0x0095 }
            r0.f145415g = r6     // Catch:{ all -> 0x0095 }
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch:{ all -> 0x0095 }
            if (r10 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0084:
            SJ.j<T> r2 = r2.f145410b
            r0.f145411c = r11
            r0.f145412d = r3
            r0.f145415g = r5
            java.lang.Object r10 = r2.y(r10, r0)
            if (r10 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r10 = r11
        L_0x0094:
            return r10
        L_0x0095:
            r10 = move-exception
        L_0x0096:
            SJ.j<T> r2 = r2.f145410b
            r0.f145411c = r10
            r0.f145412d = r3
            r0.f145415g = r4
            java.lang.Object r11 = r2.y(r11, r0)
            if (r11 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oK.C17721n.a(nI.p, dI.e):java.lang.Object");
    }

    public final List<T> b() {
        return this.f145409a;
    }
}
