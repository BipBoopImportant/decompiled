package Af;

import KJ.C15985a;
import Op.B0;
import Qr.b;
import Sl.e;
import YH.C16877v;
import com.ingka.ikea.app.browseandsearch.browseV2.b;
import dI.C17164e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nn.C11657c;
import nn.C11660f;
import nn.C11661g;
import qe.C10189b;
import tf.C10253a;
import yf.g;
import yf.s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 $2\u00020\u0001:\u00014B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ<\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u00020\u001a*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010$\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0001\u00102\u001a\u0002012\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107¨\u00068"}, d2 = {"LAf/a;", "", "Ltf/a;", "killSwitchRepository", "LIl/a;", "appConfigApi", "LSl/e;", "getStaticImageUseCase", "<init>", "(Ltf/a;LIl/a;LSl/e;)V", "Lnn/c;", "browseResponseData", "Lyf/g;", "selectedTab", "", "isCategoriesExpanded", "isOfferHubEnabled", "", "categoriesPerRow", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a;", "c", "(Lnn/c;Lyf/g;ZZILdI/e;)Ljava/lang/Object;", "Lnn/g;", "", "", "itemNosAddingToCart", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;", "e", "(Lnn/g;Ljava/util/List;)Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;", "Lyf/s;", "itemsNosAddingToCart", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$d;", "f", "(Lyf/s;Ljava/util/List;)Lcom/ingka/ikea/app/browseandsearch/browseV2/b$d;", "LPg/a;", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$b;", "d", "(LPg/a;)Lcom/ingka/ikea/app/browseandsearch/browseV2/b$b;", "Lqe/b;", "alertMessageState", "LEs/a;", "inboxState", "recentProducts", "LQr/b$c;", "kreativModel", "recommendations", "isLoggedIn", "isScanAndGoEnabled", "isLoading", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b;", "b", "(Lqe/b;LEs/a;Ljava/util/List;LQr/b$c;Lnn/c;Lyf/s;Ljava/util/List;ZZLyf/g;ZZILdI/e;)Ljava/lang/Object;", "a", "Ltf/a;", "LIl/a;", "LSl/e;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0959a f58692d = new C0959a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f58693e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C10253a f58694a;

    /* renamed from: b  reason: collision with root package name */
    private final Il.a f58695b;

    /* renamed from: c  reason: collision with root package name */
    private final e f58696c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LAf/a$a;", "", "<init>", "()V", "", "STATIC_IMAGE_PORTRAIT_KEY", "Ljava/lang/String;", "STATIC_IMAGE_SQUARE_KEY", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Af.a$a  reason: collision with other inner class name */
    public static final class C0959a {
        public /* synthetic */ C0959a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0959a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58697a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                yf.g[] r0 = yf.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yf.g r1 = yf.g.CATEGORIES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yf.g r1 = yf.g.ROOMS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f58697a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Af.a.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.mapper.BrowseV2UiMapper", f = "BrowseV2UiMapper.kt", l = {53}, m = "map")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A  reason: collision with root package name */
        int f58698A;

        /* renamed from: c  reason: collision with root package name */
        Object f58699c;

        /* renamed from: d  reason: collision with root package name */
        Object f58700d;

        /* renamed from: e  reason: collision with root package name */
        Object f58701e;

        /* renamed from: f  reason: collision with root package name */
        Object f58702f;

        /* renamed from: g  reason: collision with root package name */
        Object f58703g;

        /* renamed from: h  reason: collision with root package name */
        Object f58704h;

        /* renamed from: i  reason: collision with root package name */
        Object f58705i;

        /* renamed from: j  reason: collision with root package name */
        Object f58706j;

        /* renamed from: k  reason: collision with root package name */
        Object f58707k;

        /* renamed from: l  reason: collision with root package name */
        Object f58708l;

        /* renamed from: m  reason: collision with root package name */
        Object f58709m;

        /* renamed from: n  reason: collision with root package name */
        Object f58710n;

        /* renamed from: o  reason: collision with root package name */
        Object f58711o;

        /* renamed from: p  reason: collision with root package name */
        Object f58712p;

        /* renamed from: q  reason: collision with root package name */
        Object f58713q;

        /* renamed from: r  reason: collision with root package name */
        boolean f58714r;

        /* renamed from: s  reason: collision with root package name */
        boolean f58715s;

        /* renamed from: t  reason: collision with root package name */
        boolean f58716t;

        /* renamed from: u  reason: collision with root package name */
        boolean f58717u;

        /* renamed from: v  reason: collision with root package name */
        int f58718v;

        /* renamed from: w  reason: collision with root package name */
        int f58719w;

        /* renamed from: x  reason: collision with root package name */
        int f58720x;

        /* renamed from: y  reason: collision with root package name */
        /* synthetic */ Object f58721y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ a f58722z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f58722z = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f58721y = obj;
            this.f58698A |= Integer.MIN_VALUE;
            return this.f58722z.b((C10189b) null, (Es.a) null, (List<Pg.a>) null, (b.c) null, (C11657c) null, (s) null, (List<String>) null, false, false, (g) null, false, false, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.mapper.BrowseV2UiMapper", f = "BrowseV2UiMapper.kt", l = {129, 130}, m = "mapCategoriesAndRoomSection")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A  reason: collision with root package name */
        final /* synthetic */ a f58723A;

        /* renamed from: B  reason: collision with root package name */
        int f58724B;

        /* renamed from: c  reason: collision with root package name */
        Object f58725c;

        /* renamed from: d  reason: collision with root package name */
        Object f58726d;

        /* renamed from: e  reason: collision with root package name */
        Object f58727e;

        /* renamed from: f  reason: collision with root package name */
        Object f58728f;

        /* renamed from: g  reason: collision with root package name */
        Object f58729g;

        /* renamed from: h  reason: collision with root package name */
        Object f58730h;

        /* renamed from: i  reason: collision with root package name */
        Object f58731i;

        /* renamed from: j  reason: collision with root package name */
        Object f58732j;

        /* renamed from: k  reason: collision with root package name */
        Object f58733k;

        /* renamed from: l  reason: collision with root package name */
        Object f58734l;

        /* renamed from: m  reason: collision with root package name */
        Object f58735m;

        /* renamed from: n  reason: collision with root package name */
        Object f58736n;

        /* renamed from: o  reason: collision with root package name */
        Object f58737o;

        /* renamed from: p  reason: collision with root package name */
        Object f58738p;

        /* renamed from: q  reason: collision with root package name */
        boolean f58739q;

        /* renamed from: r  reason: collision with root package name */
        boolean f58740r;

        /* renamed from: s  reason: collision with root package name */
        int f58741s;

        /* renamed from: t  reason: collision with root package name */
        int f58742t;

        /* renamed from: u  reason: collision with root package name */
        int f58743u;

        /* renamed from: v  reason: collision with root package name */
        int f58744v;

        /* renamed from: w  reason: collision with root package name */
        int f58745w;

        /* renamed from: x  reason: collision with root package name */
        int f58746x;

        /* renamed from: y  reason: collision with root package name */
        int f58747y;

        /* renamed from: z  reason: collision with root package name */
        /* synthetic */ Object f58748z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f58723A = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f58748z = obj;
            this.f58724B |= Integer.MIN_VALUE;
            return this.f58723A.c((C11657c) null, (g) null, false, false, 0, this);
        }
    }

    public a(C10253a aVar, Il.a aVar2, e eVar) {
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(eVar, "getStaticImageUseCase");
        this.f58694a = aVar;
        this.f58695b = aVar2;
        this.f58696c = eVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018e, code lost:
        if (r24.c().isEmpty() == false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a1, code lost:
        if (r24.a().isEmpty() == false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ae, code lost:
        r9 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(nn.C11657c r24, yf.g r25, boolean r26, boolean r27, int r28, dI.C17164e<? super com.ingka.ikea.app.browseandsearch.browseV2.b.a> r29) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            boolean r7 = r6 instanceof Af.a.d
            if (r7 == 0) goto L_0x0021
            r7 = r6
            Af.a$d r7 = (Af.a.d) r7
            int r8 = r7.f58724B
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x0021
            int r8 = r8 - r9
            r7.f58724B = r8
            goto L_0x0026
        L_0x0021:
            Af.a$d r7 = new Af.a$d
            r7.<init>(r0, r6)
        L_0x0026:
            java.lang.Object r8 = r7.f58748z
            java.lang.Object r9 = eI.C17187b.f()
            int r10 = r7.f58724B
            r12 = 2
            r14 = 1
            if (r10 == 0) goto L_0x0106
            if (r10 == r14) goto L_0x0081
            if (r10 != r12) goto L_0x0079
            int r1 = r7.f58747y
            int r2 = r7.f58746x
            java.lang.Object r3 = r7.f58738p
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.f58737o
            KJ.c r4 = (KJ.C15987c) r4
            java.lang.Object r5 = r7.f58736n
            KJ.c r5 = (KJ.C15987c) r5
            java.lang.Object r6 = r7.f58735m
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r6 = r7.f58734l
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = r7.f58733k
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r6 = r7.f58732j
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = r7.f58731i
            com.ingka.ikea.core.model.Media$Image r6 = (com.ingka.ikea.core.model.Media.Image) r6
            java.lang.Object r6 = r7.f58730h
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r7.f58729g
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r7.f58728f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r7.f58727e
            yf.g r6 = (yf.g) r6
            java.lang.Object r6 = r7.f58726d
            nn.c r6 = (nn.C11657c) r6
            java.lang.Object r6 = r7.f58725c
            Af.a r6 = (Af.a) r6
            XH.y.b(r8)
            r0 = r4
            r15 = r5
            goto L_0x02a7
        L_0x0079:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0081:
            int r1 = r7.f58747y
            int r2 = r7.f58746x
            int r3 = r7.f58745w
            int r4 = r7.f58744v
            int r5 = r7.f58743u
            int r6 = r7.f58742t
            int r10 = r7.f58741s
            boolean r15 = r7.f58740r
            boolean r13 = r7.f58739q
            java.lang.Object r12 = r7.f58737o
            KJ.c r12 = (KJ.C15987c) r12
            java.lang.Object r14 = r7.f58736n
            KJ.c r14 = (KJ.C15987c) r14
            java.lang.Object r11 = r7.f58735m
            java.util.Iterator r11 = (java.util.Iterator) r11
            r24 = r1
            java.lang.Object r1 = r7.f58734l
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r25 = r1
            java.lang.Object r1 = r7.f58733k
            java.util.Collection r1 = (java.util.Collection) r1
            r26 = r1
            java.lang.Object r1 = r7.f58732j
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r27 = r1
            java.lang.Object r1 = r7.f58731i
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r7.f58730h
            java.util.List r1 = (java.util.List) r1
            r28 = r1
            java.lang.Object r1 = r7.f58729g
            java.util.List r1 = (java.util.List) r1
            r29 = r1
            java.lang.Object r1 = r7.f58728f
            dI.e r1 = (dI.C17164e) r1
            r18 = r1
            java.lang.Object r1 = r7.f58727e
            yf.g r1 = (yf.g) r1
            r19 = r1
            java.lang.Object r1 = r7.f58726d
            nn.c r1 = (nn.C11657c) r1
            r20 = r1
            java.lang.Object r1 = r7.f58725c
            Af.a r1 = (Af.a) r1
            XH.y.b(r8)
            r17 = r24
            r24 = r3
            r21 = r8
            r0 = r12
            r12 = r28
            r8 = r29
            r3 = r1
            r28 = r10
            r1 = r20
            r20 = r9
            r9 = r25
            r25 = r4
            r4 = r15
            r15 = r14
            r14 = r26
            r26 = r5
            r5 = r27
            r27 = r6
            r6 = r18
            r22 = r19
            r19 = r2
            r2 = r22
            goto L_0x023d
        L_0x0106:
            XH.y.b(r8)
            if (r1 != 0) goto L_0x010d
            r8 = 0
            return r8
        L_0x010d:
            int[] r8 = Af.a.b.f58697a
            int r10 = r25.ordinal()
            r8 = r8[r10]
            r10 = 1
            if (r8 == r10) goto L_0x0126
            r10 = 2
            if (r8 != r10) goto L_0x0120
            java.util.List r8 = r24.c()
            goto L_0x012a
        L_0x0120:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0126:
            java.util.List r8 = r24.a()
        L_0x012a:
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x0132
            r10 = 0
            return r10
        L_0x0132:
            r10 = 0
            int r11 = r5 * 4
            if (r3 == 0) goto L_0x0139
            r12 = r8
            goto L_0x0140
        L_0x0139:
            r12 = r8
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r12 = YH.C16877v.k1(r12, r11)
        L_0x0140:
            fI.a r13 = yf.g.b()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r13.iterator()
        L_0x014d:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x01bc
            java.lang.Object r17 = r15.next()
            r10 = r17
            yf.g r10 = (yf.g) r10
            int[] r17 = Af.a.b.f58697a
            int r19 = r10.ordinal()
            r20 = r9
            r9 = r17[r19]
            r5 = 1
            if (r9 == r5) goto L_0x0174
            r5 = 2
            if (r9 != r5) goto L_0x016e
            int r5 = wf.C10366b.f77642c
            goto L_0x0176
        L_0x016e:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0174:
            int r5 = wf.C10366b.f77641b
        L_0x0176:
            int r9 = r10.ordinal()
            r9 = r17[r9]
            r17 = r15
            r15 = 1
            if (r9 == r15) goto L_0x0197
            r15 = 2
            if (r9 != r15) goto L_0x0191
            java.util.List r9 = r24.c()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01ae
            goto L_0x01a3
        L_0x0191:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0197:
            java.util.List r9 = r24.a()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01ae
        L_0x01a3:
            com.ingka.ikea.app.browseandsearch.browseV2.b$a$a r9 = new com.ingka.ikea.app.browseandsearch.browseV2.b$a$a
            if (r10 != r2) goto L_0x01a9
            r15 = 1
            goto L_0x01aa
        L_0x01a9:
            r15 = 0
        L_0x01aa:
            r9.<init>(r5, r15, r10)
            goto L_0x01af
        L_0x01ae:
            r9 = 0
        L_0x01af:
            if (r9 == 0) goto L_0x01b4
            r14.add(r9)
        L_0x01b4:
            r5 = r28
            r15 = r17
            r9 = r20
            r10 = 0
            goto L_0x014d
        L_0x01bc:
            r20 = r9
            r17 = r15
            KJ.c r5 = KJ.C15985a.h(r14)
            r9 = r12
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            KJ.c r9 = KJ.C15985a.h(r9)
            if (r3 != 0) goto L_0x01d5
            int r10 = r8.size()
            if (r10 <= r11) goto L_0x01d5
            r10 = 1
            goto L_0x01d6
        L_0x01d5:
            r10 = 0
        L_0x01d6:
            if (r4 == 0) goto L_0x01df
            yf.g r15 = yf.g.CATEGORIES
            if (r2 != r15) goto L_0x01df
            r19 = 1
            goto L_0x01e1
        L_0x01df:
            r19 = 0
        L_0x01e1:
            Sl.e r15 = r0.f58696c
            r7.f58725c = r0
            r7.f58726d = r1
            r7.f58727e = r2
            r7.f58728f = r6
            r7.f58729g = r8
            r7.f58730h = r12
            r7.f58731i = r13
            r7.f58732j = r13
            r7.f58733k = r14
            r7.f58734l = r13
            r0 = r17
            r7.f58735m = r0
            r7.f58736n = r5
            r7.f58737o = r9
            r7.f58739q = r3
            r7.f58740r = r4
            r0 = r28
            r7.f58741s = r0
            r7.f58742t = r11
            r0 = 0
            r7.f58743u = r0
            r7.f58744v = r0
            r7.f58745w = r0
            r7.f58746x = r10
            r0 = r19
            r7.f58747y = r0
            r0 = 1
            r7.f58724B = r0
            java.lang.String r0 = "browseOfferPortrait"
            java.lang.Object r0 = r15.a(r0, r7)
            r15 = r20
            if (r0 != r15) goto L_0x0224
            return r15
        L_0x0224:
            r21 = r0
            r0 = r9
            r27 = r11
            r9 = r13
            r20 = r15
            r11 = r17
            r17 = r19
            r24 = 0
            r25 = 0
            r26 = 0
            r15 = r5
            r19 = r10
            r5 = r9
            r13 = r3
            r3 = r23
        L_0x023d:
            r10 = r21
            com.ingka.ikea.core.model.Media$Image r10 = (com.ingka.ikea.core.model.Media.Image) r10
            if (r10 == 0) goto L_0x0250
            java.lang.String r21 = r10.getUrl()
            r29 = r13
            r22 = r21
            r21 = r4
            r4 = r22
            goto L_0x0255
        L_0x0250:
            r21 = r4
            r29 = r13
            r4 = 0
        L_0x0255:
            Sl.e r13 = r3.f58696c
            r7.f58725c = r3
            r7.f58726d = r1
            r7.f58727e = r2
            r7.f58728f = r6
            r7.f58729g = r8
            r7.f58730h = r12
            r7.f58731i = r10
            r7.f58732j = r5
            r7.f58733k = r14
            r7.f58734l = r9
            r7.f58735m = r11
            r7.f58736n = r15
            r7.f58737o = r0
            r7.f58738p = r4
            r3 = r29
            r7.f58739q = r3
            r1 = r21
            r7.f58740r = r1
            r10 = r28
            r7.f58741s = r10
            r11 = r27
            r7.f58742t = r11
            r5 = r26
            r7.f58743u = r5
            r1 = r25
            r7.f58744v = r1
            r3 = r24
            r7.f58745w = r3
            r10 = r19
            r7.f58746x = r10
            r1 = r17
            r7.f58747y = r1
            r2 = 2
            r7.f58724B = r2
            java.lang.String r2 = "browseOfferSquare"
            java.lang.Object r8 = r13.a(r2, r7)
            r2 = r20
            if (r8 != r2) goto L_0x02a5
            return r2
        L_0x02a5:
            r3 = r4
            r2 = r10
        L_0x02a7:
            com.ingka.ikea.core.model.Media$Image r8 = (com.ingka.ikea.core.model.Media.Image) r8
            if (r8 == 0) goto L_0x02b0
            java.lang.String r11 = r8.getUrl()
            goto L_0x02b1
        L_0x02b0:
            r11 = 0
        L_0x02b1:
            Bf.a r4 = new Bf.a
            r4.<init>(r3, r11)
            com.ingka.ikea.app.browseandsearch.browseV2.b$a r3 = new com.ingka.ikea.app.browseandsearch.browseV2.b$a
            if (r2 == 0) goto L_0x02bc
            r2 = 1
            goto L_0x02bd
        L_0x02bc:
            r2 = 0
        L_0x02bd:
            if (r1 == 0) goto L_0x02c2
            r16 = 1
            goto L_0x02c4
        L_0x02c2:
            r16 = 0
        L_0x02c4:
            r24 = r3
            r25 = r15
            r26 = r0
            r27 = r2
            r28 = r16
            r29 = r4
            r24.<init>(r25, r26, r27, r28, r29)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Af.a.c(nn.c, yf.g, boolean, boolean, int, dI.e):java.lang.Object");
    }

    private final b.C1213b d(Pg.a aVar) {
        return new b.C1213b(aVar.b(), aVar.a(), aVar.c());
    }

    private final b.c e(C11661g gVar, List<String> list) {
        String b10 = gVar.b();
        String d10 = gVar.d();
        Iterable<C11660f> c10 = gVar.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (C11660f a10 : c10) {
            List<String> list2 = list;
            arrayList.add(B0.o(a10.a(), list2, gVar.a(), this.f58695b.s(), this.f58695b.w(), this.f58694a.b(), true, false, false, false, 448, (Object) null));
        }
        return new b.c(b10, d10, C15985a.h(arrayList));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r4.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ingka.ikea.app.browseandsearch.browseV2.b.d f(yf.s r4, java.util.List<java.lang.String> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x000e
            nn.g r1 = r4.a()
            if (r1 == 0) goto L_0x000e
            com.ingka.ikea.app.browseandsearch.browseV2.b$c r5 = r3.e(r1, r5)
            goto L_0x000f
        L_0x000e:
            r5 = r0
        L_0x000f:
            if (r4 == 0) goto L_0x0046
            nn.g r1 = r4.a()
            if (r1 == 0) goto L_0x0046
            java.util.List r1 = r1.c()
            if (r1 == 0) goto L_0x0046
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = YH.C16877v.y(r1, r2)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x002e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r1.next()
            nn.f r2 = (nn.C11660f) r2
            com.ingka.ikea.core.model.product.ProductItem r2 = r2.a()
            java.lang.String r2 = r2.f()
            r0.add(r2)
            goto L_0x002e
        L_0x0046:
            r1 = 0
            if (r4 == 0) goto L_0x0051
            boolean r4 = r4.b()
            r2 = 1
            if (r4 != r2) goto L_0x0051
            r1 = r2
        L_0x0051:
            com.ingka.ikea.app.browseandsearch.browseV2.b$d r4 = new com.ingka.ikea.app.browseandsearch.browseV2.b$d
            r4.<init>(r5, r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Af.a.f(yf.s, java.util.List):com.ingka.ikea.app.browseandsearch.browseV2.b$d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x011f, code lost:
        r7 = r11.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(qe.C10189b r20, Es.a r21, java.util.List<Pg.a> r22, Qr.b.c r23, nn.C11657c r24, yf.s r25, java.util.List<java.lang.String> r26, boolean r27, boolean r28, yf.g r29, boolean r30, boolean r31, int r32, dI.C17164e<? super com.ingka.ikea.app.browseandsearch.browseV2.b> r33) {
        /*
            r19 = this;
            r7 = r19
            r0 = r22
            r1 = r33
            boolean r2 = r1 instanceof Af.a.c
            if (r2 == 0) goto L_0x001a
            r2 = r1
            Af.a$c r2 = (Af.a.c) r2
            int r3 = r2.f58698A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f58698A = r3
        L_0x0018:
            r6 = r2
            goto L_0x0020
        L_0x001a:
            Af.a$c r2 = new Af.a$c
            r2.<init>(r7, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r6.f58721y
            java.lang.Object r8 = eI.C17187b.f()
            int r3 = r6.f58698A
            r10 = 1
            if (r3 == 0) goto L_0x0081
            if (r3 != r10) goto L_0x0079
            boolean r0 = r6.f58717u
            boolean r1 = r6.f58715s
            boolean r3 = r6.f58714r
            java.lang.Object r4 = r6.f58713q
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r4 = r6.f58712p
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r4 = r6.f58711o
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r4 = r6.f58710n
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r4 = r6.f58709m
            KJ.c r4 = (KJ.C15987c) r4
            java.lang.Object r5 = r6.f58708l
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r6.f58707k
            yf.g r5 = (yf.g) r5
            java.lang.Object r5 = r6.f58706j
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r8 = r6.f58705i
            yf.s r8 = (yf.s) r8
            java.lang.Object r11 = r6.f58704h
            nn.c r11 = (nn.C11657c) r11
            java.lang.Object r12 = r6.f58703g
            Qr.b$c r12 = (Qr.b.c) r12
            java.lang.Object r13 = r6.f58702f
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r6.f58701e
            Es.a r13 = (Es.a) r13
            java.lang.Object r14 = r6.f58700d
            qe.b r14 = (qe.C10189b) r14
            java.lang.Object r6 = r6.f58699c
            Af.a r6 = (Af.a) r6
            XH.y.b(r2)
            r18 = r14
            r14 = r12
            r12 = r18
            goto L_0x011b
        L_0x0079:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0081:
            XH.y.b(r2)
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = YH.C16877v.y(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r2.iterator()
        L_0x0096:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00aa
            java.lang.Object r5 = r4.next()
            Pg.a r5 = (Pg.a) r5
            com.ingka.ikea.app.browseandsearch.browseV2.b$b r5 = r7.d(r5)
            r3.add(r5)
            goto L_0x0096
        L_0x00aa:
            KJ.c r11 = KJ.C15985a.h(r3)
            tf.a r5 = r7.f58694a
            boolean r5 = r5.c()
            r6.f58699c = r7
            r12 = r20
            r6.f58700d = r12
            r13 = r21
            r6.f58701e = r13
            r6.f58702f = r0
            r14 = r23
            r6.f58703g = r14
            r15 = r24
            r6.f58704h = r15
            r0 = r25
            r6.f58705i = r0
            r10 = r26
            r6.f58706j = r10
            r9 = r29
            r6.f58707k = r9
            r6.f58708l = r1
            r6.f58709m = r11
            r6.f58710n = r2
            r6.f58711o = r2
            r6.f58712p = r3
            r6.f58713q = r4
            r4 = r27
            r6.f58714r = r4
            r3 = r28
            r6.f58715s = r3
            r2 = r30
            r6.f58716t = r2
            r1 = r31
            r6.f58717u = r1
            r7 = r32
            r6.f58718v = r7
            r7 = 0
            r6.f58719w = r7
            r6.f58720x = r7
            r7 = 1
            r6.f58698A = r7
            r0 = r19
            r1 = r24
            r2 = r29
            r3 = r30
            r4 = r5
            r5 = r32
            java.lang.Object r2 = r0.c(r1, r2, r3, r4, r5, r6)
            if (r2 != r8) goto L_0x010e
            return r8
        L_0x010e:
            r6 = r19
            r8 = r25
            r3 = r27
            r1 = r28
            r0 = r31
            r5 = r10
            r4 = r11
            r11 = r15
        L_0x011b:
            com.ingka.ikea.app.browseandsearch.browseV2.b$a r2 = (com.ingka.ikea.app.browseandsearch.browseV2.b.a) r2
            if (r11 == 0) goto L_0x012a
            nn.g r7 = r11.b()
            if (r7 == 0) goto L_0x012a
            com.ingka.ikea.app.browseandsearch.browseV2.b$c r7 = r6.e(r7, r5)
            goto L_0x012b
        L_0x012a:
            r7 = 0
        L_0x012b:
            if (r8 == 0) goto L_0x0136
            com.ingka.ikea.app.browseandsearch.browseV2.b$d r5 = r6.f(r8, r5)
            if (r5 != 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r8 = 1
            goto L_0x014e
        L_0x0136:
            com.ingka.ikea.app.browseandsearch.browseV2.b$d r5 = new com.ingka.ikea.app.browseandsearch.browseV2.b$d
            r8 = 7
            r9 = 0
            r10 = 0
            r15 = 0
            r17 = 0
            r20 = r5
            r21 = r10
            r22 = r15
            r23 = r17
            r24 = r8
            r25 = r9
            r20.<init>(r21, r22, r23, r24, r25)
            goto L_0x0134
        L_0x014e:
            r3 = r3 ^ r8
            Il.a r9 = r6.f58695b
            java.lang.String r9 = r9.o()
            if (r0 == 0) goto L_0x0161
            tf.a r6 = r6.f58694a
            boolean r6 = r6.c()
            if (r6 == 0) goto L_0x0161
            r6 = r8
            goto L_0x0162
        L_0x0161:
            r6 = 0
        L_0x0162:
            if (r11 != 0) goto L_0x0169
            if (r0 != 0) goto L_0x0169
            r16 = r8
            goto L_0x016b
        L_0x0169:
            r16 = 0
        L_0x016b:
            com.ingka.ikea.app.browseandsearch.browseV2.b r8 = new com.ingka.ikea.app.browseandsearch.browseV2.b
            r20 = r8
            r21 = r0
            r22 = r6
            r23 = r16
            r24 = r12
            r25 = r13
            r26 = r4
            r27 = r2
            r28 = r7
            r29 = r5
            r30 = r3
            r31 = r9
            r32 = r1
            r33 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Af.a.b(qe.b, Es.a, java.util.List, Qr.b$c, nn.c, yf.s, java.util.List, boolean, boolean, yf.g, boolean, boolean, int, dI.e):java.lang.Object");
    }
}
