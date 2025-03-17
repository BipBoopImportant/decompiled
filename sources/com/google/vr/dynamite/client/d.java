package com.google.vr.dynamite.client;

import java.util.Objects;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f69439a;

    /* renamed from: b  reason: collision with root package name */
    private final String f69440b;

    public d(String str, String str2) {
        this.f69439a = str;
        this.f69440b = str2;
    }

    public final String a() {
        return this.f69439a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return Objects.equals(this.f69439a, dVar.f69439a) && Objects.equals(this.f69440b, dVar.f69440b);
        }
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f69439a) * 37) + Objects.hashCode(this.f69440b);
    }

    public final String toString() {
        return "[packageName=" + this.f69439a + ",libraryName=" + this.f69440b + "]";
    }
}
