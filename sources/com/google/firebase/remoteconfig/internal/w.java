package com.google.firebase.remoteconfig.internal;

import Ic.n;
import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;

public class w implements n {

    /* renamed from: a  reason: collision with root package name */
    private final String f68849a;

    /* renamed from: b  reason: collision with root package name */
    private final int f68850b;

    w(String str, int i10) {
        this.f68849a = str;
        this.f68850b = i10;
    }

    private String e() {
        return a().trim();
    }

    private void f() {
        if (this.f68849a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    public String a() {
        if (this.f68850b == 0) {
            return "";
        }
        f();
        return this.f68849a;
    }

    public long b() {
        if (this.f68850b == 0) {
            return 0;
        }
        String e10 = e();
        try {
            return Long.valueOf(e10).longValue();
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{e10, Constants.LONG}), e11);
        }
    }

    public double c() {
        if (this.f68850b == 0) {
            return 0.0d;
        }
        String e10 = e();
        try {
            return Double.valueOf(e10).doubleValue();
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{e10, FeatureVariable.DOUBLE_TYPE}), e11);
        }
    }

    public boolean d() {
        if (this.f68850b == 0) {
            return false;
        }
        String e10 = e();
        if (o.f68788f.matcher(e10).matches()) {
            return true;
        }
        if (o.f68789g.matcher(e10).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{e10, FeatureVariable.BOOLEAN_TYPE}));
    }

    public int i() {
        return this.f68850b;
    }
}
