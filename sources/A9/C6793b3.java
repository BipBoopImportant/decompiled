package a9;

import E8.b;
import E8.c;

/* renamed from: a9.b3  reason: case insensitive filesystem */
public final class C6793b3 implements C6904p2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f42468a;

    public C6793b3(c cVar) {
        this.f42468a = cVar;
    }

    public final boolean a() {
        return System.currentTimeMillis() - this.f42468a.e(b.TELEMETRY_LAST_REPORT_SENT_TIME_STAMP, 0) > 1209600000;
    }

    public final int getType() {
        return 3;
    }
}
