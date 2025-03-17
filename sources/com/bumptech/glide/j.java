package com.bumptech.glide;

import F7.d;
import S7.b;
import Y7.f;
import android.content.Context;
import java.util.List;

final class j {

    class a implements f.b<i> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f46521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f46522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f46523c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ S7.a f46524d;

        a(b bVar, List list, S7.a aVar) {
            this.f46522b = bVar;
            this.f46523c = list;
            this.f46524d = aVar;
        }

        /* renamed from: a */
        public i get() {
            if (!this.f46521a) {
                V4.a.c("Glide registry");
                this.f46521a = true;
                try {
                    return j.a(this.f46522b, this.f46523c, this.f46524d);
                } finally {
                    this.f46521a = false;
                    V4.a.f();
                }
            } else {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
        }
    }

    static i a(b bVar, List<b> list, S7.a aVar) {
        d f10 = bVar.f();
        F7.b e10 = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e g10 = bVar.i().g();
        i iVar = new i();
        b(applicationContext, iVar, f10, e10, g10);
        c(applicationContext, bVar, iVar, list, aVar);
        return iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0275  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(android.content.Context r24, com.bumptech.glide.i r25, F7.d r26, F7.b r27, com.bumptech.glide.e r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            L7.l r4 = new L7.l
            r4.<init>()
            r1.o(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 < r5) goto L_0x001e
            L7.q r5 = new L7.q
            r5.<init>()
            r1.o(r5)
        L_0x001e:
            android.content.res.Resources r5 = r24.getResources()
            java.util.List r6 = r25.g()
            P7.a r7 = new P7.a
            r7.<init>(r0, r6, r2, r3)
            C7.k r8 = L7.E.m(r26)
            L7.n r9 = new L7.n
            java.util.List r10 = r25.g()
            android.util.DisplayMetrics r11 = r5.getDisplayMetrics()
            r9.<init>(r10, r11, r2, r3)
            r10 = 28
            if (r4 < r10) goto L_0x0055
            java.lang.Class<com.bumptech.glide.c$b> r11 = com.bumptech.glide.c.b.class
            r12 = r28
            boolean r11 = r12.a(r11)
            if (r11 == 0) goto L_0x0055
            L7.u r11 = new L7.u
            r11.<init>()
            L7.i r12 = new L7.i
            r12.<init>()
            goto L_0x005f
        L_0x0055:
            L7.h r12 = new L7.h
            r12.<init>(r9)
            L7.A r11 = new L7.A
            r11.<init>(r9, r3)
        L_0x005f:
            java.lang.String r13 = "Animation"
            java.lang.Class<java.nio.ByteBuffer> r14 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.Drawable> r15 = android.graphics.drawable.Drawable.class
            r16 = r7
            java.lang.Class<java.io.InputStream> r7 = java.io.InputStream.class
            if (r4 < r10) goto L_0x0079
            C7.k r10 = N7.e.f(r6, r3)
            r1.e(r13, r7, r15, r10)
            C7.k r10 = N7.e.a(r6, r3)
            r1.e(r13, r14, r15, r10)
        L_0x0079:
            N7.j r10 = new N7.j
            r10.<init>(r0)
            r17 = r4
            L7.c r4 = new L7.c
            r4.<init>(r3)
            Q7.a r0 = new Q7.a
            r0.<init>()
            r28 = r0
            Q7.d r0 = new Q7.d
            r0.<init>()
            r18 = r0
            android.content.ContentResolver r0 = r24.getContentResolver()
            r19 = r0
            I7.c r0 = new I7.c
            r0.<init>()
            com.bumptech.glide.i r0 = r1.a(r14, r0)
            r20 = r10
            I7.v r10 = new I7.v
            r10.<init>(r3)
            com.bumptech.glide.i r0 = r0.a(r7, r10)
            java.lang.String r10 = "Bitmap"
            r21 = r15
            java.lang.Class<android.graphics.Bitmap> r15 = android.graphics.Bitmap.class
            com.bumptech.glide.i r0 = r0.e(r10, r14, r15, r12)
            r0.e(r10, r7, r15, r11)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.c()
            r22 = r13
            java.lang.Class<android.os.ParcelFileDescriptor> r13 = android.os.ParcelFileDescriptor.class
            if (r0 == 0) goto L_0x00cc
            L7.w r0 = new L7.w
            r0.<init>(r9)
            r1.e(r10, r13, r15, r0)
        L_0x00cc:
            C7.k r0 = L7.E.c(r26)
            java.lang.Class<android.content.res.AssetFileDescriptor> r9 = android.content.res.AssetFileDescriptor.class
            r1.e(r10, r9, r15, r0)
            com.bumptech.glide.i r0 = r1.e(r10, r13, r15, r8)
            r23 = r9
            I7.x$a r9 = I7.x.a.a()
            com.bumptech.glide.i r0 = r0.d(r15, r15, r9)
            L7.C r9 = new L7.C
            r9.<init>()
            com.bumptech.glide.i r0 = r0.e(r10, r15, r15, r9)
            com.bumptech.glide.i r0 = r0.b(r15, r4)
            L7.a r9 = new L7.a
            r9.<init>(r5, r12)
            java.lang.String r12 = "BitmapDrawable"
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.i r0 = r0.e(r12, r14, r1, r9)
            L7.a r9 = new L7.a
            r9.<init>(r5, r11)
            com.bumptech.glide.i r0 = r0.e(r12, r7, r1, r9)
            L7.a r9 = new L7.a
            r9.<init>(r5, r8)
            com.bumptech.glide.i r0 = r0.e(r12, r13, r1, r9)
            L7.b r8 = new L7.b
            r8.<init>(r2, r4)
            com.bumptech.glide.i r0 = r0.b(r1, r8)
            P7.j r4 = new P7.j
            r8 = r16
            r4.<init>(r6, r8, r3)
            java.lang.Class<P7.c> r6 = P7.c.class
            r9 = r22
            com.bumptech.glide.i r0 = r0.e(r9, r7, r6, r4)
            com.bumptech.glide.i r0 = r0.e(r9, r14, r6, r8)
            P7.d r4 = new P7.d
            r4.<init>()
            com.bumptech.glide.i r0 = r0.b(r6, r4)
            I7.x$a r4 = I7.x.a.a()
            java.lang.Class<A7.a> r8 = A7.a.class
            com.bumptech.glide.i r0 = r0.d(r8, r8, r4)
            P7.h r4 = new P7.h
            r4.<init>(r2)
            com.bumptech.glide.i r0 = r0.e(r10, r8, r15, r4)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            r9 = r20
            r8 = r21
            com.bumptech.glide.i r0 = r0.c(r4, r8, r9)
            L7.y r10 = new L7.y
            r10.<init>(r9, r2)
            com.bumptech.glide.i r0 = r0.c(r4, r15, r10)
            M7.a$a r9 = new M7.a$a
            r9.<init>()
            com.bumptech.glide.i r0 = r0.p(r9)
            I7.d$b r9 = new I7.d$b
            r9.<init>()
            java.lang.Class<java.io.File> r10 = java.io.File.class
            com.bumptech.glide.i r0 = r0.d(r10, r14, r9)
            I7.g$e r9 = new I7.g$e
            r9.<init>()
            com.bumptech.glide.i r0 = r0.d(r10, r7, r9)
            O7.a r9 = new O7.a
            r9.<init>()
            com.bumptech.glide.i r0 = r0.c(r10, r10, r9)
            I7.g$b r9 = new I7.g$b
            r9.<init>()
            com.bumptech.glide.i r0 = r0.d(r10, r13, r9)
            I7.x$a r9 = I7.x.a.a()
            com.bumptech.glide.i r0 = r0.d(r10, r10, r9)
            com.bumptech.glide.load.data.k$a r9 = new com.bumptech.glide.load.data.k$a
            r9.<init>(r3)
            r0.p(r9)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.c()
            if (r0 == 0) goto L_0x01ab
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r3 = r1
            r1 = r25
            r1.p(r0)
            goto L_0x01ae
        L_0x01ab:
            r3 = r1
            r1 = r25
        L_0x01ae:
            I7.p r0 = I7.f.g(r24)
            I7.p r9 = I7.f.c(r24)
            I7.p r11 = I7.f.e(r24)
            java.lang.Class r12 = java.lang.Integer.TYPE
            r16 = r6
            com.bumptech.glide.i r6 = r1.d(r12, r7, r0)
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            com.bumptech.glide.i r0 = r6.d(r2, r7, r0)
            r6 = r23
            com.bumptech.glide.i r0 = r0.d(r12, r6, r9)
            com.bumptech.glide.i r0 = r0.d(r2, r6, r9)
            com.bumptech.glide.i r0 = r0.d(r12, r8, r11)
            com.bumptech.glide.i r0 = r0.d(r2, r8, r11)
            I7.p r9 = I7.u.f(r24)
            com.bumptech.glide.i r0 = r0.d(r4, r7, r9)
            I7.p r9 = I7.u.e(r24)
            r0.d(r4, r6, r9)
            I7.t$c r0 = new I7.t$c
            r0.<init>(r5)
            I7.t$a r9 = new I7.t$a
            r9.<init>(r5)
            I7.t$b r11 = new I7.t$b
            r11.<init>(r5)
            r20 = r3
            com.bumptech.glide.i r3 = r1.d(r2, r4, r0)
            com.bumptech.glide.i r0 = r3.d(r12, r4, r0)
            com.bumptech.glide.i r0 = r0.d(r2, r6, r9)
            com.bumptech.glide.i r0 = r0.d(r12, r6, r9)
            com.bumptech.glide.i r0 = r0.d(r2, r7, r11)
            r0.d(r12, r7, r11)
            I7.e$c r0 = new I7.e$c
            r0.<init>()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            com.bumptech.glide.i r0 = r1.d(r2, r7, r0)
            I7.e$c r3 = new I7.e$c
            r3.<init>()
            com.bumptech.glide.i r0 = r0.d(r4, r7, r3)
            I7.w$c r3 = new I7.w$c
            r3.<init>()
            com.bumptech.glide.i r0 = r0.d(r2, r7, r3)
            I7.w$b r3 = new I7.w$b
            r3.<init>()
            com.bumptech.glide.i r0 = r0.d(r2, r13, r3)
            I7.w$a r3 = new I7.w$a
            r3.<init>()
            com.bumptech.glide.i r0 = r0.d(r2, r6, r3)
            I7.a$c r2 = new I7.a$c
            android.content.res.AssetManager r3 = r24.getAssets()
            r2.<init>(r3)
            com.bumptech.glide.i r0 = r0.d(r4, r7, r2)
            I7.a$b r2 = new I7.a$b
            android.content.res.AssetManager r3 = r24.getAssets()
            r2.<init>(r3)
            com.bumptech.glide.i r0 = r0.d(r4, r6, r2)
            J7.b$a r2 = new J7.b$a
            r3 = r24
            r9 = r28
            r2.<init>(r3)
            com.bumptech.glide.i r0 = r0.d(r4, r7, r2)
            J7.c$a r2 = new J7.c$a
            r2.<init>(r3)
            r0.d(r4, r7, r2)
            r0 = 29
            r2 = r17
            if (r2 < r0) goto L_0x0285
            J7.d$c r0 = new J7.d$c
            r0.<init>(r3)
            r1.d(r4, r7, r0)
            J7.d$b r0 = new J7.d$b
            r0.<init>(r3)
            r1.d(r4, r13, r0)
        L_0x0285:
            I7.y$d r0 = new I7.y$d
            r2 = r19
            r0.<init>(r2)
            com.bumptech.glide.i r0 = r1.d(r4, r7, r0)
            I7.y$b r11 = new I7.y$b
            r11.<init>(r2)
            com.bumptech.glide.i r0 = r0.d(r4, r13, r11)
            I7.y$a r11 = new I7.y$a
            r11.<init>(r2)
            com.bumptech.glide.i r0 = r0.d(r4, r6, r11)
            I7.z$a r2 = new I7.z$a
            r2.<init>()
            com.bumptech.glide.i r0 = r0.d(r4, r7, r2)
            J7.g$a r2 = new J7.g$a
            r2.<init>()
            java.lang.Class<java.net.URL> r6 = java.net.URL.class
            com.bumptech.glide.i r0 = r0.d(r6, r7, r2)
            I7.l$a r2 = new I7.l$a
            r2.<init>(r3)
            com.bumptech.glide.i r0 = r0.d(r4, r10, r2)
            J7.a$a r2 = new J7.a$a
            r2.<init>()
            java.lang.Class<I7.h> r3 = I7.h.class
            com.bumptech.glide.i r0 = r0.d(r3, r7, r2)
            I7.b$a r2 = new I7.b$a
            r2.<init>()
            java.lang.Class<byte[]> r3 = byte[].class
            com.bumptech.glide.i r0 = r0.d(r3, r14, r2)
            I7.b$d r2 = new I7.b$d
            r2.<init>()
            com.bumptech.glide.i r0 = r0.d(r3, r7, r2)
            I7.x$a r2 = I7.x.a.a()
            com.bumptech.glide.i r0 = r0.d(r4, r4, r2)
            I7.x$a r2 = I7.x.a.a()
            com.bumptech.glide.i r0 = r0.d(r8, r8, r2)
            N7.k r2 = new N7.k
            r2.<init>()
            com.bumptech.glide.i r0 = r0.c(r8, r8, r2)
            Q7.b r2 = new Q7.b
            r2.<init>(r5)
            r4 = r20
            com.bumptech.glide.i r0 = r0.q(r15, r4, r2)
            com.bumptech.glide.i r0 = r0.q(r15, r3, r9)
            Q7.c r2 = new Q7.c
            r6 = r26
            r7 = r18
            r2.<init>(r6, r9, r7)
            com.bumptech.glide.i r0 = r0.q(r8, r3, r2)
            r2 = r16
            r0.q(r2, r3, r7)
            C7.k r0 = L7.E.d(r26)
            r1.c(r14, r15, r0)
            L7.a r2 = new L7.a
            r2.<init>(r5, r0)
            r1.c(r14, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.j.b(android.content.Context, com.bumptech.glide.i, F7.d, F7.b, com.bumptech.glide.e):void");
    }

    private static void c(Context context, b bVar, i iVar, List<b> list, S7.a aVar) {
        for (b next : list) {
            try {
                next.b(context, bVar, iVar);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next.getClass().getName(), e10);
            }
        }
        if (aVar != null) {
            aVar.a(context, bVar, iVar);
        }
    }

    static f.b<i> d(b bVar, List<b> list, S7.a aVar) {
        return new a(bVar, list, aVar);
    }
}
