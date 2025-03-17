package com.ingka.ikea.app.ratingsandreviews.presentation;

import Oi.C10821f;
import Pi.c0;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import com.ingka.ikea.app.ratingsandreviews.navigation.WriteReviewRoute;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;
import rw.f;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/presentation/WriteReviewFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "", "X", "I", "destId", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WriteReviewFragment extends b {

    /* renamed from: X  reason: collision with root package name */
    private final int f91145X = WriteReviewRoute.Companion.a();

    /* access modifiers changed from: private */
    public static final C16807N H0(WriteReviewFragment writeReviewFragment) {
        C8951o f10 = f.f(writeReviewFragment, Integer.valueOf(writeReviewFragment.f91145X), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(1907475469);
        if (C4895p.J()) {
            C4895p.S(1907475469, i10, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.WriteReviewFragment.FragmentContent (WriteReviewFragment.kt:19)");
        }
        mVar.W(405605949);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && mVar.V(this)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = new C10821f(this);
            mVar.u(D10);
        }
        mVar.P();
        c0.j((Qi.f) null, (C17631a) D10, mVar, 0, 1);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
