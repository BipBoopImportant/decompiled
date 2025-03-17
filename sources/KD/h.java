package kD;

import YH.C16877v;
import com.ingka.ikea.useraccount.model.Address;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kD.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\b\b\u0018\u0000 22\u00020\u0001:\u0001\u001bBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b#\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\u001b\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b$\u0010*R\u0017\u0010/\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b+\u0010.R\u0019\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b \u0010\u0014¨\u00063"}, d2 = {"LkD/h;", "", "", "firstName", "lastName", "initials", "email", "mobileNumber", "birthDate", "preferredStore", "", "newsletter", "", "Lcom/ingka/ikea/useraccount/model/Address;", "addresses", "LkD/f;", "loyaltyCards", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "f", "c", "e", "h", "getBirthDate", "g", "i", "Ljava/lang/Boolean;", "getNewsletter", "()Ljava/lang/Boolean;", "Ljava/util/List;", "()Ljava/util/List;", "j", "k", "Z", "()Z", "isFamilyMember", "l", "familyCardNumber", "m", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: m  reason: collision with root package name */
    public static final a f128628m = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private static final h f128629n = new h("", "", "", "", (String) null, (String) null, (String) null, (Boolean) null, C16877v.n(), C16877v.n());

    /* renamed from: a  reason: collision with root package name */
    private final String f128630a;

    /* renamed from: b  reason: collision with root package name */
    private final String f128631b;

    /* renamed from: c  reason: collision with root package name */
    private final String f128632c;

    /* renamed from: d  reason: collision with root package name */
    private final String f128633d;

    /* renamed from: e  reason: collision with root package name */
    private final String f128634e;

    /* renamed from: f  reason: collision with root package name */
    private final String f128635f;

    /* renamed from: g  reason: collision with root package name */
    private final String f128636g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f128637h;

    /* renamed from: i  reason: collision with root package name */
    private final List<Address> f128638i;

    /* renamed from: j  reason: collision with root package name */
    private final List<f> f128639j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f128640k;

    /* renamed from: l  reason: collision with root package name */
    private final String f128641l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkD/h$a;", "", "<init>", "()V", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, List<Address> list, List<f> list2) {
        String str8;
        Object obj;
        C17542s.j(str, "firstName");
        C17542s.j(str2, "lastName");
        C17542s.j(str3, "initials");
        C17542s.j(str4, "email");
        C17542s.j(list, "addresses");
        C17542s.j(list2, "loyaltyCards");
        this.f128630a = str;
        this.f128631b = str2;
        this.f128632c = str3;
        this.f128633d = str4;
        this.f128634e = str5;
        this.f128635f = str6;
        this.f128636g = str7;
        this.f128637h = bool;
        this.f128638i = list;
        this.f128639j = list2;
        Iterable iterable = list2;
        boolean z10 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((f) it.next()).b() == f.a.FAMILY) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f128640k = z10;
        Iterator it2 = this.f128639j.iterator();
        while (true) {
            str8 = null;
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((f) obj).b() == f.a.FAMILY) {
                break;
            }
        }
        f fVar = (f) obj;
        this.f128641l = fVar != null ? fVar.a() : str8;
    }

    public final List<Address> a() {
        return this.f128638i;
    }

    public final String b() {
        return this.f128633d;
    }

    public final String c() {
        return this.f128641l;
    }

    public final String d() {
        return this.f128630a;
    }

    public final String e() {
        return this.f128632c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return C17542s.e(this.f128630a, hVar.f128630a) && C17542s.e(this.f128631b, hVar.f128631b) && C17542s.e(this.f128632c, hVar.f128632c) && C17542s.e(this.f128633d, hVar.f128633d) && C17542s.e(this.f128634e, hVar.f128634e) && C17542s.e(this.f128635f, hVar.f128635f) && C17542s.e(this.f128636g, hVar.f128636g) && C17542s.e(this.f128637h, hVar.f128637h) && C17542s.e(this.f128638i, hVar.f128638i) && C17542s.e(this.f128639j, hVar.f128639j);
    }

    public final String f() {
        return this.f128631b;
    }

    public final List<f> g() {
        return this.f128639j;
    }

    public final String h() {
        return this.f128634e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f128630a.hashCode() * 31) + this.f128631b.hashCode()) * 31) + this.f128632c.hashCode()) * 31) + this.f128633d.hashCode()) * 31;
        String str = this.f128634e;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f128635f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f128636g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f128637h;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return ((((hashCode4 + i10) * 31) + this.f128638i.hashCode()) * 31) + this.f128639j.hashCode();
    }

    public final String i() {
        return this.f128636g;
    }

    public final boolean j() {
        return this.f128640k;
    }

    public String toString() {
        String str = this.f128630a;
        String str2 = this.f128631b;
        String str3 = this.f128632c;
        String str4 = this.f128633d;
        String str5 = this.f128634e;
        String str6 = this.f128635f;
        String str7 = this.f128636g;
        Boolean bool = this.f128637h;
        List<Address> list = this.f128638i;
        List<f> list2 = this.f128639j;
        return "Profile(firstName=" + str + ", lastName=" + str2 + ", initials=" + str3 + ", email=" + str4 + ", mobileNumber=" + str5 + ", birthDate=" + str6 + ", preferredStore=" + str7 + ", newsletter=" + bool + ", addresses=" + list + ", loyaltyCards=" + list2 + ")";
    }
}
