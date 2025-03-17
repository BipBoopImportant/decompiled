package qg;

import XH.C16807N;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import com.ingka.ikea.dynamicfields.datalayer.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\b\u0018\u0000 :2\u00020\u0001:\u0001;Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b\"\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\u0017R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0014X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lqg/w;", "Lqg/x;", "", "key", "targetKey", "title", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "inputType", "", "Lqg/y;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "textAsCollapsed", "", "lines", "hint", "Lkotlin/Function1;", "LXH/N;", "onChanged", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/dynamicfields/datalayer/b;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;LnI/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "j", "Ljava/lang/String;", "e", "k", "g", "l", "x", "m", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "w", "()Lcom/ingka/ikea/dynamicfields/datalayer/b;", "n", "Ljava/util/List;", "i", "()Ljava/util/List;", "o", "p", "h", "q", "I", "z", "r", "y", "s", "LnI/l;", "f", "()LnI/l;", "t", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends x {

    /* renamed from: t  reason: collision with root package name */
    public static final a f76220t = new a((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    public static final int f76221u = 8;

    /* renamed from: j  reason: collision with root package name */
    private final String f76222j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76223k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76224l;

    /* renamed from: m  reason: collision with root package name */
    private final b f76225m;

    /* renamed from: n  reason: collision with root package name */
    private final List<y> f76226n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Conditions> f76227o;

    /* renamed from: p  reason: collision with root package name */
    private final String f76228p;

    /* renamed from: q  reason: collision with root package name */
    private final int f76229q;

    /* renamed from: r  reason: collision with root package name */
    private final String f76230r;

    /* renamed from: s  reason: collision with root package name */
    private final C17642l<String, C16807N> f76231s;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lqg/w$a;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lkotlin/Function1;", "", "LXH/N;", "onChanged", "Lqg/w;", "a", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;LnI/l;)Lqg/w;", "LINES", "Ljava/lang/String;", "", "LINES_DEFAULT", "I", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            r0 = HJ.C15854t.t((r0 = r1.c()));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final qg.w a(com.ingka.ikea.dynamicfields.datalayer.FieldAttributes r13, nI.C17642l<? super java.lang.String, XH.C16807N> r14) {
            /*
                r12 = this;
                java.lang.String r0 = "attrs"
                kotlin.jvm.internal.C17542s.j(r13, r0)
                java.util.List r0 = r13.c()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x000f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0029
                java.lang.Object r1 = r0.next()
                r2 = r1
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r2 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r2
                java.lang.String r2 = r2.b()
                java.lang.String r3 = "lines"
                boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
                if (r2 == 0) goto L_0x000f
                goto L_0x002a
            L_0x0029:
                r1 = 0
            L_0x002a:
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r1 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r1
                if (r1 == 0) goto L_0x0040
                java.lang.String r0 = r1.c()
                if (r0 == 0) goto L_0x0040
                java.lang.Integer r0 = HJ.C15854t.t(r0)
                if (r0 == 0) goto L_0x0040
                int r0 = r0.intValue()
            L_0x003e:
                r9 = r0
                goto L_0x0042
            L_0x0040:
                r0 = 4
                goto L_0x003e
            L_0x0042:
                qg.w r0 = new qg.w
                java.lang.String r2 = r13.h()
                java.lang.String r3 = r13.i()
                java.lang.String r4 = r13.l()
                com.ingka.ikea.dynamicfields.datalayer.b r5 = r13.f()
                java.util.List r6 = qg.j.b(r13)
                java.util.List r7 = r13.o()
                java.lang.String r8 = r13.k()
                java.lang.String r10 = r13.j()
                r1 = r0
                r11 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.String r13 = r13.g()
                if (r13 != 0) goto L_0x0071
                java.lang.String r13 = ""
            L_0x0071:
                r0.r(r13)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.w.a.a(com.ingka.ikea.dynamicfields.datalayer.FieldAttributes, nI.l):qg.w");
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(String str, String str2, String str3, b bVar, List<? extends y> list, List<Conditions> list2, String str4, int i10, String str5, C17642l<? super String, C16807N> lVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "title");
        C17542s.j(bVar, "inputType");
        C17542s.j(list, "validation");
        C17542s.j(list2, "visibility");
        C17542s.j(str5, "hint");
        this.f76222j = str;
        this.f76223k = str2;
        this.f76224l = str3;
        this.f76225m = bVar;
        this.f76226n = list;
        this.f76227o = list2;
        this.f76228p = str4;
        this.f76229q = i10;
        this.f76230r = str5;
        this.f76231s = lVar;
    }

    public String e() {
        return this.f76222j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return C17542s.e(this.f76222j, wVar.f76222j) && C17542s.e(this.f76223k, wVar.f76223k) && C17542s.e(this.f76224l, wVar.f76224l) && this.f76225m == wVar.f76225m && C17542s.e(this.f76226n, wVar.f76226n) && C17542s.e(this.f76227o, wVar.f76227o) && C17542s.e(this.f76228p, wVar.f76228p) && this.f76229q == wVar.f76229q && C17542s.e(this.f76230r, wVar.f76230r) && C17542s.e(this.f76231s, wVar.f76231s);
    }

    /* access modifiers changed from: protected */
    public C17642l<String, C16807N> f() {
        return this.f76231s;
    }

    public String g() {
        return this.f76223k;
    }

    public String h() {
        return this.f76228p;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f76222j.hashCode() * 31) + this.f76223k.hashCode()) * 31) + this.f76224l.hashCode()) * 31) + this.f76225m.hashCode()) * 31) + this.f76226n.hashCode()) * 31) + this.f76227o.hashCode()) * 31;
        String str = this.f76228p;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f76229q)) * 31) + this.f76230r.hashCode()) * 31;
        C17642l<String, C16807N> lVar = this.f76231s;
        if (lVar != null) {
            i10 = lVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public List<y> i() {
        return this.f76226n;
    }

    public List<Conditions> k() {
        return this.f76227o;
    }

    public String toString() {
        String str = this.f76222j;
        String str2 = this.f76223k;
        String str3 = this.f76224l;
        b bVar = this.f76225m;
        List<y> list = this.f76226n;
        List<Conditions> list2 = this.f76227o;
        String str4 = this.f76228p;
        int i10 = this.f76229q;
        String str5 = this.f76230r;
        C17642l<String, C16807N> lVar = this.f76231s;
        return "TextBoxViewModel(key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", inputType=" + bVar + ", validation=" + list + ", visibility=" + list2 + ", textAsCollapsed=" + str4 + ", lines=" + i10 + ", hint=" + str5 + ", onChanged=" + lVar + ")";
    }

    public b w() {
        return this.f76225m;
    }

    public String x() {
        return this.f76224l;
    }

    public final String y() {
        return this.f76230r;
    }

    public final int z() {
        return this.f76229q;
    }
}
