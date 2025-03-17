package androidx.appcompat.widget;

import I2.C4618k0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;

/* renamed from: androidx.appcompat.widget.t  reason: case insensitive filesystem */
public interface C5007t {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, k.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    Menu j();

    int k();

    C4618k0 l(int i10, long j10);

    ViewGroup m();

    void n(boolean z10);

    void o(int i10);

    void p();

    void q(boolean z10);

    void r();

    void s(ScrollingTabContainerView scrollingTabContainerView);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i10);

    void u(int i10);

    void v(k.a aVar, f.a aVar2);

    void w(int i10);

    int x();

    void y();
}
