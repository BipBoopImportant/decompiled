package oE;

import android.content.Context;

/* renamed from: oE.d  reason: case insensitive filesystem */
class C14881d {

    /* renamed from: a  reason: collision with root package name */
    private String f130029a;

    /* renamed from: b  reason: collision with root package name */
    private final String f130030b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f130031c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f130032d;

    public C14881d(Context context, String str) {
        this.f130032d = context;
        this.f130030b = str;
    }

    public synchronized String a() {
        return this.f130029a;
    }

    public String b() {
        return this.f130030b;
    }

    public Boolean c() {
        return this.f130031c;
    }

    public synchronized void d(boolean z10) {
        try {
            if (this.f130031c == null && !z10) {
                C14884g.s(this.f130032d).l(this.f130030b);
            }
            this.f130031c = Boolean.valueOf(z10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void e(String str) {
        this.f130029a = str;
    }

    public boolean f() {
        if (c() == null) {
            return true;
        }
        return c().booleanValue();
    }
}
