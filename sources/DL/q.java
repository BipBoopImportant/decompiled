package Dl;

import HJ.C15854t;
import IC.C13023e;
import N1.Y;
import S1.C;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16796C;
import XH.C16807N;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.widget.TextView;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.core.widget.i;
import c2.h;
import c2.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.f;
import p1.C5751x0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LIC/e;", "content", "LTC/b;", "textStyle", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "c", "(LIC/e;LTC/b;Landroidx/compose/ui/d;LU0/m;II)V", "", "text", "Lc2/h;", "bulletRadius", "textBulletGap", "", "f", "(Ljava/lang/String;FFLU0/m;II)Ljava/lang/CharSequence;", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(IC.C13023e r16, TC.C13679b r17, androidx.compose.ui.d r18, U0.C4889m r19, int r20, int r21) {
        /*
            r1 = r16
            r2 = r17
            r4 = r20
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "textStyle"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 1875639018(0x6fcbfaea, float:1.2625759E29)
            r3 = r19
            U0.m r3 = r3.k(r0)
            r5 = r21 & 1
            if (r5 == 0) goto L_0x0020
            r5 = r4 | 6
            goto L_0x0039
        L_0x0020:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0038
            r5 = r4 & 8
            if (r5 != 0) goto L_0x002d
            boolean r5 = r3.V(r1)
            goto L_0x0031
        L_0x002d:
            boolean r5 = r3.F(r1)
        L_0x0031:
            if (r5 == 0) goto L_0x0035
            r5 = 4
            goto L_0x0036
        L_0x0035:
            r5 = 2
        L_0x0036:
            r5 = r5 | r4
            goto L_0x0039
        L_0x0038:
            r5 = r4
        L_0x0039:
            r6 = r21 & 2
            r11 = 32
            if (r6 == 0) goto L_0x0042
            r5 = r5 | 48
            goto L_0x0051
        L_0x0042:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0051
            boolean r6 = r3.V(r2)
            if (r6 == 0) goto L_0x004e
            r6 = r11
            goto L_0x0050
        L_0x004e:
            r6 = 16
        L_0x0050:
            r5 = r5 | r6
        L_0x0051:
            r6 = r21 & 4
            if (r6 == 0) goto L_0x005b
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0057:
            r7 = r18
        L_0x0059:
            r12 = r5
            goto L_0x006e
        L_0x005b:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0057
            r7 = r18
            boolean r8 = r3.V(r7)
            if (r8 == 0) goto L_0x006a
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r5 = r5 | r8
            goto L_0x0059
        L_0x006e:
            r5 = r12 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r5 != r8) goto L_0x0081
            boolean r5 = r3.l()
            if (r5 != 0) goto L_0x007b
            goto L_0x0081
        L_0x007b:
            r3.L()
            r13 = r7
            goto L_0x013b
        L_0x0081:
            if (r6 == 0) goto L_0x0087
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r13 = r5
            goto L_0x0088
        L_0x0087:
            r13 = r7
        L_0x0088:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0094
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.uicomposables.views.HtmlView (ViewWrappers.kt:46)"
            U0.C4895p.S(r0, r12, r5, r6)
        L_0x0094:
            int r0 = r12 >> 3
            r5 = r0 & 14
            N1.Y r14 = r2.a(r3, r5)
            U0.I0 r5 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r5 = r3.Q(r5)
            c2.d r5 = (c2.d) r5
            long r6 = r14.s()
            float r5 = r5.O0(r6)
            int r15 = (int) r5
            int r5 = IC.C13023e.f110931a
            r6 = r12 & 14
            r5 = r5 | r6
            java.lang.String r5 = r1.a(r3, r5)
            r9 = 0
            r10 = 6
            r6 = 0
            r7 = 0
            r8 = r3
            java.lang.CharSequence r5 = f(r5, r6, r7, r8, r9, r10)
            U0.I0 r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r3.Q(r6)
            android.content.Context r6 = (android.content.Context) r6
            r7 = -1775516339(0xffffffff962bc54d, float:-1.3875527E-25)
            r3.W(r7)
            r7 = r12 & 112(0x70, float:1.57E-43)
            if (r7 != r11) goto L_0x00d7
            r7 = 1
            goto L_0x00d8
        L_0x00d7:
            r7 = 0
        L_0x00d8:
            java.lang.Object r8 = r3.D()
            if (r7 != 0) goto L_0x00e6
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00ef
        L_0x00e6:
            int r7 = tK.C18011b.f147430a
            android.graphics.Typeface r8 = w2.C6214h.g(r6, r7)
            r3.u(r8)
        L_0x00ef:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            r3.P()
            r6 = -1775510094(0xffffffff962bddb2, float:-1.3883225E-25)
            r3.W(r6)
            boolean r6 = r3.d(r15)
            boolean r7 = r3.V(r14)
            r6 = r6 | r7
            boolean r7 = r3.F(r8)
            r6 = r6 | r7
            boolean r7 = r3.F(r5)
            r6 = r6 | r7
            java.lang.Object r7 = r3.D()
            if (r6 != 0) goto L_0x011b
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0123
        L_0x011b:
            Dl.o r7 = new Dl.o
            r7.<init>(r15, r14, r8, r5)
            r3.u(r7)
        L_0x0123:
            r5 = r7
            nI.l r5 = (nI.C17642l) r5
            r3.P()
            r9 = r0 & 112(0x70, float:1.57E-43)
            r10 = 4
            r7 = 0
            r6 = r13
            r8 = r3
            androidx.compose.ui.viewinterop.e.a(r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x013b
            U0.C4895p.R()
        L_0x013b:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x0153
            Dl.p r7 = new Dl.p
            r0 = r7
            r1 = r16
            r2 = r17
            r3 = r13
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dl.q.c(IC.e, TC.b, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final TextView d(int i10, Y y10, Typeface typeface, CharSequence charSequence, Context context) {
        C17542s.j(context, "context");
        TextView textView = new TextView(context);
        i.p(textView, f.f75289a);
        i.m(textView, i10);
        textView.setTextSize(2, v.h(y10.l()));
        textView.setTextColor(C5751x0.k(y10.h()));
        textView.setTypeface(typeface, C17542s.e(y10.o(), C.f13316b.a()) ? 1 : 0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(charSequence);
        return textView;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C13023e eVar, C13679b bVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(eVar, bVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final CharSequence f(String str, float f10, float f11, C4889m mVar, int i10, int i11) {
        mVar.W(-788637643);
        if ((i11 & 2) != 0) {
            f10 = h.B((float) 2);
        }
        if ((i11 & 4) != 0) {
            f11 = h.B((float) 8);
        }
        if (C4895p.J()) {
            C4895p.S(-788637643, i10, -1, "com.ingka.ikea.app.uicomposables.views.prepareText (ViewWrappers.kt:92)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str, 63));
        c2.d dVar = (c2.d) mVar.Q(C5100f0.e());
        XH.v a10 = C16796C.a(Float.valueOf(dVar.H1(f10)), Float.valueOf(dVar.H1(f11)));
        float floatValue = ((Number) a10.a()).floatValue();
        float floatValue2 = ((Number) a10.b()).floatValue();
        BulletSpan[] bulletSpanArr = (BulletSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), BulletSpan.class);
        C17542s.g(bulletSpanArr);
        for (BulletSpan bulletSpan : bulletSpanArr) {
            int spanStart = spannableStringBuilder.getSpanStart(bulletSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(bulletSpan);
            spannableStringBuilder.removeSpan(bulletSpan);
            spannableStringBuilder.setSpan(new a(floatValue, floatValue2), spanStart, spanEnd, 17);
        }
        CharSequence z12 = C15854t.z1(spannableStringBuilder);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return z12;
    }
}
