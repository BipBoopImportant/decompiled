package qg;

import IC.C13026h;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import YH.C16877v;
import YH.X;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import com.ingka.ikea.dynamicfields.datalayer.KeyValue;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DBk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0007\u0010&R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b \u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010\u0015R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R(\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000207\u0018\u0001068\u0014X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010B\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028V@VX\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lqg/t;", "Lqg/i;", "", "", "key", "targetKey", "text", "isChecked", "", "Lqg/y;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "textAsCollapsed", "", "urlLinks", "Lqg/g;", "dialogLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lqg/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "j", "Ljava/lang/String;", "e", "k", "g", "l", "x", "m", "Z", "()Z", "n", "Ljava/util/List;", "i", "()Ljava/util/List;", "o", "p", "h", "q", "Ljava/util/Map;", "y", "()Ljava/util/Map;", "r", "Lqg/g;", "w", "()Lqg/g;", "Lkotlin/Function1;", "LXH/N;", "s", "LnI/l;", "f", "()LnI/l;", "onChanged", "_", "z", "()Ljava/lang/Boolean;", "setValue", "(Z)V", "value", "t", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends i<Boolean> {

    /* renamed from: t  reason: collision with root package name */
    public static final a f76183t = new a((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    public static final int f76184u = 8;

    /* renamed from: j  reason: collision with root package name */
    private final String f76185j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76186k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76187l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f76188m;

    /* renamed from: n  reason: collision with root package name */
    private final List<y> f76189n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Conditions> f76190o;

    /* renamed from: p  reason: collision with root package name */
    private final String f76191p;

    /* renamed from: q  reason: collision with root package name */
    private final Map<String, String> f76192q;

    /* renamed from: r  reason: collision with root package name */
    private final g f76193r;

    /* renamed from: s  reason: collision with root package name */
    private final C17642l<Boolean, C16807N> f76194s;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqg/t$a;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lqg/t;", "a", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;)Lqg/t;", "", "LINK", "Ljava/lang/String;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(FieldAttributes fieldAttributes) {
            C17542s.j(fieldAttributes, "attrs");
            ArrayList<KeyValue> arrayList = new ArrayList<>();
            for (Object next : fieldAttributes.c()) {
                if (C17542s.e(((KeyValue) next).b(), "link")) {
                    arrayList.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList, 10)), 16));
            for (KeyValue keyValue : arrayList) {
                v a10 = C16796C.a(keyValue.a(), keyValue.c());
                linkedHashMap.put(a10.c(), a10.d());
            }
            g a11 = g.f76111d.a(fieldAttributes.c());
            ArrayList arrayList2 = new ArrayList();
            if (fieldAttributes.p()) {
                arrayList2.add(new C10194d(fieldAttributes.d(), C13026h.c(fieldAttributes.d())));
            }
            arrayList2.addAll(j.b(fieldAttributes));
            String g10 = fieldAttributes.g();
            return new t(fieldAttributes.h(), fieldAttributes.i(), fieldAttributes.j(), (g10 == null || g10.length() == 0) ? !fieldAttributes.p() : Boolean.parseBoolean(g10), arrayList2, fieldAttributes.o(), fieldAttributes.k(), linkedHashMap, a11);
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(String str, String str2, String str3, boolean z10, List<? extends y> list, List<Conditions> list2, String str4, Map<String, String> map, g gVar) {
        super(Boolean.valueOf(z10), (DefaultConstructorMarker) null);
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "text");
        C17542s.j(list, "validation");
        C17542s.j(list2, "visibility");
        C17542s.j(map, "urlLinks");
        this.f76185j = str;
        this.f76186k = str2;
        this.f76187l = str3;
        this.f76188m = z10;
        this.f76189n = list;
        this.f76190o = list2;
        this.f76191p = str4;
        this.f76192q = map;
        this.f76193r = gVar;
    }

    public String e() {
        return this.f76185j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return C17542s.e(this.f76185j, tVar.f76185j) && C17542s.e(this.f76186k, tVar.f76186k) && C17542s.e(this.f76187l, tVar.f76187l) && this.f76188m == tVar.f76188m && C17542s.e(this.f76189n, tVar.f76189n) && C17542s.e(this.f76190o, tVar.f76190o) && C17542s.e(this.f76191p, tVar.f76191p) && C17542s.e(this.f76192q, tVar.f76192q) && C17542s.e(this.f76193r, tVar.f76193r);
    }

    /* access modifiers changed from: protected */
    public C17642l<Boolean, C16807N> f() {
        return this.f76194s;
    }

    public String g() {
        return this.f76186k;
    }

    public String h() {
        return this.f76191p;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f76185j.hashCode() * 31) + this.f76186k.hashCode()) * 31) + this.f76187l.hashCode()) * 31) + Boolean.hashCode(this.f76188m)) * 31) + this.f76189n.hashCode()) * 31) + this.f76190o.hashCode()) * 31;
        String str = this.f76191p;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f76192q.hashCode()) * 31;
        g gVar = this.f76193r;
        if (gVar != null) {
            i10 = gVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public List<y> i() {
        return this.f76189n;
    }

    public List<Conditions> k() {
        return this.f76190o;
    }

    public String toString() {
        String str = this.f76185j;
        String str2 = this.f76186k;
        String str3 = this.f76187l;
        boolean z10 = this.f76188m;
        List<y> list = this.f76189n;
        List<Conditions> list2 = this.f76190o;
        String str4 = this.f76191p;
        Map<String, String> map = this.f76192q;
        g gVar = this.f76193r;
        return "StaticLabelFieldViewModel(key=" + str + ", targetKey=" + str2 + ", text=" + str3 + ", isChecked=" + z10 + ", validation=" + list + ", visibility=" + list2 + ", textAsCollapsed=" + str4 + ", urlLinks=" + map + ", dialogLink=" + gVar + ")";
    }

    public final g w() {
        return this.f76193r;
    }

    public final String x() {
        return this.f76187l;
    }

    public final Map<String, String> y() {
        return this.f76192q;
    }

    /* renamed from: z */
    public Boolean j() {
        return Boolean.valueOf(this.f76188m);
    }
}
