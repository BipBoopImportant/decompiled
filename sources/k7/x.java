package k7;

import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C8533b;
import l7.C8536e;
import m7.c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0007\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010 8FX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lk7/x;", "Lk7/o;", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "<init>", "(Lm7/c;Ll7/b;Lk7/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lm7/c;", "i", "()Lm7/c;", "f", "Ll7/b;", "g", "()Ll7/b;", "Lk7/h;", "p", "()Lk7/h;", "", "h", "LXH/o;", "q", "()Ljava/util/List;", "values", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x extends o {

    /* renamed from: i  reason: collision with root package name */
    public static final a f54341i = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final c f54342e;

    /* renamed from: f  reason: collision with root package name */
    private final C8533b f54343f;

    /* renamed from: g  reason: collision with root package name */
    private final h f54344g;

    /* renamed from: h  reason: collision with root package name */
    private final C16824o f54345h = C16825p.b(new w(this));

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lk7/x$a;", "", "<init>", "()V", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "Lk7/x;", "b", "(Lm7/c;Ll7/b;Lk7/h;)Lk7/x;", "", "Lk7/o;", "values", "a", "(Lm7/c;Ljava/util/List;Lk7/h;)Lk7/x;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(c cVar, List<? extends o> list, h hVar) {
            C17542s.j(cVar, "tag");
            C17542s.j(list, "values");
            C17542s.j(hVar, "logger");
            Iterable<o> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (o f10 : iterable) {
                arrayList.add(f10.f());
            }
            return new x(cVar, C8536e.a(arrayList), hVar);
        }

        public final x b(c cVar, C8533b bVar, h hVar) {
            C17542s.j(cVar, "tag");
            C17542s.j(bVar, "encoded");
            C17542s.j(hVar, "logger");
            return new x(cVar, bVar, hVar);
        }

        private a() {
        }
    }

    public x(c cVar, C8533b bVar, h hVar) {
        C17542s.j(cVar, "tag");
        C17542s.j(bVar, "encoded");
        C17542s.j(hVar, "logger");
        this.f54342e = cVar;
        this.f54343f = bVar;
        this.f54344g = hVar;
    }

    /* access modifiers changed from: private */
    public static final CharSequence r(o oVar) {
        C17542s.j(oVar, "it");
        return oVar.toString();
    }

    /* access modifiers changed from: private */
    public static final List s(x xVar) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < xVar.g().a()) {
            C8533b e02 = xVar.g().e0(i10, xVar.g().a());
            C8464d a10 = g.a(e02, xVar.p());
            arrayList.add(g.d(e02.e0(0, a10.c()), xVar.p()));
            i10 += a10.c();
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return C17542s.e(this.f54342e, xVar.f54342e) && C17542s.e(this.f54343f, xVar.f54343f) && C17542s.e(this.f54344g, xVar.f54344g);
    }

    public C8533b g() {
        return this.f54343f;
    }

    public int hashCode() {
        return (((this.f54342e.hashCode() * 31) + this.f54343f.hashCode()) * 31) + this.f54344g.hashCode();
    }

    public c i() {
        return this.f54342e;
    }

    public h p() {
        return this.f54344g;
    }

    public final List<o> q() {
        return (List) this.f54345h.getValue();
    }

    public String toString() {
        String str = i().h(16) ? "SEQUENCE" : "SET";
        return str + " (" + q().size() + " elem)" + C15854t.i(C16877v.G0(q(), "\n", "\n", (CharSequence) null, 0, (CharSequence) null, new v(), 28, (Object) null), "  ");
    }
}
