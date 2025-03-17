package com.google.android.material.internal;

import Ra.d;
import Ra.f;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f67013a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final f f67014b = new a();

    /* renamed from: c  reason: collision with root package name */
    private float f67015c;

    /* renamed from: d  reason: collision with root package name */
    private float f67016d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f67017e = true;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<b> f67018f = new WeakReference<>((Object) null);

    /* renamed from: g  reason: collision with root package name */
    private d f67019g;

    class a extends f {
        a() {
        }

        public void a(int i10) {
            boolean unused = q.this.f67017e = true;
            b bVar = (b) q.this.f67018f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z10) {
            if (!z10) {
                boolean unused = q.this.f67017e = true;
                b bVar = (b) q.this.f67018f.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public q(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f67013a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f67013a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f67015c = d(str);
        this.f67016d = c(str);
        this.f67017e = false;
    }

    public d e() {
        return this.f67019g;
    }

    public float f(String str) {
        if (!this.f67017e) {
            return this.f67016d;
        }
        i(str);
        return this.f67016d;
    }

    public TextPaint g() {
        return this.f67013a;
    }

    public float h(String str) {
        if (!this.f67017e) {
            return this.f67015c;
        }
        i(str);
        return this.f67015c;
    }

    public void j(b bVar) {
        this.f67018f = new WeakReference<>(bVar);
    }

    public void k(d dVar, Context context) {
        if (this.f67019g != dVar) {
            this.f67019g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f67013a, this.f67014b);
                b bVar = this.f67018f.get();
                if (bVar != null) {
                    this.f67013a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f67013a, this.f67014b);
                this.f67017e = true;
            }
            b bVar2 = this.f67018f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f67017e = z10;
    }

    public void m(boolean z10) {
        this.f67017e = z10;
    }

    public void n(Context context) {
        this.f67019g.n(context, this.f67013a, this.f67014b);
    }
}
