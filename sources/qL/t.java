package QL;

import QL.C16360c;
import QL.u;
import java.util.concurrent.Executor;

final class t {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f137851a;

    /* renamed from: b  reason: collision with root package name */
    static final u f137852b;

    /* renamed from: c  reason: collision with root package name */
    static final C16360c f137853c;

    static {
        String property = System.getProperty("java.vm.name");
        property.hashCode();
        if (property.equals("RoboVM")) {
            f137851a = null;
            f137852b = new u();
            f137853c = new C16360c();
        } else if (!property.equals("Dalvik")) {
            f137851a = null;
            f137852b = new u.b();
            f137853c = new C16360c.a();
        } else {
            f137851a = new C16358a();
            f137852b = new u.a();
            f137853c = new C16360c.a();
        }
    }
}
