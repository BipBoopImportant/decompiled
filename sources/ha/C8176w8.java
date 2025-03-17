package ha;

import K9.C6620s;
import hc.C9771d;
import java.io.UnsupportedEncodingException;

/* renamed from: ha.w8  reason: case insensitive filesystem */
public final class C8176w8 implements C8027h8 {

    /* renamed from: a  reason: collision with root package name */
    private final C8015g6 f52883a;

    /* renamed from: b  reason: collision with root package name */
    private D7 f52884b = new D7();

    /* renamed from: c  reason: collision with root package name */
    private final int f52885c;

    private C8176w8(C8015g6 g6Var, int i10) {
        this.f52883a = g6Var;
        F8.a();
        this.f52885c = i10;
    }

    public static C8027h8 d(C8015g6 g6Var) {
        return new C8176w8(g6Var, 0);
    }

    public static C8027h8 e(C8015g6 g6Var, int i10) {
        return new C8176w8(g6Var, 1);
    }

    public final C8027h8 a(D7 d72) {
        this.f52884b = d72;
        return this;
    }

    public final byte[] b(int i10, boolean z10) {
        this.f52884b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f52884b.e(Boolean.FALSE);
        this.f52883a.i(this.f52884b.m());
        try {
            F8.a();
            if (i10 == 0) {
                return new C9771d().j(C7974c5.f52465a).k(true).i().b(this.f52883a.j()).getBytes("utf-8");
            }
            C8035i6 j10 = this.f52883a.j();
            W0 w02 = new W0();
            C7974c5.f52465a.a(w02);
            return w02.b().a(j10);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    public final C8027h8 c(C8005f6 f6Var) {
        this.f52883a.f(f6Var);
        return this;
    }

    public final int zza() {
        return this.f52885c;
    }

    public final String zzd() {
        F7 g10 = this.f52883a.j().g();
        return (g10 == null || C8177x.b(g10.k())) ? "NA" : (String) C6620s.l(g10.k());
    }
}
