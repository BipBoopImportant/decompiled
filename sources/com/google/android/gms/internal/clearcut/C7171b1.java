package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.b1  reason: case insensitive filesystem */
final class C7171b1 {

    /* renamed from: A  reason: collision with root package name */
    private int f48306A;

    /* renamed from: B  reason: collision with root package name */
    private int f48307B;

    /* renamed from: C  reason: collision with root package name */
    private Field f48308C;

    /* renamed from: D  reason: collision with root package name */
    private Object f48309D;

    /* renamed from: E  reason: collision with root package name */
    private Object f48310E;

    /* renamed from: F  reason: collision with root package name */
    private Object f48311F;

    /* renamed from: a  reason: collision with root package name */
    private final C7175c1 f48312a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f48313b;

    /* renamed from: c  reason: collision with root package name */
    private Class<?> f48314c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f48315d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f48316e;

    /* renamed from: f  reason: collision with root package name */
    private final int f48317f;

    /* renamed from: g  reason: collision with root package name */
    private final int f48318g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final int f48319h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final int f48320i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final int f48321j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final int f48322k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final int f48323l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final int f48324m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final int[] f48325n;

    /* renamed from: o  reason: collision with root package name */
    private int f48326o;

    /* renamed from: p  reason: collision with root package name */
    private int f48327p;

    /* renamed from: q  reason: collision with root package name */
    private int f48328q = Integer.MAX_VALUE;

    /* renamed from: r  reason: collision with root package name */
    private int f48329r = Integer.MIN_VALUE;

    /* renamed from: s  reason: collision with root package name */
    private int f48330s = 0;

    /* renamed from: t  reason: collision with root package name */
    private int f48331t = 0;

    /* renamed from: u  reason: collision with root package name */
    private int f48332u = 0;

    /* renamed from: v  reason: collision with root package name */
    private int f48333v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f48334w = 0;

    /* renamed from: x  reason: collision with root package name */
    private int f48335x;

    /* renamed from: y  reason: collision with root package name */
    private int f48336y;

    /* renamed from: z  reason: collision with root package name */
    private int f48337z;

    C7171b1(Class<?> cls, String str, Object[] objArr) {
        this.f48314c = cls;
        C7175c1 c1Var = new C7175c1(str);
        this.f48312a = c1Var;
        this.f48313b = objArr;
        this.f48315d = c1Var.b();
        int b10 = c1Var.b();
        this.f48316e = b10;
        int[] iArr = null;
        if (b10 == 0) {
            this.f48317f = 0;
            this.f48318g = 0;
            this.f48319h = 0;
            this.f48320i = 0;
            this.f48321j = 0;
            this.f48323l = 0;
            this.f48322k = 0;
            this.f48324m = 0;
            this.f48325n = null;
            return;
        }
        int b11 = c1Var.b();
        this.f48317f = b11;
        int b12 = c1Var.b();
        this.f48318g = b12;
        this.f48319h = c1Var.b();
        this.f48320i = c1Var.b();
        this.f48323l = c1Var.b();
        this.f48322k = c1Var.b();
        this.f48321j = c1Var.b();
        this.f48324m = c1Var.b();
        int b13 = c1Var.b();
        this.f48325n = b13 != 0 ? new int[b13] : iArr;
        this.f48326o = (b11 << 1) + b12;
    }

    private static Field c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    private final Object f() {
        Object[] objArr = this.f48313b;
        int i10 = this.f48326o;
        this.f48326o = i10 + 1;
        return objArr[i10];
    }

