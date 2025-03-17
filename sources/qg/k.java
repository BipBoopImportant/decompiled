package qg;

import IC.C13026h;
import XH.C16807N;
import YH.C16877v;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import com.ingka.ikea.dynamicfields.datalayer.KeyValue;
import com.ingka.ikea.dynamicfields.datalayer.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 72\u00020\u0001:\u00018Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b \u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010\u0014R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0014X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00106\u001a\u0002018\u0016X\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lqg/k;", "Lqg/x;", "", "key", "targetKey", "title", "", "Lqg/y;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "textAsCollapsed", "Lcom/ingka/ikea/dynamicfields/datalayer/KeyValue;", "data", "Lkotlin/Function1;", "LXH/N;", "onChanged", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;LnI/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "j", "Ljava/lang/String;", "e", "k", "g", "l", "x", "m", "Ljava/util/List;", "i", "()Ljava/util/List;", "n", "o", "h", "p", "y", "q", "LnI/l;", "f", "()LnI/l;", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "r", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "w", "()Lcom/ingka/ikea/dynamicfields/datalayer/b;", "inputType", "s", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends x {

    /* renamed from: s  reason: collision with root package name */
    public static final a f76125s = new a((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f76126t = 8;

    /* renamed from: j  reason: collision with root package name */
    private final String f76127j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76128k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76129l;

    /* renamed from: m  reason: collision with root package name */
    private final List<y> f76130m;

    /* renamed from: n  reason: collision with root package name */
    private final List<Conditions> f76131n;

    /* renamed from: o  reason: collision with root package name */
    private final String f76132o;

    /* renamed from: p  reason: collision with root package name */
    private final List<KeyValue> f76133p;

    /* renamed from: q  reason: collision with root package name */
    private final C17642l<String, C16807N> f76134q;

    /* renamed from: r  reason: collision with root package name */
    private final b f76135r = b.TEXT;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqg/k$a;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lkotlin/Function1;", "", "LXH/N;", "onChanged", "Lqg/k;", "a", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;LnI/l;)Lqg/k;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(FieldAttributes fieldAttributes, C17642l<? super String, C16807N> lVar) {
            Object obj;
            String str;
            C17542s.j(fieldAttributes, "attrs");
            Iterable<KeyValue> c10 = fieldAttributes.c();
            ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
            for (KeyValue c11 : c10) {
                arrayList.add(c11.c());
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new n(C16877v.y1(arrayList), !fieldAttributes.p(), fieldAttributes.d(), C13026h.c(fieldAttributes.d())));
            arrayList2.addAll(j.b(fieldAttributes));
            Iterator it = fieldAttributes.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((KeyValue) obj).c(), fieldAttributes.g())) {
                    break;
                }
            }
            KeyValue keyValue = (KeyValue) obj;
            if (keyValue == null || (str = keyValue.c()) == null) {
                str = "";
            }
            k kVar = new k(fieldAttributes.h(), fieldAttributes.i(), fieldAttributes.l(), arrayList2, fieldAttributes.o(), fieldAttributes.k(), fieldAttributes.c(), lVar);
            kVar.r(str);
            return kVar;
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(String str, String str2, String str3, List<? extends y> list, List<Conditions> list2, String str4, List<KeyValue> list3, C17642l<? super String, C16807N> lVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "title");
        C17542s.j(list, "validation");
        C17542s.j(list2, "visibility");
        C17542s.j(list3, "data");
        this.f76127j = str;
        this.f76128k = str2;
        this.f76129l = str3;
        this.f76130m = list;
        this.f76131n = list2;
        this.f76132o = str4;
        this.f76133p = list3;
        this.f76134q = lVar;
    }

    public String e() {
        return this.f76127j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return C17542s.e(this.f76127j, kVar.f76127j) && C17542s.e(this.f76128k, kVar.f76128k) && C17542s.e(this.f76129l, kVar.f76129l) && C17542s.e(this.f76130m, kVar.f76130m) && C17542s.e(this.f76131n, kVar.f76131n) && C17542s.e(this.f76132o, kVar.f76132o) && C17542s.e(this.f76133p, kVar.f76133p) && C17542s.e(this.f76134q, kVar.f76134q);
    }

    /* access modifiers changed from: protected */
    public C17642l<String, C16807N> f() {
        return this.f76134q;
    }

    public String g() {
        return this.f76128k;
    }

    public String h() {
        return this.f76132o;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f76127j.hashCode() * 31) + this.f76128k.hashCode()) * 31) + this.f76129l.hashCode()) * 31) + this.f76130m.hashCode()) * 31) + this.f76131n.hashCode()) * 31;
        String str = this.f76132o;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f76133p.hashCode()) * 31;
        C17642l<String, C16807N> lVar = this.f76134q;
        if (lVar != null) {
            i10 = lVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public List<y> i() {
        return this.f76130m;
    }

    public List<Conditions> k() {
        return this.f76131n;
    }

    public String toString() {
        String str = this.f76127j;
        String str2 = this.f76128k;
        String str3 = this.f76129l;
        List<y> list = this.f76130m;
        List<Conditions> list2 = this.f76131n;
        String str4 = this.f76132o;
        List<KeyValue> list3 = this.f76133p;
        C17642l<String, C16807N> lVar = this.f76134q;
        return "GenericPickerFieldViewModel(key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", validation=" + list + ", visibility=" + list2 + ", textAsCollapsed=" + str4 + ", data=" + list3 + ", onChanged=" + lVar + ")";
    }

    public b w() {
        return this.f76135r;
    }

    public String x() {
        return this.f76129l;
    }

    public final List<KeyValue> y() {
        return this.f76133p;
    }
}
