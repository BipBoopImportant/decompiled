package com.ingka.ikea.core.android.activities;

import XH.C16807N;
import YC.C13858c;
import Zo.a;
import android.os.Bundle;
import androidx.appcompat.app.g;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.DialogFragment;
import jC.C14614a;
import jC.h;
import jC.p;
import jC.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0010\u001a\u00020\u0007*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0016\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001b\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\f\u001a\u00020\u000b8\u0014XD¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\r\u001a\u00020\u000b8\u0014XD¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001a\u0010\u000e\u001a\u00020\u000b8\u0014XD¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u001a\u0010\u000f\u001a\u00020\u000b8\u0014XD¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0014\u00108\u001a\u00020\u00198\u0016X\u0005¢\u0006\u0006\u001a\u0004\b.\u00107R\u0014\u0010:\u001a\u00020\u000b8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b9\u00100R\u0014\u0010>\u001a\u00020;8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/ingka/ikea/core/android/activities/BaseLocaleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LjC/h;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/fragment/app/t;", "", "drawUnderStatusBar", "drawUnderNavigationBar", "drawUnderDisplayCutout", "handleImeInsets", "a0", "(Landroidx/fragment/app/t;ZZZZ)V", "Landroidx/fragment/app/o;", "c0", "(Landroidx/fragment/app/o;ZZZZ)V", "Landroidx/fragment/app/DialogFragment;", "d", "(Landroidx/fragment/app/DialogFragment;ZZZZ)V", "Lkotlin/Function1;", "LjC/q;", "block", "b", "(LnI/l;)V", "LZo/a;", "A", "LZo/a;", "w0", "()LZo/a;", "setApplicationLocale", "(LZo/a;)V", "applicationLocale", "LIl/a;", "B", "LIl/a;", "v0", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "C", "Z", "z0", "()Z", "D", "y0", "E", "x0", "F", "A0", "()LjC/q;", "systemUi", "j0", "isSystemUiInstalled", "LjC/a;", "e0", "()LjC/a;", "drawUnderConfig", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseLocaleActivity extends Hilt_BaseLocaleActivity implements h {

    /* renamed from: A  reason: collision with root package name */
    public a f94816A;

    /* renamed from: B  reason: collision with root package name */
    public Il.a f94817B;

    /* renamed from: C  reason: collision with root package name */
    private final boolean f94818C = true;

    /* renamed from: D  reason: collision with root package name */
    private final boolean f94819D;

    /* renamed from: E  reason: collision with root package name */
    private final boolean f94820E;

    /* renamed from: F  reason: collision with root package name */
    private final boolean f94821F;

    /* renamed from: z  reason: collision with root package name */
    private final /* synthetic */ h f94822z = p.a();

    /* access modifiers changed from: protected */
    public boolean A0() {
        return this.f94821F;
    }

    public q Z() {
        return this.f94822z.Z();
    }

    public void a0(C5191t tVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(tVar, "<this>");
        this.f94822z.a0(tVar, z10, z11, z12, z13);
    }

    public void b(C17642l<? super q, C16807N> lVar) {
        C17542s.j(lVar, "block");
        this.f94822z.b(lVar);
    }

    public void c0(C5187o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(oVar, "<this>");
        this.f94822z.c0(oVar, z10, z11, z12, z13);
    }

    public void d(DialogFragment dialogFragment, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(dialogFragment, "<this>");
        this.f94822z.d(dialogFragment, z10, z11, z12, z13);
    }

    public C14614a e0() {
        return this.f94822z.e0();
    }

    public boolean j0() {
        return this.f94822z.j0();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        g.R(true);
        if (!C13858c.a(this)) {
            g.V(1);
        }
        super.onCreate(bundle);
        w0().a(v0());
        a0(this, z0(), y0(), x0(), A0());
    }

    public final Il.a v0() {
        Il.a aVar = this.f94817B;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public final a w0() {
        a aVar = this.f94816A;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("applicationLocale");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean x0() {
        return this.f94820E;
    }

    /* access modifiers changed from: protected */
    public boolean y0() {
        return this.f94819D;
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return this.f94818C;
    }
}
