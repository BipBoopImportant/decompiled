package qn;

import D4.C6444s;
import D4.K;
import D4.L;
import D4.P;
import HJ.C15854t;
import QJ.M;
import TJ.C16532g;
import Tp.b;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import on.C11686a;
import pn.C11762b;
import pn.C11763c;
import tI.C17978n;
import un.C12068a;
import un.d;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001.B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017Ju\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010\u00102\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010<R*\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\bB\u0010<\u0012\u0004\bE\u00103\u001a\u0004\bC\u0010\u0017\"\u0004\bD\u00101R2\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u00103\u001a\u0004\bH\u0010IR\u0018\u0010 \u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0018\u0010!\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010<R*\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bQ\u00103\u001a\u0004\bN\u0010O\"\u0004\bP\u0010+R \u0010V\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020&0R8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lqn/k;", "Lpn/b;", "Lpn/c;", "plpRepository", "LTp/b;", "discoverRepository", "LMg/b;", "localHistoryRepository", "LQJ/M;", "dispatcher", "Lon/a;", "plpAnalytics", "Lug/k;", "labsFeatures", "<init>", "(Lpn/c;LTp/b;LMg/b;LQJ/M;Lon/a;Lug/k;)V", "", "filters", "", "", "m", "(Ljava/lang/String;)Ljava/util/Map;", "r", "()Ljava/lang/String;", "type", "id", "", "useIdAsGroupParameter", "fallbackTitle", "sortBy", "", "nbrOfProductsPerRow", "includedItemNos", "prioritiser", "Lun/a;", "availabilityParams", "LTJ/g;", "LD4/M;", "Lun/d;", "d", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lun/a;)LTJ/g;", "LXH/N;", "e", "(Lun/a;)V", "filterId", "filterValueId", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "(Ljava/lang/String;)V", "b", "()V", "Lpn/c;", "LTp/b;", "LMg/b;", "LQJ/M;", "Lon/a;", "f", "Lug/k;", "g", "Ljava/lang/String;", "h", "i", "Z", "j", "title", "k", "getSortBy", "setSortBy", "getSortBy$annotations", "l", "Ljava/util/Map;", "getFilters", "()Ljava/util/Map;", "getFilters$annotations", "n", "o", "Lun/a;", "getAvailabilityParams", "()Lun/a;", "setAvailabilityParams", "getAvailabilityParams$annotations", "LD4/s;", "Lqn/k$a;", "p", "LD4/s;", "invalidatingPagingSourceFactory", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements C11762b {

    /* renamed from: a  reason: collision with root package name */
    private final C11763c f101747a;

    /* renamed from: b  reason: collision with root package name */
    private final b f101748b;

    /* renamed from: c  reason: collision with root package name */
    private final Mg.b f101749c;

    /* renamed from: d  reason: collision with root package name */
    private final M f101750d;

    /* renamed from: e  reason: collision with root package name */
    private final C11686a f101751e;

    /* renamed from: f  reason: collision with root package name */
    private final ug.k f101752f;

    /* renamed from: g  reason: collision with root package name */
    private String f101753g = "";

    /* renamed from: h  reason: collision with root package name */
    private String f101754h = "";

    /* renamed from: i  reason: collision with root package name */
    private boolean f101755i;

    /* renamed from: j  reason: collision with root package name */
    private String f101756j = "";

    /* renamed from: k  reason: collision with root package name */
    private String f101757k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, List<String>> f101758l = new LinkedHashMap();

    /* renamed from: m  reason: collision with root package name */
    private String f101759m;

    /* renamed from: n  reason: collision with root package name */
    private String f101760n;

    /* renamed from: o  reason: collision with root package name */
    private C12068a f101761o;

    /* renamed from: p  reason: collision with root package name */
    private final C6444s<a, d> f101762p = new C6444s<>(new d(this));

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ>\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lqn/k$a;", "", "", "pageToken", "", "start", "end", "totalCount", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "a", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)Lqn/k$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "c", "I", "f", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f101763a;

        /* renamed from: b  reason: collision with root package name */
        private final Integer f101764b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f101765c;

        /* renamed from: d  reason: collision with root package name */
        private final int f101766d;

        public a() {
            this((String) null, (Integer) null, (Integer) null, 0, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ a b(a aVar, String str, Integer num, Integer num2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f101763a;
            }
            if ((i11 & 2) != 0) {
                num = aVar.f101764b;
            }
            if ((i11 & 4) != 0) {
                num2 = aVar.f101765c;
            }
            if ((i11 & 8) != 0) {
                i10 = aVar.f101766d;
            }
            return aVar.a(str, num, num2, i10);
        }

        public final a a(String str, Integer num, Integer num2, int i10) {
            return new a(str, num, num2, i10);
        }

        public final Integer c() {
            return this.f101765c;
        }

        public final String d() {
            return this.f101763a;
        }

        public final Integer e() {
            return this.f101764b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f101763a, aVar.f101763a) && C17542s.e(this.f101764b, aVar.f101764b) && C17542s.e(this.f101765c, aVar.f101765c) && this.f101766d == aVar.f101766d;
        }

        public final int f() {
            return this.f101766d;
        }

        public int hashCode() {
            String str = this.f101763a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f101764b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f101765c;
            if (num2 != null) {
                i10 = num2.hashCode();
            }
            return ((hashCode2 + i10) * 31) + Integer.hashCode(this.f101766d);
        }

        public String toString() {
            String str = this.f101763a;
            Integer num = this.f101764b;
            Integer num2 = this.f101765c;
            int i10 = this.f101766d;
            return "PlpPagingKey(pageToken=" + str + ", start=" + num + ", end=" + num2 + ", totalCount=" + i10 + ")";
        }

        public a(String str, Integer num, Integer num2, int i10) {
            this.f101763a = str;
            this.f101764b = num;
            this.f101765c = num2;
            this.f101766d = i10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, Integer num, Integer num2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? 0 : i10);
        }
    }

    public k(C11763c cVar, b bVar, Mg.b bVar2, M m10, C11686a aVar, ug.k kVar) {
        C17542s.j(cVar, "plpRepository");
        C17542s.j(bVar, "discoverRepository");
        C17542s.j(bVar2, "localHistoryRepository");
        C17542s.j(m10, "dispatcher");
        C17542s.j(aVar, "plpAnalytics");
        C17542s.j(kVar, "labsFeatures");
        this.f101747a = cVar;
        this.f101748b = bVar;
        this.f101749c = bVar2;
        this.f101750d = m10;
        this.f101751e = aVar;
        this.f101752f = kVar;
    }

    private final Map<String, List<String>> m(String str) {
        List Y02;
        if (!(str == null || (Y02 = C15854t.Y0(str, new String[]{"&"}, false, 0, 6, (Object) null)) == null)) {
            Iterable<String> iterable = Y02;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
            for (String Y03 : iterable) {
                List Y04 = C15854t.Y0(Y03, new String[]{"="}, false, 0, 6, (Object) null);
                v a10 = C16796C.a((String) Y04.get(0), C16877v.w1(C15854t.Y0((String) Y04.get(1), new String[]{","}, false, 0, 6, (Object) null)));
                linkedHashMap.put(a10.c(), a10.d());
            }
            Map<String, List<String>> z10 = X.z(linkedHashMap);
            if (z10 != null) {
                return z10;
            }
        }
        return new LinkedHashMap();
    }

    /* access modifiers changed from: private */
    public static final P n(k kVar) {
        k kVar2 = kVar;
        C11763c cVar = kVar2.f101747a;
        b bVar = kVar2.f101748b;
        M m10 = kVar2.f101750d;
        String str = kVar2.f101753g;
        String str2 = kVar2.f101754h;
        boolean z10 = kVar2.f101755i;
        String str3 = kVar2.f101756j;
        Mg.b bVar2 = kVar2.f101749c;
        String str4 = kVar2.f101759m;
        String str5 = kVar2.f101760n;
        C11686a aVar = kVar2.f101751e;
        boolean j10 = kVar2.f101752f.j();
        e eVar = r11;
        e eVar2 = new e(kVar2);
        f fVar = r14;
        f fVar2 = new f(kVar2);
        g gVar = r15;
        g gVar2 = new g(kVar2);
        return new l(cVar, bVar, bVar2, m10, str, str2, z10, str3, eVar, fVar, str4, str5, gVar, 0, aVar, j10, 8192, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final String o(k kVar) {
        return kVar.f101757k;
    }

    /* access modifiers changed from: private */
    public static final String p(k kVar) {
        return kVar.r();
    }

    /* access modifiers changed from: private */
    public static final C12068a q(k kVar) {
        return kVar.f101761o;
    }

    /* access modifiers changed from: private */
    public static final CharSequence s(Map.Entry entry) {
        C17542s.j(entry, "<destruct>");
        String G02 = C16877v.G0((List) entry.getValue(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
        return ((String) entry.getKey()) + "=" + G02;
    }

    /* access modifiers changed from: private */
    public static final boolean t(Map.Entry entry) {
        C17542s.j(entry, "it");
        return ((List) entry.getValue()).isEmpty();
    }

    /* access modifiers changed from: private */
    public static final boolean u(C17642l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    public void a(String str, String str2) {
        C17542s.j(str, "filterId");
        C17542s.j(str2, "filterValueId");
        Map<String, List<String>> map = this.f101758l;
        List<String> list = map.get(str);
        if (list == null) {
            list = new ArrayList<>();
            map.put(str, list);
        }
        List list2 = list;
        if (list2.contains(str2)) {
            list2.remove(str2);
        } else {
            list2.add(str2);
        }
        this.f101758l.entrySet().removeIf(new j(new i()));
        this.f101762p.a();
    }

    public void b() {
        this.f101757k = null;
        this.f101758l.clear();
        this.f101762p.a();
    }

    public void c(String str) {
        C17542s.j(str, "sortBy");
        this.f101757k = str;
        this.f101762p.a();
    }

    public C16532g<D4.M<d>> d(String str, String str2, boolean z10, String str3, String str4, String str5, int i10, String str6, String str7, C12068a aVar) {
        C17542s.j(str, "type");
        C17542s.j(str2, "id");
        C17542s.j(str3, "fallbackTitle");
        this.f101753g = str;
        this.f101754h = str2;
        this.f101755i = z10;
        this.f101756j = str3;
        this.f101757k = str4;
        this.f101758l.putAll(m(str5));
        this.f101759m = str6;
        this.f101760n = str7;
        this.f101761o = aVar;
        return new K(new L(24, 12, false, 24, 0, 0, 48, (DefaultConstructorMarker) null), new a((String) null, (Integer) null, 24, 0, 1, (DefaultConstructorMarker) null), this.f101762p).a();
    }

    public void e(C12068a aVar) {
        C17542s.j(aVar, "availabilityParams");
        this.f101761o = aVar;
        this.f101762p.a();
    }

    public final String r() {
        return C16877v.G0(this.f101758l.entrySet(), "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new h(), 30, (Object) null);
    }
}
