package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ikea/kompassmap/model/product/Name;", "", "id", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Name {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final String f69443id;
    private final String name;

    public Name(String str, String str2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        this.f69443id = str;
        this.name = str2;
    }

    public static /* synthetic */ Name copy$default(Name name2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = name2.f69443id;
        }
        if ((i10 & 2) != 0) {
            str2 = name2.name;
        }
        return name2.copy(str, str2);
    }

    public final String component1() {
        return this.f69443id;
    }

    public final String component2() {
        return this.name;
    }

    public final Name copy(String str, String str2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        return new Name(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name2 = (Name) obj;
        return C17542s.e(this.f69443id, name2.f69443id) && C17542s.e(this.name, name2.name);
    }

    public final String getId() {
        return this.f69443id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.f69443id.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "Name(id=" + this.f69443id + ", name=" + this.name + ')';
    }
}
