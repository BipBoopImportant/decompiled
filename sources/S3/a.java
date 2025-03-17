package s3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import jb.j;
import t3.C5950a;
import t3.N;

public final class a {

    /* renamed from: A  reason: collision with root package name */
    private static final String f29021A = N.A0(6);

    /* renamed from: B  reason: collision with root package name */
    private static final String f29022B = N.A0(7);

    /* renamed from: C  reason: collision with root package name */
    private static final String f29023C = N.A0(8);

    /* renamed from: D  reason: collision with root package name */
    private static final String f29024D = N.A0(9);

    /* renamed from: E  reason: collision with root package name */
    private static final String f29025E = N.A0(10);

    /* renamed from: F  reason: collision with root package name */
    private static final String f29026F = N.A0(11);

    /* renamed from: G  reason: collision with root package name */
    private static final String f29027G = N.A0(12);

    /* renamed from: H  reason: collision with root package name */
    private static final String f29028H = N.A0(13);

    /* renamed from: I  reason: collision with root package name */
    private static final String f29029I = N.A0(14);

    /* renamed from: J  reason: collision with root package name */
    private static final String f29030J = N.A0(15);

    /* renamed from: K  reason: collision with root package name */
    private static final String f29031K = N.A0(16);
    @Deprecated

    /* renamed from: r  reason: collision with root package name */
    public static final a f29032r = new b().o("").a();

    /* renamed from: s  reason: collision with root package name */
    private static final String f29033s = N.A0(0);

    /* renamed from: t  reason: collision with root package name */
    private static final String f29034t = N.A0(17);

    /* renamed from: u  reason: collision with root package name */
    private static final String f29035u = N.A0(1);

    /* renamed from: v  reason: collision with root package name */
    private static final String f29036v = N.A0(2);

    /* renamed from: w  reason: collision with root package name */
    private static final String f29037w = N.A0(3);

    /* renamed from: x  reason: collision with root package name */
    private static final String f29038x = N.A0(18);

    /* renamed from: y  reason: collision with root package name */
    private static final String f29039y = N.A0(4);

    /* renamed from: z  reason: collision with root package name */
    private static final String f29040z = N.A0(5);

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f29041a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f29042b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f29043c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f29044d;

    /* renamed from: e  reason: collision with root package name */
    public final float f29045e;

    /* renamed from: f  reason: collision with root package name */
    public final int f29046f;

    /* renamed from: g  reason: collision with root package name */
    public final int f29047g;

    /* renamed from: h  reason: collision with root package name */
    public final float f29048h;

    /* renamed from: i  reason: collision with root package name */
    public final int f29049i;

    /* renamed from: j  reason: collision with root package name */
    public final float f29050j;

    /* renamed from: k  reason: collision with root package name */
    public final float f29051k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f29052l;

    /* renamed from: m  reason: collision with root package name */
    public final int f29053m;

    /* renamed from: n  reason: collision with root package name */
    public final int f29054n;

    /* renamed from: o  reason: collision with root package name */
    public final float f29055o;

    /* renamed from: p  reason: collision with root package name */
    public final int f29056p;

    /* renamed from: q  reason: collision with root package name */
    public final float f29057q;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f29058a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f29059b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f29060c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f29061d;

        /* renamed from: e  reason: collision with root package name */
        private float f29062e;

        /* renamed from: f  reason: collision with root package name */
        private int f29063f;

        /* renamed from: g  reason: collision with root package name */
        private int f29064g;

        /* renamed from: h  reason: collision with root package name */
        private float f29065h;

        /* renamed from: i  reason: collision with root package name */
        private int f29066i;

        /* renamed from: j  reason: collision with root package name */
        private int f29067j;

        /* renamed from: k  reason: collision with root package name */
        private float f29068k;

        /* renamed from: l  reason: collision with root package name */
        private float f29069l;

        /* renamed from: m  reason: collision with root package name */
        private float f29070m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f29071n;

        /* renamed from: o  reason: collision with root package name */
        private int f29072o;

        /* renamed from: p  reason: collision with root package name */
        private int f29073p;

        /* renamed from: q  reason: collision with root package name */
        private float f29074q;

