package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import i.C5430j;
import java.lang.ref.WeakReference;
import w2.C6214h;

/* renamed from: androidx.appcompat.widget.o  reason: case insensitive filesystem */
class C5003o {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f16540a;

    /* renamed from: b  reason: collision with root package name */
    private K f16541b;

    /* renamed from: c  reason: collision with root package name */
    private K f16542c;

    /* renamed from: d  reason: collision with root package name */
    private K f16543d;

    /* renamed from: e  reason: collision with root package name */
    private K f16544e;

    /* renamed from: f  reason: collision with root package name */
    private K f16545f;

    /* renamed from: g  reason: collision with root package name */
    private K f16546g;

    /* renamed from: h  reason: collision with root package name */
    private K f16547h;

    /* renamed from: i  reason: collision with root package name */
    private final C5004p f16548i;

    /* renamed from: j  reason: collision with root package name */
    private int f16549j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f16550k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f16551l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f16552m;

    /* renamed from: androidx.appcompat.widget.o$a */
    class a extends C6214h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f16553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16554b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f16555c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f16553a = i10;
            this.f16554b = i11;
            this.f16555c = weakReference;
        }

        public void h(int i10) {
        }

        public void i(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f16553a) != -1) {
                typeface = e.a(typeface, i10, (this.f16554b & 2) != 0);
            }
            C5003o.this.n(this.f16555c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.o$b */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f16557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f16558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f16559c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f16557a = textView;
            this.f16558b = typeface;
            this.f16559c = i10;
        }

        public void run() {
            this.f16557a.setTypeface(this.f16558b, this.f16559c);
        }
    }

    /* renamed from: androidx.appcompat.widget.o$c */
    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.o$d */
    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.o$e */
    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    C5003o(TextView textView) {
        this.f16540a = textView;
        this.f16548i = new C5004p(textView);
    }

    private void B(int i10, float f10) {
        this.f16548i.t(i10, f10);
    }

    private void C(Context context, M m10) {
        String o10;
        this.f16549j = m10.k(C5430j.f24060E2, this.f16549j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int k10 = m10.k(C5430j.f24072H2, -1);
            this.f16550k = k10;
            if (k10 != -1) {
                this.f16549j &= 2;
            }
        }
        boolean z10 = true;
        if (m10.s(C5430j.f24068G2) || m10.s(C5430j.f24076I2)) {
            this.f16551l = null;
            int i11 = m10.s(C5430j.f24076I2) ? C5430j.f24076I2 : C5430j.f24068G2;
            int i12 = this.f16550k;
            int i13 = this.f16549j;
            if (!context.isRestricted()) {
                try {
                    Typeface j10 = m10.j(i11, this.f16549j, new a(i12, i13, new WeakReference(this.f16540a)));
                    if (j10 != null) {
                        if (i10 < 28 || this.f16550k == -1) {
                            this.f16551l = j10;
                        } else {
                            this.f16551l = e.a(Typeface.create(j10, 0), this.f16550k, (this.f16549j & 2) != 0);
                        }
                    }
                    this.f16552m = this.f16551l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f16551l == null && (o10 = m10.o(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f16550k == -1) {
                    this.f16551l = Typeface.create(o10, this.f16549j);
                    return;
                }
                Typeface create = Typeface.create(o10, 0);
                int i14 = this.f16550k;
                if ((this.f16549j & 2) == 0) {
                    z10 = false;
                }
                this.f16551l = e.a(create, i14, z10);
            }
        } else if (m10.s(C5430j.f24056D2)) {
            this.f16552m = false;
            int k11 = m10.k(C5430j.f24056D2, 1);
            if (k11 == 1) {
                this.f16551l = Typeface.SANS_SERIF;
            } else if (k11 == 2) {
                this.f16551l = Typeface.SERIF;
            } else if (k11 == 3) {
                this.f16551l = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, K k10) {
        if (drawable != null && k10 != null) {
            C4993e.i(drawable, k10, this.f16540a.getDrawableState());
        }
    }

    private static K d(Context context, C4993e eVar, int i10) {
        ColorStateList f10 = eVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        K k10 = new K();
        k10.f16253d = true;
        k10.f16250a = f10;
        return k10;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f16540a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f16540a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f16540a.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f16540a.getCompoundDrawables();
                TextView textView2 = this.f16540a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f16540a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
        }
    }

    private void z() {
        K k10 = this.f16547h;
        this.f16541b = k10;
        this.f16542c = k10;
        this.f16543d = k10;
        this.f16544e = k10;
        this.f16545f = k10;
        this.f16546g = k10;
    }

    /* access modifiers changed from: package-private */
    public void A(int i10, float f10) {
        if (!U.f16485c && !l()) {
            B(i10, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.f16541b == null && this.f16542c == null && this.f16543d == null && this.f16544e == null)) {
            Drawable[] compoundDrawables = this.f16540a.getCompoundDrawables();
            a(compoundDrawables[0], this.f16541b);
            a(compoundDrawables[1], this.f16542c);
            a(compoundDrawables[2], this.f16543d);
            a(compoundDrawables[3], this.f16544e);
        }
        if (this.f16545f != null || this.f16546g != null) {
            Drawable[] compoundDrawablesRelative = this.f16540a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f16545f);
            a(compoundDrawablesRelative[2], this.f16546g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f16548i.a();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f16548i.f();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f16548i.g();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f16548i.h();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f16548i.i();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f16548i.j();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        K k10 = this.f16547h;
        if (k10 != null) {
            return k10.f16250a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        K k10 = this.f16547h;
        if (k10 != null) {
            return k10.f16251b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f16548i.n();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r17, int r18) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            android.widget.TextView r0 = r7.f16540a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.e r11 = androidx.appcompat.widget.C4993e.b()
            int[] r0 = i.C5430j.f24137Y
            r12 = 0
            androidx.appcompat.widget.M r13 = androidx.appcompat.widget.M.v(r10, r8, r0, r9, r12)
            android.widget.TextView r0 = r7.f16540a
            android.content.Context r1 = r0.getContext()
            int[] r2 = i.C5430j.f24137Y
            android.content.res.TypedArray r4 = r13.r()
            r6 = 0
            r3 = r17
            r5 = r18
            I2.C4600b0.n0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = i.C5430j.f24141Z
            r14 = -1
            int r0 = r13.n(r0, r14)
            int r1 = i.C5430j.f24156c0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x0046
            int r1 = i.C5430j.f24156c0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.K r1 = d(r10, r11, r1)
            r7.f16541b = r1
        L_0x0046:
            int r1 = i.C5430j.f24146a0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x005a
            int r1 = i.C5430j.f24146a0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.K r1 = d(r10, r11, r1)
            r7.f16542c = r1
        L_0x005a:
            int r1 = i.C5430j.f24161d0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x006e
            int r1 = i.C5430j.f24161d0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.K r1 = d(r10, r11, r1)
            r7.f16543d = r1
        L_0x006e:
            int r1 = i.C5430j.f24151b0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x0082
            int r1 = i.C5430j.f24151b0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.K r1 = d(r10, r11, r1)
            r7.f16544e = r1
        L_0x0082:
            int r1 = i.C5430j.f24166e0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x0096
            int r1 = i.C5430j.f24166e0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.K r1 = d(r10, r11, r1)
            r7.f16545f = r1
        L_0x0096:
            int r1 = i.C5430j.f24171f0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x00aa
            int r1 = i.C5430j.f24171f0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.K r1 = d(r10, r11, r1)
            r7.f16546g = r1
        L_0x00aa:
            r13.x()
            android.widget.TextView r1 = r7.f16540a
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            r2 = 1
            r13 = 0
            if (r0 == r14) goto L_0x00fa
            int[] r3 = i.C5430j.f24048B2
            androidx.appcompat.widget.M r0 = androidx.appcompat.widget.M.t(r10, r0, r3)
            if (r1 != 0) goto L_0x00d1
            int r3 = i.C5430j.f24084K2
            boolean r3 = r0.s(r3)
            if (r3 == 0) goto L_0x00d1
            int r3 = i.C5430j.f24084K2
            boolean r3 = r0.a(r3, r12)
            r4 = r2
            goto L_0x00d3
        L_0x00d1:
            r3 = r12
            r4 = r3
        L_0x00d3:
            r7.C(r10, r0)
            int r5 = i.C5430j.f24088L2
            boolean r5 = r0.s(r5)
            if (r5 == 0) goto L_0x00e5
            int r5 = i.C5430j.f24088L2
            java.lang.String r5 = r0.o(r5)
            goto L_0x00e6
        L_0x00e5:
            r5 = r13
        L_0x00e6:
            int r6 = i.C5430j.f24080J2
            boolean r6 = r0.s(r6)
            if (r6 == 0) goto L_0x00f5
            int r6 = i.C5430j.f24080J2
            java.lang.String r6 = r0.o(r6)
            goto L_0x00f6
        L_0x00f5:
            r6 = r13
        L_0x00f6:
            r0.x()
            goto L_0x00fe
        L_0x00fa:
            r3 = r12
            r4 = r3
            r5 = r13
            r6 = r5
        L_0x00fe:
            int[] r0 = i.C5430j.f24048B2
            androidx.appcompat.widget.M r0 = androidx.appcompat.widget.M.v(r10, r8, r0, r9, r12)
            if (r1 != 0) goto L_0x0115
            int r15 = i.C5430j.f24084K2
            boolean r15 = r0.s(r15)
            if (r15 == 0) goto L_0x0115
            int r3 = i.C5430j.f24084K2
            boolean r3 = r0.a(r3, r12)
            goto L_0x0116
        L_0x0115:
            r2 = r4
        L_0x0116:
            int r4 = android.os.Build.VERSION.SDK_INT
            int r15 = i.C5430j.f24088L2
            boolean r15 = r0.s(r15)
            if (r15 == 0) goto L_0x0126
            int r5 = i.C5430j.f24088L2
            java.lang.String r5 = r0.o(r5)
        L_0x0126:
            int r15 = i.C5430j.f24080J2
            boolean r15 = r0.s(r15)
            if (r15 == 0) goto L_0x0134
            int r6 = i.C5430j.f24080J2
            java.lang.String r6 = r0.o(r6)
        L_0x0134:
            r15 = 28
            if (r4 < r15) goto L_0x014e
            int r4 = i.C5430j.f24052C2
            boolean r4 = r0.s(r4)
            if (r4 == 0) goto L_0x014e
            int r4 = i.C5430j.f24052C2
            int r4 = r0.f(r4, r14)
            if (r4 != 0) goto L_0x014e
            android.widget.TextView r4 = r7.f16540a
            r15 = 0
            r4.setTextSize(r12, r15)
        L_0x014e:
            r7.C(r10, r0)
            r0.x()
            if (r1 != 0) goto L_0x015b
            if (r2 == 0) goto L_0x015b
            r7.s(r3)
        L_0x015b:
            android.graphics.Typeface r0 = r7.f16551l
            if (r0 == 0) goto L_0x0170
            int r1 = r7.f16550k
            if (r1 != r14) goto L_0x016b
            android.widget.TextView r1 = r7.f16540a
            int r2 = r7.f16549j
            r1.setTypeface(r0, r2)
            goto L_0x0170
        L_0x016b:
            android.widget.TextView r1 = r7.f16540a
            r1.setTypeface(r0)
        L_0x0170:
            if (r6 == 0) goto L_0x0177
            android.widget.TextView r0 = r7.f16540a
            androidx.appcompat.widget.C5003o.d.d(r0, r6)
        L_0x0177:
            if (r5 == 0) goto L_0x0182
            android.widget.TextView r0 = r7.f16540a
            android.os.LocaleList r1 = androidx.appcompat.widget.C5003o.c.a(r5)
            androidx.appcompat.widget.C5003o.c.b(r0, r1)
        L_0x0182:
            androidx.appcompat.widget.p r0 = r7.f16548i
            r0.o(r8, r9)
            boolean r0 = androidx.appcompat.widget.U.f16485c
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x01c6
            androidx.appcompat.widget.p r0 = r7.f16548i
            int r0 = r0.j()
            if (r0 == 0) goto L_0x01c6
            androidx.appcompat.widget.p r0 = r7.f16548i
            int[] r0 = r0.i()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01c6
            android.widget.TextView r1 = r7.f16540a
            int r1 = androidx.appcompat.widget.C5003o.d.a(r1)
            float r1 = (float) r1
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x01c1
            android.widget.TextView r0 = r7.f16540a
            androidx.appcompat.widget.p r1 = r7.f16548i
            int r1 = r1.g()
            androidx.appcompat.widget.p r2 = r7.f16548i
            int r2 = r2.f()
            androidx.appcompat.widget.p r3 = r7.f16548i
            int r3 = r3.h()
            androidx.appcompat.widget.C5003o.d.b(r0, r1, r2, r3, r12)
            goto L_0x01c6
        L_0x01c1:
            android.widget.TextView r1 = r7.f16540a
            androidx.appcompat.widget.C5003o.d.c(r1, r0, r12)
        L_0x01c6:
            int[] r0 = i.C5430j.f24176g0
            androidx.appcompat.widget.M r8 = androidx.appcompat.widget.M.u(r10, r8, r0)
            int r0 = i.C5430j.f24216o0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01da
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r1 = r0
            goto L_0x01db
        L_0x01da:
            r1 = r13
        L_0x01db:
            int r0 = i.C5430j.f24241t0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01e9
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r2 = r0
            goto L_0x01ea
        L_0x01e9:
            r2 = r13
        L_0x01ea:
            int r0 = i.C5430j.f24221p0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01f8
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r3 = r0
            goto L_0x01f9
        L_0x01f8:
            r3 = r13
        L_0x01f9:
            int r0 = i.C5430j.f24206m0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x0207
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r4 = r0
            goto L_0x0208
        L_0x0207:
            r4 = r13
        L_0x0208:
            int r0 = i.C5430j.f24226q0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x0216
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r5 = r0
            goto L_0x0217
        L_0x0216:
            r5 = r13
        L_0x0217:
            int r0 = i.C5430j.f24211n0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x0225
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r6 = r0
            goto L_0x0226
        L_0x0225:
            r6 = r13
        L_0x0226:
            r0 = r16
            r0.y(r1, r2, r3, r4, r5, r6)
            int r0 = i.C5430j.f24231r0
            boolean r0 = r8.s(r0)
            if (r0 == 0) goto L_0x023e
            int r0 = i.C5430j.f24231r0
            android.content.res.ColorStateList r0 = r8.c(r0)
            android.widget.TextView r1 = r7.f16540a
            androidx.core.widget.i.h(r1, r0)
        L_0x023e:
            int r0 = i.C5430j.f24236s0
            boolean r0 = r8.s(r0)
            if (r0 == 0) goto L_0x0255
            int r0 = i.C5430j.f24236s0
            int r0 = r8.k(r0, r14)
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.y.e(r0, r13)
            android.widget.TextView r1 = r7.f16540a
            androidx.core.widget.i.i(r1, r0)
        L_0x0255:
            int r0 = i.C5430j.f24251v0
            int r0 = r8.f(r0, r14)
            int r1 = i.C5430j.f24256w0
            int r1 = r8.f(r1, r14)
            int r2 = i.C5430j.f24261x0
            boolean r2 = r8.s(r2)
            if (r2 == 0) goto L_0x028c
            int r2 = i.C5430j.f24261x0
            android.util.TypedValue r2 = r8.w(r2)
            if (r2 == 0) goto L_0x0283
            int r3 = r2.type
            r4 = 5
            if (r3 != r4) goto L_0x0283
            int r3 = r2.data
            int r3 = H2.m.a(r3)
            int r2 = r2.data
            float r2 = android.util.TypedValue.complexToFloat(r2)
            goto L_0x028e
        L_0x0283:
            int r2 = i.C5430j.f24261x0
            int r2 = r8.f(r2, r14)
            float r2 = (float) r2
        L_0x028a:
            r3 = r14
            goto L_0x028e
        L_0x028c:
            r2 = r9
            goto L_0x028a
        L_0x028e:
            r8.x()
            if (r0 == r14) goto L_0x0298
            android.widget.TextView r4 = r7.f16540a
            androidx.core.widget.i.k(r4, r0)
        L_0x0298:
            if (r1 == r14) goto L_0x029f
            android.widget.TextView r0 = r7.f16540a
            androidx.core.widget.i.l(r0, r1)
        L_0x029f:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x02b1
            if (r3 != r14) goto L_0x02ac
            android.widget.TextView r0 = r7.f16540a
            int r1 = (int) r2
            androidx.core.widget.i.m(r0, r1)
            goto L_0x02b1
        L_0x02ac:
            android.widget.TextView r0 = r7.f16540a
            androidx.core.widget.i.n(r0, r3, r2)
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C5003o.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f16552m) {
            this.f16551l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (textView.isAttachedToWindow()) {
                textView.post(new b(textView, typeface, this.f16549j));
            } else {
                textView.setTypeface(typeface, this.f16549j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (!U.f16485c) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void q(Context context, int i10) {
        String o10;
        M t10 = M.t(context, i10, C5430j.f24048B2);
        if (t10.s(C5430j.f24084K2)) {
            s(t10.a(C5430j.f24084K2, false));
        }
        if (t10.s(C5430j.f24052C2) && t10.f(C5430j.f24052C2, -1) == 0) {
            this.f16540a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (t10.s(C5430j.f24080J2) && (o10 = t10.o(C5430j.f24080J2)) != null) {
            d.d(this.f16540a, o10);
        }
        t10.x();
        Typeface typeface = this.f16551l;
        if (typeface != null) {
            this.f16540a.setTypeface(typeface, this.f16549j);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            L2.a.e(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        this.f16540a.setAllCaps(z10);
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, int i11, int i12, int i13) {
        this.f16548i.p(i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void u(int[] iArr, int i10) {
        this.f16548i.q(iArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void v(int i10) {
        this.f16548i.r(i10);
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f16547h == null) {
            this.f16547h = new K();
        }
        K k10 = this.f16547h;
        k10.f16250a = colorStateList;
        k10.f16253d = colorStateList != null;
        z();
    }

    /* access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f16547h == null) {
            this.f16547h = new K();
        }
        K k10 = this.f16547h;
        k10.f16251b = mode;
        k10.f16252c = mode != null;
        z();
    }
}
