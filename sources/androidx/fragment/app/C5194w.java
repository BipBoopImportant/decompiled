package androidx.fragment.app;

import H2.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.fragment.app.w  reason: case insensitive filesystem */
public class C5194w {

    /* renamed from: a  reason: collision with root package name */
    private final FragmentHostCallback<?> f22121a;

    private C5194w(FragmentHostCallback<?> fragmentHostCallback) {
        this.f22121a = fragmentHostCallback;
    }

    public static C5194w b(FragmentHostCallback<?> fragmentHostCallback) {
        return new C5194w((FragmentHostCallback) i.h(fragmentHostCallback, "callbacks == null"));
    }

    public void a(C5187o oVar) {
        FragmentManager g10 = this.f22121a.g();
        FragmentHostCallback<?> fragmentHostCallback = this.f22121a;
        g10.q(fragmentHostCallback, fragmentHostCallback, oVar);
    }

    public void c() {
        this.f22121a.g().E();
    }

    public boolean d(MenuItem menuItem) {
        return this.f22121a.g().H(menuItem);
    }

    public void e() {
        this.f22121a.g().I();
    }

    public void f() {
        this.f22121a.g().K();
    }

    public void g() {
        this.f22121a.g().T();
    }

    public void h() {
        this.f22121a.g().X();
    }

    public void i() {
        this.f22121a.g().Y();
    }

    public void j() {
        this.f22121a.g().a0();
    }

    public boolean k() {
        return this.f22121a.g().h0(true);
    }

    public FragmentManager l() {
        return this.f22121a.g();
    }

    public void m() {
        this.f22121a.g().m1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f22121a.g().I0().onCreateView(view, str, context, attributeSet);
    }
}
