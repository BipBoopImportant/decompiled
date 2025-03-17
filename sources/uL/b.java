package Ul;

import Ae.e;
import XH.C16796C;
import YH.X;
import Yl.a;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LUl/b;", "LUl/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LYl/a;", "linkData", "LXH/N;", "a", "(LYl/a;)V", "LAe/e;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f88316a;

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f88316a = eVar;
    }

    public void a(a aVar) {
        C17542s.j(aVar, "linkData");
        this.f88316a.track("linkit_app_open", X.m(C16796C.a("component_value", aVar.d()), C16796C.a("dynamic_link_link_name", aVar.a()), C16796C.a("source", aVar.i()), C16796C.a(Constants.MEDIUM, aVar.h()), C16796C.a("content", aVar.f()), C16796C.a("campaign", aVar.e()), C16796C.a("term", aVar.j()), C16796C.a("id", aVar.c()), C16796C.a("dynamicId", aVar.g())));
    }
}
