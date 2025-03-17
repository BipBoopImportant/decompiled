package G9;

import java.lang.ref.WeakReference;

abstract class q extends o {

    /* renamed from: i  reason: collision with root package name */
    private static final WeakReference f36326i = new WeakReference((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f36327b = f36326i;

    q(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] L3() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f36327b.get();
                if (bArr == null) {
                    bArr = M3();
                    this.f36327b = new WeakReference(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] M3();
}
