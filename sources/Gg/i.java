package GG;

import OE.q;
import YH.C16877v;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pG.C17745f;
import zG.C18747a;
import zG.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LGG/i;", "LzG/a;", "LpG/f;", "swapUseCase", "LOE/q;", "sugarcube", "<init>", "(LpG/f;LOE/q;)V", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "data", "LXH/N;", "k", "(Ljava/util/List;)V", "", "itemId", "h", "(ILdI/e;)Ljava/lang/Object;", "i", "o", "LpG/f;", "p", "LOE/q;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends C18747a {

    /* renamed from: o  reason: collision with root package name */
    private final C17745f f134439o;

    /* renamed from: p  reason: collision with root package name */
    private final q f134440p;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.swap.SwapViewModel", f = "SwapViewModel.kt", l = {48}, m = "fetchItems")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f134441c;

        /* renamed from: d  reason: collision with root package name */
        Object f134442d;

        /* renamed from: e  reason: collision with root package name */
        int f134443e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f134444f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f134445g;

        /* renamed from: h  reason: collision with root package name */
        int f134446h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f134445g = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f134444f = obj;
            this.f134446h |= Integer.MIN_VALUE;
            return this.f134445g.h(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.swap.SwapViewModel", f = "SwapViewModel.kt", l = {94}, m = "loadMore")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f134447c;

        /* renamed from: d  reason: collision with root package name */
        Object f134448d;

        /* renamed from: e  reason: collision with root package name */
        Object f134449e;

        /* renamed from: f  reason: collision with root package name */
        Object f134450f;

        /* renamed from: g  reason: collision with root package name */
        Object f134451g;

        /* renamed from: h  reason: collision with root package name */
        int f134452h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f134453i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i f134454j;

        /* renamed from: k  reason: collision with root package name */
        int f134455k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f134454j = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f134453i = obj;
            this.f134455k |= Integer.MIN_VALUE;
            return this.f134454j.i(0, this);
        }
    }

    public i(C17745f fVar, q qVar) {
        C17542s.j(fVar, "swapUseCase");
        C17542s.j(qVar, "sugarcube");
        this.f134439o = fVar;
        this.f134440p = qVar;
        k(C16877v.n());
    }

    private final void k(List<CachedCatalogItem> list) {
        List<CachedCatalogItem> list2 = list;
        j(new e.c(list2, false, this.f134440p.getCountry(), this.f134440p.getLanguage(), 2, (DefaultConstructorMarker) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(int r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof GG.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            GG.i$a r0 = (GG.i.a) r0
            int r1 = r0.f134446h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f134446h = r1
            goto L_0x0018
        L_0x0013:
            GG.i$a r0 = new GG.i$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f134444f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f134446h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f134442d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f134441c
            GG.i r6 = (GG.i) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r7 = r1.j()
            goto L_0x0059
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            zG.e$b r1 = zG.e.b.f152779a
            r5.j(r1)
            pG.f r1 = r5.f134439o
            r0.f134441c = r5
            r0.f134442d = r7
            r0.f134443e = r6
            r0.f134446h = r4
            java.lang.Object r7 = r1.b(r6, r0)
            if (r7 != r2) goto L_0x0058
            return r2
        L_0x0058:
            r6 = r5
        L_0x0059:
            java.lang.Throwable r0 = XH.x.e(r7)
            if (r0 != 0) goto L_0x0065
            java.util.List r7 = (java.util.List) r7
            r6.k(r7)
            goto L_0x006f
        L_0x0065:
            zG.e$a r7 = new zG.e$a
            r0 = 0
            r1 = 0
            r7.<init>(r0, r4, r1)
            r6.j(r7)
        L_0x006f:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: GG.i.h(int, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: zG.e$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.util.Collection} */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object i(int r20, dI.C17164e<? super XH.C16807N> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof GG.i.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            GG.i$b r3 = (GG.i.b) r3
            int r4 = r3.f134455k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f134455k = r4
            goto L_0x001e
        L_0x0019:
            GG.i$b r3 = new GG.i$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f134453i
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f134455k
            r8 = 1
            if (r6 == 0) goto L_0x004d
            if (r6 != r8) goto L_0x0045
            java.lang.Object r1 = r3.f134450f
            zG.e$c r1 = (zG.e.c) r1
            java.lang.Object r1 = r3.f134449e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r3.f134448d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f134447c
            GG.i r2 = (GG.i) r2
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r3 = r4.j()
            goto L_0x00a4
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            XH.y.b(r4)
            TJ.P r4 = r19.m()
            java.lang.Object r4 = r4.getValue()
            boolean r6 = r4 instanceof zG.e.c
            if (r6 == 0) goto L_0x0060
            r6 = r4
            zG.e$c r6 = (zG.e.c) r6
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            if (r6 == 0) goto L_0x006c
            java.util.List r4 = r6.b()
            if (r4 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r9 = r4
            goto L_0x0075
        L_0x006c:
            java.util.List r9 = YH.C16877v.n()
            r18 = r9
            r9 = r4
            r4 = r18
        L_0x0075:
            zG.e$c r15 = new zG.e$c
            r16 = 12
            r17 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r10 = r15
            r11 = r4
            r7 = r15
            r15 = r16
            r16 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.j(r7)
            pG.f r7 = r0.f134439o
            r3.f134447c = r0
            r3.f134448d = r2
            r3.f134449e = r4
            r3.f134450f = r6
            r3.f134451g = r9
            r3.f134452h = r1
            r3.f134455k = r8
            java.lang.Object r3 = r7.c(r1, r3)
            if (r3 != r5) goto L_0x00a2
            return r5
        L_0x00a2:
            r2 = r0
            r1 = r4
        L_0x00a4:
            java.lang.Throwable r4 = XH.x.e(r3)
            if (r4 != 0) goto L_0x00b8
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r1 = YH.C16877v.V0(r1, r3)
            r2.k(r1)
            goto L_0x00c2
        L_0x00b8:
            zG.e$a r1 = new zG.e$a
            r3 = 0
            r4 = 0
            r1.<init>(r3, r8, r4)
            r2.j(r1)
        L_0x00c2:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: GG.i.i(int, dI.e):java.lang.Object");
    }
}
