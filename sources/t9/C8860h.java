package t9;

import WH.C16729a;
import android.content.Context;
import n9.b;
import n9.d;

/* renamed from: t9.h  reason: case insensitive filesystem */
public final class C8860h implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<Context> f56723a;

    public C8860h(C16729a<Context> aVar) {
        this.f56723a = aVar;
    }

    public static C8860h a(C16729a<Context> aVar) {
        return new C8860h(aVar);
    }

    public static String c(Context context) {
        return (String) d.d(C8858f.b(context));
    }

    /* renamed from: b */
    public String get() {
        return c(this.f56723a.get());
    }
}
