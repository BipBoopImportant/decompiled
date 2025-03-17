package N1;

import N1.C4677l;
import XH.C16814e;
import YH.C16877v;
import bI.C17035a;
import f1.C5309k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 C2\u00020\u0001:\u0003\u0014<@B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 J1\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J)\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J+\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0004\b-\u0010+J)\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b/\u0010+J\u001d\u00100\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u00020&2\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0002H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u00107R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R(\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R*\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b/\u0010=\u001a\u0004\b<\u0010?R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F¢\u0006\u0006\u001a\u0004\bB\u0010?R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048F¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0014\u0010D\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b@\u00105\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"LN1/d;", "", "", "text", "", "LN1/d$c;", "LN1/G;", "spanStylesOrNull", "LN1/y;", "paragraphStylesOrNull", "", "annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "spanStyles", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "a", "(I)C", "startIndex", "endIndex", "q", "(II)LN1/d;", "LN1/W;", "range", "r", "(J)LN1/d;", "other", "p", "(LN1/d;)LN1/d;", "tag", "start", "end", "i", "(Ljava/lang/String;II)Ljava/util/List;", "", "o", "(Ljava/lang/String;II)Z", "LN1/a0;", "k", "(II)Ljava/util/List;", "LN1/b0;", "l", "LN1/l;", "d", "n", "(II)Z", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "m", "(LN1/d;)Z", "Ljava/lang/String;", "j", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "f", "g", "e", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.d  reason: case insensitive filesystem */
public final class C4669d implements CharSequence {

    /* renamed from: e  reason: collision with root package name */
    public static final b f9439e = new b((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final C5309k<C4669d, ?> f9440f = F.h();

    /* renamed from: a  reason: collision with root package name */
    private final String f9441a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c<G>> f9442b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c<C4689y>> f9443c;

    /* renamed from: d  reason: collision with root package name */
    private final List<c<? extends Object>> f9444d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LN1/d$b;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N1.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: N1.d$d  reason: collision with other inner class name */
    public static final class C0139d<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((c) t10).h()), Integer.valueOf(((c) t11).h()));
        }
    }

    public C4669d(String str, List<c<G>> list, List<c<C4689y>> list2, List<? extends c<? extends Object>> list3) {
        List g12;
        this.f9441a = str;
        this.f9442b = list;
        this.f9443c = list2;
        this.f9444d = list3;
        if (list2 != null && (g12 = C16877v.g1(list2, new C0139d())) != null) {
            int size = g12.size();
            int i10 = -1;
            int i11 = 0;
            while (i11 < size) {
                c cVar = (c) g12.get(i11);
                if (cVar.h() < i10) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                } else if (cVar.f() <= this.f9441a.length()) {
                    i10 = cVar.f();
                    i11++;
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + cVar.h() + ", " + cVar.f() + ") is out of boundary").toString());
                }
            }
        }
    }

    public char a(int i10) {
        return this.f9441a.charAt(i10);
    }

    public final List<c<? extends Object>> b() {
        return this.f9444d;
    }

    public int c() {
        return this.f9441a.length();
    }

    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List<c<C4677l>> d(int i10, int i11) {
        List<c<C4677l>> list;
        List<c<? extends Object>> list2 = this.f9444d;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                c<? extends Object> cVar = list2.get(i12);
                c cVar2 = cVar;
                if ((cVar2.g() instanceof C4677l) && C4670e.n(i10, i11, cVar2.h(), cVar2.f())) {
                    list.add(cVar);
                }
            }
        } else {
            list = C16877v.n();
        }
        C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return list;
    }

    public final List<c<C4689y>> e() {
        List<c<C4689y>> list = this.f9443c;
        return list == null ? C16877v.n() : list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4669d)) {
            return false;
        }
        C4669d dVar = (C4669d) obj;
        return C17542s.e(this.f9441a, dVar.f9441a) && C17542s.e(this.f9442b, dVar.f9442b) && C17542s.e(this.f9443c, dVar.f9443c) && C17542s.e(this.f9444d, dVar.f9444d);
    }

    public final List<c<C4689y>> f() {
        return this.f9443c;
    }

    public final List<c<G>> g() {
        List<c<G>> list = this.f9442b;
        return list == null ? C16877v.n() : list;
    }

    public final List<c<G>> h() {
        return this.f9442b;
    }

    public int hashCode() {
        int hashCode = this.f9441a.hashCode() * 31;
        List<c<G>> list = this.f9442b;
        int i10 = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<c<C4689y>> list2 = this.f9443c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<c<? extends Object>> list3 = this.f9444d;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode3 + i10;
    }

    public final List<c<String>> i(String str, int i10, int i11) {
        List<c<String>> list;
        List<c<? extends Object>> list2 = this.f9444d;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                c<? extends Object> cVar = list2.get(i12);
                c cVar2 = cVar;
                if ((cVar2.g() instanceof String) && C17542s.e(str, cVar2.i()) && C4670e.n(i10, i11, cVar2.h(), cVar2.f())) {
                    list.add(cVar);
                }
            }
        } else {
            list = C16877v.n();
        }
        C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list;
    }

    public final String j() {
        return this.f9441a;
    }

    public final List<c<a0>> k(int i10, int i11) {
        List<c<a0>> list;
        List<c<? extends Object>> list2 = this.f9444d;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                c<? extends Object> cVar = list2.get(i12);
                c cVar2 = cVar;
                if ((cVar2.g() instanceof a0) && C4670e.n(i10, i11, cVar2.h(), cVar2.f())) {
                    list.add(cVar);
                }
            }
        } else {
            list = C16877v.n();
        }
        C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return list;
    }

    @C16814e
    public final List<c<b0>> l(int i10, int i11) {
        List<c<b0>> list;
        List<c<? extends Object>> list2 = this.f9444d;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                c<? extends Object> cVar = list2.get(i12);
                c cVar2 = cVar;
                if ((cVar2.g() instanceof b0) && C4670e.n(i10, i11, cVar2.h(), cVar2.f())) {
                    list.add(cVar);
                }
            }
        } else {
            list = C16877v.n();
        }
        C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return list;
    }

    public final /* bridge */ int length() {
        return c();
    }

    public final boolean m(C4669d dVar) {
        return C17542s.e(this.f9444d, dVar.f9444d);
    }

    public final boolean n(int i10, int i11) {
        List<c<? extends Object>> list = this.f9444d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = list.get(i12);
            if ((cVar.g() instanceof C4677l) && C4670e.n(i10, i11, cVar.h(), cVar.f())) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(String str, int i10, int i11) {
        List<c<? extends Object>> list = this.f9444d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = list.get(i12);
            if ((cVar.g() instanceof String) && C17542s.e(str, cVar.i()) && C4670e.n(i10, i11, cVar.h(), cVar.f())) {
                return true;
            }
        }
        return false;
    }

    public final C4669d p(C4669d dVar) {
        a aVar = new a(this);
        aVar.h(dVar);
        return aVar.q();
    }

    /* renamed from: q */
    public C4669d subSequence(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
        } else if (i10 == 0 && i11 == this.f9441a.length()) {
            return this;
        } else {
            String substring = this.f9441a.substring(i10, i11);
            C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C4669d(substring, C4670e.j(this.f9442b, i10, i11), C4670e.j(this.f9443c, i10, i11), C4670e.j(this.f9444d, i10, i11));
        }
    }

    public final C4669d r(long j10) {
        return subSequence(W.l(j10), W.k(j10));
    }

    public String toString() {
        return this.f9441a;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"LN1/d$c;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "a", "()Ljava/lang/Object;", "b", "()I", "c", "d", "(Ljava/lang/Object;IILjava/lang/String;)LN1/d$c;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "g", "I", "h", "f", "Ljava/lang/String;", "i", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N1.d$c */
    public static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f9454a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9455b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9456c;

        /* renamed from: d  reason: collision with root package name */
        private final String f9457d;

        public c(T t10, int i10, int i11, String str) {
            this.f9454a = t10;
            this.f9455b = i10;
            this.f9456c = i11;
            this.f9457d = str;
            if (i10 > i11) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public static /* synthetic */ c e(c cVar, T t10, int i10, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                t10 = cVar.f9454a;
            }
            if ((i12 & 2) != 0) {
                i10 = cVar.f9455b;
            }
            if ((i12 & 4) != 0) {
                i11 = cVar.f9456c;
            }
            if ((i12 & 8) != 0) {
                str = cVar.f9457d;
            }
            return cVar.d(t10, i10, i11, str);
        }

        public final T a() {
            return this.f9454a;
        }

        public final int b() {
            return this.f9455b;
        }

        public final int c() {
            return this.f9456c;
        }

        public final c<T> d(T t10, int i10, int i11, String str) {
            return new c<>(t10, i10, i11, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f9454a, cVar.f9454a) && this.f9455b == cVar.f9455b && this.f9456c == cVar.f9456c && C17542s.e(this.f9457d, cVar.f9457d);
        }

        public final int f() {
            return this.f9456c;
        }

        public final T g() {
            return this.f9454a;
        }

        public final int h() {
            return this.f9455b;
        }

        public int hashCode() {
            T t10 = this.f9454a;
            return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.f9455b)) * 31) + Integer.hashCode(this.f9456c)) * 31) + this.f9457d.hashCode();
        }

        public final String i() {
            return this.f9457d;
        }

        public String toString() {
            return "Range(item=" + this.f9454a + ", start=" + this.f9455b + ", end=" + this.f9456c + ", tag=" + this.f9457d + ')';
        }

        public c(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001)B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J-\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J%\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020 ¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0003¢\u0006\u0004\b4\u0010\u0006J\r\u00105\u001a\u00020\u0007¢\u0006\u0004\b5\u00106R\u0018\u0010\b\u001a\u000607j\u0002`88\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u00109R \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010<R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010<R\"\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020?0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010<R\"\u0010A\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020?0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010<R\u0011\u0010D\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"LN1/d$a;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "LN1/d;", "text", "(LN1/d;)V", "", "LXH/N;", "j", "(Ljava/lang/String;)V", "", "f", "(Ljava/lang/CharSequence;)LN1/d$a;", "start", "end", "g", "(Ljava/lang/CharSequence;II)LN1/d$a;", "", "char", "e", "(C)LN1/d$a;", "h", "i", "(LN1/d;II)V", "LN1/G;", "style", "d", "(LN1/G;II)V", "LN1/y;", "c", "(LN1/y;II)V", "tag", "annotation", "b", "(Ljava/lang/String;Ljava/lang/String;II)V", "LN1/l$b;", "url", "a", "(LN1/l$b;II)V", "p", "(LN1/G;)I", "o", "(LN1/y;)I", "n", "(Ljava/lang/String;Ljava/lang/String;)I", "l", "()V", "index", "m", "q", "()LN1/d;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "LN1/d$a$a;", "Ljava/util/List;", "spanStyles", "paragraphStyles", "", "annotations", "styleStack", "k", "()I", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N1.d$a */
    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        private final StringBuilder f9445a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C0138a<G>> f9446b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C0138a<C4689y>> f9447c;

        /* renamed from: d  reason: collision with root package name */
        private final List<C0138a<? extends Object>> f9448d;

        /* renamed from: e  reason: collision with root package name */
        private final List<C0138a<? extends Object>> f9449e;

        public a(int i10) {
            this.f9445a = new StringBuilder(i10);
            this.f9446b = new ArrayList();
            this.f9447c = new ArrayList();
            this.f9448d = new ArrayList();
            this.f9449e = new ArrayList();
        }

        public final void a(C4677l.b bVar, int i10, int i11) {
            this.f9448d.add(new C0138a(bVar, i10, i11, (String) null, 8, (DefaultConstructorMarker) null));
        }

        public final void b(String str, String str2, int i10, int i11) {
            this.f9448d.add(new C0138a(str2, i10, i11, str));
        }

        public final void c(C4689y yVar, int i10, int i11) {
            this.f9447c.add(new C0138a(yVar, i10, i11, (String) null, 8, (DefaultConstructorMarker) null));
        }

        public final void d(G g10, int i10, int i11) {
            this.f9446b.add(new C0138a(g10, i10, i11, (String) null, 8, (DefaultConstructorMarker) null));
        }

        /* renamed from: e */
        public a append(char c10) {
            this.f9445a.append(c10);
            return this;
        }

        /* renamed from: f */
        public a append(CharSequence charSequence) {
            if (charSequence instanceof C4669d) {
                h((C4669d) charSequence);
            } else {
                this.f9445a.append(charSequence);
            }
            return this;
        }

        /* renamed from: g */
        public a append(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof C4669d) {
                i((C4669d) charSequence, i10, i11);
            } else {
                this.f9445a.append(charSequence, i10, i11);
            }
            return this;
        }

        public final void h(C4669d dVar) {
            int length = this.f9445a.length();
            this.f9445a.append(dVar.j());
            List<c<G>> h10 = dVar.h();
            if (h10 != null) {
                int size = h10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c cVar = h10.get(i10);
                    d((G) cVar.g(), cVar.h() + length, cVar.f() + length);
                }
            }
            List<c<C4689y>> f10 = dVar.f();
            if (f10 != null) {
                int size2 = f10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar2 = f10.get(i11);
                    c((C4689y) cVar2.g(), cVar2.h() + length, cVar2.f() + length);
                }
            }
            List<c<? extends Object>> b10 = dVar.b();
            if (b10 != null) {
                int size3 = b10.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    c cVar3 = b10.get(i12);
                    this.f9448d.add(new C0138a(cVar3.g(), cVar3.h() + length, cVar3.f() + length, cVar3.i()));
                }
            }
        }

        public final void i(C4669d dVar, int i10, int i11) {
            int length = this.f9445a.length();
            this.f9445a.append(dVar.j(), i10, i11);
            List f10 = C4670e.m(dVar, i10, i11);
            if (f10 != null) {
                int size = f10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    c cVar = (c) f10.get(i12);
                    d((G) cVar.g(), cVar.h() + length, cVar.f() + length);
                }
            }
            List e10 = C4670e.l(dVar, i10, i11);
            if (e10 != null) {
                int size2 = e10.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    c cVar2 = (c) e10.get(i13);
                    c((C4689y) cVar2.g(), cVar2.h() + length, cVar2.f() + length);
                }
            }
            List d10 = C4670e.k(dVar, i10, i11);
            if (d10 != null) {
                int size3 = d10.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    c cVar3 = (c) d10.get(i14);
                    this.f9448d.add(new C0138a(cVar3.g(), cVar3.h() + length, cVar3.f() + length, cVar3.i()));
                }
            }
        }

        public final void j(String str) {
            this.f9445a.append(str);
        }

        public final int k() {
            return this.f9445a.length();
        }

        public final void l() {
            if (!this.f9449e.isEmpty()) {
                List<C0138a<? extends Object>> list = this.f9449e;
                list.remove(list.size() - 1).a(this.f9445a.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.");
        }

        public final void m(int i10) {
            if (i10 < this.f9449e.size()) {
                while (this.f9449e.size() - 1 >= i10) {
                    l();
                }
                return;
            }
            throw new IllegalStateException((i10 + " should be less than " + this.f9449e.size()).toString());
        }

        public final int n(String str, String str2) {
            C0138a aVar = new C0138a(str2, this.f9445a.length(), 0, str, 4, (DefaultConstructorMarker) null);
            this.f9449e.add(aVar);
            this.f9448d.add(aVar);
            return this.f9449e.size() - 1;
        }

        public final int o(C4689y yVar) {
            C0138a aVar = new C0138a(yVar, this.f9445a.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f9449e.add(aVar);
            this.f9447c.add(aVar);
            return this.f9449e.size() - 1;
        }

        public final int p(G g10) {
            C0138a aVar = new C0138a(g10, this.f9445a.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f9449e.add(aVar);
            this.f9446b.add(aVar);
            return this.f9449e.size() - 1;
        }

        public final C4669d q() {
            String sb2 = this.f9445a.toString();
            List<C0138a<G>> list = this.f9446b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).b(this.f9445a.length()));
            }
            ArrayList arrayList2 = null;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<C0138a<C4689y>> list2 = this.f9447c;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList3.add(list2.get(i11).b(this.f9445a.length()));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            List<C0138a<? extends Object>> list3 = this.f9448d;
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList4.add(list3.get(i12).b(this.f9445a.length()));
            }
            if (!arrayList4.isEmpty()) {
                arrayList2 = arrayList4;
            }
            return new C4669d(sb2, arrayList, arrayList3, arrayList2);
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u0017\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"LN1/d$a$a;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "LN1/d$c;", "b", "(I)LN1/d$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "I", "getStart", "c", "getEnd", "(I)V", "d", "Ljava/lang/String;", "getTag", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: N1.d$a$a  reason: collision with other inner class name */
        private static final class C0138a<T> {

            /* renamed from: a  reason: collision with root package name */
            private final T f9450a;

            /* renamed from: b  reason: collision with root package name */
            private final int f9451b;

            /* renamed from: c  reason: collision with root package name */
            private int f9452c;

            /* renamed from: d  reason: collision with root package name */
            private final String f9453d;

            public C0138a(T t10, int i10, int i11, String str) {
                this.f9450a = t10;
                this.f9451b = i10;
                this.f9452c = i11;
                this.f9453d = str;
            }

            public final void a(int i10) {
                this.f9452c = i10;
            }

            public final c<T> b(int i10) {
                int i11 = this.f9452c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 != Integer.MIN_VALUE) {
                    return new c<>(this.f9450a, this.f9451b, i10, this.f9453d);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0138a)) {
                    return false;
                }
                C0138a aVar = (C0138a) obj;
                return C17542s.e(this.f9450a, aVar.f9450a) && this.f9451b == aVar.f9451b && this.f9452c == aVar.f9452c && C17542s.e(this.f9453d, aVar.f9453d);
            }

            public int hashCode() {
                T t10 = this.f9450a;
                return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.f9451b)) * 31) + Integer.hashCode(this.f9452c)) * 31) + this.f9453d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f9450a + ", start=" + this.f9451b + ", end=" + this.f9452c + ", tag=" + this.f9453d + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C0138a(Object obj, int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public a(C4669d dVar) {
            this(0, 1, (DefaultConstructorMarker) null);
            h(dVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4669d(String str, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4669d(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? C16877v.n() : list, (i10 & 4) != 0 ? C16877v.n() : list2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4669d(java.lang.String r3, java.util.List<N1.C4669d.c<N1.G>> r4, java.util.List<N1.C4669d.c<N1.C4689y>> r5) {
        /*
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r4 = r1
        L_0x000a:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0015
            r5 = r1
        L_0x0015:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.C4669d.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
