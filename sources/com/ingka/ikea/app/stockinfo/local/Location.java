package com.ingka.ikea.app.stockinfo.local;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/local/Location;", "", "heading", "", "items", "", "Lcom/ingka/ikea/app/stockinfo/local/Item;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getHeading", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public final class Location {
    private final String heading;
    private final List<Item> items;

    public Location(String str, List<Item> list) {
        C17542s.j(str, "heading");
        C17542s.j(list, "items");
        this.heading = str;
        this.items = list;
    }

    public static /* synthetic */ Location copy$default(Location location, String str, List<Item> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = location.heading;
        }
        if ((i10 & 2) != 0) {
            list = location.items;
        }
        return location.copy(str, list);
    }

    public final String component1() {
        return this.heading;
    }

    public final List<Item> component2() {
        return this.items;
    }

    public final Location copy(String str, List<Item> list) {
        C17542s.j(str, "heading");
        C17542s.j(list, "items");
        return new Location(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return C17542s.e(this.heading, location.heading) && C17542s.e(this.items, location.items);
    }

    public final String getHeading() {
        return this.heading;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public int hashCode() {
        return (this.heading.hashCode() * 31) + this.items.hashCode();
    }

    public String toString() {
        String str = this.heading;
        List<Item> list = this.items;
        return "Location(heading=" + str + ", items=" + list + ")";
    }
}
