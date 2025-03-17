package qg;

import XH.C16807N;
import am.h;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import com.ingka.ikea.dynamicfields.datalayer.b;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 @2\u00020\u0001:\u0001ABm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b \u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010\u0015R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0014X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\u0002048\u0016X\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lqg/e;", "Lqg/x;", "", "key", "targetKey", "title", "", "Lqg/y;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "textAsCollapsed", "", "minAge", "dateFormat", "Lkotlin/Function1;", "LXH/N;", "onChanged", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;LnI/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "j", "Ljava/lang/String;", "e", "k", "g", "l", "x", "m", "Ljava/util/List;", "i", "()Ljava/util/List;", "n", "o", "h", "p", "I", "A", "q", "y", "r", "LnI/l;", "f", "()LnI/l;", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "s", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "w", "()Lcom/ingka/ikea/dynamicfields/datalayer/b;", "inputType", "Ljava/text/SimpleDateFormat;", "t", "Ljava/text/SimpleDateFormat;", "z", "()Ljava/text/SimpleDateFormat;", "dateFormatter", "u", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qg.e  reason: case insensitive filesystem */
public final class C10195e extends x {

    /* renamed from: u  reason: collision with root package name */
    public static final a f76095u = new a((DefaultConstructorMarker) null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f76096v = 8;

    /* renamed from: j  reason: collision with root package name */
    private final String f76097j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76098k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76099l;

    /* renamed from: m  reason: collision with root package name */
    private final List<y> f76100m;

    /* renamed from: n  reason: collision with root package name */
    private final List<Conditions> f76101n;

    /* renamed from: o  reason: collision with root package name */
    private final String f76102o;

    /* renamed from: p  reason: collision with root package name */
    private final int f76103p;

    /* renamed from: q  reason: collision with root package name */
    private final String f76104q;

    /* renamed from: r  reason: collision with root package name */
    private final C17642l<String, C16807N> f76105r;

    /* renamed from: s  reason: collision with root package name */
    private final b f76106s = b.DATE;

    /* renamed from: t  reason: collision with root package name */
    private final SimpleDateFormat f76107t;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqg/e$a;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lam/h;", "timeProvider", "Lkotlin/Function1;", "", "LXH/N;", "onChanged", "Lqg/e;", "a", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;Lam/h;LnI/l;)Lqg/e;", "MIN_AGE", "Ljava/lang/String;", "DATE_FORMAT", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qg.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C10195e b(a aVar, FieldAttributes fieldAttributes, h hVar, C17642l lVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                hVar = h.f90337a;
            }
            if ((i10 & 4) != 0) {
                lVar = null;
            }
            return aVar.a(fieldAttributes, hVar, lVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.ingka.ikea.dynamicfields.datalayer.KeyValue} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.ingka.ikea.dynamicfields.datalayer.KeyValue} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.ingka.ikea.dynamicfields.datalayer.KeyValue} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.ingka.ikea.dynamicfields.datalayer.KeyValue} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final qg.C10195e a(com.ingka.ikea.dynamicfields.datalayer.FieldAttributes r15, am.h r16, nI.C17642l<? super java.lang.String, XH.C16807N> r17) {
            /*
                r14 = this;
                java.lang.String r0 = "attrs"
                r1 = r15
                kotlin.jvm.internal.C17542s.j(r15, r0)
                java.lang.String r0 = "timeProvider"
                r8 = r16
                kotlin.jvm.internal.C17542s.j(r8, r0)
                java.util.List r0 = r15.c()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0017:
                boolean r2 = r0.hasNext()
                r3 = 0
                if (r2 == 0) goto L_0x0032
                java.lang.Object r2 = r0.next()
                r4 = r2
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r4 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r4
                java.lang.String r4 = r4.b()
                java.lang.String r5 = "dateFormat"
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                if (r4 == 0) goto L_0x0017
                goto L_0x0033
            L_0x0032:
                r2 = r3
            L_0x0033:
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r2 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r2
                if (r2 == 0) goto L_0x00d3
                java.lang.String r12 = r2.c()
                if (r12 == 0) goto L_0x00d3
                java.util.List r0 = r15.c()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0047:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0061
                java.lang.Object r2 = r0.next()
                r4 = r2
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r4 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r4
                java.lang.String r4 = r4.b()
                java.lang.String r5 = "minAge"
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                if (r4 == 0) goto L_0x0047
                r3 = r2
            L_0x0061:
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r3 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r3
                if (r3 == 0) goto L_0x00cb
                java.lang.String r0 = r3.c()
                if (r0 == 0) goto L_0x00cb
                java.lang.Integer r0 = HJ.C15854t.t(r0)
                if (r0 == 0) goto L_0x00cb
                int r11 = r0.intValue()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r2 = qg.j.b(r15)
                java.util.Collection r2 = (java.util.Collection) r2
                r0.addAll(r2)
                qg.f r9 = new qg.f
                boolean r2 = r15.p()
                r5 = r2 ^ 1
                java.lang.String r6 = r15.d()
                java.lang.String r2 = r15.d()
                IC.e r7 = IC.C13026h.c(r2)
                r2 = r9
                r3 = r11
                r4 = r12
                r8 = r16
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r0.add(r9)
                qg.e r2 = new qg.e
                java.lang.String r5 = r15.h()
                java.lang.String r6 = r15.i()
                java.lang.String r7 = r15.l()
                java.util.List r9 = r15.o()
                java.lang.String r10 = r15.k()
                r4 = r2
                r8 = r0
                r13 = r17
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.String r0 = r15.g()
                if (r0 != 0) goto L_0x00c7
                java.lang.String r0 = ""
            L_0x00c7:
                r2.r(r0)
                return r2
            L_0x00cb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Missing minAge"
                r0.<init>(r1)
                throw r0
            L_0x00d3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Missing pattern"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.C10195e.a.a(com.ingka.ikea.dynamicfields.datalayer.FieldAttributes, am.h, nI.l):qg.e");
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10195e(String str, String str2, String str3, List<? extends y> list, List<Conditions> list2, String str4, int i10, String str5, C17642l<? super String, C16807N> lVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "title");
        C17542s.j(list, "validation");
        C17542s.j(list2, "visibility");
        C17542s.j(str5, "dateFormat");
        this.f76097j = str;
        this.f76098k = str2;
        this.f76099l = str3;
        this.f76100m = list;
        this.f76101n = list2;
        this.f76102o = str4;
        this.f76103p = i10;
        this.f76104q = str5;
        this.f76105r = lVar;
        this.f76107t = new SimpleDateFormat(str5, Locale.US);
    }

    public final int A() {
        return this.f76103p;
    }

    public String e() {
        return this.f76097j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10195e)) {
            return false;
        }
        C10195e eVar = (C10195e) obj;
        return C17542s.e(this.f76097j, eVar.f76097j) && C17542s.e(this.f76098k, eVar.f76098k) && C17542s.e(this.f76099l, eVar.f76099l) && C17542s.e(this.f76100m, eVar.f76100m) && C17542s.e(this.f76101n, eVar.f76101n) && C17542s.e(this.f76102o, eVar.f76102o) && this.f76103p == eVar.f76103p && C17542s.e(this.f76104q, eVar.f76104q) && C17542s.e(this.f76105r, eVar.f76105r);
    }

    /* access modifiers changed from: protected */
    public C17642l<String, C16807N> f() {
        return this.f76105r;
    }

    public String g() {
        return this.f76098k;
    }

    public String h() {
        return this.f76102o;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f76097j.hashCode() * 31) + this.f76098k.hashCode()) * 31) + this.f76099l.hashCode()) * 31) + this.f76100m.hashCode()) * 31) + this.f76101n.hashCode()) * 31;
        String str = this.f76102o;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f76103p)) * 31) + this.f76104q.hashCode()) * 31;
        C17642l<String, C16807N> lVar = this.f76105r;
        if (lVar != null) {
            i10 = lVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public List<y> i() {
        return this.f76100m;
    }

    public List<Conditions> k() {
        return this.f76101n;
    }

    public String toString() {
        String str = this.f76097j;
        String str2 = this.f76098k;
        String str3 = this.f76099l;
        List<y> list = this.f76100m;
        List<Conditions> list2 = this.f76101n;
        String str4 = this.f76102o;
        int i10 = this.f76103p;
        String str5 = this.f76104q;
        C17642l<String, C16807N> lVar = this.f76105r;
        return "DatePickerFieldViewModel(key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", validation=" + list + ", visibility=" + list2 + ", textAsCollapsed=" + str4 + ", minAge=" + i10 + ", dateFormat=" + str5 + ", onChanged=" + lVar + ")";
    }

    public b w() {
        return this.f76106s;
    }

    public String x() {
        return this.f76099l;
    }

    public final String y() {
        return this.f76104q;
    }

    public final SimpleDateFormat z() {
        return this.f76107t;
    }
}
