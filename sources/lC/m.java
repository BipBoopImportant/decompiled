package lC;

import HJ.C15854t;
import I2.C0;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import jC.C14615b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nC.C14844e;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR+\u0010$\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8V@VX\u0002¢\u0006\u0012\u001a\u0004\b\u0015\u0010 \"\u0004\b\u0012\u0010!*\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LlC/m;", "LlC/n;", "Landroid/view/View;", "view", "LlC/d;", "iconColorHandler", "LnC/e;", "suggestIconColor", "<init>", "(Landroid/view/View;LlC/d;LnC/e;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "LjC/b;", "default", "", "applyResult", "b", "(Landroid/graphics/drawable/Drawable;LjC/b;ZLdI/e;)Ljava/lang/Object;", "a", "Landroid/view/View;", "LlC/d;", "c", "LnC/e;", "LI2/C0;", "d", "()LI2/C0;", "rootWindowInsetsCompat", "", "getHeight", "()I", "height", "<set-?>", "()LjC/b;", "(LjC/b;)V", "getIconColor$delegate", "(LlC/m;)Ljava/lang/Object;", "iconColor", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    private final View f128914a;

    /* renamed from: b  reason: collision with root package name */
    private final C14752d f128915b;

    /* renamed from: c  reason: collision with root package name */
    private final C14844e f128916c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.systemui.internal.handler.StatusBarHandlerImpl", f = "StatusBarHandler.kt", l = {90}, m = "suggestIconColor")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f128917c;

        /* renamed from: d  reason: collision with root package name */
        Object f128918d;

        /* renamed from: e  reason: collision with root package name */
        Object f128919e;

        /* renamed from: f  reason: collision with root package name */
        Object f128920f;

        /* renamed from: g  reason: collision with root package name */
        Object f128921g;

        /* renamed from: h  reason: collision with root package name */
        boolean f128922h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f128923i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ m f128924j;

        /* renamed from: k  reason: collision with root package name */
        int f128925k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f128924j = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128923i = obj;
            this.f128925k |= Integer.MIN_VALUE;
            return this.f128924j.b((Drawable) null, (C14615b) null, false, this);
        }
    }

    public m(View view, C14752d dVar, C14844e eVar) {
        C17542s.j(view, "view");
        C17542s.j(dVar, "iconColorHandler");
        C17542s.j(eVar, "suggestIconColor");
        this.f128914a = view;
        this.f128915b = dVar;
        this.f128916c = eVar;
    }

    private final C0 d() {
        C0 z10 = C0.z(this.f128914a.getRootWindowInsets(), this.f128914a);
        C17542s.i(z10, "toWindowInsetsCompat(...)");
        return z10;
    }

    public void a(C14615b bVar) {
        C17542s.j(bVar, "<set-?>");
        this.f128915b.b(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(android.graphics.drawable.Drawable r28, jC.C14615b r29, boolean r30, dI.C17164e<? super jC.C14615b> r31) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r31
            boolean r4 = r3 instanceof lC.m.a
            if (r4 == 0) goto L_0x001c
            r4 = r3
            lC.m$a r4 = (lC.m.a) r4
            int r5 = r4.f128925k
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.f128925k = r5
        L_0x001a:
            r12 = r4
            goto L_0x0022
        L_0x001c:
            lC.m$a r4 = new lC.m$a
            r4.<init>(r0, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r4 = r12.f128923i
            java.lang.Object r15 = eI.C17187b.f()
            int r5 = r12.f128925k
            java.lang.String r14 = "|"
            java.lang.String r16 = "b"
            java.lang.String r17 = "m"
            java.lang.String r13 = "main"
            r11 = 0
            java.lang.String r10 = "SystemUi"
            r9 = 1
            r18 = 0
            if (r5 == 0) goto L_0x0064
            if (r5 != r9) goto L_0x005c
            boolean r1 = r12.f128922h
            java.lang.Object r2 = r12.f128921g
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.Object r2 = r12.f128920f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r12.f128919e
            jC.b r2 = (jC.C14615b) r2
            java.lang.Object r3 = r12.f128918d
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            java.lang.Object r3 = r12.f128917c
            lC.m r3 = (lC.m) r3
            XH.y.b(r4)
            r5 = r3
            r6 = r4
            r4 = r10
            r3 = r13
            r0 = r14
            goto L_0x014c
        L_0x005c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0064:
            XH.y.b(r4)
            boolean r4 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r4 != 0) goto L_0x010c
            qv.e r3 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x007e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0095
            java.lang.Object r6 = r4.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r3, r11)
            if (r7 == 0) goto L_0x007e
            r5.add(r6)
            goto L_0x007e
        L_0x0095:
            java.util.Iterator r4 = r5.iterator()
            r5 = r18
            r6 = r5
        L_0x009c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x010b
            java.lang.Object r7 = r4.next()
            r19 = r7
            qv.b r19 = (qv.C11819b) r19
            r7 = 0
            if (r5 != 0) goto L_0x00d6
            if (r1 == 0) goto L_0x00b8
            java.lang.Class r5 = r28.getClass()
            java.lang.String r5 = r5.getSimpleName()
            goto L_0x00ba
        L_0x00b8:
            r5 = r18
        L_0x00ba:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "drawable is not a BitmapDrawable. bitmap:"
            r8.append(r11)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.String r5 = qv.C11818a.a(r5, r7)
            if (r5 != 0) goto L_0x00d2
            goto L_0x010b
        L_0x00d2:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x00d6:
            if (r6 != 0) goto L_0x00fd
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            boolean r6 = HJ.C15854t.b0(r6, r13, r9)
            if (r6 == 0) goto L_0x00e9
            r6 = r17
            goto L_0x00eb
        L_0x00e9:
            r6 = r16
        L_0x00eb:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r14)
            r8.append(r10)
            java.lang.String r6 = r8.toString()
        L_0x00fd:
            r22 = 0
            r20 = r3
            r21 = r6
            r23 = r7
            r24 = r5
            r19.a(r20, r21, r22, r23, r24)
            goto L_0x009c
        L_0x010b:
            return r2
        L_0x010c:
            r4 = r1
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r6 = r4.getBitmap()
            nC.e r5 = r0.f128916c
            kotlin.jvm.internal.C17542s.g(r6)
            int r4 = r6.getWidth()
            int r19 = r27.getHeight()
            r12.f128917c = r0
            r12.f128918d = r1
            r12.f128919e = r2
            r12.f128920f = r3
            r12.f128921g = r6
            r1 = r30
            r12.f128922h = r1
            r12.f128925k = r9
            r7 = 0
            r8 = 0
            r3 = 0
            r20 = 32
            r21 = 0
            r9 = r4
            r4 = r10
            r10 = r19
            r11 = r3
            r3 = r13
            r13 = r20
            r0 = r14
            r14 = r21
            java.lang.Object r5 = nC.C14844e.a.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r5 != r15) goto L_0x0149
            return r15
        L_0x0149:
            r6 = r5
            r5 = r27
        L_0x014c:
            jC.b$d r6 = (jC.C14615b.d) r6
            if (r6 != 0) goto L_0x01ef
            qv.e r13 = qv.e.DEBUG
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0163:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x017b
            java.lang.Object r9 = r7.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            r14 = 0
            boolean r10 = r10.b(r13, r14)
            if (r10 == 0) goto L_0x0163
            r8.add(r9)
            goto L_0x0163
        L_0x017b:
            r14 = 0
            java.util.Iterator r15 = r8.iterator()
            r7 = r18
            r8 = r7
        L_0x0183:
            boolean r9 = r15.hasNext()
            if (r9 == 0) goto L_0x01ec
            java.lang.Object r9 = r15.next()
            qv.b r9 = (qv.C11819b) r9
            r11 = 0
            if (r7 != 0) goto L_0x01ae
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "suggestion based on bitmap was null, returning default icon color: "
            r7.append(r10)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = qv.C11818a.a(r7, r11)
            if (r7 != 0) goto L_0x01aa
            goto L_0x01ec
        L_0x01aa:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x01ae:
            r19 = r7
            if (r8 != 0) goto L_0x01db
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r12 = 1
            boolean r7 = HJ.C15854t.b0(r7, r3, r12)
            if (r7 == 0) goto L_0x01c4
            r7 = r17
            goto L_0x01c6
        L_0x01c4:
            r7 = r16
        L_0x01c6:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r0)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
        L_0x01d8:
            r20 = r8
            goto L_0x01dd
        L_0x01db:
            r12 = 1
            goto L_0x01d8
        L_0x01dd:
            r10 = 0
            r7 = r9
            r8 = r13
            r9 = r20
            r12 = r19
            r7.a(r8, r9, r10, r11, r12)
            r7 = r19
            r8 = r20
            goto L_0x0183
        L_0x01ec:
            r11 = 1
            goto L_0x0288
        L_0x01ef:
            r14 = 0
            qv.e r2 = qv.e.DEBUG
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0203:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x021a
            java.lang.Object r9 = r7.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r2, r14)
            if (r10 == 0) goto L_0x0203
            r8.add(r9)
            goto L_0x0203
        L_0x021a:
            java.util.Iterator r7 = r8.iterator()
            r8 = r18
            r9 = r8
        L_0x0221:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0249
            java.lang.Object r10 = r7.next()
            r21 = r10
            qv.b r21 = (qv.C11819b) r21
            r10 = 0
            if (r8 != 0) goto L_0x024f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "bitmap suggests icon color: "
            r8.append(r11)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = qv.C11818a.a(r8, r10)
            if (r8 != 0) goto L_0x024b
        L_0x0249:
            r11 = 1
            goto L_0x0287
        L_0x024b:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x024f:
            if (r9 != 0) goto L_0x0278
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r11 = 1
            boolean r9 = HJ.C15854t.b0(r9, r3, r11)
            if (r9 == 0) goto L_0x0263
            r9 = r17
            goto L_0x0265
        L_0x0263:
            r9 = r16
        L_0x0265:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r12.append(r0)
            r12.append(r4)
            java.lang.String r9 = r12.toString()
            goto L_0x0279
        L_0x0278:
            r11 = 1
        L_0x0279:
            r24 = 0
            r22 = r2
            r23 = r9
            r25 = r10
            r26 = r8
            r21.a(r22, r23, r24, r25, r26)
            goto L_0x0221
        L_0x0287:
            r2 = r6
        L_0x0288:
            if (r1 == 0) goto L_0x0321
            qv.e r1 = qv.e.DEBUG
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x029d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x02b4
            java.lang.Object r9 = r7.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r1, r14)
            if (r10 == 0) goto L_0x029d
            r8.add(r9)
            goto L_0x029d
        L_0x02b4:
            java.util.Iterator r7 = r8.iterator()
            r8 = r18
        L_0x02ba:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x031e
            java.lang.Object r9 = r7.next()
            r19 = r9
            qv.b r19 = (qv.C11819b) r19
            r9 = 0
            if (r18 != 0) goto L_0x02e9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "applying suggested icon color to the status bar: "
            r10.append(r12)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = qv.C11818a.a(r10, r9)
            if (r10 != 0) goto L_0x02e3
            goto L_0x031e
        L_0x02e3:
            java.lang.String r10 = qv.C11820c.a(r10)
            r18 = r10
        L_0x02e9:
            if (r8 != 0) goto L_0x0310
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            boolean r8 = HJ.C15854t.b0(r8, r3, r11)
            if (r8 == 0) goto L_0x02fc
            r8 = r17
            goto L_0x02fe
        L_0x02fc:
            r8 = r16
        L_0x02fe:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r0)
            r10.append(r4)
            java.lang.String r8 = r10.toString()
        L_0x0310:
            r22 = 0
            r20 = r1
            r21 = r8
            r23 = r9
            r24 = r18
            r19.a(r20, r21, r22, r23, r24)
            goto L_0x02ba
        L_0x031e:
            r5.a(r2)
        L_0x0321:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lC.m.b(android.graphics.drawable.Drawable, jC.b, boolean, dI.e):java.lang.Object");
    }

    public C14615b c() {
        return this.f128915b.a();
    }

    public int getHeight() {
        if (this.f128914a.isAttachedToWindow()) {
            return d().f(C0.l.g()).f31837b;
        }
        e eVar = e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Trying to get statusbar height while view is not attached, returning 0,\nTo get around this, get the height when the view has been attached like:\n    view.doOnAttach { systemUi.statusBar.height }\n    view.doOnPreDraw { systemUi.statusBar.height }\nor if possible apply padding/margin using\n    systemUi { view.applyStatusBarOffset(Offset.Padding) }", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = m.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return 0;
    }
}
