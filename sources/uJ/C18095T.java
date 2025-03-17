package uJ;

import AI.C15429j;
import DI.C15561h;
import DI.n0;
import YH.C16877v;
import bI.C17035a;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17656k;
import nJ.C17669x;
import vJ.g;
import yJ.C18739h;

/* renamed from: uJ.T  reason: case insensitive filesystem */
public final class C18095T implements y0, C18739h {

    /* renamed from: a  reason: collision with root package name */
    private C18096U f147844a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashSet<C18096U> f147845b;

    /* renamed from: c  reason: collision with root package name */
    private final int f147846c;

    /* renamed from: uJ.T$a */
    public static final class a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l f147847a;

        public a(C17642l lVar) {
            this.f147847a = lVar;
        }

        public final int compare(T t10, T t11) {
            C18096U u10 = (C18096U) t10;
            C17642l lVar = this.f147847a;
            C17542s.g(u10);
            String obj = lVar.invoke(u10).toString();
            C18096U u11 = (C18096U) t11;
            C17642l lVar2 = this.f147847a;
            C17542s.g(u11);
            return C17035a.e(obj, lVar2.invoke(u11).toString());
        }
    }

    public C18095T(Collection<? extends C18096U> collection) {
        C17542s.j(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<C18096U> linkedHashSet = new LinkedHashSet<>(collection);
        this.f147845b = linkedHashSet;
        this.f147846c = linkedHashSet.hashCode();
    }

    /* access modifiers changed from: private */
    public static final C18113f0 l(C18095T t10, g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return t10.b(gVar).k();
    }

    public static /* synthetic */ String o(C18095T t10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = C18093Q.f147842a;
        }
        return t10.n(lVar);
    }

    /* access modifiers changed from: private */
    public static final String q(C18096U u10) {
        C17542s.j(u10, "it");
        return u10.toString();
    }

    /* access modifiers changed from: private */
    public static final CharSequence r(C17642l lVar, C18096U u10) {
        C17542s.g(u10);
        return lVar.invoke(u10).toString();
    }

    public Collection<C18096U> a() {
        return this.f147845b;
    }

    public C15561h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18095T)) {
            return false;
        }
        return C17542s.e(this.f147845b, ((C18095T) obj).f147845b);
    }

    public boolean f() {
        return false;
    }

    public List<n0> getParameters() {
        return C16877v.n();
    }

    public int hashCode() {
        return this.f147846c;
    }

    public final C17656k j() {
        return C17669x.f144882d.a("member scope for intersection type", this.f147845b);
    }

    public final C18113f0 k() {
        return C18099X.n(u0.f147932b.k(), this, C16877v.n(), false, j(), new C18094S(this));
    }

    public final C18096U m() {
        return this.f147844a;
    }

    public final String n(C17642l<? super C18096U, ? extends Object> lVar) {
        C17542s.j(lVar, "getProperTypeRelatedToStringify");
        return C16877v.G0(C16877v.g1(this.f147845b, new a(lVar)), " & ", "{", "}", 0, (CharSequence) null, new C18092P(lVar), 24, (Object) null);
    }

    public C15429j p() {
        C15429j p10 = this.f147845b.iterator().next().N0().p();
        C17542s.i(p10, "getBuiltIns(...)");
        return p10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: uJ.T} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7, types: [uJ.U] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uJ.C18095T b(vJ.g r5) {
        /*
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.util.Collection r0 = r4.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = YH.C16877v.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r2 = r0.next()
            uJ.U r2 = (uJ.C18096U) r2
            uJ.U r2 = r2.P0(r5)
            r1.add(r2)
            r2 = 1
            goto L_0x001b
        L_0x0030:
            r0 = 0
            if (r2 != 0) goto L_0x0034
            goto L_0x0047
        L_0x0034:
            uJ.U r2 = r4.m()
            if (r2 == 0) goto L_0x003e
            uJ.U r0 = r2.P0(r5)
        L_0x003e:
            uJ.T r5 = new uJ.T
            r5.<init>(r1)
            uJ.T r0 = r5.t(r0)
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            r0 = r4
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uJ.C18095T.b(vJ.g):uJ.T");
    }

    public final C18095T t(C18096U u10) {
        return new C18095T(this.f147845b, u10);
    }

    public String toString() {
        return o(this, (C17642l) null, 1, (Object) null);
    }

    private C18095T(Collection<? extends C18096U> collection, C18096U u10) {
        this(collection);
        this.f147844a = u10;
    }
}
