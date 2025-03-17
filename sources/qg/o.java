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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 62\u00020\u0001:\u00017BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b\u001e\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u0012R(\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000200\u0018\u00010/8\u0014X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lqg/o;", "Lqg/x;", "", "key", "targetKey", "title", "text", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "inputType", "", "Lqg/y;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "textAsCollapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/dynamicfields/datalayer/b;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "j", "Ljava/lang/String;", "e", "k", "g", "l", "x", "m", "y", "n", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "w", "()Lcom/ingka/ikea/dynamicfields/datalayer/b;", "o", "Ljava/util/List;", "i", "()Ljava/util/List;", "p", "q", "h", "Lkotlin/Function1;", "LXH/N;", "r", "LnI/l;", "f", "()LnI/l;", "onChanged", "s", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends x {

    /* renamed from: s  reason: collision with root package name */
    public static final a f76155s = new a((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f76156t = 8;

    /* renamed from: j  reason: collision with root package name */
    private final String f76157j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76158k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76159l;

    /* renamed from: m  reason: collision with root package name */
    private final String f76160m;

    /* renamed from: n  reason: collision with root package name */
    private final b f76161n;

    /* renamed from: o  reason: collision with root package name */
    private final List<y> f76162o;

    /* renamed from: p  reason: collision with root package name */
    private final List<Conditions> f76163p;

    /* renamed from: q  reason: collision with root package name */
    private final String f76164q;

    /* renamed from: r  reason: collision with root package name */
    private final C17642l<String, C16807N> f76165r;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqg/o$a;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lqg/o;", "a", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;)Lqg/o;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(FieldAttributes fieldAttributes) {
            C17542s.j(fieldAttributes, "attrs");
            o oVar = new o(fieldAttributes.h(), fieldAttributes.i(), fieldAttributes.l(), fieldAttributes.j(), fieldAttributes.f(), j.b(fieldAttributes), fieldAttributes.o(), fieldAttributes.k());
            String g10 = fieldAttributes.g();
            if (g10 == null) {
                g10 = "";
            }
            oVar.r(g10);
            return oVar;
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(String str, String str2, String str3, String str4, b bVar, List<? extends y> list, List<Conditions> list2, String str5) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "title");
        C17542s.j(str4, "text");
        C17542s.j(bVar, "inputType");
        C17542s.j(list, "validation");
        C17542s.j(list2, "visibility");
        this.f76157j = str;
        this.f76158k = str2;
        this.f76159l = str3;
        this.f76160m = str4;
        this.f76161n = bVar;
        this.f76162o = list;
        this.f76163p = list2;
        this.f76164q = str5;
    }

    public String e() {
        return this.f76157j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C17542s.e(this.f76157j, oVar.f76157j) && C17542s.e(this.f76158k, oVar.f76158k) && C17542s.e(this.f76159l, oVar.f76159l) && C17542s.e(this.f76160m, oVar.f76160m) && this.f76161n == oVar.f76161n && C17542s.e(this.f76162o, oVar.f76162o) && C17542s.e(this.f76163p, oVar.f76163p) && C17542s.e(this.f76164q, oVar.f76164q);
    }

    /* access modifiers changed from: protected */
    public C17642l<String, C16807N> f() {
        return this.f76165r;
    }

    public String g() {
        return this.f76158k;
    }

    public String h() {
        return this.f76164q;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f76157j.hashCode() * 31) + this.f76158k.hashCode()) * 31) + this.f76159l.hashCode()) * 31) + this.f76160m.hashCode()) * 31) + this.f76161n.hashCode()) * 31) + this.f76162o.hashCode()) * 31) + this.f76163p.hashCode()) * 31;
        String str = this.f76164q;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public List<y> i() {
        return this.f76162o;
    }

    public List<Conditions> k() {
        return this.f76163p;
    }

    public String toString() {
        String str = this.f76157j;
        String str2 = this.f76158k;
        String str3 = this.f76159l;
        String str4 = this.f76160m;
        b bVar = this.f76161n;
        List<y> list = this.f76162o;
        List<Conditions> list2 = this.f76163p;
        String str5 = this.f76164q;
        return "InformationMessageViewModel(key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", text=" + str4 + ", inputType=" + bVar + ", validation=" + list + ", visibility=" + list2 + ", textAsCollapsed=" + str5 + ")";
    }

    public b w() {
        return this.f76161n;
    }

    public String x() {
        return this.f76159l;
    }

    public final String y() {
        return this.f76160m;
    }
}
