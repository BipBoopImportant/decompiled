package r3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import r3.b;

public abstract class d implements b {

    /* renamed from: b  reason: collision with root package name */
    protected b.a f28650b;

    /* renamed from: c  reason: collision with root package name */
    protected b.a f28651c;

    /* renamed from: d  reason: collision with root package name */
    private b.a f28652d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f28653e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f28654f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f28655g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f28656h;

    public d() {
        ByteBuffer byteBuffer = b.f28643a;
        this.f28654f = byteBuffer;
        this.f28655g = byteBuffer;
        b.a aVar = b.a.f28644e;
        this.f28652d = aVar;
        this.f28653e = aVar;
        this.f28650b = aVar;
        this.f28651c = aVar;
    }

    public final void a() {
        flush();
        this.f28654f = b.f28643a;
        b.a aVar = b.a.f28644e;
        this.f28652d = aVar;
        this.f28653e = aVar;
        this.f28650b = aVar;
        this.f28651c = aVar;
        l();
    }

    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f28655g;
        this.f28655g = b.f28643a;
        return byteBuffer;
    }

    public boolean c() {
        return this.f28653e != b.a.f28644e;
    }

    public boolean d() {
        return this.f28656h && this.f28655g == b.f28643a;
    }

    public final b.a f(b.a aVar) {
        this.f28652d = aVar;
        this.f28653e = i(aVar);
        return c() ? this.f28653e : b.a.f28644e;
    }

    public final void flush() {
        this.f28655g = b.f28643a;
        this.f28656h = false;
        this.f28650b = this.f28652d;
        this.f28651c = this.f28653e;
        j();
    }

    public final void g() {
        this.f28656h = true;
        k();
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        return this.f28655g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    public abstract b.a i(b.a aVar);

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer m(int i10) {
        if (this.f28654f.capacity() < i10) {
            this.f28654f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f28654f.clear();
        }
        ByteBuffer byteBuffer = this.f28654f;
        this.f28655g = byteBuffer;
        return byteBuffer;
    }
}
