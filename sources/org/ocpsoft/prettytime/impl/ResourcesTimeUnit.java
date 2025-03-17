package org.ocpsoft.prettytime.impl;

import NL.g;

public abstract class ResourcesTimeUnit implements g {

    /* renamed from: d  reason: collision with root package name */
    private static long f146215d;

    /* renamed from: a  reason: collision with root package name */
    private long f146216a;

    /* renamed from: b  reason: collision with root package name */
    private long f146217b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f146218c = 1;

    public ResourcesTimeUnit() {
        long j10 = f146215d;
        f146215d = 1 + j10;
        this.f146216a = j10;
    }

    public long a() {
        return this.f146217b;
    }

    public long b() {
        return this.f146218c;
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "org.ocpsoft.prettytime.i18n.Resources";
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    public void e(long j10) {
        this.f146217b = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcesTimeUnit resourcesTimeUnit = (ResourcesTimeUnit) obj;
        if (this.f146217b != resourcesTimeUnit.f146217b) {
            return false;
        }
        return this.f146218c == resourcesTimeUnit.f146218c;
    }

    public void f(long j10) {
        this.f146218c = j10;
    }

    public int hashCode() {
        return 31 + Long.hashCode(this.f146216a);
    }

    public String toString() {
        return d();
    }
}