        public a a() {
            return new a(this.f29058a, this.f29060c, this.f29061d, this.f29059b, this.f29062e, this.f29063f, this.f29064g, this.f29065h, this.f29066i, this.f29067j, this.f29068k, this.f29069l, this.f29070m, this.f29071n, this.f29072o, this.f29073p, this.f29074q);
        }

        public b b() {
            this.f29071n = false;
            return this;
        }

        public int c() {
            return this.f29064g;
        }

        public int d() {
            return this.f29066i;
        }

        public CharSequence e() {
            return this.f29058a;
        }

        public b f(Bitmap bitmap) {
            this.f29059b = bitmap;
            return this;
        }

        public b g(float f10) {
            this.f29070m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f29062e = f10;
            this.f29063f = i10;
            return this;
        }

        public b i(int i10) {
            this.f29064g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f29061d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f29065h = f10;
            return this;
        }

        public b l(int i10) {
            this.f29066i = i10;
            return this;
        }

        public b m(float f10) {
            this.f29074q = f10;
            return this;
        }

        public b n(float f10) {
            this.f29069l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f29058a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f29060c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f29068k = f10;
            this.f29067j = i10;
            return this;
        }

        public b r(int i10) {
            this.f29073p = i10;
            return this;
        }

        public b s(int i10) {
            this.f29072o = i10;
            this.f29071n = true;
            return this;
        }

        public b() {
            this.f29058a = null;
            this.f29059b = null;
            this.f29060c = null;
            this.f29061d = null;
            this.f29062e = -3.4028235E38f;
            this.f29063f = Integer.MIN_VALUE;
            this.f29064g = Integer.MIN_VALUE;
            this.f29065h = -3.4028235E38f;
            this.f29066i = Integer.MIN_VALUE;
            this.f29067j = Integer.MIN_VALUE;
            this.f29068k = -3.4028235E38f;
            this.f29069l = -3.4028235E38f;
            this.f29070m = -3.4028235E38f;
            this.f29071n = false;
            this.f29072o = -16777216;
            this.f29073p = Integer.MIN_VALUE;
        }

