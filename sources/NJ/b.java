package Nj;

import FB.C12860a;
import Ry.f;
import Ry.k;
import Tj.D;
import XH.x;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import rz.b0;
import tz.C15100a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHB¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"LNj/b;", "LNj/a;", "LRy/k;", "upptackaRepository", "LRy/f;", "scanAndGoCartRepositoryFactory", "LSy/a;", "scanAndGoAnalytics", "LIl/a;", "appConfigApi", "LFB/a;", "localStoreSelectionRepository", "Ltz/a;", "getProfileState", "LRy/a;", "settingsRepo", "<init>", "(LRy/k;LRy/f;LSy/a;LIl/a;LFB/a;Ltz/a;LRy/a;)V", "", "numOfSupportedProducts", "numOfUnSupportedProducts", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "errorType", "LXH/N;", "c", "(IILcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;)V", "", "Lrz/b0;", "products", "b", "(Ljava/util/List;)V", "supportedProducts", "unSupportedProducts", "LXH/x;", "LNj/a$b;", "a", "(Ljava/util/List;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LRy/k;", "LRy/f;", "LSy/a;", "d", "LIl/a;", "e", "LFB/a;", "f", "Ltz/a;", "g", "LRy/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final k f83753a;

    /* renamed from: b  reason: collision with root package name */
    private final f f83754b;

    /* renamed from: c  reason: collision with root package name */
    private final Sy.a f83755c;

    /* renamed from: d  reason: collision with root package name */
    private final Il.a f83756d;

    /* renamed from: e  reason: collision with root package name */
    private final C12860a f83757e;

    /* renamed from: f  reason: collision with root package name */
    private final C15100a f83758f;

    /* renamed from: g  reason: collision with root package name */
    private final Ry.a f83759g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.domain.usecase.ImportProductsFromUpptackaUseCaseImpl", f = "ImportProductsFromUpptackaUseCaseImpl.kt", l = {53, 65, 68, 71}, m = "invoke-0E7RQCE")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f83760c;

        /* renamed from: d  reason: collision with root package name */
        Object f83761d;

        /* renamed from: e  reason: collision with root package name */
        Object f83762e;

        /* renamed from: f  reason: collision with root package name */
        Object f83763f;

        /* renamed from: g  reason: collision with root package name */
        Object f83764g;

        /* renamed from: h  reason: collision with root package name */
        Object f83765h;

        /* renamed from: i  reason: collision with root package name */
        Object f83766i;

        /* renamed from: j  reason: collision with root package name */
        Object f83767j;

        /* renamed from: k  reason: collision with root package name */
        Object f83768k;

        /* renamed from: l  reason: collision with root package name */
        Object f83769l;

        /* renamed from: m  reason: collision with root package name */
        Object f83770m;

        /* renamed from: n  reason: collision with root package name */
        int f83771n;

        /* renamed from: o  reason: collision with root package name */
        int f83772o;

        /* renamed from: p  reason: collision with root package name */
        int f83773p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f83774q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b f83775r;

        /* renamed from: s  reason: collision with root package name */
        int f83776s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f83775r = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f83774q = obj;
            this.f83776s |= Integer.MIN_VALUE;
            Object a10 = this.f83775r.a((List<b0>) null, (List<b0>) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public b(k kVar, f fVar, Sy.a aVar, Il.a aVar2, C12860a aVar3, C15100a aVar4, Ry.a aVar5) {
        C17542s.j(kVar, "upptackaRepository");
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "scanAndGoAnalytics");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(aVar3, "localStoreSelectionRepository");
        C17542s.j(aVar4, "getProfileState");
        C17542s.j(aVar5, "settingsRepo");
        this.f83753a = kVar;
        this.f83754b = fVar;
        this.f83755c = aVar;
        this.f83756d = aVar2;
        this.f83757e = aVar3;
        this.f83758f = aVar4;
        this.f83759g = aVar5;
    }

    private final void b(List<b0> list) {
        String b10 = this.f83756d.s().b();
        for (b0 b0Var : list) {
            this.f83755c.K(b0Var.g().d(), b0Var.g().e(), b10, b0Var.h().c(), b0Var.h().b(), D.a(b0Var.f()));
        }
    }

    private final void c(int i10, int i11, UiError.Type type) {
        this.f83755c.x(type.getValue(), i10, i11);
    }

    static /* synthetic */ void d(b bVar, int i10, int i11, UiError.Type type, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            type = UiError.Type.GENERIC;
        }
        bVar.c(i10, i11, type);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.util.List<rz.b0> r25, java.util.List<rz.b0> r26, dI.C17164e<? super XH.x<? extends Nj.a.b>> r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            boolean r3 = r2 instanceof Nj.b.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Nj.b$a r3 = (Nj.b.a) r3
            int r4 = r3.f83776s
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f83776s = r4
            goto L_0x001e
        L_0x0019:
            Nj.b$a r3 = new Nj.b$a
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f83774q
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f83776s
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L_0x00cf
            if (r6 == r10) goto L_0x00b5
            if (r6 == r9) goto L_0x0097
            if (r6 == r8) goto L_0x0074
            if (r6 != r7) goto L_0x006c
            int r1 = r3.f83772o
            int r2 = r3.f83771n
            java.lang.Object r6 = r3.f83770m
            rz.b0 r6 = (rz.b0) r6
            java.lang.Object r6 = r3.f83768k
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r8 = r3.f83767j
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r9 = r3.f83766i
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r3.f83765h
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r3.f83764g
            Ry.i r12 = (Ry.i) r12
            java.lang.Object r13 = r3.f83763f
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r3.f83762e
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r3.f83761d
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r7 = r3.f83760c
            Nj.b r7 = (Nj.b) r7
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            r4.j()
            r0 = 0
            r4 = 4
            goto L_0x01df
        L_0x006c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0074:
            int r1 = r3.f83771n
            java.lang.Object r2 = r3.f83766i
            EB.d r2 = (EB.C12832d) r2
            java.lang.Object r2 = r3.f83765h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r3.f83764g
            Ry.i r6 = (Ry.i) r6
            java.lang.Object r7 = r3.f83763f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r3.f83762e
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r3.f83761d
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r3.f83760c
            Nj.b r10 = (Nj.b) r10
            XH.y.b(r4)
            goto L_0x0179
        L_0x0097:
            java.lang.Object r1 = r3.f83764g
            Ry.i r1 = (Ry.i) r1
            java.lang.Object r2 = r3.f83763f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r6 = r3.f83762e
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.f83761d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r9 = r3.f83760c
            Nj.b r9 = (Nj.b) r9
            XH.y.b(r4)
            r10 = r9
            r9 = r7
            r7 = r2
            r2 = r6
            r6 = r1
            goto L_0x0140
        L_0x00b5:
            java.lang.Object r1 = r3.f83763f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r3.f83762e
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r3.f83761d
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.f83760c
            Nj.b r7 = (Nj.b) r7
            XH.y.b(r4)
            r23 = r4
            r4 = r1
            r1 = r6
        L_0x00cc:
            r6 = r23
            goto L_0x00ed
        L_0x00cf:
            XH.y.b(r4)
            Ry.k r4 = r0.f83753a
            r3.f83760c = r0
            r3.f83761d = r1
            r6 = r26
            r3.f83762e = r6
            r3.f83763f = r2
            r3.f83776s = r10
            java.lang.Object r4 = r4.b(r1, r3)
            if (r4 != r5) goto L_0x00e7
            return r5
        L_0x00e7:
            r7 = r0
            r23 = r4
            r4 = r2
            r2 = r6
            goto L_0x00cc
        L_0x00ed:
            Ry.i r6 = (Ry.i) r6
            Ry.i$a r10 = Ry.i.a.f115633a
            boolean r10 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r10 == 0) goto L_0x0118
            int r17 = r1.size()
            int r18 = r2.size()
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r7
            d(r16, r17, r18, r19, r20, r21)
            XH.x$a r1 = XH.x.f139812b
            Nj.a$a$a r1 = Nj.a.C1684a.C1685a.f83751a
            java.lang.Object r1 = XH.y.a(r1)
            java.lang.Object r1 = XH.x.b(r1)
            goto L_0x01ea
        L_0x0118:
            Ry.i$b r10 = Ry.i.b.f115634a
            boolean r10 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r10 == 0) goto L_0x01eb
            r7.b(r1)
            Ry.a r10 = r7.f83759g
            TJ.g r10 = r10.b()
            r3.f83760c = r7
            r3.f83761d = r1
            r3.f83762e = r2
            r3.f83763f = r4
            r3.f83764g = r6
            r3.f83776s = r9
            java.lang.Object r9 = TJ.C16534i.B(r10, r3)
            if (r9 != r5) goto L_0x013c
            return r5
        L_0x013c:
            r10 = r7
            r7 = r4
            r4 = r9
            r9 = r1
        L_0x0140:
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r4 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r4
            if (r4 == 0) goto L_0x0149
            boolean r1 = r4.e()
            goto L_0x014a
        L_0x0149:
            r1 = 0
        L_0x014a:
            if (r1 == 0) goto L_0x01e2
            FB.a r4 = r10.f83757e
            EB.d r4 = r4.c()
            if (r4 == 0) goto L_0x015a
            java.lang.String r12 = r4.e()
            if (r12 != 0) goto L_0x015c
        L_0x015a:
            java.lang.String r12 = ""
        L_0x015c:
            tz.a r13 = r10.f83758f
            r3.f83760c = r10
            r3.f83761d = r9
            r3.f83762e = r2
            r3.f83763f = r7
            r3.f83764g = r6
            r3.f83765h = r12
            r3.f83766i = r4
            r3.f83771n = r1
            r3.f83776s = r8
            java.lang.Object r4 = r13.a(r3)
            if (r4 != r5) goto L_0x0177
            return r5
        L_0x0177:
            r8 = r2
            r2 = r12
        L_0x0179:
            rz.K r4 = (rz.K) r4
            java.lang.String r4 = r4.a()
            r12 = r9
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r13 = r12.iterator()
            r14 = r8
            r15 = r9
            r8 = r12
            r9 = r4
            r12 = r6
            r6 = r13
            r13 = r7
            r7 = r10
            r10 = r2
            r2 = r1
            r1 = 0
        L_0x0191:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x01e2
            java.lang.Object r4 = r6.next()
            r11 = r4
            rz.b0 r11 = (rz.b0) r11
            Ry.f r0 = r7.f83754b
            Ry.e r16 = r0.invoke()
            java.lang.String r17 = r11.d()
            rz.U r0 = r11.h()
            int r18 = r0.c()
            r3.f83760c = r7
            r3.f83761d = r15
            r3.f83762e = r14
            r3.f83763f = r13
            r3.f83764g = r12
            r3.f83765h = r10
            r3.f83766i = r9
            r3.f83767j = r8
            r3.f83768k = r6
            r3.f83769l = r4
            r3.f83770m = r11
            r3.f83771n = r2
            r3.f83772o = r1
            r0 = 0
            r3.f83773p = r0
            r4 = 4
            r3.f83776s = r4
            r19 = 0
            r20 = r10
            r21 = r9
            r22 = r3
            java.lang.Object r11 = r16.m(r17, r18, r19, r20, r21, r22)
            if (r11 != r5) goto L_0x01df
            return r5
        L_0x01df:
            r0 = r24
            goto L_0x0191
        L_0x01e2:
            XH.x$a r0 = XH.x.f139812b
            Nj.a$b$a r0 = Nj.a.b.C1686a.f83752a
            java.lang.Object r1 = XH.x.b(r0)
        L_0x01ea:
            return r1
        L_0x01eb:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Nj.b.a(java.util.List, java.util.List, dI.e):java.lang.Object");
    }
}
