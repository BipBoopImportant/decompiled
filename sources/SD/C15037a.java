package sD;

import TJ.C16505B;
import TJ.C16521S;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import sf.C10240a;
import sf.C10241b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"LsD/a;", "Lsf/b;", "<init>", "()V", "Lsf/a;", "key", "", "default", "LTJ/B;", "c", "(Lsf/a;Z)LTJ/B;", "value", "LXH/N;", "a", "(Lsf/a;Z)V", "b", "(Lsf/a;Z)Z", "", "Ljava/util/Map;", "flows", "userdataservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sD.a  reason: case insensitive filesystem */
public final class C15037a implements C10241b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<C10240a, C16505B<Boolean>> f130936a = new LinkedHashMap();

    private final C16505B<Boolean> c(C10240a aVar, boolean z10) {
        C16505B<Boolean> b10;
        synchronized (this.f130936a) {
            try {
                Map<C10240a, C16505B<Boolean>> map = this.f130936a;
                C16505B<Boolean> b11 = map.get(aVar);
                if (b11 == null) {
                    b11 = C16521S.a(Boolean.valueOf(z10));
                    map.put(aVar, b11);
                }
                b10 = b11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }

    public void a(C10240a aVar, boolean z10) {
        C17542s.j(aVar, "key");
        c(aVar, z10).setValue(Boolean.valueOf(z10));
    }

    public boolean b(C10240a aVar, boolean z10) {
        C17542s.j(aVar, "key");
        return c(aVar, z10).getValue().booleanValue();
    }
}
