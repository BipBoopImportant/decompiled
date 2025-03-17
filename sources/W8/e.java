package w8;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ²\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b'\u0010\u001bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010#\u001a\u0004\b+\u0010\u001b\"\u0004\b:\u0010;R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b6\u0010>R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010?\u001a\u0004\b<\u0010@R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\bA\u00105R\"\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\bB\u00105\"\u0004\bC\u0010DR\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\b8\u00105¨\u0006E"}, d2 = {"Lw8/e;", "", "", "id", "name", "parent", "Landroid/graphics/Rect;", "bounds", "", "posZ", "", "isVisible", "", "childOrder", "viewAlpha", "background", "bitmap", "", "children", "Lw8/e$a;", "nodeType", "isClickable", "isEmptyOverlay", "excludeFromGestureRecognition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lw8/e;Landroid/graphics/Rect;FZIFLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lw8/e$a;ZZZ)V", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/lang/String;Lw8/e;Landroid/graphics/Rect;FZIFLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lw8/e$a;ZZZ)Lw8/e;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "j", "c", "Lw8/e;", "l", "()Lw8/e;", "d", "Landroid/graphics/Rect;", "e", "()Landroid/graphics/Rect;", "F", "m", "()F", "f", "Z", "q", "()Z", "g", "I", "h", "n", "r", "(Ljava/lang/String;)V", "k", "Ljava/util/List;", "()Ljava/util/List;", "Lw8/e$a;", "()Lw8/e$a;", "o", "p", "s", "(Z)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f57348a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57349b;

    /* renamed from: c  reason: collision with root package name */
    private final e f57350c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f57351d;

    /* renamed from: e  reason: collision with root package name */
    private final float f57352e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f57353f;

    /* renamed from: g  reason: collision with root package name */
    private final int f57354g;

    /* renamed from: h  reason: collision with root package name */
    private final float f57355h;

    /* renamed from: i  reason: collision with root package name */
    private final String f57356i;

    /* renamed from: j  reason: collision with root package name */
    private String f57357j;

    /* renamed from: k  reason: collision with root package name */
    private final List<e> f57358k;

    /* renamed from: l  reason: collision with root package name */
    private final a f57359l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f57360m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f57361n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f57362o;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lw8/e$a;", "", "<init>", "()V", "a", "b", "c", "Lw8/e$a$a;", "Lw8/e$a$b;", "Lw8/e$a$c;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw8/e$a$a;", "Lw8/e$a;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: w8.e$a$a  reason: collision with other inner class name */
        public static final class C0924a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0924a f57363a = new C0924a();

            private C0924a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw8/e$a$b;", "Lw8/e$a;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f57364a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lw8/e$a$c;", "Lw8/e$a;", "", "columnCount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getColumnCount", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f57365a;

            public c(int i10) {
                super((DefaultConstructorMarker) null);
                this.f57365a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f57365a == ((c) obj).f57365a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f57365a);
            }

            public String toString() {
                return "VerticalLazyContainer(columnCount=" + this.f57365a + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e() {
        this((String) null, (String) null, (e) null, (Rect) null, 0.0f, false, 0, 0.0f, (String) null, (String) null, (List) null, (a) null, false, false, false, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ e b(e eVar, String str, String str2, e eVar2, Rect rect, float f10, boolean z10, int i10, float f11, String str3, String str4, List list, a aVar, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        e eVar3 = eVar;
        int i12 = i11;
        return eVar.a((i12 & 1) != 0 ? eVar3.f57348a : str, (i12 & 2) != 0 ? eVar3.f57349b : str2, (i12 & 4) != 0 ? eVar3.f57350c : eVar2, (i12 & 8) != 0 ? eVar3.f57351d : rect, (i12 & 16) != 0 ? eVar3.f57352e : f10, (i12 & 32) != 0 ? eVar3.f57353f : z10, (i12 & 64) != 0 ? eVar3.f57354g : i10, (i12 & 128) != 0 ? eVar3.f57355h : f11, (i12 & 256) != 0 ? eVar3.f57356i : str3, (i12 & 512) != 0 ? eVar3.f57357j : str4, (i12 & 1024) != 0 ? eVar3.f57358k : list, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? eVar3.f57359l : aVar, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? eVar3.f57360m : z11, (i12 & 8192) != 0 ? eVar3.f57361n : z12, (i12 & 16384) != 0 ? eVar3.f57362o : z13);
    }

    public final e a(String str, String str2, e eVar, Rect rect, float f10, boolean z10, int i10, float f11, String str3, String str4, List<e> list, a aVar, boolean z11, boolean z12, boolean z13) {
        String str5 = str;
        C17542s.j(str5, "id");
        String str6 = str2;
        C17542s.j(str6, "name");
        Rect rect2 = rect;
        C17542s.j(rect2, "bounds");
        List<e> list2 = list;
        C17542s.j(list2, "children");
        a aVar2 = aVar;
        C17542s.j(aVar2, "nodeType");
        return new e(str5, str6, eVar, rect2, f10, z10, i10, f11, str3, str4, list2, aVar2, z11, z12, z13);
    }

    public final String c() {
        return this.f57356i;
    }

    public final String d() {
        return this.f57357j;
    }

    public final Rect e() {
        return this.f57351d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f57348a, eVar.f57348a) && C17542s.e(this.f57349b, eVar.f57349b) && C17542s.e(this.f57350c, eVar.f57350c) && C17542s.e(this.f57351d, eVar.f57351d) && Float.compare(this.f57352e, eVar.f57352e) == 0 && this.f57353f == eVar.f57353f && this.f57354g == eVar.f57354g && Float.compare(this.f57355h, eVar.f57355h) == 0 && C17542s.e(this.f57356i, eVar.f57356i) && C17542s.e(this.f57357j, eVar.f57357j) && C17542s.e(this.f57358k, eVar.f57358k) && C17542s.e(this.f57359l, eVar.f57359l) && this.f57360m == eVar.f57360m && this.f57361n == eVar.f57361n && this.f57362o == eVar.f57362o;
    }

    public final int f() {
        return this.f57354g;
    }

    public final List<e> g() {
        return this.f57358k;
    }

    public final boolean h() {
        return this.f57362o;
    }

    public int hashCode() {
        int hashCode = (this.f57349b.hashCode() + (this.f57348a.hashCode() * 31)) * 31;
        e eVar = this.f57350c;
        int i10 = 0;
        int hashCode2 = (Float.hashCode(this.f57352e) + ((this.f57351d.hashCode() + ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31)) * 31;
        boolean z10 = this.f57353f;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode3 = (Float.hashCode(this.f57355h) + ((Integer.hashCode(this.f57354g) + ((hashCode2 + (z10 ? 1 : 0)) * 31)) * 31)) * 31;
        String str = this.f57356i;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57357j;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        int hashCode5 = (this.f57359l.hashCode() + ((this.f57358k.hashCode() + ((hashCode4 + i10) * 31)) * 31)) * 31;
        boolean z12 = this.f57360m;
        if (z12) {
            z12 = true;
        }
        int i11 = (hashCode5 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f57361n;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f57362o;
        if (!z14) {
            z11 = z14;
        }
        return i12 + (z11 ? 1 : 0);
    }

    public final String i() {
        return this.f57348a;
    }

    public final String j() {
        return this.f57349b;
    }

    public final a k() {
        return this.f57359l;
    }

    public final e l() {
        return this.f57350c;
    }

    public final float m() {
        return this.f57352e;
    }

    public final float n() {
        return this.f57355h;
    }

    public final boolean o() {
        return this.f57360m;
    }

    public final boolean p() {
        return this.f57361n;
    }

    public final boolean q() {
        return this.f57353f;
    }

    public final void r(String str) {
        this.f57357j = str;
    }

    public final void s(boolean z10) {
        this.f57361n = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ViewNode name: ");
        sb2.append(this.f57349b);
        sb2.append(" parent: ");
        e eVar = this.f57350c;
        sb2.append(eVar != null ? eVar.f57349b : null);
        sb2.append(" nodeType: ");
        sb2.append(this.f57359l);
        sb2.append(" bounds: ");
        sb2.append(this.f57351d);
        sb2.append(" posZ: ");
        sb2.append(this.f57352e);
        sb2.append(" isVisible: ");
        sb2.append(this.f57353f);
        sb2.append(" childOrder: ");
        sb2.append(this.f57354g);
        sb2.append(" viewAlpha: ");
        sb2.append(this.f57355h);
        sb2.append(" background: ");
        sb2.append(this.f57356i);
        sb2.append(" childrenSize: ");
        sb2.append(this.f57358k.size());
        sb2.append(" isClickable: ");
        sb2.append(this.f57360m);
        sb2.append(" isEmptyOverlay: ");
        sb2.append(this.f57361n);
        sb2.append(" excludeFromGestureRecognition: ");
        sb2.append(this.f57362o);
        sb2.append(' ');
        return sb2.toString();
    }

    public e(String str, String str2, e eVar, Rect rect, float f10, boolean z10, int i10, float f11, String str3, String str4, List<e> list, a aVar, boolean z11, boolean z12, boolean z13) {
        List<e> list2 = list;
        a aVar2 = aVar;
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(rect, "bounds");
        C17542s.j(list2, "children");
        C17542s.j(aVar2, "nodeType");
        this.f57348a = str;
        this.f57349b = str2;
        this.f57350c = eVar;
        this.f57351d = rect;
        this.f57352e = f10;
        this.f57353f = z10;
        this.f57354g = i10;
        this.f57355h = f11;
        this.f57356i = str3;
        this.f57357j = str4;
        this.f57358k = list2;
        this.f57359l = aVar2;
        this.f57360m = z11;
        this.f57361n = z12;
        this.f57362o = z13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(java.lang.String r17, java.lang.String r18, w8.e r19, android.graphics.Rect r20, float r21, boolean r22, int r23, float r24, java.lang.String r25, java.lang.String r26, java.util.List r27, w8.e.a r28, boolean r29, boolean r30, boolean r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r17
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = r18
        L_0x0013:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x001a
            r3 = r4
            goto L_0x001c
        L_0x001a:
            r3 = r19
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0026
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            goto L_0x0028
        L_0x0026:
            r5 = r20
        L_0x0028:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002e
            r6 = 0
            goto L_0x0030
        L_0x002e:
            r6 = r21
        L_0x0030:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0036
            r7 = 1
            goto L_0x0038
        L_0x0036:
            r7 = r22
        L_0x0038:
            r8 = r0 & 64
            r9 = 0
            if (r8 == 0) goto L_0x003f
            r8 = r9
            goto L_0x0041
        L_0x003f:
            r8 = r23
        L_0x0041:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004a
        L_0x0048:
            r10 = r24
        L_0x004a:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r4
            goto L_0x0052
        L_0x0050:
            r11 = r25
        L_0x0052:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r4 = r26
        L_0x0059:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0063
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            goto L_0x0065
        L_0x0063:
            r12 = r27
        L_0x0065:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x006c
            w8.e$a$b r13 = w8.e.a.b.f57364a
            goto L_0x006e
        L_0x006c:
            r13 = r28
        L_0x006e:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0074
            r14 = r9
            goto L_0x0076
        L_0x0074:
            r14 = r29
        L_0x0076:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007c
            r15 = r9
            goto L_0x007e
        L_0x007c:
            r15 = r30
        L_0x007e:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r9 = r31
        L_0x0085:
            r17 = r16
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r10
            r26 = r11
            r27 = r4
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.e.<init>(java.lang.String, java.lang.String, w8.e, android.graphics.Rect, float, boolean, int, float, java.lang.String, java.lang.String, java.util.List, w8.e$a, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
