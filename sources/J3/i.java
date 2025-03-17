package J3;

import J3.j;
import J3.l;
import java.io.FileNotFoundException;
import java.io.IOException;
import q3.B;
import w3.h;
import w3.q;

public class i implements j {

    /* renamed from: a  reason: collision with root package name */
    private final int f37295a;

    public i() {
        this(-1);
    }

    public long a(j.a aVar) {
        IOException iOException = aVar.f37298c;
        if ((iOException instanceof B) || (iOException instanceof FileNotFoundException) || (iOException instanceof q) || (iOException instanceof l.h) || h.a(iOException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((aVar.f37299d - 1) * 1000, 5000);
    }

    public int b(int i10) {
        int i11 = this.f37295a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    public i(int i10) {
        this.f37295a = i10;
    }
}
