package fh;

import KC.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import px.C14927a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfh/a;", "LKC/s;", "Lpx/a;", "prepaidCardValidator", "<init>", "(Lpx/a;)V", "", "cardNumber", "", "b", "(Ljava/lang/String;)Z", "d", "pin", "c", "a", "Lpx/a;", "()Z", "hasConfig", "giftcard-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fh.a  reason: case insensitive filesystem */
public final class C9717a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final C14927a f73025a;

    public C9717a(C14927a aVar) {
        C17542s.j(aVar, "prepaidCardValidator");
        this.f73025a = aVar;
    }

    public boolean a() {
        return this.f73025a.a();
    }

    public boolean b(String str) {
        C17542s.j(str, "cardNumber");
        return this.f73025a.b(str);
    }

    public boolean c(String str) {
        C17542s.j(str, "pin");
        return this.f73025a.c(str);
    }

    public boolean d(String str) {
        C17542s.j(str, "cardNumber");
        return this.f73025a.d(str);
    }
}
