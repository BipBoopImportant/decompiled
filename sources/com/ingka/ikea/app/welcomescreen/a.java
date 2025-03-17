package com.ingka.ikea.app.welcomescreen;

import HJ.C15854t;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import YH.C16877v;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.lifecycle.C5219w;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.l0;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import ow.g;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import uI.C18055d;
import x4.C;
import x4.C8948l;
import x4.C8951o;
import x4.I;
import x4.v;
import x4.x;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a8\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00050\u0004H@¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\r\u001a\u00020\u0005*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0014\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u001a\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u000fH\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aI\u0010$\u001a\u00020\u0005*\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u000f2\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\"H\u0001¢\u0006\u0004\b$\u0010%\u001a\u001d\u0010'\u001a\u00020\u0005*\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010*\u001a\u00020\u0005*\u00020\u00002\u0006\u0010)\u001a\u00020\u0002H\u0000¢\u0006\u0004\b*\u0010+\u001a\u001d\u0010,\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lx4/o;", "", "Low/f;", "trackedTabs", "Lkotlin/Function1;", "LXH/N;", "listener", "a", "(Lx4/o;Ljava/util/Set;LnI/l;LdI/e;)Ljava/lang/Object;", "Landroid/view/View;", "navController", "navigationTabItems", "onTabSelected", "b", "(Landroid/view/View;Lx4/o;Ljava/util/Set;LnI/l;)V", "", "Lx4/l;", "entries", "Lcom/ingka/ikea/app/welcomescreen/b;", "navigationTabHolder", "c", "(Ljava/util/List;Lcom/ingka/ikea/app/welcomescreen/b;)Low/f;", "", "navigationTabStringRoutes", "LuI/d;", "navigationTabTypeSafeRoutes", "d", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lx4/l;", "Lx4/C;", "e", "(Lx4/o;)Lx4/C;", "navigationTabRoutes", "Low/g;", "scrollableDestinationIntegration", "Lkotlin/Function0;", "scrollStartRouteToTop", "g", "(Lx4/o;Ljava/util/List;Ljava/util/List;Low/g;LnI/a;)V", "nestedGraph", "i", "(Lx4/o;Lx4/l;)V", "navigationTab", "h", "(Lx4/o;Low/f;)V", "f", "(Ljava/util/Set;)Lcom/ingka/ikea/app/welcomescreen/b;", "IKEA_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.welcomescreen.BottomNavigationViewExtensionsKt", f = "BottomNavigationViewExtensions.kt", l = {44}, m = "addOnTabChangedListener")
    /* renamed from: com.ingka.ikea.app.welcomescreen.a$a  reason: collision with other inner class name */
    static final class C2068a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f92845c;

        /* renamed from: d  reason: collision with root package name */
        Object f92846d;

        /* renamed from: e  reason: collision with root package name */
        Object f92847e;

        /* renamed from: f  reason: collision with root package name */
        Object f92848f;

        /* renamed from: g  reason: collision with root package name */
        Object f92849g;

        /* renamed from: h  reason: collision with root package name */
        Object f92850h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f92851i;

        /* renamed from: j  reason: collision with root package name */
        int f92852j;

        C2068a(C17164e<? super C2068a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f92851i = obj;
            this.f92852j |= Integer.MIN_VALUE;
            return a.a((C8951o) null, (Set<? extends ow.f>) null, (C17642l<? super ow.f, C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f92853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O<ow.f> f92854b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<ow.f, C16807N> f92855c;

        b(b bVar, O<ow.f> o10, C17642l<? super ow.f, C16807N> lVar) {
            this.f92853a = bVar;
            this.f92854b = o10;
            this.f92855c = lVar;
        }

        /* renamed from: c */
        public final Object emit(List<C8948l> list, C17164e<? super C16807N> eVar) {
            T c10 = a.c(list, this.f92853a);
            if (!C17542s.e(this.f92854b.f144348a, c10)) {
                this.f92854b.f144348a = c10;
                this.f92855c.invoke(c10);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lx4/l;", "entries", "LXH/N;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.welcomescreen.BottomNavigationViewExtensionsKt$bindItemsToRoutes$1", f = "BottomNavigationViewExtensions.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<List<? extends C8948l>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92856c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92857d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f92858e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<ow.f, C16807N> f92859f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17642l<? super ow.f, C16807N> lVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f92858e = bVar;
            this.f92859f = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f92858e, this.f92859f, eVar);
            cVar.f92857d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(List<C8948l> list, C17164e<? super C16807N> eVar) {
            return ((c) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                eI.C17187b.f()
                int r1 = r0.f92856c
                if (r1 != 0) goto L_0x019e
                XH.y.b(r18)
                java.lang.Object r1 = r0.f92857d
                java.util.List r1 = (java.util.List) r1
                com.ingka.ikea.app.welcomescreen.b r2 = r0.f92858e
                ow.f r2 = com.ingka.ikea.app.welcomescreen.a.c(r1, r2)
                if (r2 == 0) goto L_0x001d
                nI.l<ow.f, XH.N> r3 = r0.f92859f
                r3.invoke(r2)
            L_0x001d:
                java.util.List r1 = YH.C16877v.V(r1)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r4 = YH.C16877v.y(r1, r3)
                r2.<init>(r4)
                java.util.Iterator r1 = r1.iterator()
            L_0x0032:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x004e
                java.lang.Object r4 = r1.next()
                x4.l r4 = (x4.C8948l) r4
                x4.v r4 = r4.e()
                java.lang.String r4 = r4.C()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r2.add(r4)
                goto L_0x0032
            L_0x004e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = YH.C16877v.y(r2, r3)
                r1.<init>(r3)
                java.util.Iterator r2 = r2.iterator()
            L_0x005b:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x00eb
                java.lang.Object r3 = r2.next()
                r6 = r3
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r3 = "."
                java.lang.String[] r7 = new java.lang.String[]{r3}
                r10 = 6
                r11 = 0
                r8 = 0
                r9 = 0
                java.util.List r3 = HJ.C15854t.Y0(r6, r7, r8, r9, r10, r11)
                java.lang.Object r3 = YH.C16877v.I0(r3)
                r6 = r3
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                java.lang.String r3 = "{"
                java.lang.String[] r7 = new java.lang.String[]{r3}
                java.util.List r3 = HJ.C15854t.Y0(r6, r7, r8, r9, r10, r11)
                int r6 = r3.size()
                java.lang.String r7 = "parsing error"
                if (r6 <= 0) goto L_0x0096
                java.lang.Object r3 = r3.get(r5)
                goto L_0x0097
            L_0x0096:
                r3 = r7
            L_0x0097:
                r8 = r3
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                java.lang.String r3 = "?"
                java.lang.String[] r9 = new java.lang.String[]{r3}
                r12 = 6
                r13 = 0
                r10 = 0
                r11 = 0
                java.util.List r3 = HJ.C15854t.Y0(r8, r9, r10, r11, r12, r13)
                int r6 = r3.size()
                if (r6 <= 0) goto L_0x00b2
                java.lang.Object r7 = r3.get(r5)
            L_0x00b2:
                java.lang.String r7 = (java.lang.String) r7
                int r3 = r7.length()
                int r3 = r3 - r4
                r6 = r5
                r8 = r6
            L_0x00bb:
                if (r6 > r3) goto L_0x00dc
                if (r8 != 0) goto L_0x00c1
                r9 = r6
                goto L_0x00c2
            L_0x00c1:
                r9 = r3
            L_0x00c2:
                char r9 = r7.charAt(r9)
                r10 = 47
                if (r9 != r10) goto L_0x00cc
                r9 = r4
                goto L_0x00cd
            L_0x00cc:
                r9 = r5
            L_0x00cd:
                if (r8 != 0) goto L_0x00d6
                if (r9 != 0) goto L_0x00d3
                r8 = r4
                goto L_0x00bb
            L_0x00d3:
                int r6 = r6 + 1
                goto L_0x00bb
            L_0x00d6:
                if (r9 != 0) goto L_0x00d9
                goto L_0x00dc
            L_0x00d9:
                int r3 = r3 + -1
                goto L_0x00bb
            L_0x00dc:
                int r3 = r3 + 1
                java.lang.CharSequence r3 = r7.subSequence(r6, r3)
                java.lang.String r3 = r3.toString()
                r1.add(r3)
                goto L_0x005b
            L_0x00eb:
                qv.e r2 = qv.e.DEBUG
                qv.d r3 = qv.d.f102012a
                java.util.List r3 = r3.a()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x00fe:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x0115
                java.lang.Object r7 = r3.next()
                r8 = r7
                qv.b r8 = (qv.C11819b) r8
                boolean r8 = r8.b(r2, r5)
                if (r8 == 0) goto L_0x00fe
                r6.add(r7)
                goto L_0x00fe
            L_0x0115:
                java.util.Iterator r3 = r6.iterator()
                r5 = 0
                r14 = r5
            L_0x011b:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x019b
                java.lang.Object r6 = r3.next()
                r15 = r6
                qv.b r15 = (qv.C11819b) r15
                r13 = 0
                if (r5 != 0) goto L_0x015c
                r12 = 62
                r16 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r5 = r1
                r4 = r13
                r13 = r16
                java.lang.String r5 = YH.C16877v.G0(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Navigation backstack has changed: \n"
                r6.append(r7)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r5 = qv.C11818a.a(r5, r4)
                if (r5 != 0) goto L_0x0156
                goto L_0x019b
            L_0x0156:
                java.lang.String r5 = qv.C11820c.a(r5)
            L_0x015a:
                r11 = r5
                goto L_0x015e
            L_0x015c:
                r4 = r13
                goto L_0x015a
            L_0x015e:
                if (r14 != 0) goto L_0x018e
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r6 = "main"
                r12 = 1
                boolean r5 = HJ.C15854t.b0(r5, r6, r12)
                if (r5 == 0) goto L_0x0174
                java.lang.String r5 = "m"
                goto L_0x0176
            L_0x0174:
                java.lang.String r5 = "b"
            L_0x0176:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                java.lang.String r5 = "|"
                r6.append(r5)
                java.lang.String r5 = "navigation"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                r14 = r5
                goto L_0x018f
            L_0x018e:
                r12 = 1
            L_0x018f:
                r8 = 0
                r5 = r15
                r6 = r2
                r7 = r14
                r9 = r4
                r10 = r11
                r5.a(r6, r7, r8, r9, r10)
                r5 = r11
                r4 = r12
                goto L_0x011b
            L_0x019b:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            L_0x019e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.welcomescreen.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(x4.C8951o r7, java.util.Set<? extends ow.f> r8, nI.C17642l<? super ow.f, XH.C16807N> r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            boolean r0 = r10 instanceof com.ingka.ikea.app.welcomescreen.a.C2068a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.ingka.ikea.app.welcomescreen.a$a r0 = (com.ingka.ikea.app.welcomescreen.a.C2068a) r0
            int r1 = r0.f92852j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f92852j = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.welcomescreen.a$a r0 = new com.ingka.ikea.app.welcomescreen.a$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r1 = r0.f92851i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f92852j
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 == r4) goto L_0x002d
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002d:
            java.lang.Object r7 = r0.f92850h
            com.ingka.ikea.app.welcomescreen.b r7 = (com.ingka.ikea.app.welcomescreen.b) r7
            java.lang.Object r7 = r0.f92849g
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r7 = r0.f92848f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f92847e
            nI.l r7 = (nI.C17642l) r7
            java.lang.Object r7 = r0.f92846d
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r7 = r0.f92845c
            x4.o r7 = (x4.C8951o) r7
            XH.y.b(r1)
            goto L_0x0073
        L_0x0049:
            XH.y.b(r1)
            kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
            r1.<init>()
            com.ingka.ikea.app.welcomescreen.b r3 = f(r8)
            TJ.P r5 = r7.G()
            com.ingka.ikea.app.welcomescreen.a$b r6 = new com.ingka.ikea.app.welcomescreen.a$b
            r6.<init>(r3, r1, r9)
            r0.f92845c = r7
            r0.f92846d = r8
            r0.f92847e = r9
            r0.f92848f = r10
            r0.f92849g = r1
            r0.f92850h = r3
            r0.f92852j = r4
            java.lang.Object r7 = r5.collect(r6, r0)
            if (r7 != r2) goto L_0x0073
            return r2
        L_0x0073:
            XH.k r7 = new XH.k
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.welcomescreen.a.a(x4.o, java.util.Set, nI.l, dI.e):java.lang.Object");
    }

    @SuppressLint({"RestrictedApi"})
    public static final void b(View view, C8951o oVar, Set<? extends ow.f> set, C17642l<? super ow.f, C16807N> lVar) {
        C17542s.j(view, "<this>");
        C17542s.j(oVar, "navController");
        C17542s.j(set, "navigationTabItems");
        C17542s.j(lVar, "onTabSelected");
        C5221y a10 = l0.a(view);
        if (a10 != null) {
            C16534i.M(C16534i.R(oVar.G(), new c(f(set), lVar, (C17164e<? super c>) null)), C5219w.a(a10.getLifecycle()));
        }
    }

    public static final ow.f c(List<C8948l> list, b bVar) {
        v e10;
        Object c10;
        C17542s.j(list, "entries");
        C17542s.j(bVar, "navigationTabHolder");
        C8948l d10 = d(list, bVar.b(), bVar.c());
        ow.f fVar = null;
        if (!(d10 == null || (e10 = d10.e()) == null)) {
            for (ow.f fVar2 : bVar.a()) {
                if (C17542s.e(e10.C(), fVar2.a()) || ((c10 = fVar2.c()) != null && v.f57671k.d(e10, P.b(c10.getClass())))) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public static final C8948l d(List<C8948l> list, List<String> list2, List<? extends C18055d<?>> list3) {
        C17542s.j(list, "entries");
        C17542s.j(list2, "navigationTabStringRoutes");
        C17542s.j(list3, "navigationTabTypeSafeRoutes");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            XH.v vVar = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            C8948l lVar = (C8948l) next;
            if (C16877v.l0(list2, lVar.e().C())) {
                vVar = C16796C.a(Integer.valueOf(i10), lVar);
            } else {
                Iterable iterable = list3;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (v.f57671k.d(lVar.e(), (C18055d) it2.next())) {
                            vVar = C16796C.a(Integer.valueOf(i10), lVar);
                            break;
                        }
                    }
                }
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
            i10 = i11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        XH.v vVar2 = (XH.v) C16877v.w0(arrayList);
        XH.v vVar3 = (XH.v) C16877v.z0(arrayList, 1);
        if (vVar3 == null) {
            return (C8948l) vVar2.d();
        }
        return ((Number) vVar3.c()).intValue() - ((Number) vVar2.c()).intValue() == 2 ? (C8948l) vVar3.d() : (C8948l) vVar2.d();
    }

    public static final C e(C8951o oVar) {
        C17542s.j(oVar, "<this>");
        return new C.a().m(true).d(true).g(x.f57702q.b(oVar.L()).x(), false, true).a();
    }

    public static final b f(Set<? extends ow.f> set) {
        C17542s.j(set, "navigationTabItems");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : set) {
            if (((ow.f) next).c() == null) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        XH.v vVar = new XH.v(arrayList, arrayList2);
        List<ow.f> list = (List) vVar.b();
        Iterable<ow.f> iterable = (List) vVar.a();
        ArrayList arrayList3 = new ArrayList(C16877v.y(iterable, 10));
        for (ow.f a10 : iterable) {
            arrayList3.add(a10.a());
        }
        ArrayList arrayList4 = new ArrayList();
        for (ow.f c10 : list) {
            Object c11 = c10.c();
            C18055d b10 = c11 != null ? P.b(c11.getClass()) : null;
            if (b10 != null) {
                arrayList4.add(b10);
            }
        }
        return new b(set, arrayList3, arrayList4);
    }

    @SuppressLint({"RestrictedApi"})
    public static final void g(C8951o oVar, List<String> list, List<? extends C18055d<?>> list2, g gVar, C17631a<C16807N> aVar) {
        C17542s.j(oVar, "<this>");
        C17542s.j(list, "navigationTabRoutes");
        C17542s.j(list2, "navigationTabTypeSafeRoutes");
        C17542s.j(gVar, "scrollableDestinationIntegration");
        C17542s.j(aVar, "scrollStartRouteToTop");
        List value = oVar.G().getValue();
        C8948l d10 = d(value, list, list2);
        int p10 = C16877v.p(value) - C16877v.B0(value, d10);
        if (p10 > 1) {
            gVar.a();
            i(oVar, d10);
        } else if (p10 == 1) {
            aVar.invoke();
        }
    }

    public static final void h(C8951o oVar, ow.f fVar) {
        C17542s.j(oVar, "<this>");
        C17542s.j(fVar, "navigationTab");
        fVar.b();
        e eVar = e.DEBUG;
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
                String a10 = C11818a.a(P.b(fVar.getClass()).f() + " selected, navigating to " + fVar.a(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = oVar.getClass().getName();
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
        Object c10 = fVar.c();
        if (c10 != null) {
            C8951o.f0(oVar, c10, e(oVar), (I.a) null, 4, (Object) null);
        } else {
            C8951o.g0(oVar, fVar.a(), e(oVar), (I.a) null, 4, (Object) null);
        }
    }

    private static final void i(C8951o oVar, C8948l lVar) {
        v e10;
        String b02;
        v e11 = lVar != null ? lVar.e() : null;
        x xVar = e11 instanceof x ? (x) e11 : null;
        if (xVar == null || (b02 = xVar.b0()) == null) {
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Couldn't find the startRoute of the nested graph " + ((lVar == null || (e10 = lVar.e()) == null) ? null : e10.C()) + " to pop up to.", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = oVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, (Throwable) null, str);
            }
            return;
        }
        C8951o.o0(oVar, b02, false, false, 4, (Object) null);
    }
}
