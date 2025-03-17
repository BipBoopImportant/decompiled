package nts;

/* renamed from: nts.ⅻ  reason: contains not printable characters */
public class C4128 extends C3803 {

    /* renamed from: ػ  reason: contains not printable characters */
    public C4064 f3585;

    public C4128(C4064 r12, Object obj) {
        super(r12, obj);
        this.f3585 = r12;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m3315(String str) {
        C4064 r02 = this.f3585;
        if (r02 != null && r02.f3153) {
            try {
                r02.m3136(str);
            } catch (C3625 e10) {
                r02.m3168(e10);
            }
        }
    }

    /* renamed from: и  reason: contains not printable characters */
    public void m3316(String str) {
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3318(String str) {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3319() {
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m3322(String str) {
        C4064 r02 = this.f3585;
        if (r02 != null && r02.f3153) {
            try {
                if (r02.f3216) {
                    if ("[".compareTo(str) == 0) {
                        r02.f3244.m1433();
                    } else if ("{".compareTo(str) == 0) {
                        r02.f3244.m1441();
                    } else {
                        r02.f3244.m1424(str, 4);
                    }
                } else if (r02.f3140 <= 220) {
                    r02.m3174(str);
                } else {
                    r02.m2897(str);
                }
            } catch (C3625 e10) {
                r02.m3168(e10);
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3317() {
        C4064 r02 = this.f3585;
        if (r02 != null && r02.f3153) {
            try {
                r02.m3072();
            } catch (C3625 e10) {
                r02.m3168(e10);
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3320(int i10, String str) {
        C3748 r02;
        C4064 r03 = this.f3585;
        if (r03 != null && (r02 = ((C3652) r03).f718) != null) {
            r02.m1167(i10, str);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3321(String str) {
        C4064 r02 = this.f3585;
        if (r02 != null && r02.f3153) {
            try {
                if (r02.f3216) {
                    r02.f3244.m1431(str, r02.f3299.f1413.m3799());
                } else if (r02.f3140 >= 231) {
                    r02.m3013(str);
                } else {
                    r02.m2880(str);
                }
            } catch (C3625 e10) {
                r02.m3168(e10);
            }
        }
    }
}
