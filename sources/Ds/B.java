package Ds;

import IC.C13026h;
import Ps.f;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qs.d;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LDs/B;", "LDs/A;", "<init>", "()V", "LPs/f;", "notificationSetting", "LDs/y;", "a", "(LPs/f;)LDs/y;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class B implements A {
    public y a(f fVar) {
        C17542s.j(fVar, "notificationSetting");
        if (fVar instanceof f.a) {
            return new y(fVar, C13026h.a(d.f101995g), C13026h.a(d.f101994f), 0);
        }
        if (fVar instanceof f.b) {
            return new y(fVar, C13026h.a(d.f101991c), C13026h.a(d.f101990b), 1);
        }
        if (fVar instanceof f.c) {
            return new y(fVar, C13026h.a(d.f101993e), C13026h.a(d.f101992d), 2);
        }
        throw new t();
    }
}
