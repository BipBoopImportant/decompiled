package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0005H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ikea/kompassmap/model/product/CashCarry;", "", "unitOfMeasure", "", "quantity", "", "probabilityThisDay", "Lcom/ikea/kompassmap/model/product/ProbabilityThisDay;", "<init>", "(Ljava/lang/String;ILcom/ikea/kompassmap/model/product/ProbabilityThisDay;)V", "getUnitOfMeasure", "()Ljava/lang/String;", "getQuantity", "()I", "getProbabilityThisDay", "()Lcom/ikea/kompassmap/model/product/ProbabilityThisDay;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CashCarry {
    public static final int $stable = 0;
    private final ProbabilityThisDay probabilityThisDay;
    private final int quantity;
    private final String unitOfMeasure;

    public CashCarry(String str, int i10, ProbabilityThisDay probabilityThisDay2) {
        C17542s.j(str, "unitOfMeasure");
        C17542s.j(probabilityThisDay2, "probabilityThisDay");
        this.unitOfMeasure = str;
        this.quantity = i10;
        this.probabilityThisDay = probabilityThisDay2;
    }

    public static /* synthetic */ CashCarry copy$default(CashCarry cashCarry, String str, int i10, ProbabilityThisDay probabilityThisDay2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cashCarry.unitOfMeasure;
        }
        if ((i11 & 2) != 0) {
            i10 = cashCarry.quantity;
        }
        if ((i11 & 4) != 0) {
            probabilityThisDay2 = cashCarry.probabilityThisDay;
        }
        return cashCarry.copy(str, i10, probabilityThisDay2);
    }

    public final String component1() {
        return this.unitOfMeasure;
    }

    public final int component2() {
        return this.quantity;
    }

    public final ProbabilityThisDay component3() {
        return this.probabilityThisDay;
    }

    public final CashCarry copy(String str, int i10, ProbabilityThisDay probabilityThisDay2) {
        C17542s.j(str, "unitOfMeasure");
        C17542s.j(probabilityThisDay2, "probabilityThisDay");
        return new CashCarry(str, i10, probabilityThisDay2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCarry)) {
            return false;
        }
        CashCarry cashCarry = (CashCarry) obj;
        return C17542s.e(this.unitOfMeasure, cashCarry.unitOfMeasure) && this.quantity == cashCarry.quantity && C17542s.e(this.probabilityThisDay, cashCarry.probabilityThisDay);
    }

    public final ProbabilityThisDay getProbabilityThisDay() {
        return this.probabilityThisDay;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    public int hashCode() {
        return (((this.unitOfMeasure.hashCode() * 31) + Integer.hashCode(this.quantity)) * 31) + this.probabilityThisDay.hashCode();
    }

    public String toString() {
        return "CashCarry(unitOfMeasure=" + this.unitOfMeasure + ", quantity=" + this.quantity + ", probabilityThisDay=" + this.probabilityThisDay + ')';
    }
}
