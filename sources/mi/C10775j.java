package Mi;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017Jª\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b*\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b(\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b.\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b0\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b:\u00103R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b+\u00103¨\u0006;"}, d2 = {"LMi/j;", "LMi/i;", "", "id", "nickname", "sourceLanguage", "sourceCountry", "appDisplayLanguage", "", "rating", "age", "title", "reviewText", "", "verifiedPurchase", "LMi/k;", "response", "LMi/n;", "translation", "isLocalReview", "positiveFeedbacksCount", "hasVotedHelpful", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLMi/k;LMi/n;ZIZ)V", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLMi/k;LMi/n;ZIZ)LMi/j;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "h", "c", "n", "d", "m", "e", "f", "I", "j", "o", "i", "l", "Z", "q", "()Z", "k", "LMi/k;", "()LMi/k;", "LMi/n;", "p", "()LMi/n;", "r", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mi.j  reason: case insensitive filesystem */
public final class C10775j implements C10774i {

    /* renamed from: a  reason: collision with root package name */
    private final String f83400a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83401b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83402c;

    /* renamed from: d  reason: collision with root package name */
    private final String f83403d;

    /* renamed from: e  reason: collision with root package name */
    private final String f83404e;

    /* renamed from: f  reason: collision with root package name */
    private final int f83405f;

    /* renamed from: g  reason: collision with root package name */
    private final String f83406g;

    /* renamed from: h  reason: collision with root package name */
    private final String f83407h;

    /* renamed from: i  reason: collision with root package name */
    private final String f83408i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f83409j;

    /* renamed from: k  reason: collision with root package name */
    private final C10776k f83410k;

    /* renamed from: l  reason: collision with root package name */
    private final n f83411l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f83412m;

    /* renamed from: n  reason: collision with root package name */
    private final int f83413n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f83414o;

    public C10775j(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, boolean z10, C10776k kVar, n nVar, boolean z11, int i11, boolean z12) {
        String str9 = str6;
        String str10 = str7;
        String str11 = str8;
        C17542s.j(str, "id");
        C17542s.j(str2, "nickname");
        C17542s.j(str3, "sourceLanguage");
        C17542s.j(str4, "sourceCountry");
        C17542s.j(str5, "appDisplayLanguage");
        C17542s.j(str9, "age");
        C17542s.j(str10, "title");
        C17542s.j(str11, "reviewText");
        this.f83400a = str;
        this.f83401b = str2;
        this.f83402c = str3;
        this.f83403d = str4;
        this.f83404e = str5;
        this.f83405f = i10;
        this.f83406g = str9;
        this.f83407h = str10;
        this.f83408i = str11;
        this.f83409j = z10;
        this.f83410k = kVar;
        this.f83411l = nVar;
        this.f83412m = z11;
        this.f83413n = i11;
        this.f83414o = z12;
    }

