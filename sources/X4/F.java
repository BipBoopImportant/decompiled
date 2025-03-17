package x4;

import HJ.C15835a;
import HJ.C15854t;
import YH.C16870n;
import YH.C16877v;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b&\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006'()*+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010 ¨\u0006-"}, d2 = {"Lx4/F;", "T", "", "", "isNullableAllowed", "<init>", "(Z)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "h", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "g", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "other", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Z", "c", "()Z", "b", "Ljava/lang/String;", "name", "q", "r", "s", "t", "u", "v", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class F<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final q f57428c = new q((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final F<Integer> f57429d = new i();

    /* renamed from: e  reason: collision with root package name */
    public static final F<Integer> f57430e = new m();

    /* renamed from: f  reason: collision with root package name */
    public static final F<int[]> f57431f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final F<List<Integer>> f57432g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final F<Long> f57433h = new l();

    /* renamed from: i  reason: collision with root package name */
    public static final F<long[]> f57434i = new j();

    /* renamed from: j  reason: collision with root package name */
    public static final F<List<Long>> f57435j = new k();

    /* renamed from: k  reason: collision with root package name */
    public static final F<Float> f57436k = new f();

    /* renamed from: l  reason: collision with root package name */
    public static final F<float[]> f57437l = new d();

    /* renamed from: m  reason: collision with root package name */
    public static final F<List<Float>> f57438m = new e();

    /* renamed from: n  reason: collision with root package name */
    public static final F<Boolean> f57439n = new c();

    /* renamed from: o  reason: collision with root package name */
    public static final F<boolean[]> f57440o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final F<List<Boolean>> f57441p = new b();

    /* renamed from: q  reason: collision with root package name */
    public static final F<String> f57442q = new p();

    /* renamed from: r  reason: collision with root package name */
    public static final F<String[]> f57443r = new n();

    /* renamed from: s  reason: collision with root package name */
    public static final F<List<String>> f57444s = new o();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f57445a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57446b = "nav_type";

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"x4/F$a", "Lx4/d;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "o", "(Ljava/lang/String;)[Z", "previousValue", "p", "(Ljava/lang/String;[Z)[Z", "other", "", "s", "([Z[Z)Z", "", "r", "([Z)Ljava/util/List;", "m", "()[Z", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends C8940d<boolean[]> {
        a() {
            super(true);
        }

        public String b() {
            return "boolean[]";
        }

        /* renamed from: m */
        public boolean[] k() {
            return new boolean[0];
        }

        /* renamed from: n */
        public boolean[] a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: o */
        public boolean[] f(String str) {
            C17542s.j(str, "value");
            return new boolean[]{F.f57439n.f(str).booleanValue()};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = YH.C16870n.I(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean[] g(java.lang.String r2, boolean[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0011
                boolean[] r0 = r1.f(r2)
                boolean[] r3 = YH.C16870n.I(r3, r0)
                if (r3 != 0) goto L_0x0015
            L_0x0011:
                boolean[] r3 = r1.f(r2)
            L_0x0015:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.a.g(java.lang.String, boolean[]):boolean[]");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, boolean[] zArr) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putBooleanArray(str, zArr);
        }

        /* renamed from: r */
        public List<String> l(boolean[] zArr) {
            List<Boolean> e12;
            if (zArr == null || (e12 = C16870n.e1(zArr)) == null) {
                return C16877v.n();
            }
            Iterable<Boolean> iterable = e12;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Boolean booleanValue : iterable) {
                arrayList.add(String.valueOf(booleanValue.booleanValue()));
            }
            return arrayList;
        }

        /* renamed from: s */
        public boolean j(boolean[] zArr, boolean[] zArr2) {
            Boolean[] boolArr = null;
            Boolean[] N10 = zArr != null ? C16870n.N(zArr) : null;
            if (zArr2 != null) {
                boolArr = C16870n.N(zArr2);
            }
            return C16870n.d(N10, boolArr);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"x4/F$b", "Lx4/d;", "", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends C8940d<List<? extends Boolean>> {
        b() {
            super(true);
        }

        public String b() {
            return "List<Boolean>";
        }

        /* renamed from: m */
        public List<Boolean> k() {
            return C16877v.n();
        }

        /* renamed from: n */
        public List<Boolean> a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            boolean[] zArr = (boolean[]) bundle.get(str);
            if (zArr != null) {
                return C16870n.e1(zArr);
            }
            return null;
        }

        /* renamed from: o */
        public List<Boolean> f(String str) {
            C17542s.j(str, "value");
            return C16877v.e(F.f57439n.f(str));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = YH.C16877v.V0(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<java.lang.Boolean> g(java.lang.String r2, java.util.List<java.lang.Boolean> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0015
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.List r0 = r1.f(r2)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r3 = YH.C16877v.V0(r3, r0)
                if (r3 != 0) goto L_0x0019
            L_0x0015:
                java.util.List r3 = r1.f(r2)
            L_0x0019:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.b.g(java.lang.String, java.util.List):java.util.List");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, List<Boolean> list) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putBooleanArray(str, list != null ? C16877v.m1(list) : null);
        }

        /* renamed from: r */
        public List<String> l(List<Boolean> list) {
            if (list == null) {
                return C16877v.n();
            }
            Iterable<Boolean> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Boolean booleanValue : iterable) {
                arrayList.add(String.valueOf(booleanValue.booleanValue()));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean j(java.util.List<java.lang.Boolean> r4, java.util.List<java.lang.Boolean> r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Boolean[] r2 = new java.lang.Boolean[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.Boolean[] r4 = (java.lang.Boolean[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Boolean[] r0 = new java.lang.Boolean[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.Boolean[] r0 = (java.lang.Boolean[]) r0
            L_0x001d:
                boolean r4 = YH.C16870n.d(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.b.j(java.util.List, java.util.List):boolean");
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"x4/F$c", "Lx4/F;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "l", "(Ljava/lang/String;)Ljava/lang/Boolean;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends F<Boolean> {
        c() {
            super(false);
        }

        public String b() {
            return FeatureVariable.BOOLEAN_TYPE;
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Boolean) obj).booleanValue());
        }

        /* renamed from: k */
        public Boolean a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (Boolean) bundle.get(str);
        }

        /* renamed from: l */
        public Boolean f(String str) {
            boolean z10;
            C17542s.j(str, "value");
            if (C17542s.e(str, "true")) {
                z10 = true;
            } else if (C17542s.e(str, "false")) {
                z10 = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z10);
        }

        public void m(Bundle bundle, String str, boolean z10) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putBoolean(str, z10);
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"x4/F$d", "Lx4/d;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "o", "(Ljava/lang/String;)[F", "previousValue", "p", "(Ljava/lang/String;[F)[F", "other", "", "s", "([F[F)Z", "", "r", "([F)Ljava/util/List;", "m", "()[F", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends C8940d<float[]> {
        d() {
            super(true);
        }

        public String b() {
            return "float[]";
        }

        /* renamed from: m */
        public float[] k() {
            return new float[0];
        }

        /* renamed from: n */
        public float[] a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (float[]) bundle.get(str);
        }

        /* renamed from: o */
        public float[] f(String str) {
            C17542s.j(str, "value");
            return new float[]{F.f57436k.f(str).floatValue()};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = YH.C16870n.C(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public float[] g(java.lang.String r2, float[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0011
                float[] r0 = r1.f(r2)
                float[] r3 = YH.C16870n.C(r3, r0)
                if (r3 != 0) goto L_0x0015
            L_0x0011:
                float[] r3 = r1.f(r2)
            L_0x0015:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.d.g(java.lang.String, float[]):float[]");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, float[] fArr) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putFloatArray(str, fArr);
        }

        /* renamed from: r */
        public List<String> l(float[] fArr) {
            List<Float> Z02;
            if (fArr == null || (Z02 = C16870n.Z0(fArr)) == null) {
                return C16877v.n();
            }
            Iterable<Number> iterable = Z02;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Number floatValue : iterable) {
                arrayList.add(String.valueOf(floatValue.floatValue()));
            }
            return arrayList;
        }

        /* renamed from: s */
        public boolean j(float[] fArr, float[] fArr2) {
            Float[] fArr3 = null;
            Float[] P10 = fArr != null ? C16870n.P(fArr) : null;
            if (fArr2 != null) {
                fArr3 = C16870n.P(fArr2);
            }
            return C16870n.d(P10, fArr3);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"x4/F$e", "Lx4/d;", "", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends C8940d<List<? extends Float>> {
        e() {
            super(true);
        }

        public String b() {
            return "List<Float>";
        }

        /* renamed from: m */
        public List<Float> k() {
            return C16877v.n();
        }

        /* renamed from: n */
        public List<Float> a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            float[] fArr = (float[]) bundle.get(str);
            if (fArr != null) {
                return C16870n.Z0(fArr);
            }
            return null;
        }

        /* renamed from: o */
        public List<Float> f(String str) {
            C17542s.j(str, "value");
            return C16877v.e(F.f57436k.f(str));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = YH.C16877v.V0(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<java.lang.Float> g(java.lang.String r2, java.util.List<java.lang.Float> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0015
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.List r0 = r1.f(r2)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r3 = YH.C16877v.V0(r3, r0)
                if (r3 != 0) goto L_0x0019
            L_0x0015:
                java.util.List r3 = r1.f(r2)
            L_0x0019:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.e.g(java.lang.String, java.util.List):java.util.List");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, List<Float> list) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putFloatArray(str, list != null ? C16877v.q1(list) : null);
        }

        /* renamed from: r */
        public List<String> l(List<Float> list) {
            if (list == null) {
                return C16877v.n();
            }
            Iterable<Number> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Number floatValue : iterable) {
                arrayList.add(String.valueOf(floatValue.floatValue()));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean j(java.util.List<java.lang.Float> r4, java.util.List<java.lang.Float> r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Float[] r2 = new java.lang.Float[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.Float[] r4 = (java.lang.Float[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Float[] r0 = new java.lang.Float[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.Float[] r0 = (java.lang.Float[]) r0
            L_0x001d:
                boolean r4 = YH.C16870n.d(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.e.j(java.util.List, java.util.List):boolean");
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"x4/F$f", "Lx4/F;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "l", "(Ljava/lang/String;)Ljava/lang/Float;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends F<Float> {
        f() {
            super(false);
        }

        public String b() {
            return "float";
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Number) obj).floatValue());
        }

        /* renamed from: k */
        public Float a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            Object obj = bundle.get(str);
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        /* renamed from: l */
        public Float f(String str) {
            C17542s.j(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        public void m(Bundle bundle, String str, float f10) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putFloat(str, f10);
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"x4/F$g", "Lx4/d;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "o", "(Ljava/lang/String;)[I", "previousValue", "p", "(Ljava/lang/String;[I)[I", "other", "", "s", "([I[I)Z", "", "r", "([I)Ljava/util/List;", "m", "()[I", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends C8940d<int[]> {
        g() {
            super(true);
        }

        public String b() {
            return "integer[]";
        }

        /* renamed from: m */
        public int[] k() {
            return new int[0];
        }

        /* renamed from: n */
        public int[] a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (int[]) bundle.get(str);
        }

        /* renamed from: o */
        public int[] f(String str) {
            C17542s.j(str, "value");
            return new int[]{F.f57429d.f(str).intValue()};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = YH.C16870n.E(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int[] g(java.lang.String r2, int[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0011
                int[] r0 = r1.f(r2)
                int[] r3 = YH.C16870n.E(r3, r0)
                if (r3 != 0) goto L_0x0015
            L_0x0011:
                int[] r3 = r1.f(r2)
            L_0x0015:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.g.g(java.lang.String, int[]):int[]");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, int[] iArr) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putIntArray(str, iArr);
        }

        /* renamed from: r */
        public List<String> l(int[] iArr) {
            List<Integer> a12;
            if (iArr == null || (a12 = C16870n.a1(iArr)) == null) {
                return C16877v.n();
            }
            Iterable<Number> iterable = a12;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Number intValue : iterable) {
                arrayList.add(String.valueOf(intValue.intValue()));
            }
            return arrayList;
        }

        /* renamed from: s */
        public boolean j(int[] iArr, int[] iArr2) {
            Integer[] numArr = null;
            Integer[] Q10 = iArr != null ? C16870n.Q(iArr) : null;
            if (iArr2 != null) {
                numArr = C16870n.Q(iArr2);
            }
            return C16870n.d(Q10, numArr);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"x4/F$h", "Lx4/d;", "", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h extends C8940d<List<? extends Integer>> {
        h() {
            super(true);
        }

        public String b() {
            return "List<Int>";
        }

        /* renamed from: m */
        public List<Integer> k() {
            return C16877v.n();
        }

        /* renamed from: n */
        public List<Integer> a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            int[] iArr = (int[]) bundle.get(str);
            if (iArr != null) {
                return C16870n.a1(iArr);
            }
            return null;
        }

        /* renamed from: o */
        public List<Integer> f(String str) {
            C17542s.j(str, "value");
            return C16877v.e(F.f57429d.f(str));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = YH.C16877v.V0(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<java.lang.Integer> g(java.lang.String r2, java.util.List<java.lang.Integer> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0015
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.List r0 = r1.f(r2)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r3 = YH.C16877v.V0(r3, r0)
                if (r3 != 0) goto L_0x0019
            L_0x0015:
                java.util.List r3 = r1.f(r2)
            L_0x0019:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.h.g(java.lang.String, java.util.List):java.util.List");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, List<Integer> list) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putIntArray(str, list != null ? C16877v.s1(list) : null);
        }

        /* renamed from: r */
        public List<String> l(List<Integer> list) {
            if (list == null) {
                return C16877v.n();
            }
            Iterable<Number> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Number intValue : iterable) {
                arrayList.add(String.valueOf(intValue.intValue()));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean j(java.util.List<java.lang.Integer> r4, java.util.List<java.lang.Integer> r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Integer[] r2 = new java.lang.Integer[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.Integer[] r4 = (java.lang.Integer[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Integer[] r0 = new java.lang.Integer[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            L_0x001d:
                boolean r4 = YH.C16870n.d(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.h.j(java.util.List, java.util.List):boolean");
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"x4/F$i", "Lx4/F;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "l", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i extends F<Integer> {
        i() {
            super(false);
        }

        public String b() {
            return FeatureVariable.INTEGER_TYPE;
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Number) obj).intValue());
        }

        /* renamed from: k */
        public Integer a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            Object obj = bundle.get(str);
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* renamed from: l */
        public Integer f(String str) {
            int i10;
            C17542s.j(str, "value");
            if (C15854t.W(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                C17542s.i(substring, "substring(...)");
                i10 = Integer.parseInt(substring, C15835a.a(16));
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public void m(Bundle bundle, String str, int i10) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putInt(str, i10);
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"x4/F$j", "Lx4/d;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "o", "(Ljava/lang/String;)[J", "previousValue", "p", "(Ljava/lang/String;[J)[J", "other", "", "s", "([J[J)Z", "", "r", "([J)Ljava/util/List;", "m", "()[J", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j extends C8940d<long[]> {
        j() {
            super(true);
        }

        public String b() {
            return "long[]";
        }

        /* renamed from: m */
        public long[] k() {
            return new long[0];
        }

        /* renamed from: n */
        public long[] a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (long[]) bundle.get(str);
        }

        /* renamed from: o */
        public long[] f(String str) {
            C17542s.j(str, "value");
            return new long[]{F.f57433h.f(str).longValue()};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = YH.C16870n.F(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long[] g(java.lang.String r2, long[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0011
                long[] r0 = r1.f(r2)
                long[] r3 = YH.C16870n.F(r3, r0)
                if (r3 != 0) goto L_0x0015
            L_0x0011:
                long[] r3 = r1.f(r2)
            L_0x0015:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.j.g(java.lang.String, long[]):long[]");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, long[] jArr) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putLongArray(str, jArr);
        }

        /* renamed from: r */
        public List<String> l(long[] jArr) {
            List<Long> b12;
            if (jArr == null || (b12 = C16870n.b1(jArr)) == null) {
                return C16877v.n();
            }
            Iterable<Number> iterable = b12;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Number longValue : iterable) {
                arrayList.add(String.valueOf(longValue.longValue()));
            }
            return arrayList;
        }

        /* renamed from: s */
        public boolean j(long[] jArr, long[] jArr2) {
            Long[] lArr = null;
            Long[] R10 = jArr != null ? C16870n.R(jArr) : null;
            if (jArr2 != null) {
                lArr = C16870n.R(jArr2);
            }
            return C16870n.d(R10, lArr);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"x4/F$k", "Lx4/d;", "", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k extends C8940d<List<? extends Long>> {
        k() {
            super(true);
        }

        public String b() {
            return "List<Long>";
        }

        /* renamed from: m */
        public List<Long> k() {
            return C16877v.n();
        }

        /* renamed from: n */
        public List<Long> a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            long[] jArr = (long[]) bundle.get(str);
            if (jArr != null) {
                return C16870n.b1(jArr);
            }
            return null;
        }

        /* renamed from: o */
        public List<Long> f(String str) {
            C17542s.j(str, "value");
            return C16877v.e(F.f57433h.f(str));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = YH.C16877v.V0(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<java.lang.Long> g(java.lang.String r2, java.util.List<java.lang.Long> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0015
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.List r0 = r1.f(r2)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r3 = YH.C16877v.V0(r3, r0)
                if (r3 != 0) goto L_0x0019
            L_0x0015:
                java.util.List r3 = r1.f(r2)
            L_0x0019:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.k.g(java.lang.String, java.util.List):java.util.List");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, List<Long> list) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putLongArray(str, list != null ? C16877v.u1(list) : null);
        }

        /* renamed from: r */
        public List<String> l(List<Long> list) {
            if (list == null) {
                return C16877v.n();
            }
            Iterable<Number> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Number longValue : iterable) {
                arrayList.add(String.valueOf(longValue.longValue()));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean j(java.util.List<java.lang.Long> r4, java.util.List<java.lang.Long> r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Long[] r2 = new java.lang.Long[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.Long[] r4 = (java.lang.Long[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Long[] r0 = new java.lang.Long[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.Long[] r0 = (java.lang.Long[]) r0
            L_0x001d:
                boolean r4 = YH.C16870n.d(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.k.j(java.util.List, java.util.List):boolean");
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"x4/F$l", "Lx4/F;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "l", "(Ljava/lang/String;)Ljava/lang/Long;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l extends F<Long> {
        l() {
            super(false);
        }

        public String b() {
            return Constants.LONG;
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Number) obj).longValue());
        }

        /* renamed from: k */
        public Long a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            Object obj = bundle.get(str);
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        /* renamed from: l */
        public Long f(String str) {
            String str2;
            long j10;
            C17542s.j(str, "value");
            if (C15854t.G(str, "L", false, 2, (Object) null)) {
                str2 = str.substring(0, str.length() - 1);
                C17542s.i(str2, "substring(...)");
            } else {
                str2 = str;
            }
            if (C15854t.W(str, "0x", false, 2, (Object) null)) {
                String substring = str2.substring(2);
                C17542s.i(substring, "substring(...)");
                j10 = Long.parseLong(substring, C15835a.a(16));
            } else {
                j10 = Long.parseLong(str2);
            }
            return Long.valueOf(j10);
        }

        public void m(Bundle bundle, String str, long j10) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putLong(str, j10);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"x4/F$m", "Lx4/F;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "l", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class m extends F<Integer> {
        m() {
            super(false);
        }

        public String b() {
            return "reference";
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Number) obj).intValue());
        }

        /* renamed from: k */
        public Integer a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            Object obj = bundle.get(str);
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* renamed from: l */
        public Integer f(String str) {
            int i10;
            C17542s.j(str, "value");
            if (C15854t.W(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                C17542s.i(substring, "substring(...)");
                i10 = Integer.parseInt(substring, C15835a.a(16));
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public void m(Bundle bundle, String str, int i10) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putInt(str, i10);
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"x4/F$n", "Lx4/d;", "", "", "Landroid/os/Bundle;", "bundle", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "o", "(Ljava/lang/String;)[Ljava/lang/String;", "previousValue", "p", "(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;", "other", "", "s", "([Ljava/lang/String;[Ljava/lang/String;)Z", "", "r", "([Ljava/lang/String;)Ljava/util/List;", "m", "()[Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n extends C8940d<String[]> {
        n() {
            super(true);
        }

        public String b() {
            return "string[]";
        }

        /* renamed from: m */
        public String[] k() {
            return new String[0];
        }

        /* renamed from: n */
        public String[] a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (String[]) bundle.get(str);
        }

        /* renamed from: o */
        public String[] f(String str) {
            C17542s.j(str, "value");
            return new String[]{str};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = (java.lang.String[]) YH.C16870n.H(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String[] g(java.lang.String r2, java.lang.String[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0013
                java.lang.String[] r0 = r1.f(r2)
                java.lang.Object[] r3 = YH.C16870n.H(r3, r0)
                java.lang.String[] r3 = (java.lang.String[]) r3
                if (r3 != 0) goto L_0x0017
            L_0x0013:
                java.lang.String[] r3 = r1.f(r2)
            L_0x0017:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.n.g(java.lang.String, java.lang.String[]):java.lang.String[]");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, String[] strArr) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putStringArray(str, strArr);
        }

        /* renamed from: r */
        public List<String> l(String[] strArr) {
            if (strArr == null) {
                return C16877v.n();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String encode : strArr) {
                arrayList.add(Uri.encode(encode));
            }
            return arrayList;
        }

        /* renamed from: s */
        public boolean j(String[] strArr, String[] strArr2) {
            return C16870n.d(strArr, strArr2);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"x4/F$o", "Lx4/d;", "", "", "Landroid/os/Bundle;", "bundle", "key", "value", "LXH/N;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class o extends C8940d<List<? extends String>> {
        o() {
            super(true);
        }

        public String b() {
            return "List<String>";
        }

        /* renamed from: m */
        public List<String> k() {
            return C16877v.n();
        }

        /* renamed from: n */
        public List<String> a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            String[] strArr = (String[]) bundle.get(str);
            if (strArr != null) {
                return C16870n.c1(strArr);
            }
            return null;
        }

        /* renamed from: o */
        public List<String> f(String str) {
            C17542s.j(str, "value");
            return C16877v.e(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = YH.C16877v.V0(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<java.lang.String> g(java.lang.String r2, java.util.List<java.lang.String> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                if (r3 == 0) goto L_0x0015
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.List r0 = r1.f(r2)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r3 = YH.C16877v.V0(r3, r0)
                if (r3 != 0) goto L_0x0019
            L_0x0015:
                java.util.List r3 = r1.f(r2)
            L_0x0019:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.o.g(java.lang.String, java.util.List):java.util.List");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, List<String> list) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putStringArray(str, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        /* renamed from: r */
        public List<String> l(List<String> list) {
            if (list == null) {
                return C16877v.n();
            }
            Iterable<String> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (String encode : iterable) {
                arrayList.add(Uri.encode(encode));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean j(java.util.List<java.lang.String> r4, java.util.List<java.lang.String> r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.String[] r2 = new java.lang.String[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.String[] r4 = (java.lang.String[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.String[] r0 = (java.lang.String[]) r0
            L_0x001d:
                boolean r4 = YH.C16870n.d(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.o.j(java.util.List, java.util.List):boolean");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"x4/F$p", "Lx4/F;", "", "Landroid/os/Bundle;", "bundle", "key", "value", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "l", "(Ljava/lang/String;)Ljava/lang/String;", "n", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class p extends F<String> {
        p() {
            super(true);
        }

        public String b() {
            return FeatureVariable.STRING_TYPE;
        }

        /* renamed from: k */
        public String a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (String) bundle.get(str);
        }

        /* renamed from: l */
        public String f(String str) {
            C17542s.j(str, "value");
            if (C17542s.e(str, "null")) {
                return null;
            }
            return str;
        }

        /* renamed from: m */
        public void h(Bundle bundle, String str, String str2) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            bundle.putString(str, str2);
        }

        /* renamed from: n */
        public String i(String str) {
            String encode = str != null ? Uri.encode(str) : null;
            return encode == null ? "null" : encode;
        }
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00180\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00180\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00180\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0017R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00180\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0017R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0017R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0017R\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010+0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0017R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00180\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lx4/F$q;", "", "<init>", "()V", "", "type", "packageName", "Lx4/F;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lx4/F;", "Ljava/lang/Class;", "clazz", "", "isArray", "d", "(Ljava/lang/Class;Z)Lx4/F;", "value", "b", "(Ljava/lang/String;)Lx4/F;", "c", "(Ljava/lang/Object;)Lx4/F;", "", "BoolArrayType", "Lx4/F;", "", "BoolListType", "BoolType", "", "FloatArrayType", "", "FloatListType", "FloatType", "", "IntArrayType", "", "IntListType", "IntType", "", "LongArrayType", "", "LongListType", "LongType", "ReferenceType", "", "StringArrayType", "StringListType", "StringType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class q {
        public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public F<?> a(String str, String str2) {
            String str3;
            F<Integer> f10 = F.f57429d;
            if (C17542s.e(f10.b(), str)) {
                return f10;
            }
            F<int[]> f11 = F.f57431f;
            if (C17542s.e(f11.b(), str)) {
                return f11;
            }
            F<List<Integer>> f12 = F.f57432g;
            if (C17542s.e(f12.b(), str)) {
                return f12;
            }
            F<Long> f13 = F.f57433h;
            if (C17542s.e(f13.b(), str)) {
                return f13;
            }
            F<long[]> f14 = F.f57434i;
            if (C17542s.e(f14.b(), str)) {
                return f14;
            }
            F<List<Long>> f15 = F.f57435j;
            if (C17542s.e(f15.b(), str)) {
                return f15;
            }
            F<Boolean> f16 = F.f57439n;
            if (C17542s.e(f16.b(), str)) {
                return f16;
            }
            F<boolean[]> f17 = F.f57440o;
            if (C17542s.e(f17.b(), str)) {
                return f17;
            }
            F<List<Boolean>> f18 = F.f57441p;
            if (C17542s.e(f18.b(), str)) {
                return f18;
            }
            F<String> f19 = F.f57442q;
            if (C17542s.e(f19.b(), str)) {
                return f19;
            }
            F<String[]> f20 = F.f57443r;
            if (C17542s.e(f20.b(), str)) {
                return f20;
            }
            F<List<String>> f21 = F.f57444s;
            if (C17542s.e(f21.b(), str)) {
                return f21;
            }
            F<Float> f22 = F.f57436k;
            if (C17542s.e(f22.b(), str)) {
                return f22;
            }
            F<float[]> f23 = F.f57437l;
            if (C17542s.e(f23.b(), str)) {
                return f23;
            }
            F<List<Float>> f24 = F.f57438m;
            if (C17542s.e(f24.b(), str)) {
                return f24;
            }
            F<Integer> f25 = F.f57430e;
            if (C17542s.e(f25.b(), str)) {
                return f25;
            }
            if (str == null || str.length() == 0) {
                return f19;
            }
            try {
                if (!C15854t.W(str, ".", false, 2, (Object) null) || str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2 + str;
                }
                boolean G10 = C15854t.G(str, "[]", false, 2, (Object) null);
                if (G10) {
                    str3 = str3.substring(0, str3.length() - 2);
                    C17542s.i(str3, "substring(...)");
                }
                Class<?> cls = Class.forName(str3);
                C17542s.i(cls, "clazz");
                F<?> d10 = d(cls, G10);
                if (d10 != null) {
                    return d10;
                }
                throw new IllegalArgumentException((str3 + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r1 = x4.F.f57439n;
            r1.f(r3);
            kotlin.jvm.internal.C17542s.h(r1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
            r3 = x4.F.f57442q;
            kotlin.jvm.internal.C17542s.h(r3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
            return r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r1 = x4.F.f57433h;
            r1.f(r3);
            kotlin.jvm.internal.C17542s.h(r1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r1 = x4.F.f57436k;
            r1.f(r3);
            kotlin.jvm.internal.C17542s.h(r1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            return r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final x4.F<java.lang.Object> b(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>"
                java.lang.String r1 = "value"
                kotlin.jvm.internal.C17542s.j(r3, r1)
                x4.F<java.lang.Integer> r1 = x4.F.f57429d     // Catch:{ IllegalArgumentException -> 0x0010 }
                r1.f(r3)     // Catch:{ IllegalArgumentException -> 0x0010 }
                kotlin.jvm.internal.C17542s.h(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0010 }
                return r1
            L_0x0010:
                x4.F<java.lang.Long> r1 = x4.F.f57433h     // Catch:{ IllegalArgumentException -> 0x0019 }
                r1.f(r3)     // Catch:{ IllegalArgumentException -> 0x0019 }
                kotlin.jvm.internal.C17542s.h(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0019 }
                return r1
            L_0x0019:
                x4.F<java.lang.Float> r1 = x4.F.f57436k     // Catch:{ IllegalArgumentException -> 0x0022 }
                r1.f(r3)     // Catch:{ IllegalArgumentException -> 0x0022 }
                kotlin.jvm.internal.C17542s.h(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0022 }
                return r1
            L_0x0022:
                x4.F<java.lang.Boolean> r1 = x4.F.f57439n     // Catch:{ IllegalArgumentException -> 0x002b }
                r1.f(r3)     // Catch:{ IllegalArgumentException -> 0x002b }
                kotlin.jvm.internal.C17542s.h(r1, r0)     // Catch:{ IllegalArgumentException -> 0x002b }
                return r1
            L_0x002b:
                x4.F<java.lang.String> r3 = x4.F.f57442q
                kotlin.jvm.internal.C17542s.h(r3, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.q.b(java.lang.String):x4.F");
        }

        public final F<Object> c(Object obj) {
            F<Object> vVar;
            if (obj instanceof Integer) {
                F<Integer> f10 = F.f57429d;
                C17542s.h(f10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f10;
            } else if (obj instanceof int[]) {
                F<int[]> f11 = F.f57431f;
                C17542s.h(f11, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f11;
            } else if (obj instanceof Long) {
                F<Long> f12 = F.f57433h;
                C17542s.h(f12, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f12;
            } else if (obj instanceof long[]) {
                F<long[]> f13 = F.f57434i;
                C17542s.h(f13, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f13;
            } else if (obj instanceof Float) {
                F<Float> f14 = F.f57436k;
                C17542s.h(f14, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f14;
            } else if (obj instanceof float[]) {
                F<float[]> f15 = F.f57437l;
                C17542s.h(f15, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f15;
            } else if (obj instanceof Boolean) {
                F<Boolean> f16 = F.f57439n;
                C17542s.h(f16, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f16;
            } else if (obj instanceof boolean[]) {
                F<boolean[]> f17 = F.f57440o;
                C17542s.h(f17, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f17;
            } else if ((obj instanceof String) || obj == null) {
                F<String> f18 = F.f57442q;
                C17542s.h(f18, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f18;
            } else if (!(obj instanceof Object[]) || !(((Object[]) obj) instanceof String[])) {
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    C17542s.g(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        C17542s.h(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        vVar = new s<>(componentType2);
                        return vVar;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    C17542s.g(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        C17542s.h(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        vVar = new u<>(componentType4);
                        return vVar;
                    }
                }
                if (obj instanceof Parcelable) {
                    vVar = new t<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    vVar = new r<>(obj.getClass());
                } else if (obj instanceof Serializable) {
                    vVar = new v<>(obj.getClass());
                } else {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                return vVar;
            } else {
                F<String[]> f19 = F.f57443r;
                C17542s.h(f19, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return f19;
            }
        }

        public final F<?> d(Class<?> cls, boolean z10) {
            C17542s.j(cls, "clazz");
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z10 ? new s(cls) : new t(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z10) {
                return new r(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z10 ? new u(cls) : new v(cls);
            }
            return null;
        }

        private q() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lx4/F$r;", "", "D", "Lx4/F$v;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "value", "n", "(Ljava/lang/String;)Ljava/lang/Enum;", "u", "Ljava/lang/Class;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class r<D extends Enum<?>> extends v<D> {

        /* renamed from: u  reason: collision with root package name */
        private final Class<D> f57447u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(Class<D> cls) {
            super(false, cls);
            C17542s.j(cls, "type");
            if (cls.isEnum()) {
                this.f57447u = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        public String b() {
            String name = this.f57447u.getName();
            C17542s.i(name, "type.name");
            return name;
        }

        /* renamed from: n */
        public D l(String str) {
            D d10;
            C17542s.j(str, "value");
            D[] enumConstants = this.f57447u.getEnumConstants();
            C17542s.i(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (C15854t.H(((Enum) d10).name(), str, true)) {
                    break;
                }
                i10++;
            }
            D d11 = (Enum) d10;
            if (d11 != null) {
                return d11;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f57447u.getName() + '.');
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lx4/F$s;", "Landroid/os/Parcelable;", "D", "Lx4/F;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "l", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "n", "([Landroid/os/Parcelable;[Landroid/os/Parcelable;)Z", "t", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class s<D extends Parcelable> extends F<D[]> {

        /* renamed from: t  reason: collision with root package name */
        private final Class<D[]> f57448t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(Class<D> cls) {
            super(true);
            C17542s.j(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                    C17542s.h(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                    this.f57448t = cls2;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
        }

        public String b() {
            String name = this.f57448t.getName();
            C17542s.i(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C17542s.e(s.class, obj.getClass())) {
                return false;
            }
            return C17542s.e(this.f57448t, ((s) obj).f57448t);
        }

        public int hashCode() {
            return this.f57448t.hashCode();
        }

        /* renamed from: k */
        public D[] a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: l */
        public D[] f(String str) {
            C17542s.j(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: m */
        public void h(Bundle bundle, String str, D[] dArr) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            this.f57448t.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }

        /* renamed from: n */
        public boolean j(D[] dArr, D[] dArr2) {
            return C16870n.d(dArr, dArr2);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lx4/F$t;", "D", "Lx4/F;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "h", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "t", "Ljava/lang/Class;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class t<D> extends F<D> {

        /* renamed from: t  reason: collision with root package name */
        private final Class<D> f57449t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(Class<D> cls) {
            super(true);
            C17542s.j(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f57449t = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        public D a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return bundle.get(str);
        }

        public String b() {
            String name = this.f57449t.getName();
            C17542s.i(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C17542s.e(t.class, obj.getClass())) {
                return false;
            }
            return C17542s.e(this.f57449t, ((t) obj).f57449t);
        }

        public D f(String str) {
            C17542s.j(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public void h(Bundle bundle, String str, D d10) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            this.f57449t.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d10);
            }
        }

        public int hashCode() {
            return this.f57449t.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lx4/F$u;", "Ljava/io/Serializable;", "D", "Lx4/F;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "l", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "n", "([Ljava/io/Serializable;[Ljava/io/Serializable;)Z", "t", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class u<D extends Serializable> extends F<D[]> {

        /* renamed from: t  reason: collision with root package name */
        private final Class<D[]> f57450t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(Class<D> cls) {
            super(true);
            C17542s.j(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                    C17542s.h(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                    this.f57450t = cls2;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        public String b() {
            String name = this.f57450t.getName();
            C17542s.i(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C17542s.e(u.class, obj.getClass())) {
                return false;
            }
            return C17542s.e(this.f57450t, ((u) obj).f57450t);
        }

        public int hashCode() {
            return this.f57450t.hashCode();
        }

        /* renamed from: k */
        public D[] a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: l */
        public D[] f(String str) {
            C17542s.j(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [D[], java.lang.Object, java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(android.os.Bundle r2, java.lang.String r3, D[] r4) {
            /*
                r1 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                java.lang.Class<D[]> r0 = r1.f57450t
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.F.u.h(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }

        /* renamed from: n */
        public boolean j(D[] dArr, D[] dArr2) {
            return C16870n.d(dArr, dArr2);
        }
    }

    public F(boolean z10) {
        this.f57445a = z10;
    }

    public abstract T a(Bundle bundle, String str);

    public String b() {
        return this.f57446b;
    }

    public boolean c() {
        return this.f57445a;
    }

    public final T d(Bundle bundle, String str, String str2) {
        C17542s.j(bundle, "bundle");
        C17542s.j(str, "key");
        C17542s.j(str2, "value");
        T f10 = f(str2);
        h(bundle, str, f10);
        return f10;
    }

    public final T e(Bundle bundle, String str, String str2, T t10) {
        C17542s.j(bundle, "bundle");
        C17542s.j(str, "key");
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        } else if (str2 == null) {
            return t10;
        } else {
            T g10 = g(str2, t10);
            h(bundle, str, g10);
            return g10;
        }
    }

    public abstract T f(String str);

    public T g(String str, T t10) {
        C17542s.j(str, "value");
        return f(str);
    }

    public abstract void h(Bundle bundle, String str, T t10);

    public String i(T t10) {
        return String.valueOf(t10);
    }

    public boolean j(T t10, T t11) {
        return C17542s.e(t10, t11);
    }

    public String toString() {
        return b();
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lx4/F$v;", "Ljava/io/Serializable;", "D", "Lx4/F;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "nullableAllowed", "(ZLjava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "l", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "t", "Ljava/lang/Class;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class v<D extends Serializable> extends F<D> {

        /* renamed from: t  reason: collision with root package name */
        private final Class<D> f57451t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(Class<D> cls) {
            super(true);
            C17542s.j(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (!cls.isEnum()) {
                this.f57451t = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        public String b() {
            String name = this.f57451t.getName();
            C17542s.i(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            return C17542s.e(this.f57451t, ((v) obj).f57451t);
        }

        public int hashCode() {
            return this.f57451t.hashCode();
        }

        /* renamed from: k */
        public D a(Bundle bundle, String str) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            return (Serializable) bundle.get(str);
        }

        /* renamed from: l */
        public D f(String str) {
            C17542s.j(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: m */
        public void h(Bundle bundle, String str, D d10) {
            C17542s.j(bundle, "bundle");
            C17542s.j(str, "key");
            C17542s.j(d10, "value");
            this.f57451t.cast(d10);
            bundle.putSerializable(str, d10);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(boolean z10, Class<D> cls) {
            super(z10);
            C17542s.j(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f57451t = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
