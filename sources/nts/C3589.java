package nts;

import java.util.Random;

/* renamed from: nts.Щ  reason: contains not printable characters */
public class C3589 {

    /* renamed from: ગ  reason: contains not printable characters */
    public static Random f332 = new Random();

    /* renamed from: ഇ  reason: contains not printable characters */
    public static char[] f333 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m345(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(f333[(bArr[i10] & 255) >> 4]);
            sb2.append(f333[bArr[i10] & 15]);
        }
        return sb2.toString();
    }
}
