package com.sugarcube.app.base.data.model;

import com.sugarcube.core.network.models.AuthType;
import com.sugarcube.core.network.models.Composition;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/app/base/data/model/PendingComposition;", "", "composition", "Lcom/sugarcube/core/network/models/Composition;", "pendingAction", "Lcom/sugarcube/core/network/models/AuthType;", "pendingActionHandled", "", "<init>", "(Lcom/sugarcube/core/network/models/Composition;Lcom/sugarcube/core/network/models/AuthType;Z)V", "getComposition", "()Lcom/sugarcube/core/network/models/Composition;", "getPendingAction", "()Lcom/sugarcube/core/network/models/AuthType;", "getPendingActionHandled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PendingComposition {
    public static final int $stable = 8;
    private final Composition composition;
    private final AuthType pendingAction;
    private final boolean pendingActionHandled;

    public PendingComposition(Composition composition2, AuthType authType, boolean z10) {
        C17542s.j(composition2, "composition");
        C17542s.j(authType, "pendingAction");
        this.composition = composition2;
        this.pendingAction = authType;
        this.pendingActionHandled = z10;
    }

    public static /* synthetic */ PendingComposition copy$default(PendingComposition pendingComposition, Composition composition2, AuthType authType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            composition2 = pendingComposition.composition;
        }
        if ((i10 & 2) != 0) {
            authType = pendingComposition.pendingAction;
        }
        if ((i10 & 4) != 0) {
            z10 = pendingComposition.pendingActionHandled;
        }
        return pendingComposition.copy(composition2, authType, z10);
    }

    public final Composition component1() {
        return this.composition;
    }

    public final AuthType component2() {
        return this.pendingAction;
    }

    public final boolean component3() {
        return this.pendingActionHandled;
    }

    public final PendingComposition copy(Composition composition2, AuthType authType, boolean z10) {
        C17542s.j(composition2, "composition");
        C17542s.j(authType, "pendingAction");
        return new PendingComposition(composition2, authType, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingComposition)) {
            return false;
        }
        PendingComposition pendingComposition = (PendingComposition) obj;
        return C17542s.e(this.composition, pendingComposition.composition) && this.pendingAction == pendingComposition.pendingAction && this.pendingActionHandled == pendingComposition.pendingActionHandled;
    }

    public final Composition getComposition() {
        return this.composition;
    }

    public final AuthType getPendingAction() {
        return this.pendingAction;
    }

    public final boolean getPendingActionHandled() {
        return this.pendingActionHandled;
    }

    public int hashCode() {
        return (((this.composition.hashCode() * 31) + this.pendingAction.hashCode()) * 31) + Boolean.hashCode(this.pendingActionHandled);
    }

    public String toString() {
        Composition composition2 = this.composition;
        AuthType authType = this.pendingAction;
        boolean z10 = this.pendingActionHandled;
        return "PendingComposition(composition=" + composition2 + ", pendingAction=" + authType + ", pendingActionHandled=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PendingComposition(Composition composition2, AuthType authType, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(composition2, authType, (i10 & 4) != 0 ? false : z10);
    }
}
