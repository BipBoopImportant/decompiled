package Tj;

import Ej.F;
import XH.t;
import XH.u;
import XH.x;
import XH.y;
import android.net.Uri;
import gj.k;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LTj/q;", "", "Lgj/k;", "barcodeToScannerResult", "<init>", "(Lgj/k;)V", "", "format", "", "rawValue", "LXH/x;", "LEj/F;", "a", "(ILjava/lang/String;)Ljava/lang/Object;", "Lgj/k;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final k f87674a;

    public q(k kVar) {
        C17542s.j(kVar, "barcodeToScannerResult");
        this.f87674a = kVar;
    }

    public final Object a(int i10, String str) {
        C17542s.j(str, "rawValue");
        try {
            x.a aVar = x.f139812b;
            k kVar = this.f87674a;
            String decode = Uri.decode(str);
            C17542s.i(decode, "decode(...)");
            k.a a10 = kVar.a(i10, decode);
            if (a10 instanceof k.a.c) {
                return x.b(new F(((k.a.c) a10).a().h(), ((k.a.c) a10).a().d(), ((k.a.c) a10).a().e(), ((k.a.c) a10).a().g(), ((k.a.c) a10).a().c(), ((k.a.c) a10).a().b()));
            }
            if (!(a10 instanceof k.a.C2185a)) {
                if (!C17542s.e(a10, k.a.b.f97613a)) {
                    throw new t();
                }
            }
            return x.b(y.a(new u(String.valueOf(a10))));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            return x.b(y.a(th2));
        }
    }
}
