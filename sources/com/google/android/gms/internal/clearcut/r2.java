package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class r2 {
    private static int a(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private static long b(long j10, long j11, long j12) {
        long j13 = (j10 ^ j11) * j12;
        long j14 = ((j13 ^ (j13 >>> 47)) ^ j11) * j12;
        return (j14 ^ (j14 >>> 47)) * j12;
    }

    public static long c(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("Out of bound index with offput: 0 and length: ");
            sb2.append(length);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        char c10 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j10 = ((long) (length << 1)) - 7286425919675154353L;
                long e10 = e(bArr2, 0) * -5435081209227447693L;
                long e11 = e(bArr2, 8);
                long e12 = e(bArr2, length - 8) * j10;
                return b(Long.rotateRight(e10 + e11, 43) + Long.rotateRight(e12, 30) + (e(bArr2, length - 16) * -7286425919675154353L), e10 + Long.rotateRight(e11 - 7286425919675154353L, 18) + e12, j10);
            } else if (length >= 8) {
                long j11 = ((long) (length << 1)) - 7286425919675154353L;
                long e13 = e(bArr2, 0) - 7286425919675154353L;
                long e14 = e(bArr2, length - 8);
                return b((Long.rotateRight(e14, 37) * j11) + e13, (Long.rotateRight(e13, 25) + e14) * j11, j11);
            } else if (length >= 4) {
                return b(((((long) a(bArr2, 0)) & 4294967295L) << 3) + ((long) length), ((long) a(bArr2, length - 4)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
            } else if (length <= 0) {
                return -7286425919675154353L;
            } else {
                long j12 = (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((bArr2[length - 1] & 255) << 2))) * -4348849565147123417L);
                return (j12 ^ (j12 >>> 47)) * -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j13 = ((long) (length << 1)) - 7286425919675154353L;
            long e15 = e(bArr2, 0) * -7286425919675154353L;
            long e16 = e(bArr2, 8);
            long e17 = e(bArr2, length - 8) * j13;
            long rotateRight = Long.rotateRight(e15 + e16, 43) + Long.rotateRight(e17, 30) + (e(bArr2, length - 16) * -7286425919675154353L);
            long b10 = b(rotateRight, e17 + e15 + Long.rotateRight(e16 - 7286425919675154353L, 18), j13);
            byte[] bArr3 = bArr;
            long e18 = e(bArr3, 16) * j13;
            long e19 = e(bArr3, 24);
            long e20 = (rotateRight + e(bArr3, length - 32)) * j13;
            return b(Long.rotateRight(e18 + e19, 43) + Long.rotateRight(e20, 30) + ((b10 + e(bArr3, length - 24)) * j13), e18 + Long.rotateRight(e19 + e15, 18) + e20, j13);
        } else {
            byte[] bArr4 = bArr2;
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long e21 = e(bArr4, 0) + 95310865018149119L;
            int i10 = length - 1;
            int i11 = (i10 / 64) << 6;
            int i12 = i10 & 63;
            int i13 = i11 + i12;
            int i14 = i13 - 63;
            long j14 = 2480279821605975764L;
            long j15 = 1390051526045402406L;
            int i15 = 0;
            while (true) {
                long rotateRight2 = (Long.rotateRight(((e21 + j14) + jArr[c10]) + e(bArr4, i15 + 8), 37) * -5435081209227447693L) ^ jArr2[1];
                long rotateRight3 = (Long.rotateRight(j14 + jArr[1] + e(bArr4, i15 + 48), 42) * -5435081209227447693L) + jArr[c10] + e(bArr4, i15 + 40);
                long rotateRight4 = Long.rotateRight(j15 + jArr2[c10], 33) * -5435081209227447693L;
                char c11 = c10;
                int i16 = i12;
                int i17 = i11;
                d(bArr, i15, jArr[1] * -5435081209227447693L, rotateRight2 + jArr2[c10], jArr);
                d(bArr, i15 + 32, rotateRight4 + jArr2[1], rotateRight3 + e(bArr4, i15 + 16), jArr2);
                int i18 = i15 + 64;
                if (i18 == i17) {
                    long j16 = -5435081209227447693L + ((rotateRight2 & 255) << 1);
                    long j17 = jArr2[c11] + ((long) i16);
                    jArr2[c11] = j17;
                    long j18 = jArr[c11] + j17;
                    jArr[c11] = j18;
                    jArr2[c11] = jArr2[c11] + j18;
                    long rotateRight5 = (Long.rotateRight(((rotateRight4 + rotateRight3) + jArr[c11]) + e(bArr4, i13 - 55), 37) * j16) ^ (jArr2[1] * 9);
                    long rotateRight6 = (Long.rotateRight(rotateRight3 + jArr[1] + e(bArr4, i13 - 15), 42) * j16) + (jArr[c11] * 9) + e(bArr4, i13 - 23);
                    long rotateRight7 = Long.rotateRight(rotateRight2 + jArr2[c11], 33) * j16;
                    d(bArr, i14, jArr[1] * j16, rotateRight5 + jArr2[c11], jArr);
                    d(bArr, i13 - 31, rotateRight7 + jArr2[1], e(bArr4, i13 - 47) + rotateRight6, jArr2);
                    long j19 = j16;
                    return b(b(jArr[c11], jArr2[c11], j19) + (((rotateRight6 >>> 47) ^ rotateRight6) * -4348849565147123417L) + rotateRight5, b(jArr[1], jArr2[1], j19) + rotateRight7, j19);
                }
                i15 = i18;
                i12 = i16;
                i11 = i17;
                c10 = c11;
                j14 = rotateRight3;
                long j20 = rotateRight2;
                e21 = rotateRight4;
                j15 = j20;
            }
        }
    }

    private static void d(byte[] bArr, int i10, long j10, long j11, long[] jArr) {
        long e10 = e(bArr, i10);
        long e11 = e(bArr, i10 + 8);
        long e12 = e(bArr, i10 + 16);
        long e13 = e(bArr, i10 + 24);
        long j12 = j10 + e10;
        long j13 = e11 + j12 + e12;
        jArr[0] = j13 + e13;
        jArr[1] = Long.rotateRight(j11 + j12 + e13, 21) + Long.rotateRight(j13, 44) + j12;
    }

    private static long e(byte[] bArr, int i10) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i10, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
