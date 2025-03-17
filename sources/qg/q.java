package qg;

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
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import qg.z;
import tI.C17978n;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u0000 A2\u00020\u0001:\u0003BCDBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0016X\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b'\u0010.R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010\u001cR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0014X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010=\u001a\u0002088\u0016X\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010>\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00028V@VX\u000e¢\u0006\f\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u0015¨\u0006E"}, d2 = {"Lqg/q;", "Lqg/x;", "", "key", "targetKey", "title", "", "Lqg/y;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "Lqg/q$c;", "ruleSets", "textAsCollapsed", "Lkotlin/Function1;", "LXH/N;", "onChanged", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;LnI/l;)V", "input", "A", "(Ljava/lang/String;)V", "", "dryRun", "includeManualInputValidationErrors", "t", "(ZZ)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "j", "Ljava/lang/String;", "e", "k", "g", "l", "x", "m", "Ljava/util/List;", "i", "()Ljava/util/List;", "n", "o", "y", "p", "h", "q", "LnI/l;", "f", "()LnI/l;", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "r", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "w", "()Lcom/ingka/ikea/dynamicfields/datalayer/b;", "inputType", "value", "z", "B", "s", "b", "c", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends x {

    /* renamed from: s  reason: collision with root package name */
    public static final a f76166s = new a((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f76167t = 8;

    /* renamed from: j  reason: collision with root package name */
    private final String f76168j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76169k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76170l;

    /* renamed from: m  reason: collision with root package name */
    private final List<y> f76171m;

    /* renamed from: n  reason: collision with root package name */
    private final List<Conditions> f76172n;

    /* renamed from: o  reason: collision with root package name */
    private final List<c> f76173o;

    /* renamed from: p  reason: collision with root package name */
    private final String f76174p;

    /* renamed from: q  reason: collision with root package name */
    private final C17642l<String, C16807N> f76175q;

    /* renamed from: r  reason: collision with root package name */
    private final com.ingka.ikea.dynamicfields.datalayer.b f76176r = com.ingka.ikea.dynamicfields.datalayer.b.PASSWORD;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqg/q$a;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lkotlin/Function1;", "", "LXH/N;", "onChanged", "Lqg/q;", "a", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;LnI/l;)Lqg/q;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(FieldAttributes fieldAttributes, C17642l<? super String, C16807N> lVar) {
            C17542s.j(fieldAttributes, "attrs");
            Iterable<KeyValue> c10 = fieldAttributes.c();
            ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
            for (KeyValue keyValue : c10) {
                ArrayList<KeyValue> arrayList2 = new ArrayList<>();
                for (Object next : fieldAttributes.n()) {
                    if (C17542s.e(keyValue.b(), ((KeyValue) next).b())) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList2, 10));
                for (KeyValue a10 : arrayList2) {
                    arrayList3.add(new b(a10.a()));
                }
                arrayList.add(new c(keyValue.a(), arrayList3));
            }
            q qVar = new q(fieldAttributes.h(), fieldAttributes.i(), fieldAttributes.l(), j.b(fieldAttributes), fieldAttributes.o(), arrayList, fieldAttributes.k(), lVar);
            String g10 = fieldAttributes.g();
            if (g10 == null) {
                g10 = "";
            }
            qVar.r(g10);
            return qVar;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lqg/q$b;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "(Ljava/lang/Boolean;)V", "isChecked", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f76177a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f76178b;

        public b(String str) {
            C17542s.j(str, "name");
            this.f76177a = str;
        }

        public final String a() {
            return this.f76177a;
        }

        public final Boolean b() {
            return this.f76178b;
        }

        public final void c(Boolean bool) {
            this.f76178b = bool;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f76177a, ((b) obj).f76177a);
        }

        public int hashCode() {
            return this.f76177a.hashCode();
        }

        public String toString() {
            String str = this.f76177a;
            return "Rule(name=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lqg/q$c;", "", "", "category", "", "Lqg/q$b;", "rules", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f76179a;

        /* renamed from: b  reason: collision with root package name */
        private final List<b> f76180b;

        public c(String str, List<b> list) {
            C17542s.j(str, "category");
            C17542s.j(list, "rules");
            this.f76179a = str;
            this.f76180b = list;
        }

        public final String a() {
            return this.f76179a;
        }

        public final List<b> b() {
            return this.f76180b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f76179a, cVar.f76179a) && C17542s.e(this.f76180b, cVar.f76180b);
        }

        public int hashCode() {
            return (this.f76179a.hashCode() * 31) + this.f76180b.hashCode();
        }

        public String toString() {
            String str = this.f76179a;
            List<b> list = this.f76180b;
            return "RuleSet(category=" + str + ", rules=" + list + ")";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, String str3, List<? extends y> list, List<Conditions> list2, List<c> list3, String str4, C17642l<? super String, C16807N> lVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "title");
        C17542s.j(list, "validation");
        C17542s.j(list2, "visibility");
        C17542s.j(list3, "ruleSets");
        this.f76168j = str;
        this.f76169k = str2;
        this.f76170l = str3;
        this.f76171m = list;
        this.f76172n = list2;
        this.f76173o = list3;
        this.f76174p = str4;
        this.f76175q = lVar;
    }

    private final void A(String str) {
        Iterable<y> i10 = i();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(i10, 10)), 16));
        for (y yVar : i10) {
            v a10 = C16796C.a(yVar.getName(), yVar.a(str));
            linkedHashMap.put(a10.c(), a10.d());
        }
        ArrayList<b> arrayList = new ArrayList<>();
        for (c b10 : this.f76173o) {
            C16877v.E(arrayList, b10.b());
        }
        for (b bVar : arrayList) {
            z zVar = (z) linkedHashMap.get(bVar.a());
            bVar.c(zVar == null ? null : C17542s.e(zVar, z.b.f76234a) ? Boolean.TRUE : Boolean.FALSE);
        }
    }

    /* renamed from: B */
    public void r(String str) {
        C17542s.j(str, "value");
        super.r(str);
        A(str);
    }

    public String e() {
        return this.f76168j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return C17542s.e(this.f76168j, qVar.f76168j) && C17542s.e(this.f76169k, qVar.f76169k) && C17542s.e(this.f76170l, qVar.f76170l) && C17542s.e(this.f76171m, qVar.f76171m) && C17542s.e(this.f76172n, qVar.f76172n) && C17542s.e(this.f76173o, qVar.f76173o) && C17542s.e(this.f76174p, qVar.f76174p) && C17542s.e(this.f76175q, qVar.f76175q);
    }

    /* access modifiers changed from: protected */
    public C17642l<String, C16807N> f() {
        return this.f76175q;
    }

    public String g() {
        return this.f76169k;
    }

    public String h() {
        return this.f76174p;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f76168j.hashCode() * 31) + this.f76169k.hashCode()) * 31) + this.f76170l.hashCode()) * 31) + this.f76171m.hashCode()) * 31) + this.f76172n.hashCode()) * 31) + this.f76173o.hashCode()) * 31;
        String str = this.f76174p;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C17642l<String, C16807N> lVar = this.f76175q;
        if (lVar != null) {
            i10 = lVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public List<y> i() {
        return this.f76171m;
    }

    public List<Conditions> k() {
        return this.f76172n;
    }

    public boolean t(boolean z10, boolean z11) {
        A(j());
        return super.t(z10, z11);
    }

    public String toString() {
        String str = this.f76168j;
        String str2 = this.f76169k;
        String str3 = this.f76170l;
        List<y> list = this.f76171m;
        List<Conditions> list2 = this.f76172n;
        List<c> list3 = this.f76173o;
        String str4 = this.f76174p;
        C17642l<String, C16807N> lVar = this.f76175q;
        return "PasswordFieldViewModel(key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", validation=" + list + ", visibility=" + list2 + ", ruleSets=" + list3 + ", textAsCollapsed=" + str4 + ", onChanged=" + lVar + ")";
    }

    public com.ingka.ikea.dynamicfields.datalayer.b w() {
        return this.f76176r;
    }

    public String x() {
        return this.f76170l;
    }

    public final List<c> y() {
        return this.f76173o;
    }

    /* renamed from: z */
    public String j() {
        return (String) super.j();
    }
}
