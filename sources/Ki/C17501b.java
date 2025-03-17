package kI;

import YH.C16870n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001a\u0010\t\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u001a\u0010\u000e\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u0012\u0004\b\r\u0010\b¨\u0006\u000f"}, d2 = {"", "a", "[B", "base64EncodeMap", "", "b", "[I", "getBase64DecodeMap$annotations", "()V", "base64DecodeMap", "c", "base64UrlEncodeMap", "d", "getBase64UrlDecodeMap$annotations", "base64UrlDecodeMap", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kI.b  reason: case insensitive filesystem */
public final class C17501b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f144257a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f144258b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f144259c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f144260d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f144257a = bArr;
        int[] iArr = new int[256];
        int i10 = 0;
        C16870n.y(iArr, -1, 0, 0, 6, (Object) null);
        iArr[61] = -2;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            iArr[bArr[i11]] = i12;
            i11++;
            i12++;
        }
        f144258b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f144259c = bArr2;
        int[] iArr2 = new int[256];
        C16870n.y(iArr2, -1, 0, 0, 6, (Object) null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i13 = 0;
        while (i10 < length2) {
            iArr2[bArr2[i10]] = i13;
            i10++;
            i13++;
        }
        f144260d = iArr2;
    }
}
