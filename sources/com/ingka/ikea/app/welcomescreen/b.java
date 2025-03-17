package com.ingka.ikea.app.welcomescreen;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.f;
import uI.C18055d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR!\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/app/welcomescreen/b;", "", "", "Low/f;", "navigationTabItems", "", "", "stringRoutes", "LuI/d;", "typeSafeRoutes", "<init>", "(Ljava/util/Set;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f92860a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f92861b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C18055d<?>> f92862c;

    public b(Set<? extends f> set, List<String> list, List<? extends C18055d<?>> list2) {
        C17542s.j(set, "navigationTabItems");
        C17542s.j(list, "stringRoutes");
        C17542s.j(list2, "typeSafeRoutes");
        this.f92860a = set;
        this.f92861b = list;
        this.f92862c = list2;
    }

    public final Set<f> a() {
        return this.f92860a;
    }

    public final List<String> b() {
        return this.f92861b;
    }

    public final List<C18055d<?>> c() {
        return this.f92862c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f92860a, bVar.f92860a) && C17542s.e(this.f92861b, bVar.f92861b) && C17542s.e(this.f92862c, bVar.f92862c);
    }

    public int hashCode() {
        return (((this.f92860a.hashCode() * 31) + this.f92861b.hashCode()) * 31) + this.f92862c.hashCode();
    }

    public String toString() {
        Set<f> set = this.f92860a;
        List<String> list = this.f92861b;
        List<C18055d<?>> list2 = this.f92862c;
        return "NavigationTabHolder(navigationTabItems=" + set + ", stringRoutes=" + list + ", typeSafeRoutes=" + list2 + ")";
    }
}
