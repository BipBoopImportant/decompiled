package pj;

import FB.C12860a;
import QJ.M;
import QJ.Q;
import Ry.h;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import oj.C11680a;
import oj.C11681b;
import oj.g;
import oj.i;
import rz.C15027u;
import rz.I;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b&\u0010'J$\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\f2\u0006\u0010)\u001a\u00020(HB¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u00100¨\u00061"}, d2 = {"Lpj/a;", "", "LRy/h;", "scanAndGoProductRepository", "LFB/a;", "localStoreSelectionRepository", "LQJ/M;", "ioDispatcher", "<init>", "(LRy/h;LFB/a;LQJ/M;)V", "Loj/b;", "item", "LXH/x;", "", "g", "(Loj/b;)Ljava/lang/Object;", "Lrz/I;", "product", "h", "(Lrz/I;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "productItem", "Lrz/Q;", "productImage", "Loj/h;", "e", "(Lcom/ingka/ikea/core/model/product/ProductItem;Lrz/Q;)Loj/h;", "", "packageCount", "", "analyticsItemNo", "storeId", "Loj/f;", "c", "(ILjava/lang/String;Ljava/lang/String;)Loj/f;", "Lrz/u;", "mustHaves", "Loj/g;", "d", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Loj/g;", "Loj/i;", "type", "f", "(Loj/i;LdI/e;)Ljava/lang/Object;", "a", "LRy/h;", "b", "LFB/a;", "LQJ/M;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pj.a  reason: case insensitive filesystem */
public final class C11719a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f100828a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f100829b;

    /* renamed from: c  reason: collision with root package name */
    private final M f100830c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.usecase.GetBottomSheetContentUseCase", f = "GetBottomSheetContentUseCase.kt", l = {51}, m = "invoke-gIAlu-s")
    /* renamed from: pj.a$a  reason: collision with other inner class name */
    static final class C2368a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f100831c;

        /* renamed from: d  reason: collision with root package name */
        Object f100832d;

        /* renamed from: e  reason: collision with root package name */
        Object f100833e;

        /* renamed from: f  reason: collision with root package name */
        Object f100834f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f100835g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C11719a f100836h;

        /* renamed from: i  reason: collision with root package name */
        int f100837i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2368a(C11719a aVar, C17164e<? super C2368a> eVar) {
            super(eVar);
            this.f100836h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f100835g = obj;
            this.f100837i |= Integer.MIN_VALUE;
            Object f10 = this.f100836h.f((i) null, this);
            return f10 == C17187b.f() ? f10 : x.a(f10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LXH/x;", "", "Loj/b;", "<anonymous>", "(LQJ/Q;)LXH/x;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.usecase.GetBottomSheetContentUseCase$invoke$2", f = "GetBottomSheetContentUseCase.kt", l = {52, 54}, m = "invokeSuspend")
    /* renamed from: pj.a$b */
    static final class b extends l implements p<Q, C17164e<? super x<? extends List<? extends C11681b>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f100838c;

        /* renamed from: d  reason: collision with root package name */
        Object f100839d;

        /* renamed from: e  reason: collision with root package name */
        Object f100840e;

        /* renamed from: f  reason: collision with root package name */
        int f100841f;

        /* renamed from: g  reason: collision with root package name */
        int f100842g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C11719a f100843h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i f100844i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C11719a aVar, i iVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f100843h = aVar;
            this.f100844i = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f100843h, this.f100844i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super x<? extends List<? extends C11681b>>> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f100842g;
            if (i10 == 0) {
                y.b(obj);
                h a10 = this.f100843h.f100828a;
                String a11 = ((i.d) this.f100844i).a();
                this.f100842g = 1;
                obj2 = a10.d(a11, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else if (i10 == 2) {
                I i11 = (I) this.f100840e;
                C11719a aVar = (C11719a) this.f100839d;
                y.b(obj);
                obj2 = (List) obj;
                return x.a(x.b(obj2));
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11719a aVar2 = this.f100843h;
            if (x.h(obj2)) {
                I i12 = (I) obj2;
                this.f100838c = obj2;
                this.f100839d = aVar2;
                this.f100840e = i12;
                this.f100841f = 0;
                this.f100842g = 2;
                obj = aVar2.h(i12, this);
                if (obj == f10) {
                    return f10;
                }
                obj2 = (List) obj;
            }
            return x.a(x.b(obj2));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.usecase.GetBottomSheetContentUseCase", f = "GetBottomSheetContentUseCase.kt", l = {81}, m = "toMustHavesAndMultiPackageContent")
    /* renamed from: pj.a$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f100845c;

        /* renamed from: d  reason: collision with root package name */
        Object f100846d;

        /* renamed from: e  reason: collision with root package name */
        Object f100847e;

        /* renamed from: f  reason: collision with root package name */
        Object f100848f;

        /* renamed from: g  reason: collision with root package name */
        Object f100849g;

        /* renamed from: h  reason: collision with root package name */
        Object f100850h;

        /* renamed from: i  reason: collision with root package name */
        Object f100851i;

        /* renamed from: j  reason: collision with root package name */
        int f100852j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f100853k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C11719a f100854l;

        /* renamed from: m  reason: collision with root package name */
        int f100855m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C11719a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f100854l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f100853k = obj;
            this.f100855m |= Integer.MIN_VALUE;
            return this.f100854l.h((I) null, this);
        }
    }

    public C11719a(h hVar, C12860a aVar, M m10) {
        C17542s.j(hVar, "scanAndGoProductRepository");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(m10, "ioDispatcher");
        this.f100828a = hVar;
        this.f100829b = aVar;
        this.f100830c = m10;
    }

    private final oj.f c(int i10, String str, String str2) {
        return new oj.f(i10, new C11680a.C2338a(str, str2));
    }

    private final g d(List<C15027u> list, String str, String str2) {
        Iterable<C15027u> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C15027u uVar : iterable) {
            arrayList.add(new g.a(uVar.b(), uVar.a()));
        }
        return new g(C16877v.m0(arrayList), new C11680a.b(str, str2));
    }

    private final oj.h e(ProductItem productItem, rz.Q q10) {
        String str = null;
        String b10 = q10 != null ? q10.b() : null;
        String str2 = "";
        if (b10 == null) {
            b10 = str2;
        }
        if (q10 != null) {
            str = q10.a();
        }
        if (str != null) {
            str2 = str;
        }
        return new oj.h(b10, str2, productItem.e().i(), productItem.e().c());
    }

    private final Object g(C11681b bVar) {
        x.a aVar = x.f139812b;
        return x.b(C16877v.e(bVar));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(rz.I r18, dI.C17164e<? super java.util.List<? extends oj.C11681b>> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof pj.C11719a.c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            pj.a$c r3 = (pj.C11719a.c) r3
            int r4 = r3.f100855m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f100855m = r4
            goto L_0x001e
        L_0x0019:
            pj.a$c r3 = new pj.a$c
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f100853k
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f100855m
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0056
            if (r6 != r8) goto L_0x004e
            java.lang.Object r1 = r3.f100851i
            rz.Q r1 = (rz.Q) r1
            java.lang.Object r1 = r3.f100850h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r3.f100849g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r3.f100848f
            rz.I r5 = (rz.I) r5
            java.lang.Object r6 = r3.f100847e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r3.f100846d
            rz.I r6 = (rz.I) r6
            java.lang.Object r3 = r3.f100845c
            pj.a r3 = (pj.C11719a) r3
            XH.y.b(r4)
            r6 = r1
            r1 = r5
            goto L_0x00a4
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0056:
            XH.y.b(r4)
            com.ingka.ikea.app.base.ProductKey r4 = r18.l()
            java.lang.String r4 = r4.getProductNo()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r9 = r18.b()
            java.lang.Object r9 = YH.C16877v.y0(r9)
            rz.Q r9 = (rz.Q) r9
            com.ingka.ikea.core.model.product.ProductItem r10 = r18.k()
            oj.h r10 = r0.e(r10, r9)
            r6.add(r10)
            FB.a r10 = r0.f100829b
            TJ.g r10 = r10.b()
            TJ.g r10 = TJ.C16534i.A(r10)
            r3.f100845c = r0
            r3.f100846d = r1
            r3.f100847e = r2
            r3.f100848f = r1
            r3.f100849g = r4
            r3.f100850h = r6
            r3.f100851i = r9
            r3.f100852j = r7
            r3.f100855m = r8
            java.lang.Object r2 = TJ.C16534i.B(r10, r3)
            if (r2 != r5) goto L_0x009e
            return r5
        L_0x009e:
            r3 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L_0x00a4:
            EB.d r4 = (EB.C12832d) r4
            java.lang.String r4 = r4.e()
            rz.v r5 = r1.f()
            int r5 = r5.b()
            r9 = 2
            if (r5 < r9) goto L_0x00bc
            oj.f r5 = r3.c(r5, r2, r4)
            r6.add(r5)
        L_0x00bc:
            rz.v r1 = r1.f()
            java.util.List r1 = r1.a()
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00d4
            oj.g r1 = r3.d(r1, r2, r4)
            r6.add(r1)
        L_0x00d4:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0190
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Need MustHaves or PackageCount: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0103:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x011a
            java.lang.Object r5 = r3.next()
            r10 = r5
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r2, r7)
            if (r10 == 0) goto L_0x0103
            r4.add(r5)
            goto L_0x0103
        L_0x011a:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = r4
            r7 = r5
        L_0x0121:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x0190
            java.lang.Object r10 = r3.next()
            qv.b r10 = (qv.C11819b) r10
            if (r5 != 0) goto L_0x013a
            java.lang.String r5 = qv.C11818a.a(r4, r1)
            if (r5 != 0) goto L_0x0136
            goto L_0x0190
        L_0x0136:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x013a:
            if (r7 != 0) goto L_0x0187
            java.lang.Class<rz.I> r7 = rz.I.class
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r11 = 36
            java.lang.String r11 = HJ.C15854t.s1(r7, r11, r4, r9, r4)
            r12 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r12, r4, r9, r4)
            int r12 = r11.length()
            if (r12 != 0) goto L_0x0158
            goto L_0x015e
        L_0x0158:
            java.lang.String r7 = "Kt"
            java.lang.String r7 = HJ.C15854t.P0(r11, r7)
        L_0x015e:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "main"
            boolean r11 = HJ.C15854t.b0(r11, r12, r8)
            if (r11 == 0) goto L_0x0171
            java.lang.String r11 = "m"
            goto L_0x0173
        L_0x0171:
            java.lang.String r11 = "b"
        L_0x0173:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "|"
            r12.append(r11)
            r12.append(r7)
            java.lang.String r7 = r12.toString()
        L_0x0187:
            r13 = 0
            r11 = r2
            r12 = r7
            r14 = r1
            r15 = r5
            r10.a(r11, r12, r13, r14, r15)
            goto L_0x0121
        L_0x0190:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r1 = YH.C16877v.m0(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pj.C11719a.h(rz.I, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(oj.i r7, dI.C17164e<? super XH.x<? extends java.util.List<? extends oj.C11681b>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pj.C11719a.C2368a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            pj.a$a r0 = (pj.C11719a.C2368a) r0
            int r1 = r0.f100837i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f100837i = r1
            goto L_0x0018
        L_0x0013:
            pj.a$a r0 = new pj.a$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f100835g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f100837i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r7 = r0.f100834f
            oj.i r7 = (oj.i) r7
            java.lang.Object r7 = r0.f100833e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f100832d
            oj.i r7 = (oj.i) r7
            java.lang.Object r7 = r0.f100831c
            pj.a r7 = (pj.C11719a) r7
            XH.y.b(r1)
            goto L_0x0091
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            XH.y.b(r1)
            boolean r1 = r7 instanceof oj.i.c
            if (r1 == 0) goto L_0x0058
            oj.e r8 = new oj.e
            oj.i$c r7 = (oj.i.c) r7
            java.lang.String r7 = r7.a()
            r8.<init>(r7)
            java.lang.Object r7 = r6.g(r8)
            goto L_0x00a5
        L_0x0058:
            boolean r1 = r7 instanceof oj.i.b
            if (r1 == 0) goto L_0x0074
            oj.d r8 = new oj.d
            oj.i$b r7 = (oj.i.b) r7
            int r0 = r7.a()
            java.lang.String r1 = r7.b()
            java.lang.String r7 = r7.c()
            r8.<init>(r0, r1, r7)
            java.lang.Object r7 = r6.g(r8)
            goto L_0x00a5
        L_0x0074:
            boolean r1 = r7 instanceof oj.i.d
            if (r1 == 0) goto L_0x0098
            QJ.M r1 = r6.f100830c
            pj.a$b r3 = new pj.a$b
            r5 = 0
            r3.<init>(r6, r7, r5)
            r0.f100831c = r6
            r0.f100832d = r7
            r0.f100833e = r8
            r0.f100834f = r7
            r0.f100837i = r4
            java.lang.Object r1 = QJ.C16310i.g(r1, r3, r0)
            if (r1 != r2) goto L_0x0091
            return r2
        L_0x0091:
            XH.x r1 = (XH.x) r1
            java.lang.Object r7 = r1.j()
            return r7
        L_0x0098:
            boolean r7 = r7 instanceof oj.i.a
            if (r7 == 0) goto L_0x00a6
            oj.c r7 = new oj.c
            r7.<init>()
            java.lang.Object r7 = r6.g(r7)
        L_0x00a5:
            return r7
        L_0x00a6:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pj.C11719a.f(oj.i, dI.e):java.lang.Object");
    }
}
