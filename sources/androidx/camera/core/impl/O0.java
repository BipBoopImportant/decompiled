package androidx.camera.core.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class O0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16753a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<? extends N0>> f16754b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Class<? extends N0>> f16755c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f16756a = true;

        /* renamed from: b  reason: collision with root package name */
        private Set<Class<? extends N0>> f16757b;

        /* renamed from: c  reason: collision with root package name */
        private Set<Class<? extends N0>> f16758c;

        public O0 a() {
            return new O0(this.f16756a, this.f16757b, this.f16758c);
        }

        public b b(Set<Class<? extends N0>> set) {
            this.f16758c = new HashSet(set);
            return this;
        }

        public b c(Set<Class<? extends N0>> set) {
            this.f16757b = new HashSet(set);
            return this;
        }

        public b d(boolean z10) {
            this.f16756a = z10;
            return this;
        }
    }

    public static O0 b() {
        return new b().d(true).a();
    }

    public boolean a(Class<? extends N0> cls, boolean z10) {
        if (this.f16754b.contains(cls)) {
            return true;
        }
        if (this.f16755c.contains(cls)) {
            return false;
        }
        return this.f16753a && z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof O0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        O0 o02 = (O0) obj;
        return this.f16753a == o02.f16753a && Objects.equals(this.f16754b, o02.f16754b) && Objects.equals(this.f16755c, o02.f16755c);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f16753a), this.f16754b, this.f16755c});
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f16753a + ", forceEnabledQuirks=" + this.f16754b + ", forceDisabledQuirks=" + this.f16755c + '}';
    }

    private O0(boolean z10, Set<Class<? extends N0>> set, Set<Class<? extends N0>> set2) {
        this.f16753a = z10;
        this.f16754b = set == null ? Collections.emptySet() : new HashSet<>(set);
        this.f16755c = set2 == null ? Collections.emptySet() : new HashSet<>(set2);
    }
}
