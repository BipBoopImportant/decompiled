package Nj;

import Nj.c;
import Ry.k;
import XH.x;
import YH.C16877v;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import dI.C17164e;
import eI.C17187b;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rz.C15026t;
import rz.C15031y;
import rz.U;
import rz.Y;
import rz.a0;
import rz.b0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bHB¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LNj/d;", "LNj/c;", "LRy/k;", "upptackaRepository", "LjB/b;", "shoppingListRepo", "<init>", "(LRy/k;LjB/b;)V", "Lrz/a0;", "products", "", "", "favorites", "LXH/x;", "LNj/c$b;", "a", "(Lrz/a0;Ljava/util/Set;)Ljava/lang/Object;", "listId", "invoke-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "invoke", "LRy/k;", "b", "LjB/b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final k f83781a;

    /* renamed from: b  reason: collision with root package name */
    private final C14613b f83782b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.domain.usecase.LoadProductsFromUpptackaUseCaseImpl", f = "LoadProductsFromUpptackaUseCaseImpl.kt", l = {41, 42}, m = "invoke-gIAlu-s")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f83783c;

        /* renamed from: d  reason: collision with root package name */
        Object f83784d;

        /* renamed from: e  reason: collision with root package name */
        Object f83785e;

        /* renamed from: f  reason: collision with root package name */
        Object f83786f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f83787g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f83788h;

        /* renamed from: i  reason: collision with root package name */
        int f83789i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f83788h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f83787g = obj;
            this.f83789i |= Integer.MIN_VALUE;
            Object r22 = this.f83788h.m6invokegIAlus((String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public d(k kVar, C14613b bVar) {
        C17542s.j(kVar, "upptackaRepository");
        C17542s.j(bVar, "shoppingListRepo");
        this.f83781a = kVar;
        this.f83782b = bVar;
    }

    private final Object a(a0 a0Var, Set<String> set) {
        Set<String> set2 = set;
        List V02 = C16877v.V0(a0Var.a(), a0Var.b());
        Iterable<b0> c10 = a0Var.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (b0 b0Var : c10) {
            arrayList.add(b0.b(b0Var, (String) null, (String) null, (ProductLiteRemote) null, (U) null, (C15031y) null, (C15026t) null, (Y) null, set2 != null ? set2.contains(b0Var.d()) : false, 0, 383, (Object) null));
        }
        x.a aVar = x.f139812b;
        return x.b(new c.b(V02, arrayList));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: dI.e<? super XH.x<Nj.c$b>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m6invokegIAlus(java.lang.String r8, dI.C17164e<? super XH.x<Nj.c.b>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Nj.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Nj.d$a r0 = (Nj.d.a) r0
            int r1 = r0.f83789i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f83789i = r1
            goto L_0x0018
        L_0x0013:
            Nj.d$a r0 = new Nj.d$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f83787g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f83789i
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x005d
            if (r3 == r5) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            java.lang.Object r8 = r0.f83786f
            Ry.j r8 = (Ry.j) r8
            java.lang.Object r9 = r0.f83785e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f83784d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f83783c
            Nj.d r9 = (Nj.d) r9
            XH.y.b(r1)
            goto L_0x009a
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r8 = r0.f83786f
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.Object r8 = r0.f83785e
            r9 = r8
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r8 = r0.f83784d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r0.f83783c
            Nj.d r3 = (Nj.d) r3
            XH.y.b(r1)
            r6 = r1
            r1 = r9
            r9 = r3
            r3 = r6
            goto L_0x0080
        L_0x005d:
            XH.y.b(r1)
            if (r8 == 0) goto L_0x00db
            int r1 = r8.length()
            if (r1 != 0) goto L_0x006a
            goto L_0x00db
        L_0x006a:
            Ry.k r1 = r7.f83781a
            r0.f83783c = r7
            r0.f83784d = r8
            r0.f83785e = r9
            r0.f83786f = r8
            r0.f83789i = r5
            java.lang.Object r1 = r1.a(r8, r0)
            if (r1 != r2) goto L_0x007d
            return r2
        L_0x007d:
            r3 = r1
            r1 = r9
            r9 = r7
        L_0x0080:
            Ry.j r3 = (Ry.j) r3
            jB.b r5 = r9.f83782b
            TJ.g r5 = r5.f()
            r0.f83783c = r9
            r0.f83784d = r8
            r0.f83785e = r1
            r0.f83786f = r3
            r0.f83789i = r4
            java.lang.Object r1 = TJ.C16534i.D(r5, r0)
            if (r1 != r2) goto L_0x0099
            return r2
        L_0x0099:
            r8 = r3
        L_0x009a:
            java.util.Set r1 = (java.util.Set) r1
            Ry.j$a r0 = Ry.j.a.f115635a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r8, r0)
            if (r0 == 0) goto L_0x00b1
            XH.x$a r8 = XH.x.f139812b
            Nj.c$a$a r8 = Nj.c.a.C1687a.f83777a
            java.lang.Object r8 = XH.y.a(r8)
            java.lang.Object r8 = XH.x.b(r8)
            goto L_0x00d4
        L_0x00b1:
            boolean r0 = r8 instanceof Ry.j.b
            if (r0 == 0) goto L_0x00c0
            Ry.j$b r8 = (Ry.j.b) r8
            rz.a0 r8 = r8.a()
            java.lang.Object r8 = r9.a(r8, r1)
            goto L_0x00d4
        L_0x00c0:
            Ry.j$c r9 = Ry.j.c.f115637a
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 == 0) goto L_0x00d5
            XH.x$a r8 = XH.x.f139812b
            Nj.c$a$b r8 = Nj.c.a.b.f83778a
            java.lang.Object r8 = XH.y.a(r8)
            java.lang.Object r8 = XH.x.b(r8)
        L_0x00d4:
            return r8
        L_0x00d5:
            XH.t r8 = new XH.t
            r8.<init>()
            throw r8
        L_0x00db:
            XH.x$a r8 = XH.x.f139812b
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            java.lang.Object r8 = XH.y.a(r8)
            java.lang.Object r8 = XH.x.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Nj.d.m6invokegIAlus(java.lang.String, dI.e):java.lang.Object");
    }
}