    private final boolean i() {
        return (this.f48315d & 1) == 1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (i() != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014b, code lost:
        if ((r5.f48336y & androidx.recyclerview.widget.RecyclerView.n.FLAG_MOVED) != 0) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        if (i() != false) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r5 = this;
            com.google.android.gms.internal.clearcut.c1 r0 = r5.f48312a
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            com.google.android.gms.internal.clearcut.c1 r0 = r5.f48312a
            int r0 = r0.b()
            r5.f48335x = r0
            com.google.android.gms.internal.clearcut.c1 r0 = r5.f48312a
            int r0 = r0.b()
            r5.f48336y = r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5.f48337z = r0
            int r1 = r5.f48335x
            int r2 = r5.f48328q
            if (r1 >= r2) goto L_0x0026
            r5.f48328q = r1
        L_0x0026:
            int r2 = r5.f48329r
            if (r1 <= r2) goto L_0x002c
            r5.f48329r = r1
        L_0x002c:
            com.google.android.gms.internal.clearcut.b0 r1 = com.google.android.gms.internal.clearcut.C7170b0.MAP
            int r2 = r1.a()
            r3 = 1
            if (r0 != r2) goto L_0x003b
            int r0 = r5.f48330s
            int r0 = r0 + r3
            r5.f48330s = r0
            goto L_0x0054
        L_0x003b:
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r2 = com.google.android.gms.internal.clearcut.C7170b0.DOUBLE_LIST
            int r2 = r2.a()
            if (r0 < r2) goto L_0x0054
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r2 = com.google.android.gms.internal.clearcut.C7170b0.GROUP_LIST
            int r2 = r2.a()
            if (r0 > r2) goto L_0x0054
            int r0 = r5.f48331t
            int r0 = r0 + r3
            r5.f48331t = r0
        L_0x0054:
            int r0 = r5.f48334w
            int r0 = r0 + r3
            r5.f48334w = r0
            int r2 = r5.f48328q
            int r4 = r5.f48335x
            boolean r0 = com.google.android.gms.internal.clearcut.C7184f1.s(r2, r4, r0)
            if (r0 == 0) goto L_0x006e
            int r0 = r5.f48335x
            int r0 = r0 + r3
            r5.f48333v = r0
            int r2 = r5.f48328q
            int r0 = r0 - r2
        L_0x006b:
            r5.f48332u = r0
            goto L_0x0072
        L_0x006e:
            int r0 = r5.f48332u
            int r0 = r0 + r3
            goto L_0x006b
        L_0x0072:
            int r0 = r5.f48336y
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0084
            int[] r0 = r5.f48325n
            int r2 = r5.f48327p
            int r4 = r2 + 1
            r5.f48327p = r4
            int r4 = r5.f48335x
            r0[r2] = r4
        L_0x0084:
            r0 = 0
            r5.f48309D = r0
            r5.f48310E = r0
            r5.f48311F = r0
            boolean r0 = r5.k()
            if (r0 == 0) goto L_0x00d4
            com.google.android.gms.internal.clearcut.c1 r0 = r5.f48312a
            int r0 = r0.b()
            r5.f48306A = r0
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r1 = com.google.android.gms.internal.clearcut.C7170b0.MESSAGE
            int r1 = r1.a()
            int r1 = r1 + 51
            if (r0 == r1) goto L_0x00cc
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r1 = com.google.android.gms.internal.clearcut.C7170b0.GROUP
            int r1 = r1.a()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x00b2
            goto L_0x00cc
        L_0x00b2:
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r1 = com.google.android.gms.internal.clearcut.C7170b0.ENUM
            int r1 = r1.a()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x015f
            boolean r0 = r5.i()
            if (r0 == 0) goto L_0x015f
        L_0x00c4:
            java.lang.Object r0 = r5.f()
            r5.f48310E = r0
            goto L_0x015f
        L_0x00cc:
            java.lang.Object r0 = r5.f()
        L_0x00d0:
            r5.f48309D = r0
            goto L_0x015f
        L_0x00d4:
            java.lang.Class<?> r0 = r5.f48314c
            java.lang.Object r2 = r5.f()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r0 = c(r0, r2)
            r5.f48308C = r0
            boolean r0 = r5.o()
            if (r0 == 0) goto L_0x00f0
            com.google.android.gms.internal.clearcut.c1 r0 = r5.f48312a
            int r0 = r0.b()
            r5.f48307B = r0
        L_0x00f0:
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r2 = com.google.android.gms.internal.clearcut.C7170b0.MESSAGE
            int r2 = r2.a()
            if (r0 == r2) goto L_0x0157
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r2 = com.google.android.gms.internal.clearcut.C7170b0.GROUP
            int r2 = r2.a()
            if (r0 != r2) goto L_0x0105
            goto L_0x0157
        L_0x0105:
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r2 = com.google.android.gms.internal.clearcut.C7170b0.MESSAGE_LIST
            int r2 = r2.a()
            if (r0 == r2) goto L_0x00cc
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r2 = com.google.android.gms.internal.clearcut.C7170b0.GROUP_LIST
            int r2 = r2.a()
            if (r0 != r2) goto L_0x011a
            goto L_0x00cc
        L_0x011a:
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r2 = com.google.android.gms.internal.clearcut.C7170b0.ENUM
            int r2 = r2.a()
            if (r0 == r2) goto L_0x014f
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r2 = com.google.android.gms.internal.clearcut.C7170b0.ENUM_LIST
            int r2 = r2.a()
            if (r0 == r2) goto L_0x014f
            int r0 = r5.f48337z
            com.google.android.gms.internal.clearcut.b0 r2 = com.google.android.gms.internal.clearcut.C7170b0.ENUM_LIST_PACKED
            int r2 = r2.a()
            if (r0 != r2) goto L_0x0139
            goto L_0x014f
        L_0x0139:
            int r0 = r5.f48337z
            int r1 = r1.a()
            if (r0 != r1) goto L_0x015f
            java.lang.Object r0 = r5.f()
            r5.f48311F = r0
            int r0 = r5.f48336y
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x015f
            goto L_0x00c4
        L_0x014f:
            boolean r0 = r5.i()
            if (r0 == 0) goto L_0x015f
            goto L_0x00c4
        L_0x0157:
            java.lang.reflect.Field r0 = r5.f48308C
            java.lang.Class r0 = r0.getType()
            goto L_0x00d0
        L_0x015f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C7171b1.a():boolean");
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        return this.f48335x;
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.f48337z;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.f48337z > C7170b0.MAP.a();
    }

    /* access modifiers changed from: package-private */
    public final Field l() {
        int i10 = this.f48306A << 1;
        Object obj = this.f48313b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c10 = c(this.f48314c, (String) obj);
        this.f48313b[i10] = c10;
        return c10;
    }

    /* access modifiers changed from: package-private */
    public final Field m() {
        int i10 = (this.f48306A << 1) + 1;
        Object obj = this.f48313b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c10 = c(this.f48314c, (String) obj);
        this.f48313b[i10] = c10;
        return c10;
    }

    /* access modifiers changed from: package-private */
    public final Field n() {
        return this.f48308C;
    }

    /* access modifiers changed from: package-private */
    public final boolean o() {
        return i() && this.f48337z <= C7170b0.GROUP.a();
    }

    /* access modifiers changed from: package-private */
    public final Field p() {
        int i10 = (this.f48317f << 1) + (this.f48307B / 32);
        Object obj = this.f48313b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c10 = c(this.f48314c, (String) obj);
        this.f48313b[i10] = c10;
        return c10;
    }

    /* access modifiers changed from: package-private */
    public final int q() {
        return this.f48307B % 32;
    }

    /* access modifiers changed from: package-private */
    public final boolean r() {
        return (this.f48336y & 256) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return (this.f48336y & 512) != 0;
    }

    /* access modifiers changed from: package-private */
    public final Object t() {
        return this.f48309D;
    }

    /* access modifiers changed from: package-private */
    public final Object u() {
        return this.f48310E;
    }

    /* access modifiers changed from: package-private */
    public final Object v() {
        return this.f48311F;
    }
}
