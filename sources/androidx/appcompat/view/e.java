package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class e extends b implements f.a {

    /* renamed from: c  reason: collision with root package name */
    private Context f15649c;

    /* renamed from: d  reason: collision with root package name */
    private ActionBarContextView f15650d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f15651e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<View> f15652f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15653g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15654h;

    /* renamed from: i  reason: collision with root package name */
    private f f15655i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f15649c = context;
        this.f15650d = actionBarContextView;
        this.f15651e = aVar;
        f X10 = new f(actionBarContextView.getContext()).X(1);
        this.f15655i = X10;
        X10.W(this);
        this.f15654h = z10;
    }

    public boolean a(f fVar, MenuItem menuItem) {
        return this.f15651e.c(this, menuItem);
    }

    public void b(f fVar) {
        k();
        this.f15650d.l();
    }

    public void c() {
        if (!this.f15653g) {
            this.f15653g = true;
            this.f15651e.a(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.f15652f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f15655i;
    }

    public MenuInflater f() {
        return new g(this.f15650d.getContext());
    }

    public CharSequence g() {
        return this.f15650d.getSubtitle();
    }

    public CharSequence i() {
        return this.f15650d.getTitle();
    }

    public void k() {
        this.f15651e.d(this, this.f15655i);
    }

    public boolean l() {
        return this.f15650d.j();
    }

    public void m(View view) {
        this.f15650d.setCustomView(view);
        this.f15652f = view != null ? new WeakReference<>(view) : null;
    }

    public void n(int i10) {
        o(this.f15649c.getString(i10));
    }

    public void o(CharSequence charSequence) {
        this.f15650d.setSubtitle(charSequence);
    }

    public void q(int i10) {
        r(this.f15649c.getString(i10));
    }

    public void r(CharSequence charSequence) {
        this.f15650d.setTitle(charSequence);
    }

    public void s(boolean z10) {
        super.s(z10);
        this.f15650d.setTitleOptional(z10);
    }
}
