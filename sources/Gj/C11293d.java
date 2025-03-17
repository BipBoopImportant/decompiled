package gj;

import XH.x;
import gj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgj/d;", "", "Lgj/o;", "urlWrapper", "Lgj/n;", "urlDataMatrixScannerResultMapper", "Lgj/b;", "asisDataMatrixScannerResultMapper", "Lgj/a;", "articleNumberDataMatrixScannerResultMapper", "<init>", "(Lgj/o;Lgj/n;Lgj/b;Lgj/a;)V", "", "format", "", "rawValue", "Lgj/j$c;", "a", "(ILjava/lang/String;)Lgj/j$c;", "Lgj/o;", "b", "Lgj/n;", "c", "Lgj/b;", "d", "Lgj/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.d  reason: case insensitive filesystem */
public final class C11293d {

    /* renamed from: a  reason: collision with root package name */
    private final o f97534a;

    /* renamed from: b  reason: collision with root package name */
    private final n f97535b;

    /* renamed from: c  reason: collision with root package name */
    private final C11291b f97536c;

    /* renamed from: d  reason: collision with root package name */
    private final C11290a f97537d;

    public C11293d(o oVar, n nVar, C11291b bVar, C11290a aVar) {
        C17542s.j(oVar, "urlWrapper");
        C17542s.j(nVar, "urlDataMatrixScannerResultMapper");
        C17542s.j(bVar, "asisDataMatrixScannerResultMapper");
        C17542s.j(aVar, "articleNumberDataMatrixScannerResultMapper");
        this.f97534a = oVar;
        this.f97535b = nVar;
        this.f97536c = bVar;
        this.f97537d = aVar;
    }

    public final j.c a(int i10, String str) {
        C17542s.j(str, "rawValue");
        j.c cVar = null;
        if (this.f97534a.a(str)) {
            Object a10 = this.f97535b.a(i10, str);
            if (!x.g(a10)) {
                cVar = a10;
            }
            return (j.c) cVar;
        }
        Object a11 = this.f97536c.a(i10, str);
        if (x.e(a11) == null) {
            return (j.c) a11;
        }
        Object a12 = this.f97537d.a(i10, str);
        if (!x.g(a12)) {
            cVar = a12;
        }
        return cVar;
    }
}
