package jK;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import YH.X;
import hK.l;
import hK.m;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b/\u0010-R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b3\u0010+R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0003058\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u00106R\"\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u000108058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u00109R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010AR%\u0010G\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C058BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010D\u001a\u0004\bE\u0010FR!\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0001058@X\u0002¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010JR\u001b\u0010N\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\bM\u0010+R\u0014\u0010Q\u001a\u00020O8VX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010PR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00030U8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010V¨\u0006X"}, d2 = {"LjK/J0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "LjK/n;", "", "serialName", "LjK/N;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;LjK/N;I)V", "", "r", "()Ljava/util/Map;", "name", "", "isOptional", "LXH/N;", "p", "(Ljava/lang/String;Z)V", "", "annotation", "w", "(Ljava/lang/annotation/Annotation;)V", "a", "x", "index", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "j", "(I)Z", "", "f", "(I)Ljava/util/List;", "e", "(I)Ljava/lang/String;", "c", "(Ljava/lang/String;)I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "i", "b", "LjK/N;", "I", "d", "added", "", "[Ljava/lang/String;", "names", "", "[Ljava/util/List;", "propertiesAnnotations", "Ljava/util/List;", "classAnnotations", "", "h", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "Lkotlinx/serialization/KSerializer;", "LXH/o;", "t", "()[Lkotlinx/serialization/KSerializer;", "childSerializers", "k", "u", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "l", "v", "_hashCode", "LhK/l;", "()LhK/l;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class J0 implements SerialDescriptor, C17467n {

    /* renamed from: a  reason: collision with root package name */
    private final String f144035a;

    /* renamed from: b  reason: collision with root package name */
    private final N<?> f144036b;

    /* renamed from: c  reason: collision with root package name */
    private final int f144037c;

    /* renamed from: d  reason: collision with root package name */
    private int f144038d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f144039e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Annotation>[] f144040f;

    /* renamed from: g  reason: collision with root package name */
    private List<Annotation> f144041g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f144042h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Integer> f144043i;

    /* renamed from: j  reason: collision with root package name */
    private final C16824o f144044j;

    /* renamed from: k  reason: collision with root package name */
    private final C16824o f144045k;

    /* renamed from: l  reason: collision with root package name */
    private final C16824o f144046l;

    public J0(String str, N<?> n10, int i10) {
        C17542s.j(str, "serialName");
        this.f144035a = str;
        this.f144036b = n10;
        this.f144037c = i10;
        this.f144038d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f144039e = strArr;
        int i12 = this.f144037c;
        this.f144040f = new List[i12];
        this.f144042h = new boolean[i12];
        this.f144043i = X.j();
        s sVar = s.PUBLICATION;
        this.f144044j = C16825p.a(sVar, new G0(this));
        this.f144045k = C16825p.a(sVar, new H0(this));
        this.f144046l = C16825p.a(sVar, new I0(this));
    }

    /* access modifiers changed from: private */
    public static final int o(J0 j02) {
        return K0.a(j02, j02.u());
    }

    public static /* synthetic */ void q(J0 j02, String str, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            j02.p(str, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    private final Map<String, Integer> r() {
        HashMap hashMap = new HashMap();
        int length = this.f144039e.length;
        for (int i10 = 0; i10 < length; i10++) {
            hashMap.put(this.f144039e[i10], Integer.valueOf(i10));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.childSerializers();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.KSerializer[] s(jK.J0 r0) {
        /*
            jK.N<?> r0 = r0.f144036b
            if (r0 == 0) goto L_0x000a
            kotlinx.serialization.KSerializer[] r0 = r0.childSerializers()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            kotlinx.serialization.KSerializer<?>[] r0 = jK.L0.f144050a
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jK.J0.s(jK.J0):kotlinx.serialization.KSerializer[]");
    }

    private final KSerializer<?>[] t() {
        return (KSerializer[]) this.f144044j.getValue();
    }

    private final int v() {
        return ((Number) this.f144046l.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final CharSequence y(J0 j02, int i10) {
        return j02.e(i10) + ": " + j02.g(i10).i();
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor[] z(J0 j02) {
        ArrayList arrayList;
        KSerializer[] typeParametersSerializers;
        N<?> n10 = j02.f144036b;
        if (n10 == null || (typeParametersSerializers = n10.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(typeParametersSerializers.length);
            for (KSerializer descriptor : typeParametersSerializers) {
                arrayList.add(descriptor.getDescriptor());
            }
        }
        return D0.b(arrayList);
    }

    public Set<String> a() {
        return this.f144043i.keySet();
    }

    public int c(String str) {
        C17542s.j(str, "name");
        Integer num = this.f144043i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final int d() {
        return this.f144037c;
    }

    public String e(int i10) {
        return this.f144039e[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C17542s.e(i(), serialDescriptor.i()) && Arrays.equals(u(), ((J0) obj).u()) && d() == serialDescriptor.d()) {
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
        List<Annotation> list = this.f144040f[i10];
        return list == null ? C16877v.n() : list;
    }

    public SerialDescriptor g(int i10) {
        return t()[i10].getDescriptor();
    }

    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f144041g;
        return list == null ? C16877v.n() : list;
    }

    public l h() {
        return m.a.f143470a;
    }

    public int hashCode() {
        return v();
    }

    public String i() {
        return this.f144035a;
    }

    public boolean j(int i10) {
        return this.f144042h[i10];
    }

    public final void p(String str, boolean z10) {
        C17542s.j(str, "name");
        String[] strArr = this.f144039e;
        int i10 = this.f144038d + 1;
        this.f144038d = i10;
        strArr[i10] = str;
        this.f144042h[i10] = z10;
        this.f144040f[i10] = null;
        if (i10 == this.f144037c - 1) {
            this.f144043i = r();
        }
    }

    public String toString() {
        C17974j w10 = C17978n.w(0, this.f144037c);
        return C16877v.G0(w10, ", ", i() + '(', ")", 0, (CharSequence) null, new F0(this), 24, (Object) null);
    }

    public final SerialDescriptor[] u() {
        return (SerialDescriptor[]) this.f144045k.getValue();
    }

    public final void w(Annotation annotation) {
        C17542s.j(annotation, "annotation");
        List<Annotation> list = this.f144040f[this.f144038d];
        if (list == null) {
            list = new ArrayList<>(1);
            this.f144040f[this.f144038d] = list;
        }
        list.add(annotation);
    }

    public final void x(Annotation annotation) {
        C17542s.j(annotation, "a");
        if (this.f144041g == null) {
            this.f144041g = new ArrayList(1);
        }
        List<Annotation> list = this.f144041g;
        C17542s.g(list);
        list.add(annotation);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(String str, N n10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : n10, i10);
    }
}
