package Is;

import Ps.g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b%\b\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001f\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b3\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\f\n\u0004\b.\u00104\u001a\u0004\b+\u0010\u001bR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0004¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b%\u00106¨\u00067"}, d2 = {"LIs/e;", "", "", "messageId", "title", "body", "createdAt", "updatedAt", "imageUrl", "imageAltText", "", "read", "LPs/g;", "source", "purpose", "featureName", "", "featureVersion", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLPs/g;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLPs/g;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)LIs/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "j", "b", "n", "c", "d", "e", "o", "getUpdatedAt$annotations", "()V", "f", "i", "g", "h", "Z", "l", "()Z", "LPs/g;", "m", "()LPs/g;", "k", "I", "Ljava/util/Map;", "()Ljava/util/Map;", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f82030a;

    /* renamed from: b  reason: collision with root package name */
    private final String f82031b;

    /* renamed from: c  reason: collision with root package name */
    private final String f82032c;

    /* renamed from: d  reason: collision with root package name */
    private final String f82033d;

    /* renamed from: e  reason: collision with root package name */
    private final String f82034e;

    /* renamed from: f  reason: collision with root package name */
    private final String f82035f;

    /* renamed from: g  reason: collision with root package name */
    private final String f82036g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f82037h;

    /* renamed from: i  reason: collision with root package name */
    private final g f82038i;

    /* renamed from: j  reason: collision with root package name */
    private final String f82039j;

    /* renamed from: k  reason: collision with root package name */
    private final String f82040k;

    /* renamed from: l  reason: collision with root package name */
    private final int f82041l;

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, String> f82042m;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, g gVar, String str8, String str9, int i10, Map<String, String> map) {
        C17542s.j(str, "messageId");
        C17542s.j(str2, "title");
        C17542s.j(str3, "body");
        C17542s.j(str4, "createdAt");
        C17542s.j(str5, "updatedAt");
        C17542s.j(str6, "imageUrl");
        C17542s.j(str7, "imageAltText");
        C17542s.j(gVar, "source");
        C17542s.j(str8, "purpose");
        C17542s.j(str9, "featureName");
        C17542s.j(map, "data");
        this.f82030a = str;
        this.f82031b = str2;
        this.f82032c = str3;
        this.f82033d = str4;
        this.f82034e = str5;
        this.f82035f = str6;
        this.f82036g = str7;
        this.f82037h = z10;
        this.f82038i = gVar;
        this.f82039j = str8;
        this.f82040k = str9;
        this.f82041l = i10;
        this.f82042m = map;
    }

    public static /* synthetic */ e b(e eVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, g gVar, String str8, String str9, int i10, Map map, int i11, Object obj) {
        e eVar2 = eVar;
        int i12 = i11;
        return eVar.a((i12 & 1) != 0 ? eVar2.f82030a : str, (i12 & 2) != 0 ? eVar2.f82031b : str2, (i12 & 4) != 0 ? eVar2.f82032c : str3, (i12 & 8) != 0 ? eVar2.f82033d : str4, (i12 & 16) != 0 ? eVar2.f82034e : str5, (i12 & 32) != 0 ? eVar2.f82035f : str6, (i12 & 64) != 0 ? eVar2.f82036g : str7, (i12 & 128) != 0 ? eVar2.f82037h : z10, (i12 & 256) != 0 ? eVar2.f82038i : gVar, (i12 & 512) != 0 ? eVar2.f82039j : str8, (i12 & 1024) != 0 ? eVar2.f82040k : str9, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? eVar2.f82041l : i10, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? eVar2.f82042m : map);
    }

    public final e a(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, g gVar, String str8, String str9, int i10, Map<String, String> map) {
        String str10 = str;
        C17542s.j(str10, "messageId");
        String str11 = str2;
        C17542s.j(str11, "title");
        String str12 = str3;
        C17542s.j(str12, "body");
        String str13 = str4;
        C17542s.j(str13, "createdAt");
        String str14 = str5;
        C17542s.j(str14, "updatedAt");
        String str15 = str6;
        C17542s.j(str15, "imageUrl");
        String str16 = str7;
        C17542s.j(str16, "imageAltText");
        g gVar2 = gVar;
        C17542s.j(gVar2, "source");
        String str17 = str8;
        C17542s.j(str17, "purpose");
        String str18 = str9;
        C17542s.j(str18, "featureName");
        Map<String, String> map2 = map;
        C17542s.j(map2, "data");
        return new e(str10, str11, str12, str13, str14, str15, str16, z10, gVar2, str17, str18, i10, map2);
    }

    public final String c() {
        return this.f82032c;
    }

    public final String d() {
        return this.f82033d;
    }

    public final Map<String, String> e() {
        return this.f82042m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f82030a, eVar.f82030a) && C17542s.e(this.f82031b, eVar.f82031b) && C17542s.e(this.f82032c, eVar.f82032c) && C17542s.e(this.f82033d, eVar.f82033d) && C17542s.e(this.f82034e, eVar.f82034e) && C17542s.e(this.f82035f, eVar.f82035f) && C17542s.e(this.f82036g, eVar.f82036g) && this.f82037h == eVar.f82037h && this.f82038i == eVar.f82038i && C17542s.e(this.f82039j, eVar.f82039j) && C17542s.e(this.f82040k, eVar.f82040k) && this.f82041l == eVar.f82041l && C17542s.e(this.f82042m, eVar.f82042m);
    }

    public final String f() {
        return this.f82040k;
    }

    public final int g() {
        return this.f82041l;
    }

    public final String h() {
        return this.f82036g;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f82030a.hashCode() * 31) + this.f82031b.hashCode()) * 31) + this.f82032c.hashCode()) * 31) + this.f82033d.hashCode()) * 31) + this.f82034e.hashCode()) * 31) + this.f82035f.hashCode()) * 31) + this.f82036g.hashCode()) * 31) + Boolean.hashCode(this.f82037h)) * 31) + this.f82038i.hashCode()) * 31) + this.f82039j.hashCode()) * 31) + this.f82040k.hashCode()) * 31) + Integer.hashCode(this.f82041l)) * 31) + this.f82042m.hashCode();
    }

    public final String i() {
        return this.f82035f;
    }

    public final String j() {
        return this.f82030a;
    }

    public final String k() {
        return this.f82039j;
    }

    public final boolean l() {
        return this.f82037h;
    }

    public final g m() {
        return this.f82038i;
    }

    public final String n() {
        return this.f82031b;
    }

    public final String o() {
        return this.f82034e;
    }

    public String toString() {
        String str = this.f82030a;
        String str2 = this.f82031b;
        String str3 = this.f82032c;
        String str4 = this.f82033d;
        String str5 = this.f82034e;
        String str6 = this.f82035f;
        String str7 = this.f82036g;
        boolean z10 = this.f82037h;
        g gVar = this.f82038i;
        String str8 = this.f82039j;
        String str9 = this.f82040k;
        int i10 = this.f82041l;
        Map<String, String> map = this.f82042m;
        return "InboxNotificationEntity(messageId=" + str + ", title=" + str2 + ", body=" + str3 + ", createdAt=" + str4 + ", updatedAt=" + str5 + ", imageUrl=" + str6 + ", imageAltText=" + str7 + ", read=" + z10 + ", source=" + gVar + ", purpose=" + str8 + ", featureName=" + str9 + ", featureVersion=" + i10 + ", data=" + map + ")";
    }
}
