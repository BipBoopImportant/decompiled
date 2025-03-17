package N6;

import HJ.C15854t;
import M6.B;
import M6.f;
import M6.k;
import M6.w;
import N6.g;
import Q6.c;
import Q6.g;
import Q6.i;
import WK.C16770e;
import WK.C16771f;
import WK.C16773h;
import XH.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"LN6/b;", "LN6/h;", "", "serverUrl", "<init>", "(Ljava/lang/String;)V", "LM6/w$a;", "D", "LM6/f;", "apolloRequest", "LN6/g;", "a", "(LM6/f;)LN6/g;", "Ljava/lang/String;", "b", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39125b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f39126a;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JU\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0014\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JK\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\u001f\u001a\u00020\u001e\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J3\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b*\u0010&¨\u0006+"}, d2 = {"LN6/b$a;", "", "<init>", "()V", "LM6/w$a;", "D", "", "serverUrl", "LM6/w;", "operation", "LM6/k;", "customScalarAdapters", "", "sendApqExtensions", "sendDocument", "d", "(Ljava/lang/String;LM6/w;LM6/k;ZZ)Ljava/lang/String;", "LQ6/g;", "writer", "query", "", "LM6/B;", "h", "(LQ6/g;LM6/w;LM6/k;ZLjava/lang/String;)Ljava/util/Map;", "autoPersistQueries", "f", "(LM6/w;LM6/k;ZZ)Ljava/util/Map;", "parameters", "c", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "LN6/c;", "e", "(LM6/w;LM6/k;ZLjava/lang/String;)LN6/c;", "LM6/f;", "apolloRequest", "g", "(LM6/f;)Ljava/util/Map;", "HEADER_ACCEPT_NAME", "Ljava/lang/String;", "HEADER_ACCEPT_VALUE_DEFER", "HEADER_ACCEPT_VALUE_MULTIPART", "HEADER_APOLLO_OPERATION_ID", "HEADER_APOLLO_OPERATION_NAME", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"N6/b$a$a", "LN6/c;", "LWK/f;", "bufferedSink", "LXH/N;", "a", "(LWK/f;)V", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "contentType", "", "J", "c", "()J", "contentLength", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: N6.b$a$a  reason: collision with other inner class name */
        public static final class C0615a implements c {

            /* renamed from: a  reason: collision with root package name */
            private final String f39127a = "application/json";

            /* renamed from: b  reason: collision with root package name */
            private final long f39128b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16773h f39129c;

            C0615a(C16773h hVar) {
                this.f39129c = hVar;
                this.f39128b = (long) hVar.W();
            }

            public void a(C16771f fVar) {
                C17542s.j(fVar, "bufferedSink");
                fVar.j2(this.f39129c);
            }

            public String b() {
                return this.f39127a;
            }

            public long c() {
                return this.f39128b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final <D extends w.a> String d(String str, w<D> wVar, k kVar, boolean z10, boolean z11) {
            return c(str, f(wVar, kVar, z10, z11));
        }

        private final <D extends w.a> Map<String, String> f(w<D> wVar, k kVar, boolean z10, boolean z11) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", wVar.name());
            C16770e eVar = new C16770e();
            R6.a aVar = new R6.a(new c(eVar, (String) null));
            aVar.C();
            wVar.a(aVar, kVar);
            aVar.K();
            if (aVar.e().isEmpty()) {
                linkedHashMap.put("variables", eVar.l0());
                if (z11) {
                    linkedHashMap.put("query", wVar.d());
                }
                if (z10) {
                    C16770e eVar2 = new C16770e();
                    c cVar = new c(eVar2, (String) null);
                    cVar.C();
                    cVar.q1("persistedQuery");
                    cVar.C();
                    cVar.q1("version").X(1);
                    cVar.q1("sha256Hash").T1(wVar.c());
                    cVar.K();
                    cVar.K();
                    linkedHashMap.put("extensions", eVar2.l0());
                }
                return linkedHashMap;
            }
            throw new IllegalStateException("FileUpload and Http GET are not supported at the same time");
        }

        /* access modifiers changed from: private */
        public final <D extends w.a> Map<String, B> h(g gVar, w<D> wVar, k kVar, boolean z10, String str) {
            gVar.C();
            gVar.q1("operationName");
            gVar.T1(wVar.name());
            gVar.q1("variables");
            R6.a aVar = new R6.a(gVar);
            aVar.C();
            wVar.a(aVar, kVar);
            aVar.K();
            Map<String, B> e10 = aVar.e();
            if (str != null) {
                gVar.q1("query");
                gVar.T1(str);
            }
            if (z10) {
                gVar.q1("extensions");
                gVar.C();
                gVar.q1("persistedQuery");
                gVar.C();
                gVar.q1("version").X(1);
                gVar.q1("sha256Hash").T1(wVar.c());
                gVar.K();
                gVar.K();
            }
            gVar.K();
            return e10;
        }

        public final String c(String str, Map<String, String> map) {
            C17542s.j(str, "<this>");
            C17542s.j(map, "parameters");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            boolean d02 = C15854t.d0(str, "?", false, 2, (Object) null);
            for (Map.Entry entry : map.entrySet()) {
                if (d02) {
                    sb2.append('&');
                } else {
                    sb2.append('?');
                    d02 = true;
                }
                sb2.append(O6.a.b((String) entry.getKey()));
                sb2.append('=');
                sb2.append(O6.a.b((String) entry.getValue()));
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }

        public final <D extends w.a> c e(w<D> wVar, k kVar, boolean z10, String str) {
            C17542s.j(wVar, "operation");
            C17542s.j(kVar, "customScalarAdapters");
            C16770e eVar = new C16770e();
            Map b10 = b.f39125b.h(new c(eVar, (String) null), wVar, kVar, z10, str);
            C16773h i02 = eVar.i0();
            return b10.isEmpty() ? new C0615a(i02) : new j(b10, i02);
        }

        public final <D extends w.a> Map<String, Object> g(f<D> fVar) {
            C17542s.j(fVar, "apolloRequest");
            w<D> f10 = fVar.f();
            Boolean h10 = fVar.h();
            boolean booleanValue = h10 != null ? h10.booleanValue() : false;
            Boolean i10 = fVar.i();
            boolean booleanValue2 = i10 != null ? i10.booleanValue() : true;
            k kVar = (k) fVar.c().a(k.f38586f);
            if (kVar != null) {
                String d10 = booleanValue2 ? f10.d() : null;
                i iVar = new i();
                Map unused = b.f39125b.h(iVar, f10, kVar, booleanValue, d10);
                Object e10 = iVar.e();
                C17542s.h(e10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                return (Map) e10;
            }
            throw new IllegalStateException("Cannot find a ResponseAdapterCache");
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: N6.b$b  reason: collision with other inner class name */
    public /* synthetic */ class C0616b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39130a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                N6.f[] r0 = N6.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                N6.f r1 = N6.f.Get     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                N6.f r1 = N6.f.Post     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f39130a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: N6.b.C0616b.<clinit>():void");
        }
    }

    public b(String str) {
        C17542s.j(str, "serverUrl");
        this.f39126a = str;
    }

    public <D extends w.a> g a(f<D> fVar) {
        C17542s.j(fVar, "apolloRequest");
        w<D> f10 = fVar.f();
        k kVar = (k) fVar.c().a(k.f38586f);
        if (kVar == null) {
            kVar = k.f38587g;
        }
        k kVar2 = kVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d("X-APOLLO-OPERATION-ID", f10.c()));
        arrayList.add(new d("X-APOLLO-OPERATION-NAME", f10.name()));
        fVar.f();
        arrayList.add(new d("Accept", "multipart/mixed; deferSpec=20220824, application/json"));
        if (fVar.d() != null) {
            arrayList.addAll(fVar.d());
        }
        Boolean h10 = fVar.h();
        boolean booleanValue = h10 != null ? h10.booleanValue() : false;
        Boolean i10 = fVar.i();
        boolean booleanValue2 = i10 != null ? i10.booleanValue() : true;
        f e10 = fVar.e();
        if (e10 == null) {
            e10 = f.Post;
        }
        int i11 = C0616b.f39130a[e10.ordinal()];
        if (i11 == 1) {
            return new g.a(f.Get, f39125b.d(this.f39126a, f10, kVar2, booleanValue, booleanValue2)).a(arrayList).c();
        }
        if (i11 == 2) {
            return new g.a(f.Post, this.f39126a).a(arrayList).b(f39125b.e(f10, kVar2, booleanValue, booleanValue2 ? f10.d() : null)).c();
        }
        throw new t();
    }
}
