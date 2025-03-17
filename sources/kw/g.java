package kw;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import cw.d;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkw/g;", "Lkw/f;", "Lcw/d;", "messageCenterRepository", "Lkw/d;", "getContentUriUseCase", "<init>", "(Lcw/d;Lkw/d;)V", "LTJ/g;", "", "Lkw/a;", "invoke", "()LTJ/g;", "a", "Lcw/d;", "b", "Lkw/d;", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f25232a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final d f25233b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcw/f;", "list", "Lkw/a;", "<anonymous>", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.messaging.impl.domain.GetContextualWhatsNewLinksUseCaseImpl$invoke$1", f = "GetContextualWhatsNewLinksUseCase.kt", l = {49}, m = "invokeSuspend")
    static final class a extends l implements p<List<? extends cw.f>, C17164e<? super List<? extends a>>, Object> {

        /* renamed from: A  reason: collision with root package name */
        /* synthetic */ Object f25234A;

        /* renamed from: B  reason: collision with root package name */
        final /* synthetic */ g f25235B;

        /* renamed from: c  reason: collision with root package name */
        Object f25236c;

        /* renamed from: d  reason: collision with root package name */
        Object f25237d;

        /* renamed from: e  reason: collision with root package name */
        Object f25238e;

        /* renamed from: f  reason: collision with root package name */
        Object f25239f;

        /* renamed from: g  reason: collision with root package name */
        Object f25240g;

        /* renamed from: h  reason: collision with root package name */
        Object f25241h;

        /* renamed from: i  reason: collision with root package name */
        Object f25242i;

        /* renamed from: j  reason: collision with root package name */
        Object f25243j;

        /* renamed from: k  reason: collision with root package name */
        Object f25244k;

        /* renamed from: l  reason: collision with root package name */
        Object f25245l;

        /* renamed from: m  reason: collision with root package name */
        Object f25246m;

        /* renamed from: n  reason: collision with root package name */
        Object f25247n;

        /* renamed from: o  reason: collision with root package name */
        Object f25248o;

        /* renamed from: p  reason: collision with root package name */
        Object f25249p;

        /* renamed from: q  reason: collision with root package name */
        Object f25250q;

        /* renamed from: r  reason: collision with root package name */
        Object f25251r;

        /* renamed from: s  reason: collision with root package name */
        int f25252s;

        /* renamed from: t  reason: collision with root package name */
        int f25253t;

        /* renamed from: u  reason: collision with root package name */
        int f25254u;

        /* renamed from: v  reason: collision with root package name */
        int f25255v;

        /* renamed from: w  reason: collision with root package name */
        int f25256w;

        /* renamed from: x  reason: collision with root package name */
        int f25257x;

        /* renamed from: y  reason: collision with root package name */
        int f25258y;

        /* renamed from: z  reason: collision with root package name */
        int f25259z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f25235B = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f25235B, eVar);
            aVar.f25234A = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(List<cw.f> list, C17164e<? super List<a>> eVar) {
            return ((a) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0130  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0142  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f25259z
                r4 = 1
                if (r2 == 0) goto L_0x006b
                if (r2 != r4) goto L_0x0063
                int r2 = r0.f25254u
                int r6 = r0.f25253t
                int r7 = r0.f25252s
                java.lang.Object r8 = r0.f25251r
                android.net.Uri r8 = (android.net.Uri) r8
                java.lang.Object r8 = r0.f25250q
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r8 = r0.f25249p
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r0.f25248o
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r9 = r0.f25247n
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r9 = r0.f25246m
                cw.f r9 = (cw.f) r9
                java.lang.Object r9 = r0.f25243j
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r0.f25242i
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.lang.Object r11 = r0.f25241h
                java.util.Collection r11 = (java.util.Collection) r11
                java.lang.Object r12 = r0.f25240g
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.lang.Object r13 = r0.f25239f
                kw.g r13 = (kw.g) r13
                java.lang.Object r14 = r0.f25238e
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.lang.Object r15 = r0.f25237d
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.lang.Object r3 = r0.f25236c
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r4 = r0.f25234A
                java.util.List r4 = (java.util.List) r4
                XH.y.b(r20)
                r5 = r6
                r16 = r15
                r6 = r1
                r15 = r14
                r1 = 1
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r2
                r2 = r20
                goto L_0x0122
            L_0x0063:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x006b:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f25234A
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L_0x0156
                r3 = r2
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r6 = r3.iterator()
            L_0x0080:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x009d
                java.lang.Object r7 = r6.next()
                r8 = r7
                cw.f r8 = (cw.f) r8
                java.lang.String r9 = r8.c()
                if (r9 == 0) goto L_0x0080
                int r8 = r8.d()
                if (r8 != 0) goto L_0x0080
                r4.add(r7)
                goto L_0x0080
            L_0x009d:
                kw.g r6 = r0.f25235B
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r8 = r4.iterator()
                r15 = r3
                r3 = r4
                r10 = r3
                r12 = r10
                r14 = r12
                r13 = r6
                r11 = r7
                r9 = r8
                r6 = 0
                r7 = 0
                r4 = r2
                r2 = 0
            L_0x00b4:
                boolean r8 = r9.hasNext()
                if (r8 == 0) goto L_0x0149
                java.lang.Object r8 = r9.next()
                r5 = r8
                cw.f r5 = (cw.f) r5
                r17 = r1
                java.lang.String r1 = r5.c()
                if (r1 == 0) goto L_0x013b
                r20 = r2
                android.net.Uri r2 = android.net.Uri.parse(r1)
                r18 = r6
                kw.d r6 = r13.f25233b
                r0.f25234A = r4
                r0.f25236c = r3
                r0.f25237d = r15
                r0.f25238e = r14
                r0.f25239f = r13
                r0.f25240g = r12
                r0.f25241h = r11
                r0.f25242i = r10
                r0.f25243j = r9
                r0.f25244k = r8
                r0.f25245l = r8
                r0.f25246m = r5
                r0.f25247n = r1
                r0.f25248o = r1
                r0.f25249p = r1
                r0.f25250q = r1
                r0.f25251r = r2
                r0.f25252s = r7
                r5 = r18
                r0.f25253t = r5
                r8 = r20
                r0.f25254u = r8
                r20 = r1
                r1 = 0
                r0.f25255v = r1
                r0.f25256w = r1
                r0.f25257x = r1
                r0.f25258y = r1
                r1 = 1
                r0.f25259z = r1
                java.lang.Object r2 = r6.a(r2, r0)
                r6 = r17
                if (r2 != r6) goto L_0x0118
                return r6
            L_0x0118:
                r16 = r15
                r15 = r14
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r20
            L_0x0122:
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L_0x0130
                kw.a r1 = new kw.a
                android.net.Uri r2 = android.net.Uri.parse(r2)
                r1.<init>(r9, r2)
                goto L_0x0131
            L_0x0130:
                r1 = 0
            L_0x0131:
                r2 = r8
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r15
                r15 = r16
                goto L_0x0140
            L_0x013b:
                r8 = r2
                r5 = r6
                r6 = r17
                r1 = 0
            L_0x0140:
                if (r1 == 0) goto L_0x0145
                r11.add(r1)
            L_0x0145:
                r1 = r6
                r6 = r5
                goto L_0x00b4
            L_0x0149:
                java.util.List r11 = (java.util.List) r11
                if (r11 == 0) goto L_0x0156
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.List r1 = YH.C16877v.m0(r11)
                if (r1 == 0) goto L_0x0156
                goto L_0x015a
            L_0x0156:
                java.util.List r1 = YH.C16877v.n()
            L_0x015a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kw.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g(d dVar, d dVar2) {
        C17542s.j(dVar, "messageCenterRepository");
        C17542s.j(dVar2, "getContentUriUseCase");
        this.f25232a = dVar;
        this.f25233b = dVar2;
    }

    public C16532g<List<a>> invoke() {
        return C16534i.N(this.f25232a.a(), new a(this, (C17164e<? super a>) null));
    }
}
