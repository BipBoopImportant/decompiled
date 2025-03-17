package androidx.appcompat.app;

import I2.C4634t;
import P4.g;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.activity.r;
import androidx.appcompat.view.b;
import androidx.lifecycle.l0;
import i.C5421a;

public class p extends r implements d {

    /* renamed from: d  reason: collision with root package name */
    private g f15560d;

    /* renamed from: e  reason: collision with root package name */
    private final C4634t.a f15561e = new o(this);

    public p(Context context, int i10) {
        super(context, f(context, i10));
        g e10 = e();
        e10.Y(f(context, i10));
        e10.G((Bundle) null);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5421a.f23871A, typedValue, true);
        return typedValue.resourceId;
    }

    private void g() {
        l0.b(getWindow().getDecorView(), this);
        g.b(getWindow().getDecorView(), this);
        C.b(getWindow().getDecorView(), this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().f(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        e().H();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C4634t.e(this.f15561e, getWindow().getDecorView(), this, keyEvent);
    }

    public g e() {
        if (this.f15560d == null) {
            this.f15560d = g.o(this, this);
        }
        return this.f15560d;
    }

    public <T extends View> T findViewById(int i10) {
        return e().p(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean i(int i10) {
        return e().P(i10);
    }

    public void invalidateOptionsMenu() {
        e().B();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        e().A();
        super.onCreate(bundle);
        e().G(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        e().M();
    }

    public void onSupportActionModeFinished(b bVar) {
    }

    public void onSupportActionModeStarted(b bVar) {
    }

    public b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void setContentView(int i10) {
        g();
        e().S(i10);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().Z(charSequence);
    }

    public void setContentView(View view) {
        g();
        e().T(view);
    }

    public void setTitle(int i10) {
        super.setTitle(i10);
        e().Z(getContext().getString(i10));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        e().U(view, layoutParams);
    }
}
