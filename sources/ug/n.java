package ug;

import Zj.a;
import Zj.h;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import qI.C17787d;
import uI.C18064m;
import ug.m;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR/\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"Lug/n;", "Lug/m;", "LZj/h;", "overridesStorage", "<init>", "(LZj/h;)V", "LXH/N;", "f", "()V", "a", "LZj/h;", "", "<set-?>", "b", "LqI/d;", "()Ljava/lang/String;", "setExpectedCheckoutState", "(Ljava/lang/String;)V", "expectedCheckoutState", "c", "setExpectedOrderStatus", "expectedOrderStatus", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements m {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f77069d;

    /* renamed from: a  reason: collision with root package name */
    private final h f77070a;

    /* renamed from: b  reason: collision with root package name */
    private final C17787d f77071b;

    /* renamed from: c  reason: collision with root package name */
    private final C17787d f77072c;

    static {
        Class<n> cls = n.class;
        f77069d = new C18064m[]{P.e(new A(cls, "expectedCheckoutState", "getExpectedCheckoutState()Ljava/lang/String;", 0)), P.e(new A(cls, "expectedOrderStatus", "getExpectedOrderStatus()Ljava/lang/String;", 0))};
    }

    public n(h hVar) {
        C17542s.j(hVar, "overridesStorage");
        this.f77070a = hVar;
        this.f77071b = a.d(hVar, m.a.OVERRIDE_SCAN_AND_GO_EXPECTED_CHECKOUT_STATE);
        this.f77072c = a.d(hVar, m.a.OVERRIDE_EXPECTED_ORDER_STATUS);
    }

    public String a() {
        return (String) this.f77071b.a(this, f77069d[0]);
    }

    public String b() {
        return (String) this.f77072c.a(this, f77069d[1]);
    }

    public void f() {
        this.f77070a.clear();
    }
}
