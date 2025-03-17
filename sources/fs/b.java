package fs;

import C7.k;
import a8.g;
import a8.i;
import android.graphics.Typeface;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lfs/b;", "LC7/k;", "Ljava/io/InputStream;", "La8/g;", "<init>", "()V", "source", "LC7/i;", "options", "", "d", "(Ljava/io/InputStream;LC7/i;)Z", "", "width", "height", "LE7/v;", "c", "(Ljava/io/InputStream;IILC7/i;)LE7/v;", "a", "imageloader-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements k<InputStream, g> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfs/b$a;", "La8/i;", "<init>", "()V", "", "fontFamily", "", "fontWeight", "fontStyle", "Landroid/graphics/Typeface;", "c", "(Ljava/lang/String;ILjava/lang/String;)Landroid/graphics/Typeface;", "imageloader-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a extends i {
        public Typeface c(String str, int i10, String str2) {
            C17542s.j(str, "fontFamily");
            C17542s.j(str2, "fontStyle");
            Typeface typeface = Typeface.SANS_SERIF;
            C17542s.i(typeface, "SANS_SERIF");
            return typeface;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r12.f() == -1.0f) goto L_0x0033;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E7.v<a8.g> a(java.io.InputStream r12, int r13, int r14, C7.i r15) {
        /*
            r11 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            r15 = 0
            a8.g.B(r15)     // Catch:{ j -> 0x005e }
            boolean r15 = a8.g.o()     // Catch:{ j -> 0x005e }
            if (r15 != 0) goto L_0x00ee
            a8.g r12 = a8.g.l(r12)     // Catch:{ j -> 0x005e }
            fs.b$a r15 = new fs.b$a     // Catch:{ j -> 0x005e }
            r15.<init>()     // Catch:{ j -> 0x005e }
            a8.g.p(r15)     // Catch:{ j -> 0x005e }
            float r15 = r12.h()     // Catch:{ j -> 0x005e }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 != 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            float r15 = r12.f()     // Catch:{ j -> 0x005e }
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 != 0) goto L_0x00e8
        L_0x0033:
            qv.e r15 = qv.e.DEBUG     // Catch:{ j -> 0x005e }
            qv.d r0 = qv.d.f102012a     // Catch:{ j -> 0x005e }
            java.util.List r0 = r0.a()     // Catch:{ j -> 0x005e }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ j -> 0x005e }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ j -> 0x005e }
            r1.<init>()     // Catch:{ j -> 0x005e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ j -> 0x005e }
        L_0x0046:
            boolean r2 = r0.hasNext()     // Catch:{ j -> 0x005e }
            r6 = 0
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r0.next()     // Catch:{ j -> 0x005e }
            r3 = r2
            qv.b r3 = (qv.C11819b) r3     // Catch:{ j -> 0x005e }
            boolean r3 = r3.b(r15, r6)     // Catch:{ j -> 0x005e }
            if (r3 == 0) goto L_0x0046
            r1.add(r2)     // Catch:{ j -> 0x005e }
            goto L_0x0046
        L_0x005e:
            r12 = move-exception
            goto L_0x00f6
        L_0x0061:
            java.util.Iterator r7 = r1.iterator()     // Catch:{ j -> 0x005e }
            r8 = 0
            r0 = r8
            r1 = r0
        L_0x0068:
            boolean r2 = r7.hasNext()     // Catch:{ j -> 0x005e }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r7.next()     // Catch:{ j -> 0x005e }
            qv.b r2 = (qv.C11819b) r2     // Catch:{ j -> 0x005e }
            r4 = 0
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "Svg is missing document width or height. Will override"
            java.lang.String r0 = qv.C11818a.a(r0, r4)     // Catch:{ j -> 0x005e }
            if (r0 != 0) goto L_0x0080
            goto L_0x00e0
        L_0x0080:
            java.lang.String r0 = qv.C11820c.a(r0)     // Catch:{ j -> 0x005e }
        L_0x0084:
            r9 = r0
            if (r1 != 0) goto L_0x00d4
            java.lang.Class<fs.b> r0 = fs.b.class
            java.lang.String r0 = r0.getName()     // Catch:{ j -> 0x005e }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ j -> 0x005e }
            r1 = 36
            r3 = 2
            java.lang.String r1 = HJ.C15854t.s1(r0, r1, r8, r3, r8)     // Catch:{ j -> 0x005e }
            r5 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r5, r8, r3, r8)     // Catch:{ j -> 0x005e }
            int r3 = r1.length()     // Catch:{ j -> 0x005e }
            if (r3 != 0) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            java.lang.String r0 = "Kt"
            java.lang.String r0 = HJ.C15854t.P0(r1, r0)     // Catch:{ j -> 0x005e }
        L_0x00aa:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ j -> 0x005e }
            java.lang.String r1 = r1.getName()     // Catch:{ j -> 0x005e }
            java.lang.String r3 = "main"
            r5 = 1
            boolean r1 = HJ.C15854t.b0(r1, r3, r5)     // Catch:{ j -> 0x005e }
            if (r1 == 0) goto L_0x00be
            java.lang.String r1 = "m"
            goto L_0x00c0
        L_0x00be:
            java.lang.String r1 = "b"
        L_0x00c0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ j -> 0x005e }
            r3.<init>()     // Catch:{ j -> 0x005e }
            r3.append(r1)     // Catch:{ j -> 0x005e }
            java.lang.String r1 = "|"
            r3.append(r1)     // Catch:{ j -> 0x005e }
            r3.append(r0)     // Catch:{ j -> 0x005e }
            java.lang.String r1 = r3.toString()     // Catch:{ j -> 0x005e }
        L_0x00d4:
            r10 = r1
            r0 = r2
            r1 = r15
            r2 = r10
            r3 = r6
            r5 = r9
            r0.a(r1, r2, r3, r4, r5)     // Catch:{ j -> 0x005e }
            r0 = r9
            r1 = r10
            goto L_0x0068
        L_0x00e0:
            float r13 = (float) r13     // Catch:{ j -> 0x005e }
            r12.z(r13)     // Catch:{ j -> 0x005e }
            float r13 = (float) r14     // Catch:{ j -> 0x005e }
            r12.w(r13)     // Catch:{ j -> 0x005e }
        L_0x00e8:
            K7.c r13 = new K7.c     // Catch:{ j -> 0x005e }
            r13.<init>(r12)     // Catch:{ j -> 0x005e }
            return r13
        L_0x00ee:
            java.io.IOException r12 = new java.io.IOException     // Catch:{ j -> 0x005e }
            java.lang.String r13 = "External entities must be disabled see: CVE-2017-1000498"
            r12.<init>(r13)     // Catch:{ j -> 0x005e }
            throw r12     // Catch:{ j -> 0x005e }
        L_0x00f6:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Cannot load SVG from stream"
            r13.<init>(r14, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: fs.b.a(java.io.InputStream, int, int, C7.i):E7.v");
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, C7.i iVar) {
        C17542s.j(inputStream, "source");
        C17542s.j(iVar, "options");
        return true;
    }
}
