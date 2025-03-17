package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ikea/kompassmap/model/product/ProbabilityThisDay;", "", "message", "", "colour", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getColour", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProbabilityThisDay {
    public static final int $stable = 0;
    private final String colour;
    private final String message;

    public ProbabilityThisDay(String str, String str2) {
        C17542s.j(str, "message");
        C17542s.j(str2, "colour");
        this.message = str;
        this.colour = str2;
    }

    public static /* synthetic */ ProbabilityThisDay copy$default(ProbabilityThisDay probabilityThisDay, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = probabilityThisDay.message;
        }
        if ((i10 & 2) != 0) {
            str2 = probabilityThisDay.colour;
        }
        return probabilityThisDay.copy(str, str2);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.colour;
    }

    public final ProbabilityThisDay copy(String str, String str2) {
        C17542s.j(str, "message");
        C17542s.j(str2, "colour");
        return new ProbabilityThisDay(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProbabilityThisDay)) {
            return false;
        }
        ProbabilityThisDay probabilityThisDay = (ProbabilityThisDay) obj;
        return C17542s.e(this.message, probabilityThisDay.message) && C17542s.e(this.colour, probabilityThisDay.colour);
    }

    public final String getColour() {
        return this.colour;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.colour.hashCode();
    }

    public String toString() {
        return "ProbabilityThisDay(message=" + this.message + ", colour=" + this.colour + ')';
    }
}
