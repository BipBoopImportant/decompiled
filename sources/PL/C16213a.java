package PL;

import NL.C16126a;
import NL.g;
import java.util.Objects;

/* renamed from: PL.a  reason: case insensitive filesystem */
public class C16213a implements C16126a {

    /* renamed from: a  reason: collision with root package name */
    private long f137207a;

    /* renamed from: b  reason: collision with root package name */
    private long f137208b;

    /* renamed from: c  reason: collision with root package name */
    private g f137209c;

    public g a() {
        return this.f137209c;
    }

    public boolean b() {
        return !d();
    }

    public long c(int i10) {
        long abs = Math.abs(e());
        return (f() == 0 || Math.abs((((double) f()) / ((double) a().b())) * 100.0d) <= ((double) i10)) ? abs : abs + 1;
    }

    public boolean d() {
        return e() < 0;
    }

    public long e() {
        return this.f137207a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16213a aVar = (C16213a) obj;
        if (this.f137208b == aVar.f137208b && this.f137207a == aVar.f137207a) {
            return Objects.equals(this.f137209c, aVar.f137209c);
        }
        return false;
    }

    public long f() {
        return this.f137208b;
    }

    public void g(long j10) {
        this.f137208b = j10;
    }

    public void h(long j10) {
        this.f137207a = j10;
    }

    public int hashCode() {
        return ((((Long.hashCode(this.f137208b) + 31) * 31) + Long.hashCode(this.f137207a)) * 31) + Objects.hashCode(this.f137209c);
    }

    public void i(g gVar) {
        this.f137209c = gVar;
    }

    public String toString() {
        return "DurationImpl [" + this.f137207a + " " + this.f137209c + ", delta=" + this.f137208b + "]";
    }
}
