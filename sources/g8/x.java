package G8;

import HJ.C15854t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LG8/x;", "", "<init>", "()V", "", "LG8/m;", "components", "modifier", "LXH/N;", "g", "(Ljava/util/List;LG8/m;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "version", "LG8/o;", "operator", "f", "(LG8/x;LG8/o;)I", "a", "Ljava/util/List;", "b", "LG8/m;", "c", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class x {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36297c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static m f36298d = m.f36277b.a("0");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static p<x> f36299e = new p<>();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final j<x> f36300f = new w();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public List<m> f36301a = C16877v.n();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public m f36302b;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LG8/x$a;", "", "<init>", "()V", "", "version", "LG8/x;", "a", "(Ljava/lang/String;)LG8/x;", "b", "()LG8/x;", "LXH/N;", "c", "(LG8/x;)V", "LG8/p;", "recycler", "LG8/p;", "LG8/j;", "versionInstanceCreator", "LG8/j;", "LG8/m;", "zeroNumber", "LG8/m;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final x a(String str) {
            C17542s.j(str, "version");
            List Y02 = C15854t.Y0(C15854t.z1(str).toString(), new String[]{"-"}, false, 2, 2, (Object) null);
            String str2 = (String) C16877v.z0(Y02, 1);
            m a10 = str2 != null ? m.f36277b.a(str2) : null;
            List<String> Y03 = C15854t.Y0((CharSequence) Y02.get(0), new String[]{"."}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(C16877v.y(Y03, 10));
            for (String a11 : Y03) {
                arrayList.add(m.f36277b.a(a11));
            }
            x b10 = b();
            b10.g(arrayList, a10);
            return b10;
        }

        public final x b() {
            return (x) x.f36299e.a(x.f36300f);
        }

        public final void c(x xVar) {
            C17542s.j(xVar, "version");
            for (m b10 : xVar.f36301a) {
                m.f36277b.b(b10);
            }
            m c10 = xVar.f36302b;
            if (c10 != null) {
                m.f36277b.b(c10);
            }
            x.f36299e.b(xVar);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private x() {
    }

    /* access modifiers changed from: private */
    public static final x h() {
        return new x();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        return C17542s.e(xVar.f36301a, this.f36301a) && C17542s.e(xVar.f36302b, this.f36302b);
    }

    public final int f(x xVar, o oVar) {
        C17542s.j(xVar, "version");
        C17542s.j(oVar, "operator");
        int max = Math.max(this.f36301a.size(), xVar.f36301a.size());
        for (int i10 = 0; i10 < max; i10++) {
            m mVar = (m) C16877v.z0(this.f36301a, i10);
            if (mVar == null) {
                mVar = f36298d;
            }
            m mVar2 = (m) C16877v.z0(xVar.f36301a, i10);
            if (mVar2 == null) {
                mVar2 = f36298d;
            }
            if (!C17542s.e(mVar, mVar2)) {
                return mVar.d(mVar2, oVar);
            }
        }
        m mVar3 = this.f36302b;
        if (mVar3 == null) {
            mVar3 = f36298d;
        }
        m mVar4 = xVar.f36302b;
        if (mVar4 == null) {
            mVar4 = f36298d;
        }
        return mVar3.d(mVar4, oVar);
    }

    public final void g(List<m> list, m mVar) {
        C17542s.j(list, "components");
        this.f36301a = list;
        this.f36302b = mVar;
    }

    public int hashCode() {
        int hashCode = this.f36301a.hashCode() * 31;
        m mVar = this.f36302b;
        return hashCode + (mVar != null ? mVar.hashCode() : 0);
    }
}
