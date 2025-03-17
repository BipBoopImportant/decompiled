package yt;

import Et.a;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import yt.f;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyt/k;", "", "<init>", "()V", "LEt/a$b;", "state", "LEt/a;", "a", "(LEt/a$b;)LEt/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f107298a = new k();

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"yt/k$a", "LEt/a;", "", "u", "()Z", "", "url", "Lkotlin/Function1;", "Lyt/f$c;", "LXH/N;", "action", "z", "(Ljava/lang/String;LnI/l;)Z", "LEt/a$a;", "c", "(LEt/a$a;)V", "LTJ/P;", "LEt/a$b;", "a", "LTJ/P;", "getState", "()LTJ/P;", "state", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Et.a {

        /* renamed from: a  reason: collision with root package name */
        private final C16519P<a.b> f107299a;

        a(a.b bVar) {
            this.f107299a = C16534i.c(C16521S.a(bVar));
        }

        /* renamed from: c */
        public void b(a.C1545a aVar) {
            C17542s.j(aVar, "action");
        }

        public C16519P<a.b> getState() {
            return this.f107299a;
        }

        public boolean u() {
            return false;
        }

        public boolean z(String str, C17642l<? super f.c, C16807N> lVar) {
            C17542s.j(lVar, "action");
            return true;
        }
    }

    private k() {
    }

    public final Et.a a(a.b bVar) {
        C17542s.j(bVar, "state");
        return new a(bVar);
    }
}
