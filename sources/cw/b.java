package cw;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b&\u0010-R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b#\u0010\u001b¨\u00068"}, d2 = {"Lcw/b;", "", "", "id", "text", "", "icon", "linkTo", "Lcw/c;", "type", "", "startMs", "endMs", "", "allowedPaths", "blockedPaths", "", "childPages", "hideOnPip", "displayedCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcw/c;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;ZZI)V", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcw/c;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;ZZI)Lcw/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "i", "c", "I", "e", "d", "g", "Lcw/c;", "j", "()Lcw/c;", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "Ljava/util/List;", "getAllowedPaths", "()Ljava/util/List;", "getBlockedPaths", "Z", "getChildPages", "()Z", "k", "getHideOnPip", "l", "messagecenter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f72348a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72349b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72350c;

    /* renamed from: d  reason: collision with root package name */
    private final String f72351d;

    /* renamed from: e  reason: collision with root package name */
    private final c f72352e;

    /* renamed from: f  reason: collision with root package name */
    private final Long f72353f;

    /* renamed from: g  reason: collision with root package name */
    private final Long f72354g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f72355h;

    /* renamed from: i  reason: collision with root package name */
    private final List<String> f72356i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f72357j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f72358k;

    /* renamed from: l  reason: collision with root package name */
    private final int f72359l;

    public b(String str, String str2, int i10, String str3, c cVar, Long l10, Long l11, List<String> list, List<String> list2, boolean z10, boolean z11, int i11) {
        C17542s.j(str, "id");
        C17542s.j(str2, "text");
        C17542s.j(cVar, "type");
        this.f72348a = str;
        this.f72349b = str2;
        this.f72350c = i10;
        this.f72351d = str3;
        this.f72352e = cVar;
        this.f72353f = l10;
        this.f72354g = l11;
        this.f72355h = list;
        this.f72356i = list2;
        this.f72357j = z10;
        this.f72358k = z11;
        this.f72359l = i11;
    }

    public static /* synthetic */ b b(b bVar, String str, String str2, int i10, String str3, c cVar, Long l10, Long l11, List list, List list2, boolean z10, boolean z11, int i11, int i12, Object obj) {
        b bVar2 = bVar;
        int i13 = i12;
        return bVar.a((i13 & 1) != 0 ? bVar2.f72348a : str, (i13 & 2) != 0 ? bVar2.f72349b : str2, (i13 & 4) != 0 ? bVar2.f72350c : i10, (i13 & 8) != 0 ? bVar2.f72351d : str3, (i13 & 16) != 0 ? bVar2.f72352e : cVar, (i13 & 32) != 0 ? bVar2.f72353f : l10, (i13 & 64) != 0 ? bVar2.f72354g : l11, (i13 & 128) != 0 ? bVar2.f72355h : list, (i13 & 256) != 0 ? bVar2.f72356i : list2, (i13 & 512) != 0 ? bVar2.f72357j : z10, (i13 & 1024) != 0 ? bVar2.f72358k : z11, (i13 & RecyclerView.n.FLAG_MOVED) != 0 ? bVar2.f72359l : i11);
    }

    public final b a(String str, String str2, int i10, String str3, c cVar, Long l10, Long l11, List<String> list, List<String> list2, boolean z10, boolean z11, int i11) {
        C17542s.j(str, "id");
        String str4 = str2;
        C17542s.j(str4, "text");
        c cVar2 = cVar;
        C17542s.j(cVar2, "type");
        return new b(str, str4, i10, str3, cVar2, l10, l11, list, list2, z10, z11, i11);
    }

    public final int c() {
        return this.f72359l;
    }

    public final Long d() {
        return this.f72354g;
    }

    public final int e() {
        return this.f72350c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f72348a, bVar.f72348a) && C17542s.e(this.f72349b, bVar.f72349b) && this.f72350c == bVar.f72350c && C17542s.e(this.f72351d, bVar.f72351d) && this.f72352e == bVar.f72352e && C17542s.e(this.f72353f, bVar.f72353f) && C17542s.e(this.f72354g, bVar.f72354g) && C17542s.e(this.f72355h, bVar.f72355h) && C17542s.e(this.f72356i, bVar.f72356i) && this.f72357j == bVar.f72357j && this.f72358k == bVar.f72358k && this.f72359l == bVar.f72359l;
    }

    public final String f() {
        return this.f72348a;
    }

    public final String g() {
        return this.f72351d;
    }

    public final Long h() {
        return this.f72353f;
    }

    public int hashCode() {
        int hashCode = ((((this.f72348a.hashCode() * 31) + this.f72349b.hashCode()) * 31) + Integer.hashCode(this.f72350c)) * 31;
        String str = this.f72351d;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f72352e.hashCode()) * 31;
        Long l10 = this.f72353f;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f72354g;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        List<String> list = this.f72355h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f72356i;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return ((((((hashCode5 + i10) * 31) + Boolean.hashCode(this.f72357j)) * 31) + Boolean.hashCode(this.f72358k)) * 31) + Integer.hashCode(this.f72359l);
    }

    public final String i() {
        return this.f72349b;
    }

    public final c j() {
        return this.f72352e;
    }

    public String toString() {
        String str = this.f72348a;
        String str2 = this.f72349b;
        int i10 = this.f72350c;
        String str3 = this.f72351d;
        c cVar = this.f72352e;
        Long l10 = this.f72353f;
        Long l11 = this.f72354g;
        List<String> list = this.f72355h;
        List<String> list2 = this.f72356i;
        boolean z10 = this.f72357j;
        boolean z11 = this.f72358k;
        int i11 = this.f72359l;
        return "CommercialMessage(id=" + str + ", text=" + str2 + ", icon=" + i10 + ", linkTo=" + str3 + ", type=" + cVar + ", startMs=" + l10 + ", endMs=" + l11 + ", allowedPaths=" + list + ", blockedPaths=" + list2 + ", childPages=" + z10 + ", hideOnPip=" + z11 + ", displayedCount=" + i11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, int i10, String str3, c cVar, Long l10, Long l11, List list, List list2, boolean z10, boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, str3, cVar, l10, l11, list, list2, z10, z11, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? 0 : i11);
    }
}
