package com.sugarcube.core.network.models;

import YH.C16877v;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/core/network/models/ParentDetails;", "", "type", "", "pos", "", "", "size", "rot", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getPos", "()Ljava/util/List;", "getSize", "getRot", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class ParentDetails {
    private final List<Double> pos;
    private final List<Double> rot;
    private final List<Double> size;
    private final String type;

    public ParentDetails() {
        this((String) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ParentDetails copy$default(ParentDetails parentDetails, String str, List<Double> list, List<Double> list2, List<Double> list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = parentDetails.type;
        }
        if ((i10 & 2) != 0) {
            list = parentDetails.pos;
        }
        if ((i10 & 4) != 0) {
            list2 = parentDetails.size;
        }
        if ((i10 & 8) != 0) {
            list3 = parentDetails.rot;
        }
        return parentDetails.copy(str, list, list2, list3);
    }

    public final String component1() {
        return this.type;
    }

    public final List<Double> component2() {
        return this.pos;
    }

    public final List<Double> component3() {
        return this.size;
    }

    public final List<Double> component4() {
        return this.rot;
    }

    public final ParentDetails copy(String str, List<Double> list, List<Double> list2, List<Double> list3) {
        C17542s.j(str, "type");
        C17542s.j(list, "pos");
        C17542s.j(list2, "size");
        C17542s.j(list3, "rot");
        return new ParentDetails(str, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentDetails)) {
            return false;
        }
        ParentDetails parentDetails = (ParentDetails) obj;
        return C17542s.e(this.type, parentDetails.type) && C17542s.e(this.pos, parentDetails.pos) && C17542s.e(this.size, parentDetails.size) && C17542s.e(this.rot, parentDetails.rot);
    }

    public final List<Double> getPos() {
        return this.pos;
    }

    public final List<Double> getRot() {
        return this.rot;
    }

    public final List<Double> getSize() {
        return this.size;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.pos.hashCode()) * 31) + this.size.hashCode()) * 31) + this.rot.hashCode();
    }

    public String toString() {
        String str = this.type;
        List<Double> list = this.pos;
        List<Double> list2 = this.size;
        List<Double> list3 = this.rot;
        return "ParentDetails(type=" + str + ", pos=" + list + ", size=" + list2 + ", rot=" + list3 + ")";
    }

    public ParentDetails(String str, List<Double> list, List<Double> list2, List<Double> list3) {
        C17542s.j(str, "type");
        C17542s.j(list, "pos");
        C17542s.j(list2, "size");
        C17542s.j(list3, "rot");
        this.type = str;
        this.pos = list;
        this.size = list2;
        this.rot = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParentDetails(String str, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)) : list, (i10 & 4) != 0 ? C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)) : list2, (i10 & 8) != 0 ? C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)) : list3);
    }
}
