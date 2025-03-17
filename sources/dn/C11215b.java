package dn;

import GK.C15774B;
import GK.C15776D;
import GK.C15804w;
import YH.X;
import cn.C11149a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tw.j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldn/b;", "LGK/w;", "Lcn/a;", "botManager", "<init>", "(Lcn/a;)V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "Lcn/a;", "botmanager-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dn.b  reason: case insensitive filesystem */
public final class C11215b implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    private final C11149a f96970a;

    public C11215b(C11149a aVar) {
        C17542s.j(aVar, "botManager");
        this.f96970a = aVar;
    }

    public C15776D intercept(C15804w.a aVar) {
        C17542s.j(aVar, "chain");
        C15774B t10 = aVar.t();
        if (j.d(t10)) {
            return aVar.b(t10);
        }
        C15774B.a i10 = aVar.t().i();
        Map<String, String> a10 = this.f96970a.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(a10.size()));
        for (Map.Entry entry : a10.entrySet()) {
            linkedHashMap.put(i10.e((String) entry.getKey(), (String) entry.getValue()), entry.getValue());
        }
        return aVar.b(i10.b());
    }
}
