package T9;

import K9.F;
import T9.c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedList;

public abstract class a<T extends c> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c f40129a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Bundle f40130b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public LinkedList f40131c;

    /* renamed from: d  reason: collision with root package name */
    private final e f40132d = new f(this);

    public static void k(FrameLayout frameLayout) {
        com.google.android.gms.common.a n10 = com.google.android.gms.common.a.n();
        Context context = frameLayout.getContext();
        int g10 = n10.g(context);
        String c10 = F.c(context, g10);
        String b10 = F.b(context, g10);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c10);
        linearLayout.addView(textView);
        Intent b11 = n10.b(context, g10, (String) null);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new h(context, b11));
        }
    }

    private final void p(int i10) {
        while (!this.f40131c.isEmpty() && ((k) this.f40131c.getLast()).b() >= i10) {
            this.f40131c.removeLast();
        }
    }

    private final void q(Bundle bundle, k kVar) {
        c cVar = this.f40129a;
        if (cVar != null) {
            kVar.a(cVar);
            return;
        }
        if (this.f40131c == null) {
            this.f40131c = new LinkedList();
        }
        this.f40131c.add(kVar);
        if (bundle != null) {
            Bundle bundle2 = this.f40130b;
            if (bundle2 == null) {
                this.f40130b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f40132d);
    }

    /* access modifiers changed from: protected */
    public abstract void a(e<T> eVar);

    public T b() {
        return this.f40129a;
    }

    public void c(Bundle bundle) {
        q(bundle, new g(this, bundle));
    }

    public void d() {
        c cVar = this.f40129a;
        if (cVar != null) {
            cVar.l();
        } else {
            p(1);
        }
    }

    public void e() {
        c cVar = this.f40129a;
        if (cVar != null) {
            cVar.onLowMemory();
        }
    }

    public void f() {
        c cVar = this.f40129a;
        if (cVar != null) {
            cVar.onPause();
        } else {
            p(5);
        }
    }

    public void g() {
        q((Bundle) null, new j(this));
    }

    public void h(Bundle bundle) {
        c cVar = this.f40129a;
        if (cVar != null) {
            cVar.t(bundle);
            return;
        }
        Bundle bundle2 = this.f40130b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void i() {
        q((Bundle) null, new i(this));
    }

    public void j() {
        c cVar = this.f40129a;
        if (cVar != null) {
            cVar.g();
        } else {
            p(4);
        }
    }
}
