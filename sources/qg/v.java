package qg;

import IC.C13026h;
import XH.C16796C;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import com.ingka.ikea.dynamicfields.datalayer.KeyValue;
import com.ingka.ikea.dynamicfields.datalayer.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b)\b\b\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\n\u00102R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b'\u00106R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u001bR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00118\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0014X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lqg/v;", "Lqg/i;", "", "Lcom/ingka/ikea/dynamicfields/datalayer/c;", "uiType", "", "key", "targetKey", "title", "text", "isChecked", "", "Lqg/y;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "textAsCollapsed", "", "urlLinks", "Lqg/g;", "dialogLink", "Lkotlin/Function1;", "LXH/N;", "onChanged", "<init>", "(Lcom/ingka/ikea/dynamicfields/datalayer/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lqg/g;LnI/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "j", "Lcom/ingka/ikea/dynamicfields/datalayer/c;", "z", "()Lcom/ingka/ikea/dynamicfields/datalayer/c;", "k", "Ljava/lang/String;", "e", "l", "g", "m", "y", "n", "x", "o", "Z", "()Z", "p", "Ljava/util/List;", "i", "()Ljava/util/List;", "q", "r", "h", "s", "Ljava/util/Map;", "A", "()Ljava/util/Map;", "t", "Lqg/g;", "w", "()Lqg/g;", "u", "LnI/l;", "f", "()LnI/l;", "v", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends i<Boolean> {

    /* renamed from: v  reason: collision with root package name */
    public static final a f76206v = new a((DefaultConstructorMarker) null);

    /* renamed from: w  reason: collision with root package name */
    public static final int f76207w = 8;

    /* renamed from: j  reason: collision with root package name */
    private final c f76208j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76209k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76210l;

    /* renamed from: m  reason: collision with root package name */
    private final String f76211m;

    /* renamed from: n  reason: collision with root package name */
    private final String f76212n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f76213o;

    /* renamed from: p  reason: collision with root package name */
    private final List<y> f76214p;

    /* renamed from: q  reason: collision with root package name */
    private final List<Conditions> f76215q;

    /* renamed from: r  reason: collision with root package name */
    private final String f76216r;

    /* renamed from: s  reason: collision with root package name */
    private final Map<String, String> f76217s;

    /* renamed from: t  reason: collision with root package name */
    private final g f76218t;

    /* renamed from: u  reason: collision with root package name */
    private final C17642l<Boolean, C16807N> f76219u;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqg/v$a;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lkotlin/Function1;", "", "LXH/N;", "onChanged", "Lqg/v;", "a", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;LnI/l;)Lqg/v;", "", "LINK", "Ljava/lang/String;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(FieldAttributes fieldAttributes, C17642l<? super Boolean, C16807N> lVar) {
            C17542s.j(fieldAttributes, "attrs");
            ArrayList<KeyValue> arrayList = new ArrayList<>();
            for (Object next : fieldAttributes.c()) {
                if (C17542s.e(((KeyValue) next).b(), "link")) {
                    arrayList.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList, 10)), 16));
            for (KeyValue keyValue : arrayList) {
                XH.v a10 = C16796C.a(keyValue.a(), keyValue.c());
                linkedHashMap.put(a10.c(), a10.d());
            }
            g a11 = g.f76111d.a(fieldAttributes.c());
            ArrayList arrayList2 = new ArrayList();
            if (fieldAttributes.p()) {
                arrayList2.add(new C10194d(fieldAttributes.d(), C13026h.c(fieldAttributes.d())));
            }
            arrayList2.addAll(j.b(fieldAttributes));
            String g10 = fieldAttributes.g();
            boolean parseBoolean = (g10 == null || g10.length() == 0) ? false : Boolean.parseBoolean(g10);
            v vVar = new v(fieldAttributes.m(), fieldAttributes.h(), fieldAttributes.i(), fieldAttributes.l(), fieldAttributes.j(), parseBoolean, arrayList2, fieldAttributes.o(), fieldAttributes.k(), linkedHashMap, a11, lVar);
            vVar.r(Boolean.valueOf(parseBoolean));
            return vVar;
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(c cVar, String str, String str2, String str3, String str4, boolean z10, List<? extends y> list, List<Conditions> list2, String str5, Map<String, String> map, g gVar, C17642l<? super Boolean, C16807N> lVar) {
        super(Boolean.valueOf(z10), (DefaultConstructorMarker) null);
        C17542s.j(cVar, "uiType");
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "title");
        C17542s.j(str4, "text");
        C17542s.j(list, "validation");
        C17542s.j(list2, "visibility");
        C17542s.j(map, "urlLinks");
        this.f76208j = cVar;
        this.f76209k = str;
        this.f76210l = str2;
        this.f76211m = str3;
        this.f76212n = str4;
        this.f76213o = z10;
        this.f76214p = list;
        this.f76215q = list2;
        this.f76216r = str5;
        this.f76217s = map;
        this.f76218t = gVar;
        this.f76219u = lVar;
    }

    public final Map<String, String> A() {
        return this.f76217s;
    }

    public String e() {
        return this.f76209k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f76208j == vVar.f76208j && C17542s.e(this.f76209k, vVar.f76209k) && C17542s.e(this.f76210l, vVar.f76210l) && C17542s.e(this.f76211m, vVar.f76211m) && C17542s.e(this.f76212n, vVar.f76212n) && this.f76213o == vVar.f76213o && C17542s.e(this.f76214p, vVar.f76214p) && C17542s.e(this.f76215q, vVar.f76215q) && C17542s.e(this.f76216r, vVar.f76216r) && C17542s.e(this.f76217s, vVar.f76217s) && C17542s.e(this.f76218t, vVar.f76218t) && C17542s.e(this.f76219u, vVar.f76219u);
    }

    /* access modifiers changed from: protected */
    public C17642l<Boolean, C16807N> f() {
        return this.f76219u;
    }

    public String g() {
        return this.f76210l;
    }

    public String h() {
        return this.f76216r;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f76208j.hashCode() * 31) + this.f76209k.hashCode()) * 31) + this.f76210l.hashCode()) * 31) + this.f76211m.hashCode()) * 31) + this.f76212n.hashCode()) * 31) + Boolean.hashCode(this.f76213o)) * 31) + this.f76214p.hashCode()) * 31) + this.f76215q.hashCode()) * 31;
        String str = this.f76216r;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f76217s.hashCode()) * 31;
        g gVar = this.f76218t;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        C17642l<Boolean, C16807N> lVar = this.f76219u;
        if (lVar != null) {
            i10 = lVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public List<y> i() {
        return this.f76214p;
    }

    public List<Conditions> k() {
        return this.f76215q;
    }

    public String toString() {
        c cVar = this.f76208j;
        String str = this.f76209k;
        String str2 = this.f76210l;
        String str3 = this.f76211m;
        String str4 = this.f76212n;
        boolean z10 = this.f76213o;
        List<y> list = this.f76214p;
        List<Conditions> list2 = this.f76215q;
        String str5 = this.f76216r;
        Map<String, String> map = this.f76217s;
        g gVar = this.f76218t;
        C17642l<Boolean, C16807N> lVar = this.f76219u;
        return "SwitchFieldViewModel(uiType=" + cVar + ", key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", text=" + str4 + ", isChecked=" + z10 + ", validation=" + list + ", visibility=" + list2 + ", textAsCollapsed=" + str5 + ", urlLinks=" + map + ", dialogLink=" + gVar + ", onChanged=" + lVar + ")";
    }

    public final g w() {
        return this.f76218t;
    }

    public final String x() {
        return this.f76212n;
    }

    public final String y() {
        return this.f76211m;
    }

    public final c z() {
        return this.f76208j;
    }
}
