package androidx.appcompat.widget;

class F {

    /* renamed from: a  reason: collision with root package name */
    private int f16207a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f16208b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f16209c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f16210d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f16211e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f16212f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16213g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16214h = false;

    F() {
    }

    public int a() {
        return this.f16213g ? this.f16207a : this.f16208b;
    }

    public int b() {
        return this.f16207a;
    }

    public int c() {
        return this.f16208b;
    }

    public int d() {
        return this.f16213g ? this.f16208b : this.f16207a;
    }

    public void e(int i10, int i11) {
        this.f16214h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f16211e = i10;
            this.f16207a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f16212f = i11;
            this.f16208b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 != this.f16213g) {
            this.f16213g = z10;
            if (!this.f16214h) {
                this.f16207a = this.f16211e;
                this.f16208b = this.f16212f;
            } else if (z10) {
                int i10 = this.f16210d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.f16211e;
                }
                this.f16207a = i10;
                int i11 = this.f16209c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f16212f;
                }
                this.f16208b = i11;
            } else {
                int i12 = this.f16209c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = this.f16211e;
                }
                this.f16207a = i12;
                int i13 = this.f16210d;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = this.f16212f;
                }
                this.f16208b = i13;
            }
        }
    }

    public void g(int i10, int i11) {
        this.f16209c = i10;
        this.f16210d = i11;
        this.f16214h = true;
        if (this.f16213g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f16207a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f16208b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f16207a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f16208b = i11;
        }
    }
}
