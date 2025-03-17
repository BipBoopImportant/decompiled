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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u0000 32\u00020\u0001:\u00014Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b \u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010\u0014R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0014X\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lqg/l;", "Lqg/x;", "", "key", "targetKey", "title", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "inputType", "", "Lqg/y;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "textAsCollapsed", "Lkotlin/Function1;", "LXH/N;", "onChanged", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/dynamicfields/datalayer/b;Ljava/util/List;Ljava/util/List;Ljava/lang/String;LnI/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "j", "Ljava/lang/String;", "e", "k", "g", "l", "x", "m", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "w", "()Lcom/ingka/ikea/dynamicfields/datalayer/b;", "n", "Ljava/util/List;", "i", "()Ljava/util/List;", "o", "p", "h", "q", "LnI/l;", "f", "()LnI/l;", "r", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends x {

    /* renamed from: r  reason: collision with root package name */
    public static final a f76136r = new a((DefaultConstructorMarker) null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f76137s = 8;

    /* renamed from: j  reason: collision with root package name */
    private final String f76138j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76139k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76140l;

    /* renamed from: m  reason: collision with root package name */
    private final b f76141m;

    /* renamed from: n  reason: collision with root package name */
    private final List<y> f76142n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Conditions> f76143o;

    /* renamed from: p  reason: collision with root package name */
    private final String f76144p;

    /* renamed from: q  reason: collision with root package name */
    private final C17642l<String, C16807N> f76145q;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqg/l$a;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lkotlin/Function1;", "", "LXH/N;", "onChanged", "Lqg/l;", "a", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;LnI/l;)Lqg/l;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(FieldAttributes fieldAttributes, C17642l<? super String, C16807N> lVar) {
            C17542s.j(fieldAttributes, "attrs");
            l lVar2 = new l(fieldAttributes.h(), fieldAttributes.i(), fieldAttributes.l(), fieldAttributes.f(), j.b(fieldAttributes), fieldAttributes.o(), fieldAttributes.k(), lVar);
            String g10 = fieldAttributes.g();
            if (g10 == null) {
                g10 = "";
            }
            lVar2.r(g10);
            return lVar2;
        }

        private a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, String str2, String str3, b bVar, List list, List list2, String str4, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, bVar, list, list2, str4, (i10 & 128) != 0 ? null : lVar);
    }

    public String e() {
        return this.f76138j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C17542s.e(this.f76138j, lVar.f76138j) && C17542s.e(this.f76139k, lVar.f76139k) && C17542s.e(this.f76140l, lVar.f76140l) && this.f76141m == lVar.f76141m && C17542s.e(this.f76142n, lVar.f76142n) && C17542s.e(this.f76143o, lVar.f76143o) && C17542s.e(this.f76144p, lVar.f76144p) && C17542s.e(this.f76145q, lVar.f76145q);
    }

    /* access modifiers changed from: protected */
    public C17642l<String, C16807N> f() {
        return this.f76145q;
    }

    public String g() {
        return this.f76139k;
    }

    public String h() {
        return this.f76144p;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f76138j.hashCode() * 31) + this.f76139k.hashCode()) * 31) + this.f76140l.hashCode()) * 31) + this.f76141m.hashCode()) * 31) + this.f76142n.hashCode()) * 31) + this.f76143o.hashCode()) * 31;
        String str = this.f76144p;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C17642l<String, C16807N> lVar = this.f76145q;
        if (lVar != null) {
            i10 = lVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public List<y> i() {
        return this.f76142n;
    }

    public List<Conditions> k() {
        return this.f76143o;
    }

    public String toString() {
        String str = this.f76138j;
        String str2 = this.f76139k;
        String str3 = this.f76140l;
        b bVar = this.f76141m;
        List<y> list = this.f76142n;
        List<Conditions> list2 = this.f76143o;
        String str4 = this.f76144p;
        C17642l<String, C16807N> lVar = this.f76145q;
        return "GenericTextFieldViewModel(key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", inputType=" + bVar + ", validation=" + list + ", visibility=" + list2 + ", textAsCollapsed=" + str4 + ", onChanged=" + lVar + ")";
    }

    public b w() {
        return this.f76141m;
    }

    public String x() {
        return this.f76140l;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, String str3, b bVar, List<? extends y> list, List<Conditions> list2, String str4, C17642l<? super String, C16807N> lVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "title");
        C17542s.j(bVar, "inputType");
        C17542s.j(list, "validation");
        C17542s.j(list2, "visibility");
        this.f76138j = str;
        this.f76139k = str2;
        this.f76140l = str3;
        this.f76141m = bVar;
        this.f76142n = list;
        this.f76143o = list2;
        this.f76144p = str4;
        this.f76145q = lVar;
    }
}
