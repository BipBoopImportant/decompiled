package x4;

import XH.C16807N;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uI.C18068q;
import x4.v;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\fB?\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000e¢\u0006\u0004\b\n\u0010\u0012J)\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u00162\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b#\u0010$JC\u0010'\u001a\u00020\u0016\"\b\b\u0001\u0010%*\u00020\u00032\u0006\u0010&\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00160\u0014H\u0007¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00028\u0000H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010-R\"\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b6\u00107R&\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001f\u00108R$\u0010?\u001a\u0004\u0018\u0001098\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0@8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u00108R\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020)0B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010CR\"\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020E0@8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00108¨\u0006G"}, d2 = {"Lx4/w;", "Lx4/v;", "D", "", "Lx4/I;", "navigator", "", "id", "", "route", "<init>", "(Lx4/I;ILjava/lang/String;)V", "(Lx4/I;Ljava/lang/String;)V", "LuI/d;", "", "LuI/q;", "Lx4/F;", "typeMap", "(Lx4/I;LuI/d;Ljava/util/Map;)V", "name", "Lkotlin/Function1;", "Lx4/j;", "LXH/N;", "argumentBuilder", "a", "(Ljava/lang/String;LnI/l;)V", "Lx4/i;", "argument", "b", "(Ljava/lang/String;Lx4/i;)V", "uriPattern", "d", "(Ljava/lang/String;)V", "Lx4/s;", "navDeepLink", "f", "(LnI/l;)V", "T", "basePath", "e", "(Ljava/lang/String;LuI/d;LnI/l;)V", "Lx4/q;", "g", "(Lx4/q;)V", "i", "()Lx4/v;", "c", "Lx4/I;", "getNavigator", "()Lx4/I;", "I", "getId", "()I", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "Ljava/util/Map;", "", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "", "arguments", "", "Ljava/util/List;", "deepLinks", "Lx4/h;", "actions", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class w<D extends v> {

    /* renamed from: a  reason: collision with root package name */
    private final I<? extends D> f57694a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57695b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57696c;

    /* renamed from: d  reason: collision with root package name */
    private Map<C18068q, ? extends F<?>> f57697d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f57698e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, C8945i> f57699f;

    /* renamed from: g  reason: collision with root package name */
    private List<q> f57700g;

    /* renamed from: h  reason: collision with root package name */
    private Map<Integer, C8944h> f57701h;

    public w(I<? extends D> i10, int i11, String str) {
        C17542s.j(i10, "navigator");
        this.f57694a = i10;
        this.f57695b = i11;
        this.f57696c = str;
        this.f57699f = new LinkedHashMap();
        this.f57700g = new ArrayList();
        this.f57701h = new LinkedHashMap();
    }

    public final void a(String str, C17642l<? super C8946j, C16807N> lVar) {
        C17542s.j(str, "name");
        C17542s.j(lVar, "argumentBuilder");
        Map<String, C8945i> map = this.f57699f;
        C8946j jVar = new C8946j();
        lVar.invoke(jVar);
        map.put(str, jVar.a());
    }

    public final void b(String str, C8945i iVar) {
        C17542s.j(str, "name");
        C17542s.j(iVar, "argument");
        this.f57699f.put(str, iVar);
    }

    public D c() {
        D i10 = i();
        i10.M(this.f57698e);
        for (Map.Entry next : this.f57699f.entrySet()) {
            i10.i((String) next.getKey(), (C8945i) next.getValue());
        }
        for (q k10 : this.f57700g) {
            i10.k(k10);
        }
        for (Map.Entry next2 : this.f57701h.entrySet()) {
            i10.K(((Number) next2.getKey()).intValue(), (C8944h) next2.getValue());
        }
        String str = this.f57696c;
        if (str != null) {
            i10.P(str);
        }
        int i11 = this.f57695b;
        if (i11 != -1) {
            i10.L(i11);
        }
        return i10;
    }

    public final void d(String str) {
        C17542s.j(str, "uriPattern");
        this.f57700g.add(new q(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> void e(java.lang.String r8, uI.C18055d<T> r9, nI.C17642l<? super x4.s, XH.C16807N> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "basePath"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "route"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "navDeepLink"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.util.Map<uI.q, ? extends x4.F<?>> r0 = r7.f57697d
            java.lang.String r1 = "Cannot add deeplink from KClass ["
            if (r0 == 0) goto L_0x0096
            kotlinx.serialization.KSerializer r0 = fK.z.e(r9)
            java.util.Map<uI.q, ? extends x4.F<?>> r2 = r7.f57697d
            r3 = 0
            java.lang.String r4 = "typeMap"
            if (r2 != 0) goto L_0x0024
            kotlin.jvm.internal.C17542s.z(r4)
            r2 = r3
        L_0x0024:
            java.util.List r0 = C4.j.h(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r0.next()
            x4.f r2 = (x4.C8942f) r2
            java.util.Map<java.lang.String, x4.i> r5 = r7.f57699f
            java.lang.String r6 = r2.d()
            java.lang.Object r5 = r5.get(r6)
            x4.i r5 = (x4.C8945i) r5
            if (r5 == 0) goto L_0x005b
            x4.F r5 = r5.a()
            x4.i r6 = r2.c()
            x4.F r6 = r6.a()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r5 == 0) goto L_0x005b
            goto L_0x002e
        L_0x005b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r9)
            java.lang.String r9 = "]. DeepLink contains unknown argument ["
            r8.append(r9)
            java.lang.String r9 = r2.d()
            r8.append(r9)
            java.lang.String r9 = "]. Ensure deeplink arguments matches the destination's route from KClass"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L_0x0085:
            java.util.Map<uI.q, ? extends x4.F<?>> r0 = r7.f57697d
            if (r0 != 0) goto L_0x008d
            kotlin.jvm.internal.C17542s.z(r4)
            goto L_0x008e
        L_0x008d:
            r3 = r0
        L_0x008e:
            x4.q r8 = x4.t.a(r8, r9, r3, r10)
            r7.g(r8)
            return
        L_0x0096:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r9)
            java.lang.String r9 = "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.w.e(java.lang.String, uI.d, nI.l):void");
    }

    public final void f(C17642l<? super s, C16807N> lVar) {
        C17542s.j(lVar, "navDeepLink");
        List<q> list = this.f57700g;
        s sVar = new s();
        lVar.invoke(sVar);
        list.add(sVar.a());
    }

    public final void g(q qVar) {
        C17542s.j(qVar, "navDeepLink");
        this.f57700g.add(qVar);
    }

    public final String h() {
        return this.f57696c;
    }

    /* access modifiers changed from: protected */
    public D i() {
        return this.f57694a.a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public w(I<? extends D> i10, String str) {
        this(i10, -1, str);
        C17542s.j(i10, "navigator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = fK.z.e(r6);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(x4.I<? extends D> r5, uI.C18055d<?> r6, java.util.Map<uI.C18068q, x4.F<?>> r7) {
        /*
            r4 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "typeMap"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            if (r6 == 0) goto L_0x0017
            kotlinx.serialization.KSerializer r0 = fK.z.e(r6)
            if (r0 == 0) goto L_0x0017
            int r0 = C4.j.g(r0)
            goto L_0x0018
        L_0x0017:
            r0 = -1
        L_0x0018:
            r1 = 0
            if (r6 == 0) goto L_0x0026
            kotlinx.serialization.KSerializer r2 = fK.z.e(r6)
            if (r2 == 0) goto L_0x0026
            r3 = 2
            java.lang.String r1 = C4.j.j(r2, r7, r1, r3, r1)
        L_0x0026:
            r4.<init>(r5, (int) r0, (java.lang.String) r1)
            if (r6 == 0) goto L_0x0053
            kotlinx.serialization.KSerializer r5 = fK.z.e(r6)
            java.util.List r5 = C4.j.h(r5, r7)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0039:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0053
            java.lang.Object r6 = r5.next()
            x4.f r6 = (x4.C8942f) r6
            java.util.Map<java.lang.String, x4.i> r0 = r4.f57699f
            java.lang.String r1 = r6.d()
            x4.i r6 = r6.c()
            r0.put(r1, r6)
            goto L_0x0039
        L_0x0053:
            r4.f57697d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.w.<init>(x4.I, uI.d, java.util.Map):void");
    }
}
