package Qb;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: Qb.h  reason: case insensitive filesystem */
class C9250h {

    /* renamed from: b  reason: collision with root package name */
    private static final String f62981b = C9251i.z(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicLong f62982c = new AtomicLong(0);

    /* renamed from: a  reason: collision with root package name */
    private final String f62983a;

    C9250h() {
        byte[] bArr = new byte[10];
        f(bArr);
        e(bArr);
        d(bArr);
        String t10 = C9251i.t(bArr);
        Locale locale = Locale.US;
        this.f62983a = String.format(locale, "%s%s%s%s", new Object[]{t10.substring(0, 12), t10.substring(12, 16), t10.subSequence(16, 20), f62981b.substring(0, 12)}).toUpperCase(locale);
    }

    private static byte[] a(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] b(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j10));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void d(byte[] bArr) {
        byte[] b10 = b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b10[0];
        bArr[9] = b10[1];
    }

    private void e(byte[] bArr) {
        byte[] b10 = b(f62982c.incrementAndGet());
        bArr[6] = b10[0];
        bArr[7] = b10[1];
    }

    private void f(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a10 = a(time / 1000);
        bArr[0] = a10[0];
        bArr[1] = a10[1];
        bArr[2] = a10[2];
        bArr[3] = a10[3];
        byte[] b10 = b(time % 1000);
        bArr[4] = b10[0];
        bArr[5] = b10[1];
    }

    public String c() {
        return this.f62983a;
    }

    public String toString() {
        return this.f62983a;
    }
}
