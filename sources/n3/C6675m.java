package N3;

import N3.O;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import q3.C5799j;
import q3.C5807s;
import t3.B;

/* renamed from: N3.m  reason: case insensitive filesystem */
public final class C6675m implements O {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f38916a = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];

    public void b(B b10, int i10, int i11) {
        b10.X(i10);
    }

    public void c(long j10, int i10, int i11, int i12, O.a aVar) {
    }

    public void e(C5807s sVar) {
    }

    public int f(C5799j jVar, int i10, boolean z10, int i11) {
        int c10 = jVar.c(this.f38916a, 0, Math.min(this.f38916a.length, i10));
        if (c10 != -1) {
            return c10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
