package E0;

import T1.C4849s;
import android.view.inputmethod.EditorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a@\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "text", "LN1/W;", "selection", "LT1/s;", "imeOptions", "", "", "contentMimeTypes", "LXH/N;", "b", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLT1/s;[Ljava/lang/String;)V", "", "bits", "flag", "", "a", "(II)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: E0.z  reason: case insensitive filesystem */
public final class C4467z {
    private static final boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(android.view.inputmethod.EditorInfo r8, java.lang.CharSequence r9, long r10, T1.C4849s r12, java.lang.String[] r13) {
        /*
            int r0 = r12.e()
            T1.r$a r1 = T1.r.f13620b
            int r2 = r1.a()
            boolean r2 = T1.r.m(r0, r2)
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 6
            r7 = 1
            if (r2 == 0) goto L_0x001e
            boolean r0 = r12.h()
            if (r0 == 0) goto L_0x001c
            goto L_0x0070
        L_0x001c:
            r6 = r5
            goto L_0x0070
        L_0x001e:
            int r2 = r1.e()
            boolean r2 = T1.r.m(r0, r2)
            if (r2 == 0) goto L_0x002a
            r6 = r7
            goto L_0x0070
        L_0x002a:
            int r2 = r1.c()
            boolean r2 = T1.r.m(r0, r2)
            if (r2 == 0) goto L_0x0036
            r6 = r4
            goto L_0x0070
        L_0x0036:
            int r2 = r1.d()
            boolean r2 = T1.r.m(r0, r2)
            if (r2 == 0) goto L_0x0042
            r6 = 5
            goto L_0x0070
        L_0x0042:
            int r2 = r1.f()
            boolean r2 = T1.r.m(r0, r2)
            if (r2 == 0) goto L_0x004e
            r6 = 7
            goto L_0x0070
        L_0x004e:
            int r2 = r1.g()
            boolean r2 = T1.r.m(r0, r2)
            if (r2 == 0) goto L_0x005a
            r6 = r3
            goto L_0x0070
        L_0x005a:
            int r2 = r1.h()
            boolean r2 = T1.r.m(r0, r2)
            if (r2 == 0) goto L_0x0066
            r6 = 4
            goto L_0x0070
        L_0x0066:
            int r2 = r1.b()
            boolean r0 = T1.r.m(r0, r2)
            if (r0 == 0) goto L_0x01c6
        L_0x0070:
            r8.imeOptions = r6
            r12.g()
            E0.t0 r0 = E0.t0.f5766a
            U1.e r2 = r12.d()
            r0.a(r8, r2)
            int r0 = r12.f()
            T1.y$a r2 = T1.C4855y.f13650b
            int r6 = r2.h()
            boolean r6 = T1.C4855y.n(r0, r6)
            if (r6 == 0) goto L_0x0091
        L_0x008e:
            r3 = r7
            goto L_0x00fa
        L_0x0091:
            int r6 = r2.a()
            boolean r6 = T1.C4855y.n(r0, r6)
            if (r6 == 0) goto L_0x00a3
            int r0 = r8.imeOptions
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r3
            r8.imeOptions = r0
            goto L_0x008e
        L_0x00a3:
            int r6 = r2.d()
            boolean r6 = T1.C4855y.n(r0, r6)
            if (r6 == 0) goto L_0x00af
            r3 = r4
            goto L_0x00fa
        L_0x00af:
            int r4 = r2.g()
            boolean r4 = T1.C4855y.n(r0, r4)
            if (r4 == 0) goto L_0x00ba
            goto L_0x00fa
        L_0x00ba:
            int r3 = r2.j()
            boolean r3 = T1.C4855y.n(r0, r3)
            if (r3 == 0) goto L_0x00c7
            r3 = 17
            goto L_0x00fa
        L_0x00c7:
            int r3 = r2.c()
            boolean r3 = T1.C4855y.n(r0, r3)
            if (r3 == 0) goto L_0x00d4
            r3 = 33
            goto L_0x00fa
        L_0x00d4:
            int r3 = r2.f()
            boolean r3 = T1.C4855y.n(r0, r3)
            if (r3 == 0) goto L_0x00e1
            r3 = 129(0x81, float:1.81E-43)
            goto L_0x00fa
        L_0x00e1:
            int r3 = r2.e()
            boolean r3 = T1.C4855y.n(r0, r3)
            if (r3 == 0) goto L_0x00ee
            r3 = 18
            goto L_0x00fa
        L_0x00ee:
            int r3 = r2.b()
            boolean r0 = T1.C4855y.n(r0, r3)
            if (r0 == 0) goto L_0x01be
            r3 = 8194(0x2002, float:1.1482E-41)
        L_0x00fa:
            r8.inputType = r3
            boolean r0 = r12.h()
            if (r0 != 0) goto L_0x0126
            int r0 = r8.inputType
            boolean r0 = a(r0, r7)
            if (r0 == 0) goto L_0x0126
            int r0 = r8.inputType
            r3 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r3
            r8.inputType = r0
            int r0 = r12.e()
            int r1 = r1.a()
            boolean r0 = T1.r.m(r0, r1)
            if (r0 == 0) goto L_0x0126
            int r0 = r8.imeOptions
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 | r1
            r8.imeOptions = r0
        L_0x0126:
            int r0 = r8.inputType
            boolean r0 = a(r0, r7)
            if (r0 == 0) goto L_0x0174
            int r0 = r12.c()
            T1.x$a r1 = T1.C4854x.f13643b
            int r3 = r1.a()
            boolean r3 = T1.C4854x.i(r0, r3)
            if (r3 == 0) goto L_0x0145
            int r0 = r8.inputType
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r8.inputType = r0
            goto L_0x0166
        L_0x0145:
            int r3 = r1.e()
            boolean r3 = T1.C4854x.i(r0, r3)
            if (r3 == 0) goto L_0x0156
            int r0 = r8.inputType
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r8.inputType = r0
            goto L_0x0166
        L_0x0156:
            int r1 = r1.c()
            boolean r0 = T1.C4854x.i(r0, r1)
            if (r0 == 0) goto L_0x0166
            int r0 = r8.inputType
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r8.inputType = r0
        L_0x0166:
            boolean r0 = r12.b()
            if (r0 == 0) goto L_0x0174
            int r0 = r8.inputType
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r1
            r8.inputType = r0
        L_0x0174:
            int r0 = N1.W.n(r10)
            r8.initialSelStart = r0
            int r10 = N1.W.i(r10)
            r8.initialSelEnd = r10
            L2.a.e(r8, r9)
            if (r13 == 0) goto L_0x0188
            L2.a.c(r8, r13)
        L_0x0188:
            int r9 = r8.imeOptions
            r10 = 33554432(0x2000000, float:9.403955E-38)
            r9 = r9 | r10
            r8.imeOptions = r9
            boolean r9 = C0.c.a()
            if (r9 == 0) goto L_0x01ba
            int r9 = r12.f()
            int r10 = r2.f()
            boolean r9 = T1.C4855y.n(r9, r10)
            if (r9 != 0) goto L_0x01ba
            int r9 = r12.f()
            int r10 = r2.e()
            boolean r9 = T1.C4855y.n(r9, r10)
            if (r9 != 0) goto L_0x01ba
            L2.a.f(r8, r7)
            E0.y r9 = E0.C4466y.f5779a
            r9.a(r8)
            goto L_0x01bd
        L_0x01ba:
            L2.a.f(r8, r5)
        L_0x01bd:
            return
        L_0x01be:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Invalid Keyboard Type"
            r8.<init>(r9)
            throw r8
        L_0x01c6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "invalid ImeAction"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.C4467z.b(android.view.inputmethod.EditorInfo, java.lang.CharSequence, long, T1.s, java.lang.String[]):void");
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j10, C4849s sVar, String[] strArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j10, sVar, strArr);
    }
}
