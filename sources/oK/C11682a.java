package ok;

import FB.C12860a;
import Il.a;
import KJ.C15985a;
import Op.B0;
import Op.d1;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import bI.C17035a;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import eI.C17187b;
import hB.C14526a;
import iB.C14550b;
import jB.C14613b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import pk.s;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u0017*\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lok/a;", "", "LhB/a;", "shoppingListRecommendationsRepository", "LFB/a;", "localStoreSelectionRepository", "LjB/b;", "shoppingListRepository", "LIl/a;", "appConfigApi", "<init>", "(LhB/a;LFB/a;LjB/b;LIl/a;)V", "LiB/b;", "recommendations", "", "", "allShoppingListItems", "Lpk/s$d$a;", "f", "(LiB/b;Ljava/util/Set;)Lpk/s$d$a;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "", "prioritizeContextualImage", "LOp/d1;", "g", "(Lcom/ingka/ikea/core/model/product/ProductItem;Ljava/util/Set;Z)LOp/d1;", "listId", "LTJ/g;", "Lpk/s$d;", "e", "(Ljava/lang/String;)LTJ/g;", "a", "LhB/a;", "b", "LFB/a;", "c", "LjB/b;", "d", "LIl/a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ok.a  reason: case insensitive filesystem */
public final class C11682a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14526a f100440a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C12860a f100441b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C14613b f100442c;

    /* renamed from: d  reason: collision with root package name */
    private final a f100443d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.usecase.GetListContentRecommendationsUseCase$invoke$$inlined$flatMapLatest$1", f = "GetListContentRecommendationsUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: ok.a$a  reason: collision with other inner class name */
    public static final class C2340a extends l implements q<C16533h<? super s.d>, C14550b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100444c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100445d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100446e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11682a f100447f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2340a(C17164e eVar, C11682a aVar) {
            super(3, eVar);
            this.f100447f = aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super s.d> hVar, C14550b bVar, C17164e<? super C16807N> eVar) {
            C2340a aVar = new C2340a(eVar, this.f100447f);
            aVar.f100445d = hVar;
            aVar.f100446e = bVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100444c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f100445d;
                C14550b bVar = (C14550b) this.f100446e;
                C16532g J10 = bVar.c().isEmpty() ? C16534i.J(null) : new d(this.f100447f.f100442c.f(), this.f100447f, bVar);
                this.f100444c = 1;
                if (C16534i.x(hVar, J10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LiB/b;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.usecase.GetListContentRecommendationsUseCase$invoke$1", f = "GetListContentRecommendationsUseCase.kt", l = {38, 40, 42}, m = "invokeSuspend")
    /* renamed from: ok.a$b */
    static final class b extends l implements p<C16533h<? super C14550b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f100448c;

        /* renamed from: d  reason: collision with root package name */
        Object f100449d;

        /* renamed from: e  reason: collision with root package name */
        Object f100450e;

        /* renamed from: f  reason: collision with root package name */
        int f100451f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f100452g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C11682a f100453h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f100454i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C11682a aVar, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f100453h = aVar;
            this.f100454i = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f100453h, this.f100454i, eVar);
            bVar.f100452g = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super C14550b> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x009c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f100451f
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0044
                if (r1 == r4) goto L_0x003c
                if (r1 == r3) goto L_0x002a
                if (r1 != r2) goto L_0x0022
                java.lang.Object r0 = r8.f100449d
                iB.b r0 = (iB.C14550b) r0
                java.lang.Object r0 = r8.f100448c
                EB.d r0 = (EB.C12832d) r0
                java.lang.Object r0 = r8.f100452g
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r9)
                goto L_0x009d
            L_0x0022:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x002a:
                java.lang.Object r1 = r8.f100448c
                EB.d r1 = (EB.C12832d) r1
                java.lang.Object r3 = r8.f100452g
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r9)
                XH.x r9 = (XH.x) r9
                java.lang.Object r9 = r9.j()
                goto L_0x0086
            L_0x003c:
                java.lang.Object r1 = r8.f100452g
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r9)
                goto L_0x0063
            L_0x0044:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f100452g
                TJ.h r9 = (TJ.C16533h) r9
                ok.a r1 = r8.f100453h
                FB.a r1 = r1.f100441b
                TJ.g r1 = r1.b()
                r8.f100452g = r9
                r8.f100451f = r4
                java.lang.Object r1 = TJ.C16534i.D(r1, r8)
                if (r1 != r0) goto L_0x0060
                return r0
            L_0x0060:
                r7 = r1
                r1 = r9
                r9 = r7
            L_0x0063:
                EB.d r9 = (EB.C12832d) r9
                ok.a r4 = r8.f100453h
                hB.a r4 = r4.f100440a
                java.lang.String r5 = r8.f100454i
                if (r9 == 0) goto L_0x0074
                java.lang.String r6 = r9.e()
                goto L_0x0075
            L_0x0074:
                r6 = 0
            L_0x0075:
                r8.f100452g = r1
                r8.f100448c = r9
                r8.f100451f = r3
                java.lang.Object r3 = r4.c(r5, r6, r8)
                if (r3 != r0) goto L_0x0082
                return r0
            L_0x0082:
                r7 = r1
                r1 = r9
                r9 = r3
                r3 = r7
            L_0x0086:
                XH.y.b(r9)
                r4 = r9
                iB.b r4 = (iB.C14550b) r4
                r8.f100452g = r3
                r8.f100448c = r1
                r8.f100449d = r4
                r8.f100450e = r9
                r8.f100451f = r2
                java.lang.Object r9 = r3.emit(r4, r8)
                if (r9 != r0) goto L_0x009d
                return r0
            L_0x009d:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ok.C11682a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lpk/s$d;", "", "e", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.usecase.GetListContentRecommendationsUseCase$invoke$3", f = "GetListContentRecommendationsUseCase.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: ok.a$c */
    static final class c extends l implements q<C16533h<? super s.d>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f100455c;

        /* renamed from: d  reason: collision with root package name */
        Object f100456d;

        /* renamed from: e  reason: collision with root package name */
        Object f100457e;

        /* renamed from: f  reason: collision with root package name */
        Object f100458f;

        /* renamed from: g  reason: collision with root package name */
        Object f100459g;

        /* renamed from: h  reason: collision with root package name */
        Object f100460h;

        /* renamed from: i  reason: collision with root package name */
        Object f100461i;

        /* renamed from: j  reason: collision with root package name */
        Object f100462j;

        /* renamed from: k  reason: collision with root package name */
        int f100463k;

        /* renamed from: l  reason: collision with root package name */
        int f100464l;

        /* renamed from: m  reason: collision with root package name */
        int f100465m;

        /* renamed from: n  reason: collision with root package name */
        int f100466n;

        /* renamed from: o  reason: collision with root package name */
        int f100467o;

        /* renamed from: p  reason: collision with root package name */
        int f100468p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f100469q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f100470r;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super s.d> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar);
            cVar.f100469q = hVar;
            cVar.f100470r = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f100468p
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r1 = r0.f100461i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f100460h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f100459g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f100458f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f100457e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f100456d
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f100455c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f100470r
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f100469q
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r20)
                goto L_0x012c
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f100469q
                TJ.h r2 = (TJ.C16533h) r2
                java.lang.Object r4 = r0.f100470r
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                qv.e r11 = qv.e.WARN
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x005c:
                boolean r6 = r5.hasNext()
                r13 = 0
                if (r6 == 0) goto L_0x0074
                java.lang.Object r6 = r5.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r11, r13)
                if (r7 == 0) goto L_0x005c
                r12.add(r6)
                goto L_0x005c
            L_0x0074:
                java.util.Iterator r14 = r12.iterator()
                r15 = 0
                r7 = r12
                r5 = r15
                r6 = r5
            L_0x007c:
                boolean r8 = r14.hasNext()
                if (r8 == 0) goto L_0x0103
                java.lang.Object r16 = r14.next()
                r7 = r16
                qv.b r7 = (qv.C11819b) r7
                if (r5 != 0) goto L_0x009c
                java.lang.String r8 = "Error loading list content recommendations"
                java.lang.String r8 = qv.C11818a.a(r8, r4)
                if (r8 != 0) goto L_0x0098
                r7 = r16
                goto L_0x0103
            L_0x0098:
                java.lang.String r5 = qv.C11820c.a(r8)
            L_0x009c:
                r17 = r5
                if (r6 != 0) goto L_0x00ee
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r6 = 36
                r8 = 2
                java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r8, r15)
                r9 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r9, r15, r8, r15)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x00bf
                goto L_0x00c5
            L_0x00bf:
                java.lang.String r5 = "Kt"
                java.lang.String r5 = HJ.C15854t.P0(r6, r5)
            L_0x00c5:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r8 = "main"
                boolean r6 = HJ.C15854t.b0(r6, r8, r3)
                if (r6 == 0) goto L_0x00d8
                java.lang.String r6 = "m"
                goto L_0x00da
            L_0x00d8:
                java.lang.String r6 = "b"
            L_0x00da:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                java.lang.String r6 = "|"
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
            L_0x00ee:
                r18 = r6
                r8 = 0
                r5 = r7
                r6 = r11
                r7 = r18
                r9 = r4
                r10 = r17
                r5.a(r6, r7, r8, r9, r10)
                r7 = r16
                r5 = r17
                r6 = r18
                goto L_0x007c
            L_0x0103:
                pk.s$d$b r8 = pk.s.d.b.f101074a
                r0.f100469q = r2
                r0.f100470r = r4
                r0.f100455c = r2
                r0.f100456d = r2
                r0.f100457e = r11
                r0.f100458f = r5
                r0.f100459g = r6
                r0.f100460h = r12
                r0.f100461i = r14
                r0.f100462j = r7
                r0.f100463k = r13
                r0.f100464l = r13
                r0.f100465m = r13
                r0.f100466n = r13
                r0.f100467o = r13
                r0.f100468p = r3
                java.lang.Object r2 = r2.emit(r8, r0)
                if (r2 != r1) goto L_0x012c
                return r1
            L_0x012c:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ok.C11682a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ok.a$d */
    public static final class d implements C16532g<s.d.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11682a f100472b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C14550b f100473c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ok.a$d$a  reason: collision with other inner class name */
        public static final class C2341a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100474a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11682a f100475b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C14550b f100476c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.usecase.GetListContentRecommendationsUseCase$invoke$lambda$1$$inlined$map$1$2", f = "GetListContentRecommendationsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ok.a$d$a$a  reason: collision with other inner class name */
            public static final class C2342a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100477c;

                /* renamed from: d  reason: collision with root package name */
                int f100478d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2341a f100479e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2342a(C2341a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100479e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100477c = obj;
                    this.f100478d |= Integer.MIN_VALUE;
                    return this.f100479e.emit((Object) null, this);
                }
            }

            public C2341a(C16533h hVar, C11682a aVar, C14550b bVar) {
                this.f100474a = hVar;
                this.f100475b = aVar;
                this.f100476c = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ok.C11682a.d.C2341a.C2342a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    ok.a$d$a$a r0 = (ok.C11682a.d.C2341a.C2342a) r0
                    int r1 = r0.f100478d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100478d = r1
                    goto L_0x0018
                L_0x0013:
                    ok.a$d$a$a r0 = new ok.a$d$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f100477c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100478d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f100474a
                    java.util.Set r6 = (java.util.Set) r6
                    ok.a r2 = r5.f100475b
                    iB.b r4 = r5.f100476c
                    pk.s$d$a r6 = r2.f(r4, r6)
                    r0.f100478d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ok.C11682a.d.C2341a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar, C11682a aVar, C14550b bVar) {
            this.f100471a = gVar;
            this.f100472b = aVar;
            this.f100473c = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100471a.collect(new C2341a(hVar, this.f100472b, this.f100473c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ok.a$e */
    public static final class e<T> implements Comparator {
        public final int compare(T t10, T t11) {
            boolean z10 = false;
            Boolean valueOf = Boolean.valueOf(((ProductItem) t10).c() == null);
            if (((ProductItem) t11).c() == null) {
                z10 = true;
            }
            return C17035a.e(valueOf, Boolean.valueOf(z10));
        }
    }

    public C11682a(C14526a aVar, C12860a aVar2, C14613b bVar, a aVar3) {
        C17542s.j(aVar, "shoppingListRecommendationsRepository");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(aVar3, "appConfigApi");
        this.f100440a = aVar;
        this.f100441b = aVar2;
        this.f100442c = bVar;
        this.f100443d = aVar3;
    }

    /* access modifiers changed from: private */
    public final s.d.a f(C14550b bVar, Set<String> set) {
        List g12 = C16877v.g1(bVar.c(), new e());
        d1 g10 = g((ProductItem) C16877v.w0(g12), set, true);
        Iterable<ProductItem> n02 = C16877v.n0(g12, 1);
        ArrayList arrayList = new ArrayList(C16877v.y(n02, 10));
        for (ProductItem h10 : n02) {
            arrayList.add(h(this, h10, set, false, 2, (Object) null));
        }
        return new s.d.a(bVar.b(), g10, C15985a.l(arrayList), C15985a.h(bVar.a()));
    }

    private final d1 g(ProductItem productItem, Set<String> set, boolean z10) {
        return B0.o(productItem, C16877v.n(), set, this.f100443d.s(), this.f100443d.w(), false, true, false, z10, false, 320, (Object) null);
    }

    static /* synthetic */ d1 h(C11682a aVar, ProductItem productItem, Set set, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return aVar.g(productItem, set, z10);
    }

    public final C16532g<s.d> e(String str) {
        C17542s.j(str, "listId");
        return C16534i.g(C16534i.g0(C16534i.H(new b(this, str, (C17164e<? super b>) null)), new C2340a((C17164e) null, this)), new c((C17164e<? super c>) null));
    }
}
