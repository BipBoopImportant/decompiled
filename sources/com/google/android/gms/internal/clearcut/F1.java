package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

abstract class F1 {
    F1() {
    }

    static void d(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i11 = 0;
        while (i11 < length) {
            try {
                char charAt = charSequence.charAt(i11);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i11, (byte) charAt);
                i11++;
            } catch (IndexOutOfBoundsException unused) {
                char charAt2 = charSequence.charAt(i11);
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Failed writing ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1));
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
        }
        if (i11 == length) {
            byteBuffer.position(position + i11);
            return;
        }
        position += i11;
        while (i11 < length) {
            char charAt3 = charSequence.charAt(i11);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                i10 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i10, (byte) ((charAt3 & '?') | 128));
                    position = i10;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i10;
                    char charAt22 = charSequence.charAt(i11);
                    StringBuilder sb22 = new StringBuilder(37);
                    sb22.append("Failed writing ");
                    sb22.append(charAt22);
                    sb22.append(" at index ");
                    sb22.append(byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1));
                    throw new ArrayIndexOutOfBoundsException(sb22.toString());
                }
            } else if (charAt3 < 55296 || 57343 < charAt3) {
                i10 = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> 12) | 224));
                position += 2;
                byteBuffer.put(i10, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            } else {
                int i12 = i11 + 1;
                if (i12 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            int i13 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                int i14 = position + 2;
                                try {
                                    byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i14, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } catch (IndexOutOfBoundsException unused3) {
                                    i11 = i12;
                                    position = i14;
                                    char charAt222 = charSequence.charAt(i11);
                                    StringBuilder sb222 = new StringBuilder(37);
                                    sb222.append("Failed writing ");
                                    sb222.append(charAt222);
                                    sb222.append(" at index ");
                                    sb222.append(byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1));
                                    throw new ArrayIndexOutOfBoundsException(sb222.toString());
                                }
                            } catch (IndexOutOfBoundsException unused4) {
                                position = i13;
                                i11 = i12;
                                char charAt2222 = charSequence.charAt(i11);
                                StringBuilder sb2222 = new StringBuilder(37);
                                sb2222.append("Failed writing ");
                                sb2222.append(charAt2222);
                                sb2222.append(" at index ");
                                sb2222.append(byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1));
                                throw new ArrayIndexOutOfBoundsException(sb2222.toString());
                            }
                        } else {
                            i11 = i12;
                        }
                    } catch (IndexOutOfBoundsException unused5) {
                        i11 = i12;
                        char charAt22222 = charSequence.charAt(i11);
                        StringBuilder sb22222 = new StringBuilder(37);
                        sb22222.append("Failed writing ");
                        sb22222.append(charAt22222);
                        sb22222.append(" at index ");
                        sb22222.append(byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1));
                        throw new ArrayIndexOutOfBoundsException(sb22222.toString());
                    }
                }
                throw new H1(i11, length);
            }
            i11++;
            position++;
        }
        byteBuffer.position(position);
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i10, byte[] bArr, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void c(CharSequence charSequence, ByteBuffer byteBuffer);

    /* access modifiers changed from: package-private */
    public final boolean e(byte[] bArr, int i10, int i11) {
        return a(0, bArr, i10, i11) == 0;
    }
}
