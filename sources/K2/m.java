package k2;

public class m extends d {

    /* renamed from: d  reason: collision with root package name */
    double f25111d;

    /* renamed from: e  reason: collision with root package name */
    double f25112e;

    m(String str) {
        this.f25049a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f25111d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i10 = indexOf2 + 1;
        this.f25112e = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    private double d(double d10) {
        double d11 = this.f25112e;
        if (d10 < d11) {
            double d12 = this.f25111d;
            return ((d12 * d11) * d11) / ((((d11 - d10) * d12) + d10) * ((d12 * (d11 - d10)) + d10));
        }
        double d13 = this.f25111d;
        return (((d11 - 1.0d) * d13) * (d11 - 1.0d)) / (((((-d13) * (d11 - d10)) - d10) + 1.0d) * ((((-d13) * (d11 - d10)) - d10) + 1.0d));
    }

    private double e(double d10) {
        double d11 = this.f25112e;
        return d10 < d11 ? (d11 * d10) / (d10 + (this.f25111d * (d11 - d10))) : ((1.0d - d11) * (d10 - 1.0d)) / ((1.0d - d10) - (this.f25111d * (d11 - d10)));
    }

    public double a(double d10) {
        return e(d10);
    }

    public double b(double d10) {
        return d(d10);
    }
}
