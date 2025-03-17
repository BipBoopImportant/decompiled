package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class c {

    /* renamed from: e  reason: collision with root package name */
    protected static final Comparator<byte[]> f46252e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<byte[]> f46253a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<byte[]> f46254b = new ArrayList(64);

    /* renamed from: c  reason: collision with root package name */
    private int f46255c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final int f46256d;

    class a implements Comparator<byte[]> {
        a() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f46256d = i10;
    }

    private synchronized void c() {
        while (this.f46255c > this.f46256d) {
            byte[] remove = this.f46253a.remove(0);
            this.f46254b.remove(remove);
            this.f46255c -= remove.length;
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f46254b.size(); i11++) {
            byte[] bArr = this.f46254b.get(i11);
            if (bArr.length >= i10) {
                this.f46255c -= bArr.length;
                this.f46254b.remove(i11);
                this.f46253a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f46256d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f46253a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f46254b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f46252e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f46254b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f46255c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f46255c = r0     // Catch:{ all -> 0x002b }
            r2.c()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.c.b(byte[]):void");
    }
}
