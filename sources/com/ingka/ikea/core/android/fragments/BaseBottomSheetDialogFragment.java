package com.ingka.ikea.core.android.fragments;

import XH.C16807N;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.DialogFragment;
import jC.C14614a;
import jC.C14615b;
import jC.h;
import jC.p;
import jC.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0012\u001a\u00020\t*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0015\u001a\u00020\t*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0018\u001a\u00020\t*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001d\u001a\u00020\t2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\r8\u0014XD¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001b8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b \u0010$R\u0014\u0010'\u001a\u00020\r8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0014\u0010+\u001a\u00020(8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "LjC/h;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/fragment/app/t;", "", "drawUnderStatusBar", "drawUnderNavigationBar", "drawUnderDisplayCutout", "handleImeInsets", "a0", "(Landroidx/fragment/app/t;ZZZZ)V", "Landroidx/fragment/app/o;", "c0", "(Landroidx/fragment/app/o;ZZZZ)V", "Landroidx/fragment/app/DialogFragment;", "d", "(Landroidx/fragment/app/DialogFragment;ZZZZ)V", "Lkotlin/Function1;", "LjC/q;", "block", "b", "(LnI/l;)V", "K", "Z", "v0", "()Z", "drawUnderSystemBars", "()LjC/q;", "systemUi", "j0", "isSystemUiInstalled", "LjC/a;", "e0", "()LjC/a;", "drawUnderConfig", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseBottomSheetDialogFragment extends Hilt_BaseBottomSheetDialogFragment implements h {

    /* renamed from: J  reason: collision with root package name */
    private final /* synthetic */ h f94839J = p.a();

    /* renamed from: K  reason: collision with root package name */
    private final boolean f94840K;

    /* access modifiers changed from: private */
    public static final C16807N w0(q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        qVar.a().a(C14615b.c.f127858b);
        return C16807N.f139792a;
    }

    public q Z() {
        return this.f94839J.Z();
    }

    public void a0(C5191t tVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(tVar, "<this>");
        this.f94839J.a0(tVar, z10, z11, z12, z13);
    }

    public void b(C17642l<? super q, C16807N> lVar) {
        C17542s.j(lVar, "block");
        this.f94839J.b(lVar);
    }

    public void c0(C5187o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(oVar, "<this>");
        this.f94839J.c0(oVar, z10, z11, z12, z13);
    }

    public void d(DialogFragment dialogFragment, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(dialogFragment, "<this>");
        this.f94839J.d(dialogFragment, z10, z11, z12, z13);
    }

    public C14614a e0() {
        return this.f94839J.e0();
    }

    public boolean j0() {
        return this.f94839J.j0();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        h.a.a(this, this, v0(), false, false, false, 14, (Object) null);
        b(new a());
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f94840K;
    }
}
