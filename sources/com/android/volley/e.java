package com.android.volley;

public class e implements r {

    /* renamed from: a  reason: collision with root package name */
    private int f46208a;

    /* renamed from: b  reason: collision with root package name */
    private int f46209b;

    /* renamed from: c  reason: collision with root package name */
    private final int f46210c;

    /* renamed from: d  reason: collision with root package name */
    private final float f46211d;

    public e() {
        this(2500, 1, 1.0f);
    }

    public int a() {
        return this.f46209b;
    }

    public void b(u uVar) {
        this.f46209b++;
        int i10 = this.f46208a;
        this.f46208a = i10 + ((int) (((float) i10) * this.f46211d));
        if (!d()) {
            throw uVar;
        }
    }

    public int c() {
        return this.f46208a;
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return this.f46209b <= this.f46210c;
    }

    public e(int i10, int i11, float f10) {
        this.f46208a = i10;
        this.f46210c = i11;
        this.f46211d = f10;
    }
}
