package WK;

import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010'J\u000f\u0010-\u001a\u00020%H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u00100R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b\u0002\u00102¨\u00063"}, d2 = {"LWK/m;", "LWK/l;", "delegate", "<init>", "(LWK/l;)V", "LWK/E;", "path", "", "functionName", "parameterName", "F", "(LWK/E;Ljava/lang/String;Ljava/lang/String;)LWK/E;", "J", "(LWK/E;Ljava/lang/String;)LWK/E;", "LWK/k;", "t", "(LWK/E;)LWK/k;", "dir", "", "q", "(LWK/E;)Ljava/util/List;", "file", "LWK/j;", "u", "(LWK/E;)LWK/j;", "", "mustCreate", "mustExist", "w", "(LWK/E;ZZ)LWK/j;", "LWK/N;", "B", "(LWK/E;)LWK/N;", "LWK/L;", "z", "(LWK/E;Z)LWK/L;", "d", "LXH/N;", "h", "(LWK/E;Z)V", "source", "target", "e", "(LWK/E;LWK/E;)V", "n", "close", "()V", "toString", "()Ljava/lang/String;", "LWK/l;", "()LWK/l;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.m  reason: case insensitive filesystem */
public abstract class C16778m extends C16777l {

    /* renamed from: e  reason: collision with root package name */
    private final C16777l f139694e;

    public C16778m(C16777l lVar) {
        C17542s.j(lVar, "delegate");
        this.f139694e = lVar;
    }

    public N B(C16762E e10) {
        C17542s.j(e10, "file");
        return this.f139694e.B(F(e10, "source", "file"));
    }

    public C16762E F(C16762E e10, String str, String str2) {
        C17542s.j(e10, "path");
        C17542s.j(str, "functionName");
        C17542s.j(str2, "parameterName");
        return e10;
    }

    public C16762E J(C16762E e10, String str) {
        C17542s.j(e10, "path");
        C17542s.j(str, "functionName");
        return e10;
    }

    public void close() {
        this.f139694e.close();
    }

    public L d(C16762E e10, boolean z10) {
        C17542s.j(e10, "file");
        return this.f139694e.d(F(e10, "appendingSink", "file"), z10);
    }

    public void e(C16762E e10, C16762E e11) {
        C17542s.j(e10, "source");
        C17542s.j(e11, "target");
        this.f139694e.e(F(e10, "atomicMove", "source"), F(e11, "atomicMove", "target"));
    }

    public void h(C16762E e10, boolean z10) {
        C17542s.j(e10, "dir");
        this.f139694e.h(F(e10, "createDirectory", "dir"), z10);
    }

    public void n(C16762E e10, boolean z10) {
        C17542s.j(e10, "path");
        this.f139694e.n(F(e10, "delete", "path"), z10);
    }

    public List<C16762E> q(C16762E e10) {
        C17542s.j(e10, "dir");
        C16762E F10 = F(e10, "list", "dir");
        ArrayList arrayList = new ArrayList();
        for (C16762E J10 : this.f139694e.q(F10)) {
            arrayList.add(J(J10, "list"));
        }
        C16877v.B(arrayList);
        return arrayList;
    }

    public C16776k t(C16762E e10) {
        C17542s.j(e10, "path");
        C16776k t10 = this.f139694e.t(F(e10, "metadataOrNull", "path"));
        if (t10 == null) {
            return null;
        }
        return t10.e() == null ? t10 : C16776k.b(t10, false, false, J(t10.e(), "metadataOrNull"), (Long) null, (Long) null, (Long) null, (Long) null, (Map) null, 251, (Object) null);
    }

    public String toString() {
        return P.b(getClass()).f() + '(' + this.f139694e + ')';
    }

    public C16775j u(C16762E e10) {
        C17542s.j(e10, "file");
        return this.f139694e.u(F(e10, "openReadOnly", "file"));
    }

    public C16775j w(C16762E e10, boolean z10, boolean z11) {
        C17542s.j(e10, "file");
        return this.f139694e.w(F(e10, "openReadWrite", "file"), z10, z11);
    }

    public L z(C16762E e10, boolean z10) {
        C17542s.j(e10, "file");
        return this.f139694e.z(F(e10, "sink", "file"), z10);
    }
}