        private b(a aVar) {
            this.f29058a = aVar.f29041a;
            this.f29059b = aVar.f29044d;
            this.f29060c = aVar.f29042b;
            this.f29061d = aVar.f29043c;
            this.f29062e = aVar.f29045e;
            this.f29063f = aVar.f29046f;
            this.f29064g = aVar.f29047g;
            this.f29065h = aVar.f29048h;
            this.f29066i = aVar.f29049i;
            this.f29067j = aVar.f29054n;
            this.f29068k = aVar.f29055o;
            this.f29069l = aVar.f29050j;
            this.f29070m = aVar.f29051k;
            this.f29071n = aVar.f29052l;
            this.f29072o = aVar.f29053m;
            this.f29073p = aVar.f29056p;
            this.f29074q = aVar.f29057q;
        }
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f29033s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f29034t);
            if (parcelableArrayList != null) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    c.c((Bundle) it.next(), valueOf);
                }
                bVar.o(valueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f29035u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f29036v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f29037w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f29038x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f29039y;
        if (bundle.containsKey(str)) {
            String str2 = f29040z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f29021A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = f29022B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = f29023C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = f29025E;
        if (bundle.containsKey(str6)) {
            String str7 = f29024D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f29026F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = f29027G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = f29028H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f29029I, false)) {
            bVar.b();
        }
        String str11 = f29030J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = f29031K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f29041a;
        if (charSequence != null) {
            bundle.putCharSequence(f29033s, charSequence);
            CharSequence charSequence2 = this.f29041a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> a10 = c.a((Spanned) charSequence2);
                if (!a10.isEmpty()) {
                    bundle.putParcelableArrayList(f29034t, a10);
                }
            }
        }
        bundle.putSerializable(f29035u, this.f29042b);
        bundle.putSerializable(f29036v, this.f29043c);
        bundle.putFloat(f29039y, this.f29045e);
        bundle.putInt(f29040z, this.f29046f);
        bundle.putInt(f29021A, this.f29047g);
        bundle.putFloat(f29022B, this.f29048h);
        bundle.putInt(f29023C, this.f29049i);
        bundle.putInt(f29024D, this.f29054n);
        bundle.putFloat(f29025E, this.f29055o);
        bundle.putFloat(f29026F, this.f29050j);
        bundle.putFloat(f29027G, this.f29051k);
        bundle.putBoolean(f29029I, this.f29052l);
        bundle.putInt(f29028H, this.f29053m);
        bundle.putInt(f29030J, this.f29056p);
        bundle.putFloat(f29031K, this.f29057q);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle d() {
        Bundle c10 = c();
        if (this.f29044d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C5950a.g(this.f29044d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            c10.putByteArray(f29038x, byteArrayOutputStream.toByteArray());
        }
        return c10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r2 = r4.f29044d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r3 = r5.f29044d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r5 == 0) goto L_0x0099
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<s3.a> r3 = s3.a.class
            if (r3 == r2) goto L_0x0011
            goto L_0x0099
        L_0x0011:
            s3.a r5 = (s3.a) r5
            java.lang.CharSequence r2 = r4.f29041a
            java.lang.CharSequence r3 = r5.f29041a
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0097
            android.text.Layout$Alignment r2 = r4.f29042b
            android.text.Layout$Alignment r3 = r5.f29042b
            if (r2 != r3) goto L_0x0097
            android.text.Layout$Alignment r2 = r4.f29043c
            android.text.Layout$Alignment r3 = r5.f29043c
            if (r2 != r3) goto L_0x0097
            android.graphics.Bitmap r2 = r4.f29044d
            if (r2 != 0) goto L_0x0032
            android.graphics.Bitmap r2 = r5.f29044d
            if (r2 != 0) goto L_0x0097
            goto L_0x003c
        L_0x0032:
            android.graphics.Bitmap r3 = r5.f29044d
            if (r3 == 0) goto L_0x0097
            boolean r2 = r2.sameAs(r3)
            if (r2 == 0) goto L_0x0097
        L_0x003c:
            float r2 = r4.f29045e
            float r3 = r5.f29045e
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            int r2 = r4.f29046f
            int r3 = r5.f29046f
            if (r2 != r3) goto L_0x0097
            int r2 = r4.f29047g
            int r3 = r5.f29047g
            if (r2 != r3) goto L_0x0097
            float r2 = r4.f29048h
            float r3 = r5.f29048h
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            int r2 = r4.f29049i
            int r3 = r5.f29049i
            if (r2 != r3) goto L_0x0097
            float r2 = r4.f29050j
            float r3 = r5.f29050j
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            float r2 = r4.f29051k
            float r3 = r5.f29051k
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            boolean r2 = r4.f29052l
            boolean r3 = r5.f29052l
            if (r2 != r3) goto L_0x0097
            int r2 = r4.f29053m
            int r3 = r5.f29053m
            if (r2 != r3) goto L_0x0097
            int r2 = r4.f29054n
            int r3 = r5.f29054n
            if (r2 != r3) goto L_0x0097
            float r2 = r4.f29055o
            float r3 = r5.f29055o
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            int r2 = r4.f29056p
            int r3 = r5.f29056p
            if (r2 != r3) goto L_0x0097
            float r2 = r4.f29057q
            float r5 = r5.f29057q
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r0 = r1
        L_0x0098:
            return r0
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        CharSequence charSequence = this.f29041a;
        return j.b(charSequence, this.f29042b, this.f29043c, this.f29044d, Float.valueOf(this.f29045e), Integer.valueOf(this.f29046f), Integer.valueOf(this.f29047g), Float.valueOf(this.f29048h), Integer.valueOf(this.f29049i), Float.valueOf(this.f29050j), Float.valueOf(this.f29051k), Boolean.valueOf(this.f29052l), Integer.valueOf(this.f29053m), Integer.valueOf(this.f29054n), Float.valueOf(this.f29055o), Integer.valueOf(this.f29056p), Float.valueOf(this.f29057q));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            C5950a.e(bitmap);
        } else {
            C5950a.a(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f29041a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f29041a = charSequence.toString();
        } else {
            this.f29041a = null;
        }
        this.f29042b = alignment;
        this.f29043c = alignment2;
        this.f29044d = bitmap2;
        this.f29045e = f10;
        this.f29046f = i10;
        this.f29047g = i11;
        this.f29048h = f11;
        this.f29049i = i12;
        this.f29050j = f13;
        this.f29051k = f14;
        this.f29052l = z10;
        this.f29053m = i14;
        this.f29054n = i13;
        this.f29055o = f12;
        this.f29056p = i15;
        this.f29057q = f15;
    }
}
