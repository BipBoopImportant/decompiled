package D3;

import D3.c;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.media3.exoplayer.v0;
import java.io.IOException;
import java.nio.ByteBuffer;
import q3.A;
import q3.B;
import q3.C5807s;
import t3.C5950a;
import t3.N;
import w3.C6219c;
import y3.f;
import y3.h;

/* renamed from: D3.a  reason: case insensitive filesystem */
public final class C6426a extends h<f, e, d> implements c {

    /* renamed from: o  reason: collision with root package name */
    private final b f33813o;

    /* renamed from: D3.a$a  reason: collision with other inner class name */
    class C0519a extends e {
        C0519a() {
        }

        public void J() {
            C6426a.this.t(this);
        }
    }

    /* renamed from: D3.a$b */
    public interface b {
        Bitmap a(byte[] bArr, int i10);
    }

    /* renamed from: D3.a$c */
    public static final class c implements c.a {

        /* renamed from: b  reason: collision with root package name */
        private final b f33815b = new b();

        public int b(C5807s sVar) {
            String str = sVar.f28244o;
            return (str == null || !A.o(str)) ? v0.v(0) : N.C0(sVar.f28244o) ? v0.v(4) : v0.v(1);
        }

        /* renamed from: d */
        public C6426a a() {
            return new C6426a(this.f33815b, (C0519a) null);
        }
    }

    /* synthetic */ C6426a(b bVar, C0519a aVar) {
        this(bVar);
    }

    /* access modifiers changed from: private */
    public static Bitmap C(byte[] bArr, int i10) {
        try {
            return C6219c.a(bArr, i10, (BitmapFactory.Options) null, -1);
        } catch (B e10) {
            throw new d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new d((Throwable) e11);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public d k(Throwable th2) {
        return new d("Unexpected decode error", th2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public d l(f fVar, e eVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C5950a.e(fVar.f32279d);
            C5950a.g(byteBuffer.hasArray());
            C5950a.a(byteBuffer.arrayOffset() == 0);
            eVar.f33817e = this.f33813o.a(byteBuffer.array(), byteBuffer.remaining());
            eVar.f32287b = fVar.f32281f;
            return null;
        } catch (d e10) {
            return e10;
        }
    }

    public /* bridge */ /* synthetic */ e a() {
        return (e) super.a();
    }

    /* access modifiers changed from: protected */
    public f i() {
        return new f(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public e j() {
        return new C0519a();
    }

    private C6426a(b bVar) {
        super(new f[1], new e[1]);
        this.f33813o = bVar;
    }
}
