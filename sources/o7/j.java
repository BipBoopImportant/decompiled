package o7;

import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import k7.C8460B;
import k7.g;
import k7.h;
import k7.o;
import k7.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C8533b;
import l7.C8536e;
import m7.c;
import m7.e;
import m7.f;
import o7.g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001fB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lo7/j;", "Lk7/o;", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "<init>", "(Lm7/c;Ll7/b;Lk7/h;)V", "", "toString", "()Ljava/lang/String;", "e", "Lm7/c;", "i", "()Lm7/c;", "f", "Ll7/b;", "g", "()Ll7/b;", "Lk7/h;", "p", "()Lk7/h;", "", "Lo7/g;", "h", "LXH/o;", "q", "()Ljava/util/List;", "values", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends o {

    /* renamed from: i  reason: collision with root package name */
    public static final a f55268i = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final c f55269e;

    /* renamed from: f  reason: collision with root package name */
    private final C8533b f55270f;

    /* renamed from: g  reason: collision with root package name */
    private final h f55271g;

    /* renamed from: h  reason: collision with root package name */
    private final C16824o f55272h;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lo7/j$a;", "", "<init>", "()V", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "Lo7/j;", "b", "(Lm7/c;Ll7/b;Lk7/h;)Lo7/j;", "", "Lo7/g;", "extensions", "a", "(Ljava/util/List;Lk7/h;)Lo7/j;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ j c(a aVar, List list, h hVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                hVar = C8460B.f54288a;
            }
            return aVar.a(list, hVar);
        }

        public final j a(List<g> list, h hVar) {
            C17542s.j(list, "extensions");
            C17542s.j(hVar, "logger");
            Iterable<g> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (g f10 : iterable) {
                arrayList.add(f10.f());
            }
            C8533b a10 = C8536e.a(arrayList);
            e eVar = e.ContextSpecific;
            f fVar = f.Constructed;
            return new j(new c(eVar, fVar, 3, 1), new x(new c(e.Universal, fVar, 16, 1), a10, hVar).f(), hVar, (DefaultConstructorMarker) null);
        }

        public final j b(c cVar, C8533b bVar, h hVar) {
            C17542s.j(cVar, "tag");
            C17542s.j(bVar, "encoded");
            C17542s.j(hVar, "logger");
            return new j(cVar, bVar, hVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ j(c cVar, C8533b bVar, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, bVar, hVar);
    }

    /* access modifiers changed from: private */
    public static final CharSequence r(g gVar) {
        C17542s.j(gVar, "it");
        return gVar.toString();
    }

    /* access modifiers changed from: private */
    public static final List s(j jVar) {
        o d10 = g.d(jVar.g(), jVar.p());
        C17542s.h(d10, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
        Iterable<o> q10 = ((x) d10).q();
        ArrayList arrayList = new ArrayList(C16877v.y(q10, 10));
        for (o oVar : q10) {
            g.a aVar = g.f55258m;
            C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
            arrayList.add(aVar.a((x) oVar));
        }
        return arrayList;
    }

    public C8533b g() {
        return this.f55270f;
    }

    public c i() {
        return this.f55269e;
    }

    public h p() {
        return this.f55271g;
    }

    public final List<g> q() {
        return (List) this.f55272h.getValue();
    }

    public String toString() {
        return C16877v.G0(q(), "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new i(), 30, (Object) null);
    }

    private j(c cVar, C8533b bVar, h hVar) {
        this.f55269e = cVar;
        this.f55270f = bVar;
        this.f55271g = hVar;
        this.f55272h = C16825p.b(new h(this));
    }
}
