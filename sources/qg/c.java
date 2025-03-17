package Qg;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11819b;
import qv.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LQg/c;", "Lqv/b;", "LQg/a;", "crashlytics", "<init>", "(LQg/a;)V", "Lqv/e;", "priority", "", "sensitive", "b", "(Lqv/e;Z)Z", "", "tag", "", "cause", "Lqv/c;", "event", "LXH/N;", "a", "(Lqv/e;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/lang/String;)V", "LQg/a;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11819b {

    /* renamed from: a  reason: collision with root package name */
    private final a f63117a;

    public c(a aVar) {
        C17542s.j(aVar, "crashlytics");
        this.f63117a = aVar;
    }

    public void a(e eVar, String str, boolean z10, Throwable th2, String str2) {
        C17542s.j(eVar, "priority");
        C17542s.j(str, "tag");
        C17542s.j(str2, "event");
        if (!z10 && !d.a(str2)) {
            if (C15854t.v0(str)) {
                this.f63117a.log(str2);
                return;
            }
            a aVar = this.f63117a;
            aVar.log(str + " " + str2);
        }
    }

    public boolean b(e eVar, boolean z10) {
        C17542s.j(eVar, "priority");
        return eVar.compareTo(e.DEBUG) >= 0 && !z10;
    }
}
