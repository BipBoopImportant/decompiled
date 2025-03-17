package xG;

import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.platform.C5113j1;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n1.C5626f;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import t0.C5938c;
import t0.x;
import z1.C6271a;
import zG.C18749c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001aS\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "hasFocus", "", "searchInput", "Lkotlin/Function1;", "LXH/N;", "onSearch", "i", "(Landroidx/compose/ui/d;ZLjava/lang/String;LnI/l;LU0/m;II)V", "", "recentSearchTerms", "searchSuggestions", "LzG/c;", "onEvent", "l", "(Landroidx/compose/ui/d;ZLjava/util/List;Ljava/util/List;LnI/l;LU0/m;II)V", "suggestion", "Lkotlin/Function0;", "onClick", "q", "(Ljava/lang/String;LnI/a;LU0/m;I)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchDrawerKt$SearchDrawer$1$1", f = "SearchDrawer.kt", l = {73}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152142c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18572a f152143d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f152144e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C18572a aVar, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f152143d = aVar;
            this.f152144e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f152143d, this.f152144e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f152142c;
            if (i10 == 0) {
                y.b(obj);
                C18572a aVar = this.f152143d;
                String str = this.f152144e;
                this.f152142c = 1;
                if (aVar.C(str, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchDrawerKt$SearchDrawer$2$1$1", f = "SearchDrawer.kt", l = {85}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152145c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18572a f152146d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C18572a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f152146d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f152146d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f152145c;
            if (i10 == 0) {
                y.b(obj);
                C18572a aVar = this.f152146d;
                this.f152145c = 1;
                if (aVar.i(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchDrawerKt$SearchDrawer$2$1$2", f = "SearchDrawer.kt", l = {88}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152147c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18572a f152148d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C18749c f152149e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C18572a aVar, C18749c cVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f152148d = aVar;
            this.f152149e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f152148d, this.f152149e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f152147c;
            if (i10 == 0) {
                y.b(obj);
                C18572a aVar = this.f152148d;
                String a10 = ((C18749c.C4330c) this.f152149e).a();
                this.f152147c = 1;
                if (aVar.C(a10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements nI.q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<String> f152150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C18749c, C16807N> f152151b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements C17631a<C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17642l<C18749c, C16807N> f152152a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f152153b;

            a(C17642l<? super C18749c, C16807N> lVar, String str) {
                this.f152152a = lVar;
                this.f152153b = str;
            }

            public final void a() {
                this.f152152a.invoke(new C18749c.b(this.f152153b));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class b extends C17544u implements C17642l {

            /* renamed from: c  reason: collision with root package name */
            public static final b f152154c = new b();

            public b() {
                super(1);
            }

            /* renamed from: a */
            public final Void invoke(String str) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class c extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f152155c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f152156d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(C17642l lVar, List list) {
                super(1);
                this.f152155c = lVar;
                this.f152156d = list;
            }

            public final Object a(int i10) {
                return this.f152155c.invoke(this.f152156d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
        /* renamed from: xG.q$d$d  reason: collision with other inner class name */
        public static final class C4322d extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f152157c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l f152158d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4322d(List list, C17642l lVar) {
                super(4);
                this.f152157c = list;
                this.f152158d = lVar;
            }

            public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (mVar.V(cVar) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= mVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 147) != 146 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    String str = (String) this.f152157c.get(i10);
                    mVar.W(632555222);
                    mVar.W(2098616229);
                    boolean V10 = mVar.V(this.f152158d) | mVar.V(str);
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new a(this.f152158d, str);
                        mVar.u(D10);
                    }
                    mVar.P();
                    q.q(str, (C17631a) D10, mVar, 0);
                    mVar.P();
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        d(List<String> list, C17642l<? super C18749c, C16807N> lVar) {
            this.f152150a = list;
            this.f152151b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(List list, C17642l lVar, x xVar) {
            C17542s.j(xVar, "$this$LazyColumn");
            xVar.e(list.size(), (C17642l<? super Integer, ? extends Object>) null, new c(b.f152154c, list), c1.c.c(-632812321, true, new C4322d(list, lVar)));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(l0.e r18, U0.C4889m r19, int r20) {
            /*
                r17 = this;
                r0 = r17
                r10 = r19
                java.lang.String r1 = "$this$AnimatedVisibility"
                r2 = r18
                kotlin.jvm.internal.C17542s.j(r2, r1)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x001c
                r1 = -1
                java.lang.String r2 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchDrawerContent.<anonymous>.<anonymous> (SearchDrawer.kt:128)"
                r3 = -1389463601(0xffffffffad2e77cf, float:-9.917358E-12)
                r4 = r20
                U0.C4895p.S(r3, r4, r1, r2)
            L_0x001c:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                r2 = 0
                r3 = 1
                r4 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r2, r3, r4)
                androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.d(r1, r2, r3, r4)
                r1 = 0
                rF.b r1 = rF.C15002a.a(r10, r1)
                long r12 = r1.p()
                r15 = 2
                r16 = 0
                r14 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.b.d(r11, r12, r14, r15, r16)
                i1.c$a r2 = i1.C5437c.f24302a
                i1.c$b r6 = r2.k()
                r2 = 1916693215(0x723e6adf, float:3.7716065E30)
                r10.W(r2)
                java.util.List<java.lang.String> r2 = r0.f152150a
                boolean r2 = r10.F(r2)
                nI.l<zG.c, XH.N> r3 = r0.f152151b
                boolean r3 = r10.V(r3)
                r2 = r2 | r3
                java.util.List<java.lang.String> r3 = r0.f152150a
                nI.l<zG.c, XH.N> r4 = r0.f152151b
                java.lang.Object r5 = r19.D()
                if (r2 != 0) goto L_0x0065
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r5 != r2) goto L_0x006d
            L_0x0065:
                xG.r r5 = new xG.r
                r5.<init>(r3, r4)
                r10.u(r5)
            L_0x006d:
                r9 = r5
                nI.l r9 = (nI.C17642l) r9
                r19.P()
                r11 = 196608(0x30000, float:2.75506E-40)
                r12 = 222(0xde, float:3.11E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r10 = r19
                t0.C5937b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x008b
                U0.C4895p.R()
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xG.q.d.b(l0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"xG/q$e", "Lz1/a;", "Lo1/g;", "available", "Lz1/e;", "source", "C1", "(JI)J", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C6271a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5113j1 f152159a;

        e(C5113j1 j1Var) {
            this.f152159a = j1Var;
        }

        public long C1(long j10, int i10) {
            C5113j1 j1Var = this.f152159a;
            if (j1Var != null) {
                j1Var.b();
            }
            return super.C1(j10, i10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(androidx.compose.ui.d r18, boolean r19, java.lang.String r20, nI.C17642l<? super java.lang.String, XH.C16807N> r21, U0.C4889m r22, int r23, int r24) {
        /*
            r3 = r20
            r4 = r21
            r5 = r23
            java.lang.String r0 = "searchInput"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onSearch"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = 1555532445(0x5cb78a9d, float:4.13298621E17)
            r1 = r22
            U0.m r1 = r1.k(r0)
            r2 = r24 & 1
            if (r2 == 0) goto L_0x0023
            r6 = r5 | 6
            r7 = r6
            r6 = r18
            goto L_0x0037
        L_0x0023:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0034
            r6 = r18
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x0031
            r7 = 4
            goto L_0x0032
        L_0x0031:
            r7 = 2
        L_0x0032:
            r7 = r7 | r5
            goto L_0x0037
        L_0x0034:
            r6 = r18
            r7 = r5
        L_0x0037:
            r8 = r24 & 2
            if (r8 == 0) goto L_0x0040
            r7 = r7 | 48
            r14 = r19
            goto L_0x0052
        L_0x0040:
            r8 = r5 & 48
            r14 = r19
            if (r8 != 0) goto L_0x0052
            boolean r8 = r1.b(r14)
            if (r8 == 0) goto L_0x004f
            r8 = 32
            goto L_0x0051
        L_0x004f:
            r8 = 16
        L_0x0051:
            r7 = r7 | r8
        L_0x0052:
            r8 = r24 & 4
            if (r8 == 0) goto L_0x0059
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0069
            boolean r8 = r1.V(r3)
            if (r8 == 0) goto L_0x0066
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r7 = r7 | r8
        L_0x0069:
            r8 = r24 & 8
            r13 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0073
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0071:
            r12 = r7
            goto L_0x0083
        L_0x0073:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0071
            boolean r8 = r1.F(r4)
            if (r8 == 0) goto L_0x007f
            r8 = r13
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r7 = r7 | r8
            goto L_0x0071
        L_0x0083:
            r7 = r12 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0096
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            r1.L()
            r2 = r6
            goto L_0x01a7
        L_0x0096:
            if (r2 == 0) goto L_0x009b
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x009c
        L_0x009b:
            r2 = r6
        L_0x009c:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00a8
            r6 = -1
            java.lang.String r7 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchDrawer (SearchDrawer.kt:65)"
            U0.C4895p.S(r0, r12, r6, r7)
        L_0x00a8:
            r0 = 1890788296(0x70b323c8, float:4.435286E29)
            r1.C(r0)
            m3.a r0 = m3.a.f26247a
            int r6 = m3.a.f26249c
            androidx.lifecycle.k0 r7 = r0.a(r1, r6)
            if (r7 == 0) goto L_0x01c2
            r0 = 0
            androidx.lifecycle.i0$c r9 = f3.a.a(r7, r1, r0)
            r6 = 1729797275(0x671a9c9b, float:7.301333E23)
            r1.C(r6)
            boolean r6 = r7 instanceof androidx.lifecycle.C5212o
            if (r6 == 0) goto L_0x00d0
            r6 = r7
            androidx.lifecycle.o r6 = (androidx.lifecycle.C5212o) r6
            l3.a r6 = r6.getDefaultViewModelCreationExtras()
        L_0x00ce:
            r10 = r6
            goto L_0x00d3
        L_0x00d0:
            l3.a$a r6 = l3.a.C0407a.f25486b
            goto L_0x00ce
        L_0x00d3:
            r16 = 36936(0x9048, float:5.1758E-41)
            r17 = 0
            java.lang.Class<xG.a> r6 = xG.C18572a.class
            r8 = 0
            r11 = r1
            r15 = r12
            r12 = r16
            r13 = r17
            androidx.lifecycle.f0 r6 = m3.c.b(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.U()
            r1.U()
            xG.a r6 = (xG.C18572a) r6
            TJ.P r7 = r6.D()
            r9 = 1
            U0.A1 r7 = U0.p1.b(r7, r8, r1, r0, r9)
            TJ.P r10 = r6.E()
            U0.A1 r10 = U0.p1.b(r10, r8, r1, r0, r9)
            java.lang.Object r11 = r1.D()
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r13 = r12.a()
            if (r11 != r13) goto L_0x0119
            dI.j r11 = dI.C17169j.f142968a
            QJ.Q r11 = U0.P.k(r11, r1)
            U0.B r13 = new U0.B
            r13.<init>(r11)
            r1.u(r13)
            r11 = r13
        L_0x0119:
            U0.B r11 = (U0.B) r11
            QJ.Q r11 = r11.a()
            r13 = -1428701978(0xffffffffaad7bce6, float:-3.8322747E-13)
            r1.W(r13)
            boolean r13 = r1.F(r6)
            r0 = r15 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r0 != r9) goto L_0x0131
            r0 = 1
            goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            r0 = r0 | r13
            java.lang.Object r9 = r1.D()
            if (r0 != 0) goto L_0x013f
            java.lang.Object r0 = r12.a()
            if (r9 != r0) goto L_0x0147
        L_0x013f:
            xG.q$a r9 = new xG.q$a
            r9.<init>(r6, r3, r8)
            r1.u(r9)
        L_0x0147:
            nI.p r9 = (nI.p) r9
            r1.P()
            int r0 = r15 >> 6
            r0 = r0 & 14
            U0.P.g(r3, r9, r1, r0)
            java.lang.Object r0 = r7.getValue()
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r10.getValue()
            r9 = r0
            java.util.List r9 = (java.util.List) r9
            r0 = -1428693132(0xffffffffaad7df74, float:-3.8346724E-13)
            r1.W(r0)
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            r7 = 2048(0x800, float:2.87E-42)
            if (r0 != r7) goto L_0x016f
            r0 = 1
            goto L_0x0170
        L_0x016f:
            r0 = 0
        L_0x0170:
            boolean r7 = r1.F(r11)
            r0 = r0 | r7
            boolean r7 = r1.F(r6)
            r0 = r0 | r7
            java.lang.Object r7 = r1.D()
            if (r0 != 0) goto L_0x0186
            java.lang.Object r0 = r12.a()
            if (r7 != r0) goto L_0x018e
        L_0x0186:
            xG.k r7 = new xG.k
            r7.<init>(r4, r11, r6)
            r1.u(r7)
        L_0x018e:
            r10 = r7
            nI.l r10 = (nI.C17642l) r10
            r1.P()
            r12 = r15 & 126(0x7e, float:1.77E-43)
            r13 = 0
            r6 = r2
            r7 = r19
            r11 = r1
            l(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01a7
            U0.C4895p.R()
        L_0x01a7:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x01c1
            xG.l r8 = new xG.l
            r0 = r8
            r1 = r2
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01c1:
            return
        L_0x01c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.q.i(androidx.compose.ui.d, boolean, java.lang.String, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, Q q10, C18572a aVar, C18749c cVar) {
        C17542s.j(cVar, "event");
        if (cVar instanceof C18749c.b) {
            lVar.invoke(((C18749c.b) cVar).a());
        } else if (C17542s.e(cVar, C18749c.a.f152770a)) {
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new b(aVar, (C17164e<? super b>) null), 3, (Object) null);
        } else if (cVar instanceof C18749c.C4330c) {
            F0 unused2 = C16314k.d(q10, (C17168i) null, (T) null, new c(aVar, cVar, (C17164e<? super c>) null), 3, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(androidx.compose.ui.d dVar, boolean z10, String str, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        i(dVar, z10, str, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void l(androidx.compose.ui.d r34, boolean r35, java.util.List<java.lang.String> r36, java.util.List<java.lang.String> r37, nI.C17642l<? super zG.C18749c, XH.C16807N> r38, U0.C4889m r39, int r40, int r41) {
        /*
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r40
            r0 = -176166819(0xfffffffff57fe85d, float:-3.2440151E32)
            r1 = r39
            U0.m r6 = r1.k(r0)
            r1 = r41 & 1
            r2 = 2
            if (r1 == 0) goto L_0x001c
            r3 = r10 | 6
            r4 = r3
            r3 = r34
            goto L_0x0030
        L_0x001c:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x002d
            r3 = r34
            boolean r4 = r6.V(r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = r2
        L_0x002b:
            r4 = r4 | r10
            goto L_0x0030
        L_0x002d:
            r3 = r34
            r4 = r10
        L_0x0030:
            r5 = r41 & 2
            r15 = 16
            if (r5 == 0) goto L_0x003b
            r4 = r4 | 48
        L_0x0038:
            r11 = r35
            goto L_0x004c
        L_0x003b:
            r11 = r10 & 48
            if (r11 != 0) goto L_0x0038
            r11 = r35
            boolean r12 = r6.b(r11)
            if (r12 == 0) goto L_0x004a
            r12 = 32
            goto L_0x004b
        L_0x004a:
            r12 = r15
        L_0x004b:
            r4 = r4 | r12
        L_0x004c:
            r12 = r41 & 4
            if (r12 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r12 = r10 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0063
            boolean r12 = r6.F(r7)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r12
        L_0x0063:
            r12 = r41 & 8
            if (r12 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r12 = r10 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x007a
            boolean r12 = r6.F(r8)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r12
        L_0x007a:
            r12 = r41 & 16
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0092
        L_0x0083:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0092
            boolean r12 = r6.F(r9)
            if (r12 == 0) goto L_0x008f
            r12 = r14
            goto L_0x0091
        L_0x008f:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r4 = r4 | r12
        L_0x0092:
            r12 = r4 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00a7
            boolean r12 = r6.l()
            if (r12 != 0) goto L_0x009f
            goto L_0x00a7
        L_0x009f:
            r6.L()
            r1 = r3
            r2 = r11
            r11 = r6
            goto L_0x02b4
        L_0x00a7:
            if (r1 == 0) goto L_0x00ae
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r22 = r1
            goto L_0x00b0
        L_0x00ae:
            r22 = r3
        L_0x00b0:
            r1 = 0
            if (r5 == 0) goto L_0x00b6
            r23 = r1
            goto L_0x00b8
        L_0x00b6:
            r23 = r11
        L_0x00b8:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00c4
            r3 = -1
            java.lang.String r5 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchDrawerContent (SearchDrawer.kt:104)"
            U0.C4895p.S(r0, r4, r3, r5)
        L_0x00c4:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.f()
            java.lang.Object r0 = r6.Q(r0)
            n1.f r0 = (n1.C5626f) r0
            U0.I0 r3 = androidx.compose.ui.platform.C5100f0.o()
            java.lang.Object r3 = r6.Q(r3)
            androidx.compose.ui.platform.j1 r3 = (androidx.compose.ui.platform.C5113j1) r3
            r5 = 1565786833(0x5d5402d1, float:9.5481267E17)
            r6.W(r5)
            java.lang.Object r5 = r6.D()
            U0.m$a r24 = U0.C4889m.f14007a
            java.lang.Object r11 = r24.a()
            if (r5 != r11) goto L_0x00f1
            r0.m r5 = r0.l.a()
            r6.u(r5)
        L_0x00f1:
            r26 = r5
            r0.m r26 = (r0.m) r26
            r6.P()
            r5 = 1565789409(0x5d540ce1, float:9.5498969E17)
            r6.W(r5)
            java.lang.Object r5 = r6.D()
            java.lang.Object r11 = r24.a()
            if (r5 != r11) goto L_0x0110
            xG.q$e r5 = new xG.q$e
            r5.<init>(r3)
            r6.u(r5)
        L_0x0110:
            xG.q$e r5 = (xG.q.e) r5
            r6.P()
            rF.b r11 = rF.C15002a.a(r6, r1)
            long r17 = r11.p()
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r22
            androidx.compose.ui.d r25 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r11 = 1565803994(0x5d5445da, float:9.5599196E17)
            r6.W(r11)
            boolean r11 = r6.V(r3)
            boolean r12 = r6.F(r0)
            r11 = r11 | r12
            java.lang.Object r12 = r6.D()
            if (r11 != 0) goto L_0x0144
            java.lang.Object r11 = r24.a()
            if (r12 != r11) goto L_0x014c
        L_0x0144:
            xG.m r12 = new xG.m
            r12.<init>(r3, r0)
            r6.u(r12)
        L_0x014c:
            r31 = r12
            nI.a r31 = (nI.C17631a) r31
            r6.P()
            r32 = 28
            r33 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.b(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r3 = 0
            androidx.compose.ui.d r0 = androidx.compose.ui.input.nestedscroll.a.b(r0, r5, r3, r2, r3)
            r2 = 0
            r5 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r0, r2, r5, r3)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.k()
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r6, r1)
            int r3 = U0.C4883j.a(r6, r1)
            U0.y r11 = r6.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r6, r0)
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r13 = r12.a()
            U0.f r16 = r6.m()
            if (r16 != 0) goto L_0x0199
            U0.C4883j.c()
        L_0x0199:
            r6.I()
            boolean r16 = r6.i()
            if (r16 == 0) goto L_0x01a6
            r6.p(r13)
            goto L_0x01a9
        L_0x01a6:
            r6.t()
        L_0x01a9:
            U0.m r13 = U0.F1.a(r6)
            nI.p r1 = r12.c()
            U0.F1.c(r13, r2, r1)
            nI.p r1 = r12.e()
            U0.F1.c(r13, r11, r1)
            nI.p r1 = r12.b()
            boolean r2 = r13.i()
            if (r2 != 0) goto L_0x01d3
            java.lang.Object r2 = r13.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r11)
            if (r2 != 0) goto L_0x01e1
        L_0x01d3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r13.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r13.w(r2, r1)
        L_0x01e1:
            nI.p r1 = r12.d()
            U0.F1.c(r13, r0, r1)
            s0.h r11 = s0.C5862h.f28810a
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01f7
            if (r23 == 0) goto L_0x01f7
            r12 = r5
            goto L_0x01f8
        L_0x01f7:
            r12 = 0
        L_0x01f8:
            xG.q$d r0 = new xG.q$d
            r0.<init>(r8, r9)
            r1 = 54
            r2 = -1389463601(0xffffffffad2e77cf, float:-9.917358E-12)
            c1.a r17 = c1.c.e(r2, r5, r0, r6, r1)
            r19 = 1572870(0x180006, float:2.20406E-39)
            r20 = 30
            r13 = 0
            r0 = 0
            r1 = 0
            r16 = 0
            r2 = r14
            r14 = r0
            r0 = r15
            r15 = r1
            r18 = r6
            l0.d.e(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = -2075828134(0xffffffff8445605a, float:-2.3201481E-36)
            r6.W(r1)
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x02a0
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r1 = 20
            float r1 = (float) r1
            float r12 = c2.h.B(r1)
            float r0 = (float) r0
            float r14 = c2.h.B(r0)
            r16 = 10
            r17 = 0
            r13 = 0
            r15 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r11, r12, r13, r14, r15, r16, r17)
            r0 = -2075821141(0xffffffff84457bab, float:-2.3214024E-36)
            r6.W(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r4
            if (r0 != r2) goto L_0x024e
            r1 = r5
            goto L_0x024f
        L_0x024e:
            r1 = 0
        L_0x024f:
            java.lang.Object r11 = r6.D()
            if (r1 != 0) goto L_0x025b
            java.lang.Object r1 = r24.a()
            if (r11 != r1) goto L_0x0263
        L_0x025b:
            xG.n r11 = new xG.n
            r11.<init>(r9)
            r6.u(r11)
        L_0x0263:
            r1 = r11
            nI.l r1 = (nI.C17642l) r1
            r6.P()
            r11 = -2075818053(0xffffffff844587bb, float:-2.3219563E-36)
            r6.W(r11)
            if (r0 != r2) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r5 = 0
        L_0x0273:
            java.lang.Object r0 = r6.D()
            if (r5 != 0) goto L_0x027f
            java.lang.Object r2 = r24.a()
            if (r0 != r2) goto L_0x0287
        L_0x027f:
            xG.o r0 = new xG.o
            r0.<init>(r9)
            r6.u(r0)
        L_0x0287:
            r5 = r0
            nI.a r5 = (nI.C17631a) r5
            r6.P()
            int r0 = r4 >> 6
            r0 = r0 & 14
            r11 = r0 | 384(0x180, float:5.38E-43)
            r12 = 0
            r0 = r36
            r2 = r3
            r3 = r5
            r4 = r6
            r5 = r11
            r11 = r6
            r6 = r12
            xG.C18579h.d(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02a1
        L_0x02a0:
            r11 = r6
        L_0x02a1:
            r11.P()
            r11.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02b0
            U0.C4895p.R()
        L_0x02b0:
            r1 = r22
            r2 = r23
        L_0x02b4:
            U0.Y0 r11 = r11.n()
            if (r11 == 0) goto L_0x02cd
            xG.p r12 = new xG.p
            r0 = r12
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r40
            r7 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.a(r12)
        L_0x02cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.q.l(androidx.compose.ui.d, boolean, java.util.List, java.util.List, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar) {
        lVar.invoke(C18749c.a.f152770a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17642l lVar, String str) {
        C17542s.j(str, "searchTerm");
        lVar.invoke(new C18749c.b(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(androidx.compose.ui.d dVar, boolean z10, List list, List list2, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        l(dVar, z10, list, list2, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C5113j1 j1Var, C5626f fVar) {
        if (j1Var != null) {
            j1Var.b();
        }
        fVar.r(true);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(java.lang.String r26, nI.C17631a<XH.C16807N> r27, U0.C4889m r28, int r29) {
        /*
            r0 = r26
            r15 = r27
            r1 = -406372665(0xffffffffe7c73ec7, float:-1.881818E24)
            r2 = r28
            U0.m r13 = r2.k(r1)
            r10 = 6
            r2 = r29 & 6
            if (r2 != 0) goto L_0x001e
            boolean r2 = r13.V(r0)
            if (r2 == 0) goto L_0x001a
            r2 = 4
            goto L_0x001b
        L_0x001a:
            r2 = 2
        L_0x001b:
            r2 = r29 | r2
            goto L_0x0020
        L_0x001e:
            r2 = r29
        L_0x0020:
            r3 = r29 & 48
            r4 = 16
            r5 = 32
            if (r3 != 0) goto L_0x0032
            boolean r3 = r13.F(r15)
            if (r3 == 0) goto L_0x0030
            r3 = r5
            goto L_0x0031
        L_0x0030:
            r3 = r4
        L_0x0031:
            r2 = r2 | r3
        L_0x0032:
            r12 = r2
            r2 = r12 & 19
            r3 = 18
            if (r2 != r3) goto L_0x0047
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x0040
            goto L_0x0047
        L_0x0040:
            r13.L()
            r25 = r13
            goto L_0x01cb
        L_0x0047:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0053
            r2 = -1
            java.lang.String r3 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SuggestionItem (SearchDrawer.kt:155)"
            U0.C4895p.S(r1, r12, r2, r3)
        L_0x0053:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r14 = 0
            r9 = 1
            r8 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r1, r14, r9, r8)
            r2 = -1499241126(0xffffffffa6a3655a, float:-1.1337868E-15)
            r13.W(r2)
            r2 = r12 & 112(0x70, float:1.57E-43)
            r7 = 0
            if (r2 != r5) goto L_0x0069
            r2 = r9
            goto L_0x006a
        L_0x0069:
            r2 = r7
        L_0x006a:
            java.lang.Object r3 = r13.D()
            if (r2 != 0) goto L_0x0078
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0080
        L_0x0078:
            xG.i r3 = new xG.i
            r3.<init>(r15)
            r13.u(r3)
        L_0x0080:
            r20 = r3
            nI.a r20 = (nI.C17631a) r20
            r13.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            float r3 = (float) r10
            float r6 = c2.h.B(r3)
            r8 = 28
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            float r9 = c2.h.B(r3)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.l(r2, r8, r6, r4, r9)
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r4 = r4.f()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$c r6 = r6.l()
            E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r6, r13, r7)
            int r6 = U0.C4883j.a(r13, r7)
            U0.y r8 = r13.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r13, r2)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r14 = r9.a()
            U0.f r18 = r13.m()
            if (r18 != 0) goto L_0x00d9
            U0.C4883j.c()
        L_0x00d9:
            r13.I()
            boolean r18 = r13.i()
            if (r18 == 0) goto L_0x00e6
            r13.p(r14)
            goto L_0x00e9
        L_0x00e6:
            r13.t()
        L_0x00e9:
            U0.m r14 = U0.F1.a(r13)
            nI.p r11 = r9.c()
            U0.F1.c(r14, r4, r11)
            nI.p r4 = r9.e()
            U0.F1.c(r14, r8, r4)
            nI.p r4 = r9.b()
            boolean r8 = r14.i()
            if (r8 != 0) goto L_0x0113
            java.lang.Object r8 = r14.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x0121
        L_0x0113:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r14.u(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.w(r6, r4)
        L_0x0121:
            nI.p r4 = r9.d()
            U0.F1.c(r14, r2, r4)
            s0.N r2 = s0.C5843N.f28726a
            float r2 = (float) r5
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.t(r1, r2)
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.i(r2, r3)
            int r2 = com.sugarcube.common.R.drawable.sc_ic_search
            t1.c r2 = J1.e.c(r2, r13, r7)
            int r3 = OE.n.f113347d2
            java.lang.Object[] r5 = new java.lang.Object[]{r26}
            java.lang.String r3 = J1.j.c(r3, r5, r13, r7)
            rF.b r5 = rF.C15002a.a(r13, r7)
            long r5 = r5.f()
            r8 = 384(0x180, float:5.38E-43)
            r9 = 0
            r11 = r7
            r7 = r13
            r14 = 0
            O0.V.a(r2, r3, r4, r5, r7, r8, r9)
            r2 = 12
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.y(r1, r2)
            s0.C5844O.a(r2, r13, r10)
            tK.v r2 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.w r2 = r2.b(r13, r3)
            tK.c r2 = r2.a()
            N1.Y r20 = r2.b()
            rF.b r2 = rF.C15002a.a(r13, r11)
            long r2 = r2.f()
            S1.C$a r4 = S1.C.f13316b
            S1.C r7 = r4.a()
            r4 = 4
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            r5 = 0
            r6 = 1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r1, r5, r4, r6, r14)
            r4 = r12 & 14
            r5 = 196656(0x30030, float:2.75574E-40)
            r22 = r4 | r5
            r23 = 0
            r24 = 65496(0xffd8, float:9.178E-41)
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r25 = r13
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r26
            r21 = r25
            O0.d1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r25.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01cb
            U0.C4895p.R()
        L_0x01cb:
            U0.Y0 r0 = r25.n()
            if (r0 == 0) goto L_0x01df
            xG.j r1 = new xG.j
            r2 = r26
            r3 = r27
            r4 = r29
            r1.<init>(r2, r3, r4)
            r0.a(r1)
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.q.q(java.lang.String, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        q(str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
