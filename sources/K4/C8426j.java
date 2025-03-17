package k4;

import java.nio.ByteBuffer;
import t3.C5950a;
import y3.h;

/* renamed from: k4.j  reason: case insensitive filesystem */
public abstract class C8426j extends h<C8432p, q, C8429m> implements C8428l {

    /* renamed from: o  reason: collision with root package name */
    private final String f54107o;

    /* renamed from: k4.j$a */
    class a extends q {
        a() {
        }

        public void J() {
            C8426j.this.t(this);
        }
    }

    protected C8426j(String str) {
        super(new C8432p[2], new q[2]);
        this.f54107o = str;
        w(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final C8429m k(Throwable th2) {
        return new C8429m("Unexpected decode error", th2);
    }

    /* access modifiers changed from: protected */
    public abstract C8427k B(byte[] bArr, int i10, boolean z10);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final C8429m l(C8432p pVar, q qVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C5950a.e(pVar.f32279d);
            q qVar2 = qVar;
            qVar2.K(pVar.f32281f, B(byteBuffer.array(), byteBuffer.limit(), z10), pVar.f54123j);
            qVar.f32289d = false;
            return null;
        } catch (C8429m e10) {
            return e10;
        }
    }

    public void b(long j10) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C8432p i() {
        return new C8432p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final q j() {
        return new a();
    }
}
