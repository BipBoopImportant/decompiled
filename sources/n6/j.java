package N6;

import M6.B;
import Q6.b;
import Q6.c;
import WK.C16770e;
import WK.C16771f;
import WK.C16773h;
import WK.y;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0016\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!¨\u0006#"}, d2 = {"LN6/j;", "LN6/c;", "", "", "LM6/B;", "uploads", "LWK/h;", "operationByteString", "<init>", "(Ljava/util/Map;LWK/h;)V", "f", "(Ljava/util/Map;)LWK/h;", "LWK/f;", "", "writeUploadContents", "LXH/N;", "g", "(LWK/f;Z)V", "bufferedSink", "a", "(LWK/f;)V", "Ljava/util/Map;", "b", "LWK/h;", "c", "Ljava/lang/String;", "boundary", "d", "()Ljava/lang/String;", "contentType", "", "e", "LXH/o;", "()J", "contentLength", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class j implements c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, B> f39149a;

    /* renamed from: b  reason: collision with root package name */
    private final C16773h f39150b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39151c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39152d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f39153e = C16825p.b(new a(this));

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 5, 1})
    static final class a extends C17544u implements C17631a<Long> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f39154c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(0);
            this.f39154c = jVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            a aVar = new a(y.b());
            C16771f c10 = y.c(aVar);
            this.f39154c.g(c10, false);
            c10.flush();
            long c11 = aVar.c();
            long j10 = 0;
            for (B c12 : this.f39154c.f39149a.values()) {
                j10 += c12.c();
            }
            return Long.valueOf(c11 + j10);
        }
    }

    public j(Map<String, ? extends B> map, C16773h hVar) {
        C17542s.j(map, "uploads");
        C17542s.j(hVar, "operationByteString");
        this.f39149a = map;
        this.f39150b = hVar;
        UUID randomUUID = UUID.randomUUID();
        C17542s.i(randomUUID, "randomUUID()");
        String uuid = randomUUID.toString();
        C17542s.i(uuid, "uuid4().toString()");
        this.f39151c = uuid;
        this.f39152d = "multipart/form-data; boundary=" + uuid;
    }

    private final C16773h f(Map<String, ? extends B> map) {
        C16770e eVar = new C16770e();
        c cVar = new c(eVar, (String) null);
        Iterable entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(C16877v.y(entrySet, 10));
        int i10 = 0;
        for (Object next : entrySet) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            arrayList.add(C16796C.a(String.valueOf(i10), C16877v.e(((Map.Entry) next).getKey())));
            i10 = i11;
        }
        b.a(cVar, X.v(arrayList));
        return eVar.i0();
    }

    /* access modifiers changed from: private */
    public final void g(C16771f fVar, boolean z10) {
        fVar.D0("--" + this.f39151c + "\r\n");
        fVar.D0("Content-Disposition: form-data; name=\"operations\"\r\n");
        fVar.D0("Content-Type: application/json\r\n");
        fVar.D0("Content-Length: " + this.f39150b.W() + "\r\n");
        fVar.D0("\r\n");
        fVar.j2(this.f39150b);
        C16773h f10 = f(this.f39149a);
        fVar.D0("\r\n--" + this.f39151c + "\r\n");
        fVar.D0("Content-Disposition: form-data; name=\"map\"\r\n");
        fVar.D0("Content-Type: application/json\r\n");
        fVar.D0("Content-Length: " + f10.W() + "\r\n");
        fVar.D0("\r\n");
        fVar.j2(f10);
        int i10 = 0;
        for (Object next : this.f39149a.values()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            B b10 = (B) next;
            fVar.D0("\r\n--" + this.f39151c + "\r\n");
            fVar.D0("Content-Disposition: form-data; name=\"" + i10 + '\"');
            if (b10.d() != null) {
                fVar.D0("; filename=\"" + b10.d() + '\"');
            }
            fVar.D0("\r\n");
            fVar.D0("Content-Type: " + b10.b() + "\r\n");
            long c10 = b10.c();
            if (c10 != -1) {
                fVar.D0("Content-Length: " + c10 + "\r\n");
            }
            fVar.D0("\r\n");
            if (z10) {
                b10.a(fVar);
            }
            i10 = i11;
        }
        fVar.D0("\r\n--" + this.f39151c + "--\r\n");
    }

    public void a(C16771f fVar) {
        C17542s.j(fVar, "bufferedSink");
        g(fVar, true);
    }

    public String b() {
        return this.f39152d;
    }

    public long c() {
        return ((Number) this.f39153e.getValue()).longValue();
    }
}
