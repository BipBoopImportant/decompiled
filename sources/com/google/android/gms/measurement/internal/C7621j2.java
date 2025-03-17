package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j2  reason: case insensitive filesystem */
final class C7621j2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f50190a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50191b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f50192c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f50193d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f50194e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7607h2 f50195f;

    C7621j2(C7607h2 h2Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f50190a = i10;
        this.f50191b = str;
        this.f50192c = obj;
        this.f50193d = obj2;
        this.f50194e = obj3;
        this.f50195f = h2Var;
    }

    public final void run() {
        C7683s2 E10 = this.f50195f.f50228a.E();
        if (!E10.p()) {
            this.f50195f.w(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f50195f.f50154c == 0) {
            if (this.f50195f.a().s()) {
                this.f50195f.f50154c = 'C';
            } else {
                this.f50195f.f50154c = 'c';
            }
        }
        if (this.f50195f.f50155d < 0) {
            this.f50195f.f50155d = 114010;
        }
        String str = "2" + "01VDIWEA?".charAt(this.f50190a) + this.f50195f.f50154c + this.f50195f.f50155d + ":" + C7607h2.v(true, this.f50191b, this.f50192c, this.f50193d, this.f50194e);
        if (str.length() > 1024) {
            str = this.f50191b.substring(0, 1024);
        }
        C7711w2 w2Var = E10.f50361f;
        if (w2Var != null) {
            w2Var.b(str, 1);
        }
    }
}
