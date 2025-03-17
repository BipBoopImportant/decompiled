package qg;

import XH.C16807N;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import com.ingka.ikea.dynamicfields.datalayer.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 32\u00020\u0001:\u00014BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b\u001d\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u0011R(\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0014X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lqg/c;", "Lqg/x;", "", "key", "targetKey", "title", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "inputType", "", "Lqg/y;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "textAsCollapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/dynamicfields/datalayer/b;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "j", "Ljava/lang/String;", "e", "k", "g", "l", "x", "m", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "w", "()Lcom/ingka/ikea/dynamicfields/datalayer/b;", "n", "Ljava/util/List;", "i", "()Ljava/util/List;", "o", "p", "h", "Lkotlin/Function1;", "LXH/N;", "q", "LnI/l;", "f", "()LnI/l;", "onChanged", "r", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qg.c  reason: case insensitive filesystem */
public final class C10193c extends x {

    /* renamed from: r  reason: collision with root package name */
    public static final a f76085r = new a((DefaultConstructorMarker) null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f76086s = 8;

    /* renamed from: j  reason: collision with root package name */
    private final String f76087j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76088k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76089l;

    /* renamed from: m  reason: collision with root package name */
    private final b f76090m;

    /* renamed from: n  reason: collision with root package name */
    private final List<y> f76091n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Conditions> f76092o;

    /* renamed from: p  reason: collision with root package name */
    private final String f76093p;

    /* renamed from: q  reason: collision with root package name */
    private final C17642l<String, C16807N> f76094q;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqg/c$a;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lqg/c;", "a", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;)Lqg/c;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qg.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C10193c a(FieldAttributes fieldAttributes) {
            C17542s.j(fieldAttributes, "attrs");
            C10193c cVar = new C10193c(fieldAttributes.h(), fieldAttributes.i(), fieldAttributes.l(), fieldAttributes.f(), j.b(fieldAttributes), fieldAttributes.o(), fieldAttributes.k());
            String g10 = fieldAttributes.g();
            if (g10 == null) {
                g10 = "";
            }
            cVar.r(g10);
            return cVar;
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10193c(String str, String str2, String str3, b bVar, List<? extends y> list, List<Conditions> list2, String str4) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "title");
        C17542s.j(bVar, "inputType");
        C17542s.j(list, "validation");
        C17542s.j(list2, "visibility");
        this.f76087j = str;
        this.f76088k = str2;
        this.f76089l = str3;
        this.f76090m = bVar;
        this.f76091n = list;
        this.f76092o = list2;
        this.f76093p = str4;
    }

    public String e() {
        return this.f76087j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10193c)) {
            return false;
        }
        C10193c cVar = (C10193c) obj;
        return C17542s.e(this.f76087j, cVar.f76087j) && C17542s.e(this.f76088k, cVar.f76088k) && C17542s.e(this.f76089l, cVar.f76089l) && this.f76090m == cVar.f76090m && C17542s.e(this.f76091n, cVar.f76091n) && C17542s.e(this.f76092o, cVar.f76092o) && C17542s.e(this.f76093p, cVar.f76093p);
    }

    /* access modifiers changed from: protected */
    public C17642l<String, C16807N> f() {
        return this.f76094q;
    }

    public String g() {
        return this.f76088k;
    }

    public String h() {
        return this.f76093p;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f76087j.hashCode() * 31) + this.f76088k.hashCode()) * 31) + this.f76089l.hashCode()) * 31) + this.f76090m.hashCode()) * 31) + this.f76091n.hashCode()) * 31) + this.f76092o.hashCode()) * 31;
        String str = this.f76093p;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public List<y> i() {
        return this.f76091n;
    }

    public List<Conditions> k() {
        return this.f76092o;
    }

    public String toString() {
        String str = this.f76087j;
        String str2 = this.f76088k;
        String str3 = this.f76089l;
        b bVar = this.f76090m;
        List<y> list = this.f76091n;
        List<Conditions> list2 = this.f76092o;
        String str4 = this.f76093p;
        return "Body2ViewModel(key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", inputType=" + bVar + ", validation=" + list + ", visibility=" + list2 + ", textAsCollapsed=" + str4 + ")";
    }

    public b w() {
        return this.f76090m;
    }

    public String x() {
        return this.f76089l;
    }
}
