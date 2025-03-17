package Vc;

import K9.C6620s;

public class a extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f64507a;

    public a(String str, int i10) {
        super(C6620s.g(str, "Provided message must not be empty."));
        this.f64507a = i10;
    }

    public int a() {
        return this.f64507a;
    }

    public a(String str, int i10, Throwable th2) {
        super(C6620s.g(str, "Provided message must not be empty."), th2);
        this.f64507a = i10;
    }
}
