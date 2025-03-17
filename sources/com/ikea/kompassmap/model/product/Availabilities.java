package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ikea/kompassmap/model/product/Availabilities;", "", "availableForCashCarry", "", "cashCarry", "Lcom/ikea/kompassmap/model/product/CashCarry;", "<init>", "(ZLcom/ikea/kompassmap/model/product/CashCarry;)V", "getAvailableForCashCarry", "()Z", "getCashCarry", "()Lcom/ikea/kompassmap/model/product/CashCarry;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Availabilities {
    public static final int $stable = 0;
    private final boolean availableForCashCarry;
    private final CashCarry cashCarry;

    public Availabilities(boolean z10, CashCarry cashCarry2) {
        this.availableForCashCarry = z10;
        this.cashCarry = cashCarry2;
    }

    public static /* synthetic */ Availabilities copy$default(Availabilities availabilities, boolean z10, CashCarry cashCarry2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = availabilities.availableForCashCarry;
        }
        if ((i10 & 2) != 0) {
            cashCarry2 = availabilities.cashCarry;
        }
        return availabilities.copy(z10, cashCarry2);
    }

    public final boolean component1() {
        return this.availableForCashCarry;
    }

    public final CashCarry component2() {
        return this.cashCarry;
    }

    public final Availabilities copy(boolean z10, CashCarry cashCarry2) {
        return new Availabilities(z10, cashCarry2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Availabilities)) {
            return false;
        }
        Availabilities availabilities = (Availabilities) obj;
        return this.availableForCashCarry == availabilities.availableForCashCarry && C17542s.e(this.cashCarry, availabilities.cashCarry);
    }

    public final boolean getAvailableForCashCarry() {
        return this.availableForCashCarry;
    }

    public final CashCarry getCashCarry() {
        return this.cashCarry;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.availableForCashCarry) * 31;
        CashCarry cashCarry2 = this.cashCarry;
        return hashCode + (cashCarry2 == null ? 0 : cashCarry2.hashCode());
    }

    public String toString() {
        return "Availabilities(availableForCashCarry=" + this.availableForCashCarry + ", cashCarry=" + this.cashCarry + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Availabilities(boolean z10, CashCarry cashCarry2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : cashCarry2);
    }
}
