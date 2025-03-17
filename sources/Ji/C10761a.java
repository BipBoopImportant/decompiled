package Ji;

import Hi.C10718a;
import Hi.C10719b;
import Il.a;
import Mi.C10772g;
import Mi.C10773h;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import QL.x;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.X;
import com.ingka.ikea.app.ratingsandreviews.data.network.remote.ProductDetailsSummaryRemote;
import com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewsResponseRemote;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJP\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000eH@¢\u0006\u0004\b \u0010\u001dJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b#\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010)R \u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0+0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R&\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0+0/8\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b,\u00102R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0+0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010-R&\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0+0/8\u0016X\u0004¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b%\u00102¨\u00068"}, d2 = {"LJi/a;", "LLi/b;", "LHi/a;", "reviewsEndpoint", "LHi/b;", "writeReviewsEndpoint", "LQJ/M;", "dispatcher", "LIl/a;", "appConfigApi", "LGo/a;", "clientIdentityProvider", "<init>", "(LHi/a;LHi/b;LQJ/M;LIl/a;LGo/a;)V", "", "itemNo", "LLi/c;", "sortingData", "", "pageSize", "pageNumber", "sourceCountryCode", "excludeCountry", "translateTo", "LMi/h;", "c", "(Ljava/lang/String;LLi/c;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LMi/g;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "reviewId", "LXH/N;", "d", "LXH/x;", "LMi/q;", "e", "LHi/a;", "b", "LHi/b;", "LQJ/M;", "LIl/a;", "LGo/a;", "LTJ/B;", "", "f", "LTJ/B;", "_reviewsVotedFor", "LTJ/P;", "g", "LTJ/P;", "()LTJ/P;", "reviewsVotedFor", "h", "_reviewedItemNos", "i", "reviewedItemNos", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ji.a  reason: case insensitive filesystem */
public final class C10761a implements Li.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C10718a f82494a;

    /* renamed from: b  reason: collision with root package name */
    private final C10719b f82495b;

    /* renamed from: c  reason: collision with root package name */
    private final M f82496c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final a f82497d;

    /* renamed from: e  reason: collision with root package name */
    private final Go.a f82498e;

    /* renamed from: f  reason: collision with root package name */
    private final C16505B<List<String>> f82499f;

    /* renamed from: g  reason: collision with root package name */
    private final C16519P<List<String>> f82500g;

    /* renamed from: h  reason: collision with root package name */
    private final C16505B<List<String>> f82501h;

    /* renamed from: i  reason: collision with root package name */
    private final C16519P<List<String>> f82502i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LMi/h;", "<anonymous>", "(LQJ/Q;)LMi/h;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.ratingsandreviews.data.repository.ReviewsRepositoryImpl$getReviews$2", f = "ReviewsRepositoryImpl.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: Ji.a$a  reason: collision with other inner class name */
    static final class C1620a extends l implements p<Q, C17164e<? super C10773h>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82503c;

        /* renamed from: d  reason: collision with root package name */
        Object f82504d;

        /* renamed from: e  reason: collision with root package name */
        Object f82505e;

        /* renamed from: f  reason: collision with root package name */
        Object f82506f;

        /* renamed from: g  reason: collision with root package name */
        Object f82507g;

        /* renamed from: h  reason: collision with root package name */
        Object f82508h;

        /* renamed from: i  reason: collision with root package name */
        Object f82509i;

        /* renamed from: j  reason: collision with root package name */
        int f82510j;

        /* renamed from: k  reason: collision with root package name */
        int f82511k;

        /* renamed from: l  reason: collision with root package name */
        int f82512l;

        /* renamed from: m  reason: collision with root package name */
        int f82513m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C10761a f82514n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f82515o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f82516p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f82517q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ String f82518r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f82519s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f82520t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ Li.c f82521u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1620a(C10761a aVar, String str, int i10, int i11, String str2, String str3, String str4, Li.c cVar, C17164e<? super C1620a> eVar) {
            super(2, eVar);
            this.f82514n = aVar;
            this.f82515o = str;
            this.f82516p = i10;
            this.f82517q = i11;
            this.f82518r = str2;
            this.f82519s = str3;
            this.f82520t = str4;
            this.f82521u = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1620a(this.f82514n, this.f82515o, this.f82516p, this.f82517q, this.f82518r, this.f82519s, this.f82520t, this.f82521u, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C10773h> eVar) {
            return ((C1620a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C10773h b10;
            Object f10 = C17187b.f();
            int i10 = this.f82513m;
            if (i10 == 0) {
                y.b(obj);
                int i11 = this.f82516p;
                int i12 = this.f82517q;
                String str = this.f82518r;
                String str2 = this.f82519s;
                String str3 = this.f82520t;
                Li.c cVar = this.f82521u;
                Map c10 = X.c();
                c10.put("pageSize", kotlin.coroutines.jvm.internal.b.e(i11));
                c10.put("pageNumber", kotlin.coroutines.jvm.internal.b.e(i12));
                if (str != null) {
                    c10.put("sourceCountryCode", str);
                }
                if (str2 != null) {
                    c10.put("excludeCountry", str2);
                }
                if (str3 != null) {
                    c10.put("translateTo", str3);
                }
                if (cVar != null) {
                    c10.put(cVar.a(), cVar.b());
                }
                Map b11 = X.b(c10);
                C10718a h10 = this.f82514n.f82494a;
                String str4 = this.f82515o;
                this.f82503c = b11;
                this.f82504d = str;
                this.f82505e = str2;
                this.f82506f = str3;
                this.f82507g = cVar;
                this.f82508h = c10;
                this.f82509i = c10;
                this.f82510j = i11;
                this.f82511k = i12;
                this.f82512l = 0;
                this.f82513m = 1;
                obj = h10.d(str4, b11, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Map map = (Map) this.f82509i;
                Map map2 = (Map) this.f82508h;
                Li.c cVar2 = (Li.c) this.f82507g;
                String str5 = (String) this.f82506f;
                String str6 = (String) this.f82505e;
                String str7 = (String) this.f82504d;
                Map map3 = (Map) this.f82503c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x xVar = (x) obj;
            if (xVar.e()) {
                ReviewsResponseRemote reviewsResponseRemote = (ReviewsResponseRemote) xVar.a();
                if (reviewsResponseRemote != null && (b10 = reviewsResponseRemote.b(this.f82514n.f82497d.i(), this.f82514n.f82497d.a())) != null) {
                    return b10;
                }
                throw new IllegalArgumentException("Failed to convert reviews");
            }
            throw new IllegalArgumentException("Api call failed.");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LMi/g;", "<anonymous>", "(LQJ/Q;)LMi/g;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.ratingsandreviews.data.repository.ReviewsRepositoryImpl$getSummary$2", f = "ReviewsRepositoryImpl.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: Ji.a$b */
    static final class b extends l implements p<Q, C17164e<? super C10772g>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82522c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10761a f82523d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f82524e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C10761a aVar, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f82523d = aVar;
            this.f82524e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f82523d, this.f82524e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C10772g> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C10772g b10;
            Object f10 = C17187b.f();
            int i10 = this.f82522c;
            if (i10 == 0) {
                y.b(obj);
                C10718a h10 = this.f82523d.f82494a;
                String str = this.f82524e;
                this.f82522c = 1;
                obj = h10.a(str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x xVar = (x) obj;
            if (xVar.e()) {
                ProductDetailsSummaryRemote productDetailsSummaryRemote = (ProductDetailsSummaryRemote) xVar.a();
                if (productDetailsSummaryRemote != null && (b10 = productDetailsSummaryRemote.b()) != null) {
                    return b10;
                }
                throw new IllegalArgumentException("Failed to convert review summary");
            }
            throw new IllegalArgumentException("Api call failed.");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.ratingsandreviews.data.repository.ReviewsRepositoryImpl", f = "ReviewsRepositoryImpl.kt", l = {121}, m = "getWriteReviewQuestions-gIAlu-s")
    /* renamed from: Ji.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f82525c;

        /* renamed from: d  reason: collision with root package name */
        Object f82526d;

        /* renamed from: e  reason: collision with root package name */
        Object f82527e;

        /* renamed from: f  reason: collision with root package name */
        Object f82528f;

        /* renamed from: g  reason: collision with root package name */
        Object f82529g;

        /* renamed from: h  reason: collision with root package name */
        int f82530h;

        /* renamed from: i  reason: collision with root package name */
        int f82531i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f82532j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C10761a f82533k;

        /* renamed from: l  reason: collision with root package name */
        int f82534l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C10761a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f82533k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82532j = obj;
            this.f82534l |= Integer.MIN_VALUE;
            Object e10 = this.f82533k.e((String) null, this);
            return e10 == C17187b.f() ? e10 : XH.x.a(e10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.ratingsandreviews.data.repository.ReviewsRepositoryImpl", f = "ReviewsRepositoryImpl.kt", l = {105, 111}, m = "markReviewHelpful")
    /* renamed from: Ji.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f82535c;

        /* renamed from: d  reason: collision with root package name */
        Object f82536d;

        /* renamed from: e  reason: collision with root package name */
        Object f82537e;

        /* renamed from: f  reason: collision with root package name */
        Object f82538f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f82539g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C10761a f82540h;

        /* renamed from: i  reason: collision with root package name */
        int f82541i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C10761a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f82540h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82539g = obj;
            this.f82541i |= Integer.MIN_VALUE;
            return this.f82540h.d((String) null, this);
        }
    }

    public C10761a(C10718a aVar, C10719b bVar, M m10, a aVar2, Go.a aVar3) {
        C17542s.j(aVar, "reviewsEndpoint");
        C17542s.j(bVar, "writeReviewsEndpoint");
        C17542s.j(m10, "dispatcher");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(aVar3, "clientIdentityProvider");
        this.f82494a = aVar;
        this.f82495b = bVar;
        this.f82496c = m10;
        this.f82497d = aVar2;
        this.f82498e = aVar3;
        C16505B<List<String>> a10 = C16521S.a(C16877v.n());
        this.f82499f = a10;
        this.f82500g = C16534i.c(a10);
        C16505B<List<String>> a11 = C16521S.a(C16877v.n());
        this.f82501h = a11;
        this.f82502i = C16534i.c(a11);
    }

    public Object a(String str, C17164e<? super C10772g> eVar) {
        return C16310i.g(this.f82496c, new b(this, str, (C17164e<? super b>) null), eVar);
    }

    public C16519P<List<String>> b() {
        return this.f82502i;
    }

    public Object c(String str, Li.c cVar, int i10, int i11, String str2, String str3, String str4, C17164e<? super C10773h> eVar) {
        return C16310i.g(this.f82496c, new C1620a(this, str, i10, i11, str2, str3, str4, cVar, (C17164e<? super C1620a>) null), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.lang.String r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Ji.C10761a.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Ji.a$d r0 = (Ji.C10761a.d) r0
            int r1 = r0.f82541i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f82541i = r1
            goto L_0x0018
        L_0x0013:
            Ji.a$d r0 = new Ji.a$d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f82539g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f82541i
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0058
            if (r3 == r5) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            java.lang.Object r7 = r0.f82538f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f82537e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f82536d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f82535c
            Ji.a r8 = (Ji.C10761a) r8
            XH.y.b(r1)
            goto L_0x00a9
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            java.lang.Object r7 = r0.f82538f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f82537e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f82536d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f82535c
            Ji.a r8 = (Ji.C10761a) r8
            XH.y.b(r1)
            goto L_0x0085
        L_0x0058:
            XH.y.b(r1)
            Go.a r1 = r6.f82498e
            java.lang.String r1 = r1.c()
            TJ.P r3 = r6.f()
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            boolean r3 = r3.contains(r7)
            if (r3 == 0) goto L_0x0095
            Hi.a r3 = r6.f82494a
            r0.f82535c = r6
            r0.f82536d = r7
            r0.f82537e = r8
            r0.f82538f = r1
            r0.f82541i = r5
            java.lang.Object r8 = r3.b(r7, r1, r0)
            if (r8 != r2) goto L_0x0084
            return r2
        L_0x0084:
            r8 = r6
        L_0x0085:
            TJ.B<java.util.List<java.lang.String>> r8 = r8.f82499f
            java.lang.Object r0 = r8.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r7 = YH.C16877v.S0(r0, r7)
            r8.setValue(r7)
            goto L_0x00b8
        L_0x0095:
            Hi.a r3 = r6.f82494a
            r0.f82535c = r6
            r0.f82536d = r7
            r0.f82537e = r8
            r0.f82538f = r1
            r0.f82541i = r4
            java.lang.Object r8 = r3.c(r7, r1, r0)
            if (r8 != r2) goto L_0x00a8
            return r2
        L_0x00a8:
            r8 = r6
        L_0x00a9:
            TJ.B<java.util.List<java.lang.String>> r8 = r8.f82499f
            java.lang.Object r0 = r8.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r7 = YH.C16877v.W0(r0, r7)
            r8.setValue(r7)
        L_0x00b8:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ji.C10761a.d(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(java.lang.String r6, dI.C17164e<? super XH.x<Mi.q>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ji.C10761a.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Ji.a$c r0 = (Ji.C10761a.c) r0
            int r1 = r0.f82534l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f82534l = r1
            goto L_0x0018
        L_0x0013:
            Ji.a$c r0 = new Ji.a$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f82532j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f82534l
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r6 = r0.f82529g
            Ji.a r6 = (Ji.C10761a) r6
            java.lang.Object r6 = r0.f82528f
            Ji.a r6 = (Ji.C10761a) r6
            java.lang.Object r6 = r0.f82527e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f82526d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f82525c
            Ji.a r6 = (Ji.C10761a) r6
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
            Hi.b r1 = r5.f82495b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f82525c = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f82526d = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f82527e = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f82528f = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f82529g = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r7 = 0
            r0.f82530h = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f82531i = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f82534l = r4     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r1 = r1.a(r6, r0)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.WriteReviewQuestionsRemote r1 = (com.ingka.ikea.app.ratingsandreviews.data.network.remote.WriteReviewQuestionsRemote) r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            Mi.q r6 = r1.b()     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
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
        throw new UnsupportedOperationException("Method not decompiled: Ji.C10761a.e(java.lang.String, dI.e):java.lang.Object");
    }

    public C16519P<List<String>> f() {
        return this.f82500g;
    }
}
