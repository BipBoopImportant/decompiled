package hK;

import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import YH.C16870n;
import YH.C16877v;
import YH.Q;
import YH.X;
import jK.C17467n;
import jK.D0;
import jK.K0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010\"R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0003028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b%\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u00109R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t068\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010>R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u00109R\u001b\u0010H\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010\"¨\u0006I"}, d2 = {"LhK/h;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "LjK/n;", "", "serialName", "LhK/l;", "kind", "", "elementsCount", "", "typeParameters", "LhK/a;", "builder", "<init>", "(Ljava/lang/String;LhK/l;ILjava/util/List;LhK/a;)V", "index", "e", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "f", "(I)Ljava/util/List;", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "j", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "b", "LhK/l;", "h", "()LhK/l;", "I", "d", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "[Ljava/util/List;", "elementAnnotations", "", "[Z", "elementOptionality", "", "Ljava/util/Map;", "name2Index", "k", "typeParametersDescriptors", "l", "LXH/o;", "n", "_hashCode", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements SerialDescriptor, C17467n {

    /* renamed from: a  reason: collision with root package name */
    private final String f143450a;

    /* renamed from: b  reason: collision with root package name */
    private final l f143451b;

    /* renamed from: c  reason: collision with root package name */
    private final int f143452c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Annotation> f143453d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f143454e;

    /* renamed from: f  reason: collision with root package name */
    private final String[] f143455f;

    /* renamed from: g  reason: collision with root package name */
    private final SerialDescriptor[] f143456g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Annotation>[] f143457h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean[] f143458i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Integer> f143459j;

    /* renamed from: k  reason: collision with root package name */
    private final SerialDescriptor[] f143460k;

    /* renamed from: l  reason: collision with root package name */
    private final C16824o f143461l;

    public h(String str, l lVar, int i10, List<? extends SerialDescriptor> list, C17335a aVar) {
        C17542s.j(str, "serialName");
        C17542s.j(lVar, "kind");
        C17542s.j(list, "typeParameters");
        C17542s.j(aVar, "builder");
        this.f143450a = str;
        this.f143451b = lVar;
        this.f143452c = i10;
        this.f143453d = aVar.c();
        this.f143454e = C16877v.r1(aVar.f());
        String[] strArr = (String[]) aVar.f().toArray(new String[0]);
        this.f143455f = strArr;
        this.f143456g = D0.b(aVar.e());
        this.f143457h = (List[]) aVar.d().toArray(new List[0]);
        this.f143458i = C16877v.m1(aVar.g());
        Iterable<Q> p12 = C16870n.p1(strArr);
        ArrayList arrayList = new ArrayList(C16877v.y(p12, 10));
        for (Q q10 : p12) {
            arrayList.add(C16796C.a(q10.d(), Integer.valueOf(q10.c())));
        }
        this.f143459j = X.v(arrayList);
        this.f143460k = D0.b(list);
        this.f143461l = C16825p.b(new C17340f(this));
    }

    /* access modifiers changed from: private */
    public static final int m(h hVar) {
        return K0.a(hVar, hVar.f143460k);
    }

    private final int n() {
        return ((Number) this.f143461l.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final CharSequence o(h hVar, int i10) {
        return hVar.e(i10) + ": " + hVar.g(i10).i();
    }

    public Set<String> a() {
        return this.f143454e;
    }

    public int c(String str) {
        C17542s.j(str, "name");
        Integer num = this.f143459j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public int d() {
        return this.f143452c;
    }

    public String e(int i10) {
        return this.f143455f[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C17542s.e(i(), serialDescriptor.i()) && Arrays.equals(this.f143460k, ((h) obj).f143460k) && d() == serialDescriptor.d()) {
                int d10 = d();
                int i10 = 0;
                while (i10 < d10) {
                    if (C17542s.e(g(i10).i(), serialDescriptor.g(i10).i()) && C17542s.e(g(i10).h(), serialDescriptor.g(i10).h())) {
                        i10++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public List<Annotation> f(int i10) {
        return this.f143457h[i10];
    }

    public SerialDescriptor g(int i10) {
        return this.f143456g[i10];
    }

    public List<Annotation> getAnnotations() {
        return this.f143453d;
    }

    public l h() {
        return this.f143451b;
    }

    public int hashCode() {
        return n();
    }

    public String i() {
        return this.f143450a;
    }

    public boolean j(int i10) {
        return this.f143458i[i10];
    }

    public String toString() {
        C17974j w10 = C17978n.w(0, d());
        return C16877v.G0(w10, ", ", i() + '(', ")", 0, (CharSequence) null, new C17341g(this), 24, (Object) null);
    }
}