    public static /* synthetic */ C10775j c(C10775j jVar, String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, boolean z10, C10776k kVar, n nVar, boolean z11, int i11, boolean z12, int i12, Object obj) {
        C10775j jVar2 = jVar;
        int i13 = i12;
        return jVar.b((i13 & 1) != 0 ? jVar2.f83400a : str, (i13 & 2) != 0 ? jVar2.f83401b : str2, (i13 & 4) != 0 ? jVar2.f83402c : str3, (i13 & 8) != 0 ? jVar2.f83403d : str4, (i13 & 16) != 0 ? jVar2.f83404e : str5, (i13 & 32) != 0 ? jVar2.f83405f : i10, (i13 & 64) != 0 ? jVar2.f83406g : str6, (i13 & 128) != 0 ? jVar2.f83407h : str7, (i13 & 256) != 0 ? jVar2.f83408i : str8, (i13 & 512) != 0 ? jVar2.f83409j : z10, (i13 & 1024) != 0 ? jVar2.f83410k : kVar, (i13 & RecyclerView.n.FLAG_MOVED) != 0 ? jVar2.f83411l : nVar, (i13 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? jVar2.f83412m : z11, (i13 & 8192) != 0 ? jVar2.f83413n : i11, (i13 & 16384) != 0 ? jVar2.f83414o : z12);
    }

    public final C10775j b(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, boolean z10, C10776k kVar, n nVar, boolean z11, int i11, boolean z12) {
        String str9 = str;
        C17542s.j(str9, "id");
        String str10 = str2;
        C17542s.j(str10, "nickname");
        String str11 = str3;
        C17542s.j(str11, "sourceLanguage");
        String str12 = str4;
        C17542s.j(str12, "sourceCountry");
        String str13 = str5;
        C17542s.j(str13, "appDisplayLanguage");
        String str14 = str6;
        C17542s.j(str14, "age");
        String str15 = str7;
        C17542s.j(str15, "title");
        String str16 = str8;
        C17542s.j(str16, "reviewText");
        return new C10775j(str9, str10, str11, str12, str13, i10, str14, str15, str16, z10, kVar, nVar, z11, i11, z12);
    }

    public final String d() {
        return this.f83406g;
    }

    public final String e() {
        return this.f83404e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10775j)) {
            return false;
        }
        C10775j jVar = (C10775j) obj;
        return C17542s.e(this.f83400a, jVar.f83400a) && C17542s.e(this.f83401b, jVar.f83401b) && C17542s.e(this.f83402c, jVar.f83402c) && C17542s.e(this.f83403d, jVar.f83403d) && C17542s.e(this.f83404e, jVar.f83404e) && this.f83405f == jVar.f83405f && C17542s.e(this.f83406g, jVar.f83406g) && C17542s.e(this.f83407h, jVar.f83407h) && C17542s.e(this.f83408i, jVar.f83408i) && this.f83409j == jVar.f83409j && C17542s.e(this.f83410k, jVar.f83410k) && C17542s.e(this.f83411l, jVar.f83411l) && this.f83412m == jVar.f83412m && this.f83413n == jVar.f83413n && this.f83414o == jVar.f83414o;
    }

    public final boolean f() {
        return this.f83414o;
    }

    public final String g() {
        return this.f83400a;
    }

    public final String h() {
        return this.f83401b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.f83400a.hashCode() * 31) + this.f83401b.hashCode()) * 31) + this.f83402c.hashCode()) * 31) + this.f83403d.hashCode()) * 31) + this.f83404e.hashCode()) * 31) + Integer.hashCode(this.f83405f)) * 31) + this.f83406g.hashCode()) * 31) + this.f83407h.hashCode()) * 31) + this.f83408i.hashCode()) * 31) + Boolean.hashCode(this.f83409j)) * 31;
        C10776k kVar = this.f83410k;
        int i10 = 0;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        n nVar = this.f83411l;
        if (nVar != null) {
            i10 = nVar.hashCode();
        }
        return ((((((hashCode2 + i10) * 31) + Boolean.hashCode(this.f83412m)) * 31) + Integer.hashCode(this.f83413n)) * 31) + Boolean.hashCode(this.f83414o);
    }

    public final int i() {
        return this.f83413n;
    }

    public final int j() {
        return this.f83405f;
    }

    public final C10776k k() {
        return this.f83410k;
    }

    public final String l() {
        return this.f83408i;
    }

    public final String m() {
        return this.f83403d;
    }

    public final String n() {
        return this.f83402c;
    }

    public final String o() {
        return this.f83407h;
    }

    public final n p() {
        return this.f83411l;
    }

    public final boolean q() {
        return this.f83409j;
    }

    public final boolean r() {
        return this.f83412m;
    }

    public String toString() {
        String str = this.f83400a;
        String str2 = this.f83401b;
        String str3 = this.f83402c;
        String str4 = this.f83403d;
        String str5 = this.f83404e;
        int i10 = this.f83405f;
        String str6 = this.f83406g;
        String str7 = this.f83407h;
        String str8 = this.f83408i;
        boolean z10 = this.f83409j;
        C10776k kVar = this.f83410k;
        n nVar = this.f83411l;
        boolean z11 = this.f83412m;
        int i11 = this.f83413n;
        boolean z12 = this.f83414o;
        return "Review(id=" + str + ", nickname=" + str2 + ", sourceLanguage=" + str3 + ", sourceCountry=" + str4 + ", appDisplayLanguage=" + str5 + ", rating=" + i10 + ", age=" + str6 + ", title=" + str7 + ", reviewText=" + str8 + ", verifiedPurchase=" + z10 + ", response=" + kVar + ", translation=" + nVar + ", isLocalReview=" + z11 + ", positiveFeedbacksCount=" + i11 + ", hasVotedHelpful=" + z12 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10775j(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, boolean z10, C10776k kVar, n nVar, boolean z11, int i11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, i10, str6, str7, str8, z10, kVar, nVar, z11, i11, (i12 & 16384) != 0 ? false : z12);
    }
}
