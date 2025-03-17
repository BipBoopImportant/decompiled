package hv;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.core.model.Image;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b1\n\u0002\u0010\t\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0002\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b:\u0010,R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\bB\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bD\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010*\u001a\u0004\bJ\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010*\u001a\u0004\bL\u0010,R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bM\u00100\u001a\u0004\bN\u00102R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bG\u0010QR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bV\u00106\u001a\u0004\bI\u0010!R\u001a\u0010[\u001a\u00020W8\u0016X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b8\u0010ZR\u0019\u0010]\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\\\u00106\u001a\u0004\b@\u0010!¨\u0006^"}, d2 = {"Lhv/c;", "LxB/a;", "", "business", "businessFeatured", "", "", "categories", "channels", "description", "family", "featured", "id", "Lcom/ingka/ikea/core/model/Image;", "image", "label", "live", "orgId", "scheduledStart", "startedDate", "comingSoon", "startingSoon", "productSkus", "Lhv/a;", "state", "Lhv/d;", "statistics", "title", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lhv/a;Lhv/d;Ljava/lang/String;)V", "g", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lhv/a;Lhv/d;Ljava/lang/String;)Lhv/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getBusiness", "()Ljava/lang/Boolean;", "b", "getBusinessFeatured", "c", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "d", "getChannels", "e", "Ljava/lang/String;", "i", "f", "getFamily", "getFeatured", "h", "getId", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "j", "getLabel", "getLive", "l", "getOrgId", "m", "getScheduledStart", "n", "getStartedDate", "o", "getComingSoon", "p", "getStartingSoon", "q", "getProductSkus", "r", "Lhv/a;", "()Lhv/a;", "s", "Lhv/d;", "getStatistics", "()Lhv/d;", "t", "", "u", "J", "()J", "stableId", "v", "formattedScheduledDate", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hv.c  reason: case insensitive filesystem */
public final class C11387c implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f98262a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f98263b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f98264c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f98265d;

    /* renamed from: e  reason: collision with root package name */
    private final String f98266e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f98267f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f98268g;

    /* renamed from: h  reason: collision with root package name */
    private final String f98269h;

    /* renamed from: i  reason: collision with root package name */
    private final Image f98270i;

    /* renamed from: j  reason: collision with root package name */
    private final String f98271j;

    /* renamed from: k  reason: collision with root package name */
    private final Boolean f98272k;

    /* renamed from: l  reason: collision with root package name */
    private final String f98273l;

    /* renamed from: m  reason: collision with root package name */
    private final String f98274m;

    /* renamed from: n  reason: collision with root package name */
    private final String f98275n;

    /* renamed from: o  reason: collision with root package name */
    private final Boolean f98276o;

    /* renamed from: p  reason: collision with root package name */
    private final Boolean f98277p;

    /* renamed from: q  reason: collision with root package name */
    private final List<String> f98278q;

    /* renamed from: r  reason: collision with root package name */
    private final C11385a f98279r;

    /* renamed from: s  reason: collision with root package name */
    private final d f98280s;

    /* renamed from: t  reason: collision with root package name */
    private final String f98281t;

    /* renamed from: u  reason: collision with root package name */
    private final long f98282u;

    /* renamed from: v  reason: collision with root package name */
    private final String f98283v;

    public C11387c(Boolean bool, Boolean bool2, List<String> list, List<String> list2, String str, Boolean bool3, Boolean bool4, String str2, Image image, String str3, Boolean bool5, String str4, String str5, String str6, Boolean bool6, Boolean bool7, List<String> list3, C11385a aVar, d dVar, String str7) {
        String str8 = str2;
        Image image2 = image;
        String str9 = str3;
        String str10 = str5;
        C11385a aVar2 = aVar;
        String str11 = str7;
        C17542s.j(str8, "id");
        C17542s.j(image2, "image");
        C17542s.j(str9, "label");
        C17542s.j(aVar2, "state");
        C17542s.j(str11, "title");
        this.f98262a = bool;
        this.f98263b = bool2;
        this.f98264c = list;
        this.f98265d = list2;
        this.f98266e = str;
        this.f98267f = bool3;
        this.f98268g = bool4;
        this.f98269h = str8;
        this.f98270i = image2;
        this.f98271j = str9;
        this.f98272k = bool5;
        this.f98273l = str4;
        this.f98274m = str10;
        this.f98275n = str6;
        this.f98276o = bool6;
        this.f98277p = bool7;
        this.f98278q = list3;
        this.f98279r = aVar2;
        this.f98280s = dVar;
        this.f98281t = str11;
        U u10 = new U(3);
        u10.a(P.b(C11387c.class));
        u10.a(str8);
        u10.b(new Object[0]);
        this.f98282u = (long) Objects.hash(u10.d(new Object[u10.c()]));
        this.f98283v = str10;
    }

    public static /* synthetic */ C11387c h(C11387c cVar, Boolean bool, Boolean bool2, List list, List list2, String str, Boolean bool3, Boolean bool4, String str2, Image image, String str3, Boolean bool5, String str4, String str5, String str6, Boolean bool6, Boolean bool7, List list3, C11385a aVar, d dVar, String str7, int i10, Object obj) {
        C11387c cVar2 = cVar;
        int i11 = i10;
        return cVar.g((i11 & 1) != 0 ? cVar2.f98262a : bool, (i11 & 2) != 0 ? cVar2.f98263b : bool2, (i11 & 4) != 0 ? cVar2.f98264c : list, (i11 & 8) != 0 ? cVar2.f98265d : list2, (i11 & 16) != 0 ? cVar2.f98266e : str, (i11 & 32) != 0 ? cVar2.f98267f : bool3, (i11 & 64) != 0 ? cVar2.f98268g : bool4, (i11 & 128) != 0 ? cVar2.f98269h : str2, (i11 & 256) != 0 ? cVar2.f98270i : image, (i11 & 512) != 0 ? cVar2.f98271j : str3, (i11 & 1024) != 0 ? cVar2.f98272k : bool5, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? cVar2.f98273l : str4, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? cVar2.f98274m : str5, (i11 & 8192) != 0 ? cVar2.f98275n : str6, (i11 & 16384) != 0 ? cVar2.f98276o : bool6, (i11 & 32768) != 0 ? cVar2.f98277p : bool7, (i11 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? cVar2.f98278q : list3, (i11 & 131072) != 0 ? cVar2.f98279r : aVar, (i11 & 262144) != 0 ? cVar2.f98280s : dVar, (i11 & ImageMetadata.LENS_APERTURE) != 0 ? cVar2.f98281t : str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11387c)) {
            return false;
        }
        C11387c cVar = (C11387c) obj;
        return C17542s.e(this.f98262a, cVar.f98262a) && C17542s.e(this.f98263b, cVar.f98263b) && C17542s.e(this.f98264c, cVar.f98264c) && C17542s.e(this.f98265d, cVar.f98265d) && C17542s.e(this.f98266e, cVar.f98266e) && C17542s.e(this.f98267f, cVar.f98267f) && C17542s.e(this.f98268g, cVar.f98268g) && C17542s.e(this.f98269h, cVar.f98269h) && C17542s.e(this.f98270i, cVar.f98270i) && C17542s.e(this.f98271j, cVar.f98271j) && C17542s.e(this.f98272k, cVar.f98272k) && C17542s.e(this.f98273l, cVar.f98273l) && C17542s.e(this.f98274m, cVar.f98274m) && C17542s.e(this.f98275n, cVar.f98275n) && C17542s.e(this.f98276o, cVar.f98276o) && C17542s.e(this.f98277p, cVar.f98277p) && C17542s.e(this.f98278q, cVar.f98278q) && this.f98279r == cVar.f98279r && C17542s.e(this.f98280s, cVar.f98280s) && C17542s.e(this.f98281t, cVar.f98281t);
    }

    public long f() {
        return this.f98282u;
    }

    public final C11387c g(Boolean bool, Boolean bool2, List<String> list, List<String> list2, String str, Boolean bool3, Boolean bool4, String str2, Image image, String str3, Boolean bool5, String str4, String str5, String str6, Boolean bool6, Boolean bool7, List<String> list3, C11385a aVar, d dVar, String str7) {
        Boolean bool8 = bool;
        C17542s.j(str2, "id");
        C17542s.j(image, "image");
        C17542s.j(str3, "label");
        C17542s.j(aVar, "state");
        C17542s.j(str7, "title");
        return new C11387c(bool, bool2, list, list2, str, bool3, bool4, str2, image, str3, bool5, str4, str5, str6, bool6, bool7, list3, aVar, dVar, str7);
    }

    public final String getId() {
        return this.f98269h;
    }

    public int hashCode() {
        Boolean bool = this.f98262a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f98263b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.f98264c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f98265d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f98266e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.f98267f;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f98268g;
        int hashCode7 = (((((((hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31) + this.f98269h.hashCode()) * 31) + this.f98270i.hashCode()) * 31) + this.f98271j.hashCode()) * 31;
        Boolean bool5 = this.f98272k;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.f98273l;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f98274m;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f98275n;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool6 = this.f98276o;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f98277p;
        int hashCode13 = (hashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        List<String> list3 = this.f98278q;
        int hashCode14 = (((hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.f98279r.hashCode()) * 31;
        d dVar = this.f98280s;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return ((hashCode14 + i10) * 31) + this.f98281t.hashCode();
    }

    public final String i() {
        return this.f98266e;
    }

    public final String j() {
        return this.f98283v;
    }

    public final Image k() {
        return this.f98270i;
    }

    public final C11385a n() {
        return this.f98279r;
    }

    public final String o() {
        return this.f98281t;
    }

    public String toString() {
        Boolean bool = this.f98262a;
        Boolean bool2 = this.f98263b;
        List<String> list = this.f98264c;
        List<String> list2 = this.f98265d;
        String str = this.f98266e;
        Boolean bool3 = this.f98267f;
        Boolean bool4 = this.f98268g;
        String str2 = this.f98269h;
        Image image = this.f98270i;
        String str3 = this.f98271j;
        Boolean bool5 = this.f98272k;
        String str4 = this.f98273l;
        String str5 = this.f98274m;
        String str6 = this.f98275n;
        Boolean bool6 = this.f98276o;
        Boolean bool7 = this.f98277p;
        List<String> list3 = this.f98278q;
        C11385a aVar = this.f98279r;
        d dVar = this.f98280s;
        String str7 = this.f98281t;
        return "Show(business=" + bool + ", businessFeatured=" + bool2 + ", categories=" + list + ", channels=" + list2 + ", description=" + str + ", family=" + bool3 + ", featured=" + bool4 + ", id=" + str2 + ", image=" + image + ", label=" + str3 + ", live=" + bool5 + ", orgId=" + str4 + ", scheduledStart=" + str5 + ", startedDate=" + str6 + ", comingSoon=" + bool6 + ", startingSoon=" + bool7 + ", productSkus=" + list3 + ", state=" + aVar + ", statistics=" + dVar + ", title=" + str7 + ")";
    }
}
