package Ii;

import D4.P;
import Li.b;
import Mi.C10770e;
import Mi.C10774i;
import QJ.C16310i;
import QJ.Q;
import XH.C16807N;
import dI.C17164e;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00013B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u0004\u0018\u00010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH@¢\u0006\u0004\b\u001f\u0010\u0012J%\u0010\"\u001a\u0004\u0018\u00010\u00022\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0016\u0010-\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u00102\u001a\u00020\u00198\u0016XD¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b&\u00101¨\u00064"}, d2 = {"LIi/b;", "LD4/P;", "LIi/a;", "LMi/i;", "LLi/b;", "reviewsRepository", "", "itemNo", "LLi/c;", "sortingData", "retailCode", "languageCode", "<init>", "(LLi/b;Ljava/lang/String;LLi/c;Ljava/lang/String;Ljava/lang/String;)V", "LD4/P$a;", "params", "LD4/P$b;", "n", "(LD4/P$a;LdI/e;)Ljava/lang/Object;", "", "LMi/h;", "reviews", "LXH/N;", "k", "(Ljava/util/List;LMi/h;)V", "", "isReviewsEmpty", "j", "(Ljava/util/List;Z)V", "l", "(LD4/P$a;Z)LIi/a;", "f", "LD4/Q;", "state", "m", "(LD4/Q;)LIi/a;", "b", "LLi/b;", "c", "Ljava/lang/String;", "d", "LLi/c;", "e", "g", "Z", "fetchLocalReviews", "h", "resetPageNumber", "i", "()Z", "keyReuseSupported", "a", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ii.b  reason: case insensitive filesystem */
public final class C10731b extends P<C10730a, C10774i> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f81750j = new a((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f81751k = 8;

    /* renamed from: b  reason: collision with root package name */
    private final b f81752b;

    /* renamed from: c  reason: collision with root package name */
    private final String f81753c;

    /* renamed from: d  reason: collision with root package name */
    private final Li.c f81754d;

    /* renamed from: e  reason: collision with root package name */
    private final String f81755e;

    /* renamed from: f  reason: collision with root package name */
    private final String f81756f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f81757g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f81758h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f81759i = true;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LIi/b$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ii.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LD4/P$b;", "LIi/a;", "LMi/i;", "<anonymous>", "(LQJ/Q;)LD4/P$b;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.ratingsandreviews.data.paging.RatingsPagingSource$load$2", f = "RatingsPagingSource.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: Ii.b$b  reason: collision with other inner class name */
    static final class C1601b extends l implements p<Q, C17164e<? super P.b<C10730a, C10774i>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f81760c;

        /* renamed from: d  reason: collision with root package name */
        Object f81761d;

        /* renamed from: e  reason: collision with root package name */
        Object f81762e;

        /* renamed from: f  reason: collision with root package name */
        Object f81763f;

        /* renamed from: g  reason: collision with root package name */
        int f81764g;

        /* renamed from: h  reason: collision with root package name */
        int f81765h;

        /* renamed from: i  reason: collision with root package name */
        int f81766i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f81767j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C10731b f81768k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ P.a<C10730a> f81769l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1601b(C10731b bVar, P.a<C10730a> aVar, C17164e<? super C1601b> eVar) {
            super(2, eVar);
            this.f81768k = bVar;
            this.f81769l = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1601b bVar = new C1601b(this.f81768k, this.f81769l, eVar);
            bVar.f81767j = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super P.b<C10730a, C10774i>> eVar) {
            return ((C1601b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
            r13 = r0;
            r0 = r15;
            r15 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
            throw r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
            r15 = move-exception;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0020, B:11:0x003c] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0026 A[ExcHandler: CancellationException (r15v15 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:4:0x0020] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f81766i
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 != r3) goto L_0x0029
                java.lang.Object r0 = r14.f81763f
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r14.f81762e
                D4.P$a r0 = (D4.P.a) r0
                java.lang.Object r0 = r14.f81761d
                Ii.b r0 = (Ii.C10731b) r0
                java.lang.Object r0 = r14.f81760c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r14.f81767j
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r15)     // Catch:{ CancellationException -> 0x0026, all -> 0x0024 }
                goto L_0x0057
            L_0x0024:
                r15 = move-exception
                goto L_0x0062
            L_0x0026:
                r15 = move-exception
                goto L_0x0127
            L_0x0029:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0031:
                XH.y.b(r15)
                java.lang.Object r15 = r14.f81767j
                QJ.Q r15 = (QJ.Q) r15
                Ii.b r1 = r14.f81768k
                D4.P$a<Ii.a> r4 = r14.f81769l
                XH.x$a r5 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f81767j = r15     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f81760c = r15     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f81761d = r1     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f81762e = r4     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f81763f = r15     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f81764g = r2     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f81765h = r2     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f81766i = r3     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                java.lang.Object r1 = r1.n(r4, r14)     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                if (r1 != r0) goto L_0x0055
                return r0
            L_0x0055:
                r0 = r15
                r15 = r1
            L_0x0057:
                D4.P$b r15 = (D4.P.b) r15     // Catch:{ CancellationException -> 0x0026, all -> 0x0024 }
                java.lang.Object r15 = XH.x.b(r15)     // Catch:{ CancellationException -> 0x0026, all -> 0x0024 }
                goto L_0x006c
            L_0x005e:
                r0 = move-exception
                r13 = r0
                r0 = r15
                r15 = r13
            L_0x0062:
                XH.x$a r1 = XH.x.f139812b
                java.lang.Object r15 = XH.y.a(r15)
                java.lang.Object r15 = XH.x.b(r15)
            L_0x006c:
                java.lang.Throwable r1 = XH.x.e(r15)
                if (r1 != 0) goto L_0x0076
                D4.P$b r15 = (D4.P.b) r15
                goto L_0x0126
            L_0x0076:
                qv.e r15 = qv.e.WARN
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0089:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x00a0
                java.lang.Object r6 = r4.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r15, r2)
                if (r7 == 0) goto L_0x0089
                r5.add(r6)
                goto L_0x0089
            L_0x00a0:
                java.util.Iterator r2 = r5.iterator()
                r10 = 0
                r4 = r10
                r5 = r4
            L_0x00a7:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0121
                java.lang.Object r6 = r2.next()
                qv.b r6 = (qv.C11819b) r6
                if (r4 != 0) goto L_0x00c3
                java.lang.String r4 = "Error loading ratings and reviews page"
                java.lang.String r4 = qv.C11818a.a(r4, r1)
                if (r4 != 0) goto L_0x00bf
                goto L_0x0121
            L_0x00bf:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x00c3:
                r11 = r4
                if (r5 != 0) goto L_0x0114
                java.lang.Class r4 = r0.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                r7 = 2
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r10, r7, r10)
                r8 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r8, r10, r7, r10)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00e5
                goto L_0x00eb
            L_0x00e5:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00eb:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00fe
                java.lang.String r5 = "m"
                goto L_0x0100
            L_0x00fe:
                java.lang.String r5 = "b"
            L_0x0100:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x0114:
                r12 = r5
                r7 = 0
                r4 = r6
                r5 = r15
                r6 = r12
                r8 = r1
                r9 = r11
                r4.a(r5, r6, r7, r8, r9)
                r4 = r11
                r5 = r12
                goto L_0x00a7
            L_0x0121:
                D4.P$b$a r15 = new D4.P$b$a
                r15.<init>(r1)
            L_0x0126:
                return r15
            L_0x0127:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: Ii.C10731b.C1601b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.ratingsandreviews.data.paging.RatingsPagingSource", f = "RatingsPagingSource.kt", l = {56, 79, 92}, m = "loadPage")
    /* renamed from: Ii.b$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f81770c;

        /* renamed from: d  reason: collision with root package name */
        Object f81771d;

        /* renamed from: e  reason: collision with root package name */
        Object f81772e;

        /* renamed from: f  reason: collision with root package name */
        Object f81773f;

        /* renamed from: g  reason: collision with root package name */
        Object f81774g;

        /* renamed from: h  reason: collision with root package name */
        Object f81775h;

        /* renamed from: i  reason: collision with root package name */
        Object f81776i;

        /* renamed from: j  reason: collision with root package name */
        Object f81777j;

        /* renamed from: k  reason: collision with root package name */
        Object f81778k;

        /* renamed from: l  reason: collision with root package name */
        int f81779l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f81780m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C10731b f81781n;

        /* renamed from: o  reason: collision with root package name */
        int f81782o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C10731b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f81781n = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81780m = obj;
            this.f81782o |= Integer.MIN_VALUE;
            return this.f81781n.n((P.a<C10730a>) null, this);
        }
    }

    public C10731b(b bVar, String str, Li.c cVar, String str2, String str3) {
        C17542s.j(bVar, "reviewsRepository");
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "retailCode");
        C17542s.j(str3, "languageCode");
        this.f81752b = bVar;
        this.f81753c = str;
        this.f81754d = cVar;
        this.f81755e = str2;
        this.f81756f = str3;
    }

    private final void j(List<C10774i> list, boolean z10) {
        Locale locale = new Locale(this.f81756f, this.f81755e);
        String displayCountry = locale.getDisplayCountry(locale);
        String str = this.f81755e;
        C17542s.g(displayCountry);
        list.add(new C10770e(str, displayCountry, z10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: Mi.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k(java.util.List<Mi.C10774i> r6, Mi.C10773h r7) {
        /*
            r5 = this;
            Mi.a r0 = r7.a()
            Mi.a r1 = r7.a()
            KJ.c r1 = r1.a()
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.next()
            r3 = r2
            Mi.b r3 = (Mi.C10767b) r3
            java.lang.String r3 = r3.b()
            java.lang.String r4 = r7.c()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x0010
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            Mi.b r2 = (Mi.C10767b) r2
            if (r2 != 0) goto L_0x0040
            Mi.a r7 = r7.a()
            KJ.c r7 = r7.a()
            java.lang.Object r7 = YH.C16877v.w0(r7)
            r2 = r7
            Mi.b r2 = (Mi.C10767b) r2
        L_0x0040:
            Mi.m r7 = new Mi.m
            r7.<init>(r0, r2)
            r6.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ii.C10731b.k(java.util.List, Mi.h):void");
    }

    private final C10730a l(P.a<C10730a> aVar, boolean z10) {
        C10730a a10 = aVar.a();
        if (a10 != null) {
            C10730a aVar2 = a10;
            if (z10) {
                return null;
            }
            int i10 = 1;
            if (this.f81758h) {
                this.f81758h = false;
            } else {
                i10 = 1 + aVar2.b();
            }
            return aVar2.a(i10);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(D4.P.a<Ii.C10730a> r26, dI.C17164e<? super D4.P.b<Ii.C10730a, Mi.C10774i>> r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            boolean r3 = r2 instanceof Ii.C10731b.c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Ii.b$c r3 = (Ii.C10731b.c) r3
            int r4 = r3.f81782o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f81782o = r4
            goto L_0x001e
        L_0x0019:
            Ii.b$c r3 = new Ii.b$c
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f81780m
            java.lang.Object r15 = eI.C17187b.f()
            int r5 = r3.f81782o
            r14 = 0
            r6 = 3
            r13 = 2
            r12 = 1
            if (r5 == 0) goto L_0x00b9
            if (r5 == r12) goto L_0x008c
            if (r5 == r13) goto L_0x0063
            if (r5 != r6) goto L_0x005b
            java.lang.Object r1 = r3.f81776i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r3.f81775h
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r3.f81774g
            kotlin.jvm.internal.K r5 = (kotlin.jvm.internal.K) r5
            java.lang.Object r6 = r3.f81773f
            Ii.a r6 = (Ii.C10730a) r6
            java.lang.Object r6 = r3.f81772e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r3.f81771d
            D4.P$a r6 = (D4.P.a) r6
            java.lang.Object r3 = r3.f81770c
            Ii.b r3 = (Ii.C10731b) r3
            XH.y.b(r4)
            r24 = r3
            r3 = r1
            r1 = r6
            r6 = r5
            r5 = r4
            r4 = r24
            goto L_0x0200
        L_0x005b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0063:
            java.lang.Object r1 = r3.f81778k
            Ii.a r1 = (Ii.C10730a) r1
            java.lang.Object r1 = r3.f81777j
            Mi.h r1 = (Mi.C10773h) r1
            java.lang.Object r1 = r3.f81776i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r3.f81775h
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r3.f81774g
            kotlin.jvm.internal.K r5 = (kotlin.jvm.internal.K) r5
            java.lang.Object r6 = r3.f81773f
            Ii.a r6 = (Ii.C10730a) r6
            java.lang.Object r6 = r3.f81772e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r3.f81771d
            D4.P$a r6 = (D4.P.a) r6
            java.lang.Object r3 = r3.f81770c
            Ii.b r3 = (Ii.C10731b) r3
            XH.y.b(r4)
            goto L_0x01a4
        L_0x008c:
            int r1 = r3.f81779l
            java.lang.Object r2 = r3.f81776i
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r3.f81775h
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r3.f81774g
            kotlin.jvm.internal.K r6 = (kotlin.jvm.internal.K) r6
            java.lang.Object r7 = r3.f81773f
            Ii.a r7 = (Ii.C10730a) r7
            java.lang.Object r8 = r3.f81772e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r3.f81771d
            D4.P$a r9 = (D4.P.a) r9
            java.lang.Object r10 = r3.f81770c
            Ii.b r10 = (Ii.C10731b) r10
            XH.y.b(r4)
            r13 = r5
            r11 = r6
            r12 = r10
            r5 = r1
            r1 = r9
            r24 = r14
            r14 = r2
            r2 = r24
            goto L_0x0122
        L_0x00b9:
            XH.y.b(r4)
            java.lang.Object r4 = r26.a()
            if (r4 == 0) goto L_0x0256
            r11 = r4
            Ii.a r11 = (Ii.C10730a) r11
            kotlin.jvm.internal.K r10 = new kotlin.jvm.internal.K
            r10.<init>()
            java.util.List r9 = YH.C16877v.c()
            boolean r4 = r0.f81757g
            if (r4 == 0) goto L_0x01b8
            Li.b r4 = r0.f81752b
            java.lang.String r5 = r0.f81753c
            Li.c r6 = r0.f81754d
            int r8 = r11.b()
            java.lang.String r7 = r0.f81755e
            java.lang.String r13 = r0.f81756f
            r3.f81770c = r0
            r3.f81771d = r1
            r3.f81772e = r2
            r3.f81773f = r11
            r3.f81774g = r10
            r3.f81775h = r9
            r3.f81776i = r9
            r3.f81779l = r14
            r3.f81782o = r12
            r17 = 5
            r18 = 0
            r19 = 32
            r20 = 0
            r21 = r7
            r7 = r17
            r22 = r9
            r9 = r21
            r23 = r10
            r10 = r18
            r17 = r11
            r11 = r13
            r13 = r12
            r12 = r3
            r13 = r19
            r2 = r14
            r14 = r20
            java.lang.Object r4 = Li.b.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r4 != r15) goto L_0x0117
            return r15
        L_0x0117:
            r8 = r27
            r12 = r0
            r5 = r2
            r7 = r17
            r13 = r22
            r14 = r13
            r11 = r23
        L_0x0122:
            Mi.h r4 = (Mi.C10773h) r4
            java.lang.Object r6 = r1.a()
            Ii.a r6 = (Ii.C10730a) r6
            if (r6 == 0) goto L_0x0135
            int r6 = r6.b()
            if (r6 != 0) goto L_0x0135
            r12.k(r14, r4)
        L_0x0135:
            java.util.List r6 = r4.b()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x01af
            java.lang.Object r6 = r1.a()
            Ii.a r6 = (Ii.C10730a) r6
            if (r6 == 0) goto L_0x0152
            int r9 = r6.b()
            if (r9 != 0) goto L_0x0152
            r9 = 1
            r12.j(r14, r9)
            goto L_0x0153
        L_0x0152:
            r9 = 1
        L_0x0153:
            r12.f81757g = r2
            r12.f81758h = r9
            Li.b r2 = r12.f81752b
            java.lang.String r9 = r12.f81753c
            Li.c r10 = r12.f81754d
            java.lang.String r0 = r12.f81755e
            r16 = r15
            java.lang.String r15 = r12.f81756f
            r3.f81770c = r12
            r3.f81771d = r1
            r3.f81772e = r8
            r3.f81773f = r7
            r3.f81774g = r11
            r3.f81775h = r13
            r3.f81776i = r14
            r3.f81777j = r4
            r3.f81778k = r6
            r3.f81779l = r5
            r4 = 2
            r3.f81782o = r4
            r7 = 5
            r8 = 0
            r17 = 0
            r18 = 16
            r19 = 0
            r4 = r2
            r5 = r9
            r6 = r10
            r9 = r17
            r10 = r0
            r23 = r11
            r11 = r15
            r0 = r12
            r12 = r3
            r22 = r13
            r13 = r18
            r2 = r14
            r14 = r19
            java.lang.Object r4 = Li.b.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15 = r16
            if (r4 != r15) goto L_0x019d
            return r15
        L_0x019d:
            r3 = r0
            r6 = r1
            r1 = r2
            r2 = r22
            r5 = r23
        L_0x01a4:
            Mi.h r4 = (Mi.C10773h) r4
            r0 = r25
            r14 = r1
            r13 = r2
            r12 = r3
            r11 = r5
            r1 = r6
            goto L_0x0207
        L_0x01af:
            r23 = r11
            r0 = r12
            r22 = r13
            r2 = r14
            r0 = r25
            goto L_0x0207
        L_0x01b8:
            r22 = r9
            r23 = r10
            r17 = r11
            r2 = r14
            Li.b r4 = r0.f81752b
            java.lang.String r5 = r0.f81753c
            Li.c r7 = r0.f81754d
            int r8 = r17.b()
            java.lang.String r10 = r0.f81755e
            java.lang.String r11 = r0.f81756f
            r3.f81770c = r0
            r3.f81771d = r1
            r9 = r2
            r2 = r27
            r3.f81772e = r2
            r2 = r17
            r3.f81773f = r2
            r2 = r23
            r3.f81774g = r2
            r14 = r22
            r3.f81775h = r14
            r3.f81776i = r14
            r3.f81779l = r9
            r3.f81782o = r6
            r9 = 5
            r12 = 0
            r13 = 16
            r16 = 0
            r6 = r7
            r7 = r9
            r9 = r12
            r12 = r3
            r3 = r14
            r14 = r16
            java.lang.Object r4 = Li.b.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r4 != r15) goto L_0x01fc
            return r15
        L_0x01fc:
            r6 = r2
            r2 = r3
            r5 = r4
            r4 = r0
        L_0x0200:
            Mi.h r5 = (Mi.C10773h) r5
            r13 = r2
            r14 = r3
            r12 = r4
            r4 = r5
            r11 = r6
        L_0x0207:
            java.util.List r2 = r4.b()
            boolean r2 = r2.isEmpty()
            r11.f144344a = r2
            java.lang.Object r2 = r1.a()
            Ii.a r2 = (Ii.C10730a) r2
            if (r2 == 0) goto L_0x0220
            int r2 = r2.b()
            if (r2 != 0) goto L_0x0220
            goto L_0x0224
        L_0x0220:
            boolean r2 = r12.f81758h
            if (r2 == 0) goto L_0x023c
        L_0x0224:
            boolean r2 = r12.f81757g
            if (r2 == 0) goto L_0x022e
            boolean r2 = r11.f144344a
            r12.j(r14, r2)
            goto L_0x023c
        L_0x022e:
            Mi.c r2 = new Mi.c
            boolean r3 = r11.f144344a
            r2.<init>(r3)
            boolean r2 = r14.add(r2)
            kotlin.coroutines.jvm.internal.b.a(r2)
        L_0x023c:
            java.util.List r2 = r4.b()
            java.util.Collection r2 = (java.util.Collection) r2
            r14.addAll(r2)
            java.util.List r2 = YH.C16877v.a(r13)
            D4.P$b$b r3 = new D4.P$b$b
            boolean r4 = r11.f144344a
            Ii.a r1 = r12.l(r1, r4)
            r4 = 0
            r3.<init>(r2, r4, r1)
            return r3
        L_0x0256:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ii.C10731b.n(D4.P$a, dI.e):java.lang.Object");
    }

    public boolean c() {
        return this.f81759i;
    }

    public Object f(P.a<C10730a> aVar, C17164e<? super P.b<C10730a, C10774i>> eVar) {
        return C16310i.g(eVar.getContext(), new C1601b(this, aVar, (C17164e<? super C1601b>) null), eVar);
    }

    /* renamed from: m */
    public C10730a d(D4.Q<C10730a, C10774i> q10) {
        C10730a a10;
        C17542s.j(q10, "state");
        Integer c10 = q10.c();
        if (c10 == null) {
            return null;
        }
        int intValue = c10.intValue();
        P.b.C0534b<C10730a, C10774i> b10 = q10.b(intValue);
        C10730a p10 = b10 != null ? b10.p() : null;
        P.b.C0534b<C10730a, C10774i> b11 = q10.b(intValue);
        C10730a m10 = b11 != null ? b11.m() : null;
        if (p10 != null && (a10 = p10.a(p10.b() + 1)) != null) {
            return a10;
        }
        if (m10 != null) {
            return m10.a(m10.b() - 1);
        }
        return null;
    }
}
