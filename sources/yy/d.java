package Yy;

import TJ.C16532g;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import fz.C14490c;
import gz.C14524b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"LYy/d;", "LYy/c;", "Lfz/c;", "dao", "<init>", "(Lfz/c;)V", "LXH/N;", "c", "(LdI/e;)Ljava/lang/Object;", "LTJ/g;", "", "Lgz/b;", "a", "()LTJ/g;", "discounts", "b", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Lfz/c;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final C14490c f118233a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCartDiscountLocalDataSourceImpl", f = "ScanAndGoCartDiscountLocalDataSource.kt", l = {27, 28}, m = "syncDiscounts")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118234c;

        /* renamed from: d  reason: collision with root package name */
        Object f118235d;

        /* renamed from: e  reason: collision with root package name */
        Object f118236e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f118237f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f118238g;

        /* renamed from: h  reason: collision with root package name */
        int f118239h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f118238g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118237f = obj;
            this.f118239h |= Integer.MIN_VALUE;
            return this.f118238g.b((List<C14524b>) null, this);
        }
    }

    public d(C14490c cVar) {
        C17542s.j(cVar, "dao");
        this.f118233a = cVar;
    }

    private final Object c(C17164e<? super C16807N> eVar) {
        Object b10 = this.f118233a.b(eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public C16532g<List<C14524b>> a() {
        return this.f118233a.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: dI.e<? super XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.util.List<gz.C14524b> r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Yy.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Yy.d$a r0 = (Yy.d.a) r0
            int r1 = r0.f118239h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118239h = r1
            goto L_0x0018
        L_0x0013:
            Yy.d$a r0 = new Yy.d$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f118237f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118239h
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0051
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r7 = r0.f118236e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f118235d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f118234c
            Yy.d r7 = (Yy.d) r7
            XH.y.b(r1)
            goto L_0x0075
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.f118236e
            r8 = r7
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r7 = r0.f118235d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r3 = r0.f118234c
            Yy.d r3 = (Yy.d) r3
            XH.y.b(r1)
            goto L_0x0064
        L_0x0051:
            XH.y.b(r1)
            r0.f118234c = r6
            r0.f118235d = r7
            r0.f118236e = r8
            r0.f118239h = r5
            java.lang.Object r1 = r6.c(r0)
            if (r1 != r2) goto L_0x0063
            return r2
        L_0x0063:
            r3 = r6
        L_0x0064:
            fz.c r1 = r3.f118233a
            r0.f118234c = r3
            r0.f118235d = r7
            r0.f118236e = r8
            r0.f118239h = r4
            java.lang.Object r7 = r1.c(r7, r0)
            if (r7 != r2) goto L_0x0075
            return r2
        L_0x0075:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Yy.d.b(java.util.List, dI.e):java.lang.Object");
    }
}
