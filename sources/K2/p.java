package k2;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class p extends d {

    /* renamed from: d  reason: collision with root package name */
    j f25134d;

    p(String str) {
        this.f25049a = str;
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i10 = 0;
        while (indexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.f25134d = d(Arrays.copyOf(dArr, i10 + 1));
    }

    private static j d(double[] dArr) {
        double[] dArr2 = dArr;
        int length = (dArr2.length * 3) - 2;
        int length2 = dArr2.length - 1;
        double d10 = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        double[] dArr4 = new double[length];
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            double d11 = dArr2[i10];
            int i11 = i10 + length2;
            dArr3[i11][0] = d11;
            double d12 = ((double) i10) * d10;
            dArr4[i11] = d12;
            if (i10 > 0) {
                int i12 = (length2 * 2) + i10;
                dArr3[i12][0] = d11 + 1.0d;
                dArr4[i12] = d12 + 1.0d;
                int i13 = i10 - 1;
                dArr3[i13][0] = (d11 - 1.0d) - d10;
                dArr4[i13] = (d12 - 4.0d) - d10;
            }
        }
        j jVar = new j(dArr4, dArr3);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + jVar.c(0.0d, 0));
        printStream.println(" 1 " + jVar.c(1.0d, 0));
        return jVar;
    }

    public double a(double d10) {
        return this.f25134d.c(d10, 0);
    }

    public double b(double d10) {
        return this.f25134d.k(d10, 0);
    }
}
