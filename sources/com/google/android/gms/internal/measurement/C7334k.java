package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k  reason: case insensitive filesystem */
public final class C7334k implements C7400s {

    /* renamed from: a  reason: collision with root package name */
    private final Double f48985a;

    public C7334k(Double d10) {
        if (d10 == null) {
            this.f48985a = Double.valueOf(Double.NaN);
        } else {
            this.f48985a = d10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7334k)) {
            return false;
        }
        return this.f48985a.equals(((C7334k) obj).f48985a);
    }

    public final Double h() {
        return this.f48985a;
    }

    public final int hashCode() {
        return this.f48985a.hashCode();
    }

    public final String i() {
        if (Double.isNaN(this.f48985a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f48985a.doubleValue())) {
            return this.f48985a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.f48985a.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : C7325j.a(valueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final C7400s k(String str, C7275d3 d3Var, List<C7400s> list) {
        if ("toString".equals(str)) {
            return new C7416u(i());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{i(), str}));
    }

    public final String toString() {
        return i();
    }

    public final C7400s zzc() {
        return new C7334k(this.f48985a);
    }

    public final Boolean zzd() {
        return Boolean.valueOf(!Double.isNaN(this.f48985a.doubleValue()) && this.f48985a.doubleValue() != 0.0d);
    }

    public final Iterator<C7400s> zzh() {
        return null;
    }
}
