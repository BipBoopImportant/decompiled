package o0;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.compose.ui.window.q;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5747v0;
import p1.C5751x0;
import s0.C5861g;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001aC\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aW\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010 \u001a\u00020\f2\b\b\u0003\u0010\u001e\u001a\u00020\u001d2\b\b\u0003\u0010\u001f\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!\u001a2\u0010&\u001a\u00020\u0018*\u00020\"2\b\b\u0001\u0010#\u001a\u00020\u001d2\b\b\u0001\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a)\u0010)\u001a\u0004\u0018\u00010(*\u00020\"2\b\b\u0001\u0010#\u001a\u00020\u001d2\b\b\u0001\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*\u001a \u0010+\u001a\u00020\u0018*\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a \u0010-\u001a\u00020\u0018*\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010,\"\u0014\u00100\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/\" \u00106\u001a\u00020\f8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/ui/window/p;", "popupPositionProvider", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Lo0/g;", "contextMenuBuilderBlock", "c", "(Landroidx/compose/ui/window/p;LnI/a;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "Lo0/b;", "colors", "d", "(Landroidx/compose/ui/window/p;LnI/a;Landroidx/compose/ui/d;Lo0/b;LnI/l;LU0/m;II)V", "Ls0/g;", "content", "a", "(Lo0/b;Landroidx/compose/ui/d;LnI/q;LU0/m;II)V", "", "label", "", "enabled", "Lp1/v0;", "leadingIcon", "onClick", "b", "(Ljava/lang/String;ZLo0/b;Landroidx/compose/ui/d;LnI/q;LnI/a;LU0/m;II)V", "", "backgroundStyleId", "foregroundStyleId", "e", "(IILU0/m;II)Lo0/b;", "Landroid/content/Context;", "resId", "attrId", "defaultColor", "h", "(Landroid/content/Context;IIJ)J", "Landroid/content/res/ColorStateList;", "i", "(Landroid/content/Context;II)Landroid/content/res/ColorStateList;", "g", "(Landroid/content/res/ColorStateList;J)J", "f", "Landroidx/compose/ui/window/q;", "Landroidx/compose/ui/window/q;", "DefaultPopupProperties", "Lo0/b;", "getDefaultContextMenuColors", "()Lo0/b;", "getDefaultContextMenuColors$annotations", "()V", "DefaultContextMenuColors", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.k  reason: case insensitive filesystem */
public final class C5660k {

    /* renamed from: a  reason: collision with root package name */
    private static final q f26660a = new q(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C5651b f26661b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: o0.k$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5651b f26662c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f26663d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ nI.q<C5861g, C4889m, Integer, C16807N> f26664e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f26665f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f26666g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5651b bVar, androidx.compose.ui.d dVar, nI.q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f26662c = bVar;
            this.f26663d = dVar;
            this.f26664e = qVar;
            this.f26665f = i10;
            this.f26666g = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C5660k.a(this.f26662c, this.f26663d, this.f26664e, mVar, M0.a(this.f26665f | 1), this.f26666g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: o0.k$b */
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f26667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f26668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, C17631a<C16807N> aVar) {
            super(0);
            this.f26667c = z10;
            this.f26668d = aVar;
        }

        public final void invoke() {
            if (this.f26667c) {
                this.f26668d.invoke();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: o0.k$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f26669c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f26670d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5651b f26671e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f26672f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ nI.q<C5747v0, C4889m, Integer, C16807N> f26673g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f26674h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f26675i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f26676j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, boolean z10, C5651b bVar, androidx.compose.ui.d dVar, nI.q<? super C5747v0, ? super C4889m, ? super Integer, C16807N> qVar, C17631a<C16807N> aVar, int i10, int i11) {
            super(2);
            this.f26669c = str;
            this.f26670d = z10;
            this.f26671e = bVar;
            this.f26672f = dVar;
            this.f26673g = qVar;
            this.f26674h = aVar;
            this.f26675i = i10;
            this.f26676j = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C5660k.b(this.f26669c, this.f26670d, this.f26671e, this.f26672f, this.f26673g, this.f26674h, mVar, M0.a(this.f26675i | 1), this.f26676j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: o0.k$d */
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.p f26677c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f26678d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f26679e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C5656g, C16807N> f26680f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f26681g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f26682h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.window.p pVar, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, C17642l<? super C5656g, C16807N> lVar, int i10, int i11) {
            super(2);
            this.f26677c = pVar;
            this.f26678d = aVar;
            this.f26679e = dVar;
            this.f26680f = lVar;
            this.f26681g = i10;
            this.f26682h = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C5660k.c(this.f26677c, this.f26678d, this.f26679e, this.f26680f, mVar, M0.a(this.f26681g | 1), this.f26682h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: o0.k$e */
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5651b f26683c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f26684d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C5656g, C16807N> f26685e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/g;", "LXH/N;", "a", "(Ls0/g;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: o0.k$e$a */
        static final class a extends C17544u implements nI.q<C5861g, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l<C5656g, C16807N> f26686c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5651b f26687d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17642l<? super C5656g, C16807N> lVar, C5651b bVar) {
                super(3);
                this.f26686c = lVar;
                this.f26687d = bVar;
            }

            public final void a(C5861g gVar, C4889m mVar, int i10) {
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1156688164, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)");
                    }
                    Object D10 = mVar.D();
                    if (D10 == C4889m.f14007a.a()) {
                        D10 = new C5656g();
                        mVar.u(D10);
                    }
                    C5656g gVar2 = (C5656g) D10;
                    C17642l<C5656g, C16807N> lVar = this.f26686c;
                    C5651b bVar = this.f26687d;
                    gVar2.b();
                    lVar.invoke(gVar2);
                    gVar2.a(bVar, mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5651b bVar, androidx.compose.ui.d dVar, C17642l<? super C5656g, C16807N> lVar) {
            super(2);
            this.f26683c = bVar;
            this.f26684d = dVar;
            this.f26685e = lVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(795909757, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)");
                }
                C5651b bVar = this.f26683c;
                C5660k.a(bVar, this.f26684d, c1.c.e(1156688164, true, new a(this.f26685e, bVar), mVar, 54), mVar, 384, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: o0.k$f */
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.p f26688c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f26689d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f26690e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5651b f26691f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<C5656g, C16807N> f26692g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f26693h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f26694i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.window.p pVar, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, C5651b bVar, C17642l<? super C5656g, C16807N> lVar, int i10, int i11) {
            super(2);
            this.f26688c = pVar;
            this.f26689d = aVar;
            this.f26690e = dVar;
            this.f26691f = bVar;
            this.f26692g = lVar;
            this.f26693h = i10;
            this.f26694i = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C5660k.d(this.f26688c, this.f26689d, this.f26690e, this.f26691f, this.f26692g, mVar, M0.a(this.f26693h | 1), this.f26694i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    static {
        C5747v0.a aVar = C5747v0.f27350b;
        f26661b = new C5651b(aVar.j(), aVar.a(), aVar.a(), C5747v0.o(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C5747v0.o(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(o0.C5651b r23, androidx.compose.ui.d r24, nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r3 = r25
            r4 = r27
            r0 = -921259293(0xffffffffc916b2e3, float:-617262.2)
            r1 = r26
            U0.m r1 = r1.k(r0)
            r2 = r28 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r4 | 6
            r5 = r2
            r2 = r23
            goto L_0x002b
        L_0x0017:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r23
            boolean r5 = r1.V(r2)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r4
            goto L_0x002b
        L_0x0028:
            r2 = r23
            r5 = r4
        L_0x002b:
            r6 = r28 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r7 = r24
            goto L_0x0046
        L_0x0034:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0031
            r7 = r24
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r5 = r5 | r8
        L_0x0046:
            r8 = r28 & 4
            if (r8 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005d
        L_0x004d:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005d
            boolean r8 = r1.F(r3)
            if (r8 == 0) goto L_0x005a
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r5 = r5 | r8
        L_0x005d:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0070
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x006a
            goto L_0x0070
        L_0x006a:
            r1.L()
            r6 = r7
            goto L_0x0166
        L_0x0070:
            if (r6 == 0) goto L_0x0075
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            goto L_0x0076
        L_0x0075:
            r6 = r7
        L_0x0076:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0082
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:144)"
            U0.C4895p.S(r0, r5, r7, r8)
        L_0x0082:
            o0.h r0 = o0.C5657h.f26642a
            float r8 = r0.h()
            float r7 = r0.c()
            A0.f r9 = A0.g.e(r7)
            r15 = 28
            r16 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r7 = r6
            androidx.compose.ui.d r17 = m1.m.b(r7, r8, r9, r10, r11, r13, r15, r16)
            long r18 = r23.a()
            r21 = 2
            r22 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.b.d(r17, r18, r20, r21, r22)
            s0.z r8 = s0.C5880z.Max
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.x.b(r7, r8)
            float r0 = r0.i()
            r8 = 0
            r9 = 0
            r10 = 1
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.k(r7, r9, r0, r10, r8)
            r0 = 0
            androidx.compose.foundation.o r12 = androidx.compose.foundation.m.c(r0, r1, r0, r10)
            r16 = 14
            r17 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.m.f(r11, r12, r13, r14, r15, r16, r17)
            int r5 = r5 << 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r8.g()
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$b r9 = r9.k()
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r1, r0)
            int r0 = U0.C4883j.a(r1, r0)
            U0.y r9 = r1.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r1, r7)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r1.m()
            if (r12 != 0) goto L_0x00fc
            U0.C4883j.c()
        L_0x00fc:
            r1.I()
            boolean r12 = r1.i()
            if (r12 == 0) goto L_0x0109
            r1.p(r11)
            goto L_0x010c
        L_0x0109:
            r1.t()
        L_0x010c:
            U0.m r11 = U0.F1.a(r1)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r8, r12)
            nI.p r8 = r10.e()
            U0.F1.c(r11, r9, r8)
            nI.p r8 = r10.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x0136
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x0144
        L_0x0136:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r11.u(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.w(r0, r8)
        L_0x0144:
            nI.p r0 = r10.d()
            U0.F1.c(r11, r7, r0)
            s0.h r0 = s0.C5862h.f28810a
            int r5 = r5 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.invoke(r0, r1, r5)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0166
            U0.C4895p.R()
        L_0x0166:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x017e
            o0.k$a r8 = new o0.k$a
            r0 = r8
            r1 = r23
            r2 = r6
            r3 = r25
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C5660k.a(o0.b, androidx.compose.ui.d, nI.q, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cb  */
    @android.annotation.SuppressLint({"ComposableLambdaParameterPosition"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r30, boolean r31, o0.C5651b r32, androidx.compose.ui.d r33, nI.q<? super p1.C5747v0, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r34, nI.C17631a<XH.C16807N> r35, U0.C4889m r36, int r37, int r38) {
        /*
            r7 = r31
            r8 = r35
            r9 = r37
            r0 = 16
            r1 = 32
            r2 = 4
            r3 = 791018367(0x2f25fb7f, float:1.5096012E-10)
            r4 = r36
            U0.m r15 = r4.k(r3)
            r10 = 1
            r4 = r38 & 1
            r11 = 2
            if (r4 == 0) goto L_0x001f
            r4 = r9 | 6
            r14 = r30
            goto L_0x0031
        L_0x001f:
            r4 = r9 & 6
            r14 = r30
            if (r4 != 0) goto L_0x0030
            boolean r4 = r15.V(r14)
            if (r4 == 0) goto L_0x002d
            r4 = r2
            goto L_0x002e
        L_0x002d:
            r4 = r11
        L_0x002e:
            r4 = r4 | r9
            goto L_0x0031
        L_0x0030:
            r4 = r9
        L_0x0031:
            r5 = r38 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
            goto L_0x0046
        L_0x0038:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0046
            boolean r5 = r15.b(r7)
            if (r5 == 0) goto L_0x0044
            r5 = r1
            goto L_0x0045
        L_0x0044:
            r5 = r0
        L_0x0045:
            r4 = r4 | r5
        L_0x0046:
            r2 = r38 & 4
            if (r2 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
            r13 = r32
            goto L_0x0061
        L_0x004f:
            r2 = r9 & 384(0x180, float:5.38E-43)
            r13 = r32
            if (r2 != 0) goto L_0x0061
            boolean r2 = r15.V(r13)
            if (r2 == 0) goto L_0x005e
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r2
        L_0x0061:
            r2 = r38 & 8
            if (r2 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r5 = r33
            goto L_0x007c
        L_0x006a:
            r5 = r9 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r33
            boolean r6 = r15.V(r5)
            if (r6 == 0) goto L_0x0079
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r6
        L_0x007c:
            r0 = r38 & 16
            if (r0 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r6 = r34
            goto L_0x0097
        L_0x0085:
            r6 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0082
            r6 = r34
            boolean r12 = r15.F(r6)
            if (r12 == 0) goto L_0x0094
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r4 = r4 | r12
        L_0x0097:
            r12 = r38 & 32
            r11 = 131072(0x20000, float:1.83671E-40)
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r12 == 0) goto L_0x00a3
            r4 = r4 | r16
        L_0x00a1:
            r12 = r4
            goto L_0x00b3
        L_0x00a3:
            r12 = r9 & r16
            if (r12 != 0) goto L_0x00a1
            boolean r12 = r15.F(r8)
            if (r12 == 0) goto L_0x00af
            r12 = r11
            goto L_0x00b1
        L_0x00af:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r12
            goto L_0x00a1
        L_0x00b3:
            r4 = 74899(0x12493, float:1.04956E-40)
            r4 = r4 & r12
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r10) goto L_0x00cb
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x00c3
            goto L_0x00cb
        L_0x00c3:
            r15.L()
            r4 = r5
            r5 = r6
            r0 = r15
            goto L_0x02d5
        L_0x00cb:
            if (r2 == 0) goto L_0x00d2
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r22 = r2
            goto L_0x00d4
        L_0x00d2:
            r22 = r5
        L_0x00d4:
            r10 = 0
            if (r0 == 0) goto L_0x00d8
            r6 = r10
        L_0x00d8:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00e4
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:181)"
            U0.C4895p.S(r3, r12, r0, r2)
        L_0x00e4:
            o0.h r5 = o0.C5657h.f26642a
            i1.c$c r4 = r5.f()
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            float r2 = r5.d()
            androidx.compose.foundation.layout.d$f r3 = r0.n(r2)
            r0 = r12 & 112(0x70, float:1.57E-43)
            r2 = 0
            if (r0 != r1) goto L_0x00fb
            r0 = 1
            goto L_0x00fc
        L_0x00fb:
            r0 = r2
        L_0x00fc:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r12
            if (r1 != r11) goto L_0x0103
            r1 = 1
            goto L_0x0104
        L_0x0103:
            r1 = r2
        L_0x0104:
            r0 = r0 | r1
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x0113
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x011b
        L_0x0113:
            o0.k$b r1 = new o0.k$b
            r1.<init>(r7, r8)
            r15.u(r1)
        L_0x011b:
            r11 = r1
            nI.a r11 = (nI.C17631a) r11
            r17 = 4
            r18 = 0
            r19 = 0
            r0 = r22
            r1 = r31
            r2 = r30
            r24 = r3
            r3 = r19
            r25 = r4
            r4 = r11
            r11 = r5
            r5 = r17
            r14 = r6
            r6 = r18
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.d(r0, r1, r2, r3, r4, r5, r6)
            r1 = 0
            r2 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r1, r2, r10)
            float r2 = r11.b()
            float r3 = r11.a()
            float r4 = r11.g()
            float r5 = r11.g()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.w(r0, r2, r4, r3, r5)
            float r2 = r11.d()
            r3 = 2
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r0, r2, r1, r3, r10)
            r1 = 54
            r3 = r24
            r2 = r25
            E1.I r1 = androidx.compose.foundation.layout.G.b(r3, r2, r15, r1)
            r2 = 0
            int r3 = U0.C4883j.a(r15, r2)
            U0.y r4 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r6 = r5.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x0184
            U0.C4883j.c()
        L_0x0184:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x0191
            r15.p(r6)
            goto L_0x0194
        L_0x0191:
            r15.t()
        L_0x0194:
            U0.m r6 = U0.F1.a(r15)
            nI.p r10 = r5.c()
            U0.F1.c(r6, r1, r10)
            nI.p r1 = r5.e()
            U0.F1.c(r6, r4, r1)
            nI.p r1 = r5.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x01be
            java.lang.Object r4 = r6.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r10)
            if (r4 != 0) goto L_0x01cc
        L_0x01be:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r1)
        L_0x01cc:
            nI.p r1 = r5.d()
            U0.F1.c(r6, r0, r1)
            s0.N r0 = s0.C5843N.f28726a
            if (r14 != 0) goto L_0x01e2
            r1 = 554568909(0x210e0ccd, float:4.8128413E-19)
            r15.W(r1)
        L_0x01dd:
            r15.P()
            goto L_0x0290
        L_0x01e2:
            r1 = 554568910(0x210e0cce, float:4.812842E-19)
            r15.W(r1)
            androidx.compose.ui.d$a r23 = androidx.compose.ui.d.f18749a
            float r24 = r11.e()
            float r26 = r11.e()
            float r27 = r11.e()
            r28 = 2
            r29 = 0
            r25 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.r(r23, r24, r25, r26, r27, r28, r29)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c r3 = r3.o()
            E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r2)
            int r4 = U0.C4883j.a(r15, r2)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
            nI.a r10 = r5.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x0223
            U0.C4883j.c()
        L_0x0223:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x0230
            r15.p(r10)
            goto L_0x0233
        L_0x0230:
            r15.t()
        L_0x0233:
            U0.m r10 = U0.F1.a(r15)
            nI.p r2 = r5.c()
            U0.F1.c(r10, r3, r2)
            nI.p r2 = r5.e()
            U0.F1.c(r10, r6, r2)
            nI.p r2 = r5.b()
            boolean r3 = r10.i()
            if (r3 != 0) goto L_0x025d
            java.lang.Object r3 = r10.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 != 0) goto L_0x026b
        L_0x025d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r10.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r10.w(r3, r2)
        L_0x026b:
            nI.p r2 = r5.d()
            U0.F1.c(r10, r1, r2)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            if (r7 == 0) goto L_0x027b
            long r1 = r32.d()
            goto L_0x027f
        L_0x027b:
            long r1 = r32.b()
        L_0x027f:
            p1.v0 r1 = p1.C5747v0.k(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.invoke(r1, r15, r2)
            r15.x()
            goto L_0x01dd
        L_0x0290:
            if (r7 == 0) goto L_0x0297
            long r1 = r32.e()
            goto L_0x029b
        L_0x0297:
            long r1 = r32.c()
        L_0x029b:
            N1.Y r1 = r11.j(r1)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1
            androidx.compose.ui.d r11 = r0.a(r2, r3, r4)
            r0 = r12 & 14
            r2 = 1572864(0x180000, float:2.204052E-39)
            r20 = r0 | r2
            r21 = 440(0x1b8, float:6.17E-43)
            r0 = 0
            r2 = 0
            r3 = 0
            r16 = 1
            r17 = 0
            r18 = 0
            r10 = r30
            r12 = r1
            r13 = r0
            r6 = r14
            r14 = r2
            r0 = r15
            r15 = r3
            r19 = r0
            B0.C4360d.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x02d2
            U0.C4895p.R()
        L_0x02d2:
            r5 = r6
            r4 = r22
        L_0x02d5:
            U0.Y0 r10 = r0.n()
            if (r10 == 0) goto L_0x02f0
            o0.k$c r11 = new o0.k$c
            r0 = r11
            r1 = r30
            r2 = r31
            r3 = r32
            r6 = r35
            r7 = r37
            r8 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x02f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C5660k.b(java.lang.String, boolean, o0.b, androidx.compose.ui.d, nI.q, nI.a, U0.m, int, int):void");
    }

    public static final void c(androidx.compose.ui.window.p pVar, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, C17642l<? super C5656g, C16807N> lVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(712057293);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(pVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(aVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.F(lVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(712057293, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            d(pVar, aVar, dVar, e(0, 0, k10, 0, 3), lVar, k10, (i12 & 1022) | ((i12 << 3) & 57344), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new d(pVar, aVar, dVar2, lVar, i10, i11));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.ui.window.p r16, nI.C17631a<XH.C16807N> r17, androidx.compose.ui.d r18, o0.C5651b r19, nI.C17642l<? super o0.C5656g, XH.C16807N> r20, U0.C4889m r21, int r22, int r23) {
        /*
            r4 = r19
            r5 = r20
            r6 = r22
            r0 = 1447189339(0x56425b5b, float:5.3424406E13)
            r1 = r21
            U0.m r1 = r1.k(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r6 | 6
            r3 = r2
            r2 = r16
            goto L_0x002d
        L_0x0019:
            r2 = r6 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r16
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r6
            goto L_0x002d
        L_0x002a:
            r2 = r16
            r3 = r6
        L_0x002d:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0036
            r3 = r3 | 48
            r14 = r17
            goto L_0x0048
        L_0x0036:
            r7 = r6 & 48
            r14 = r17
            if (r7 != 0) goto L_0x0048
            boolean r7 = r1.F(r14)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r3 = r3 | r7
        L_0x0048:
            r7 = r23 & 4
            if (r7 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r18
            goto L_0x0063
        L_0x0051:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r18
            boolean r9 = r1.V(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r9
        L_0x0063:
            r9 = r23 & 8
            if (r9 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007a
            boolean r9 = r1.V(r4)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r9
        L_0x007a:
            r9 = r23 & 16
            if (r9 == 0) goto L_0x0081
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0091
        L_0x0081:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0091
            boolean r9 = r1.F(r5)
            if (r9 == 0) goto L_0x008e
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r3 = r3 | r9
        L_0x0091:
            r9 = r3 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r10) goto L_0x00a3
            boolean r9 = r1.l()
            if (r9 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            r1.L()
            r3 = r8
            goto L_0x00e2
        L_0x00a3:
            if (r7 == 0) goto L_0x00a9
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r15 = r7
            goto L_0x00aa
        L_0x00a9:
            r15 = r8
        L_0x00aa:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00b6
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:121)"
            U0.C4895p.S(r0, r3, r7, r8)
        L_0x00b6:
            androidx.compose.ui.window.q r9 = f26660a
            o0.k$e r0 = new o0.k$e
            r0.<init>(r4, r15, r5)
            r7 = 54
            r8 = 795909757(0x2f709e7d, float:2.1884179E-10)
            r10 = 1
            c1.a r10 = c1.c.e(r8, r10, r0, r1, r7)
            r0 = r3 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            r3 = r3 & 112(0x70, float:1.57E-43)
            r12 = r0 | r3
            r13 = 0
            r7 = r16
            r8 = r17
            r11 = r1
            androidx.compose.ui.window.b.a(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00e1
            U0.C4895p.R()
        L_0x00e1:
            r3 = r15
        L_0x00e2:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x00fd
            o0.k$f r9 = new o0.k$f
            r0 = r9
            r1 = r16
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C5660k.d(androidx.compose.ui.window.p, nI.a, androidx.compose.ui.d, o0.b, nI.l, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: o0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: o0.b} */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r5 == U0.C4889m.f14007a.a()) goto L_0x0052;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final o0.C5651b e(int r20, int r21, U0.C4889m r22, int r23, int r24) {
        /*
            r0 = r22
            r1 = r24 & 1
            if (r1 == 0) goto L_0x000a
            r1 = 16973958(0x1030086, float:2.4061276E-38)
            goto L_0x000c
        L_0x000a:
            r1 = r20
        L_0x000c:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0014
            r2 = 16973952(0x1030080, float:2.406126E-38)
            goto L_0x0016
        L_0x0014:
            r2 = r21
        L_0x0016:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0027
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)"
            r5 = 1689505294(0x64b3ce0e, float:2.653452E22)
            r6 = r23
            U0.C4895p.S(r5, r6, r3, r4)
        L_0x0027:
            U0.I0 r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r3 = r0.Q(r3)
            android.content.Context r3 = (android.content.Context) r3
            U0.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            java.lang.Object r4 = r0.Q(r4)
            android.content.res.Configuration r4 = (android.content.res.Configuration) r4
            boolean r5 = r0.V(r3)
            boolean r4 = r0.V(r4)
            r4 = r4 | r5
            java.lang.Object r5 = r22.D()
            if (r4 != 0) goto L_0x0052
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0084
        L_0x0052:
            o0.b r4 = f26661b
            long r5 = r4.a()
            r7 = 16842801(0x1010031, float:2.3693695E-38)
            long r9 = h(r3, r1, r7, r5)
            r1 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r1 = i(r3, r2, r1)
            long r2 = r4.e()
            long r13 = g(r1, r2)
            long r2 = r4.c()
            long r17 = f(r1, r2)
            o0.b r5 = new o0.b
            r19 = 0
            r8 = r5
            r11 = r13
            r15 = r17
            r8.<init>(r9, r11, r13, r15, r17, r19)
            r0.u(r5)
        L_0x0084:
            o0.b r5 = (o0.C5651b) r5
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x008f
            U0.C4895p.R()
        L_0x008f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C5660k.e(int, int, U0.m, int, int):o0.b");
    }

    private static final long f(ColorStateList colorStateList, long j10) {
        int k10 = C5751x0.k(j10);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, k10)) : null;
        return (valueOf == null || valueOf.intValue() == k10) ? j10 : C5751x0.b(valueOf.intValue());
    }

    private static final long g(ColorStateList colorStateList, long j10) {
        int k10 = C5751x0.k(j10);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{16842910}, k10)) : null;
        return (valueOf == null || valueOf.intValue() == k10) ? j10 : C5751x0.b(valueOf.intValue());
    }

    private static final long h(Context context, int i10, int i11, long j10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        int k10 = C5751x0.k(j10);
        int color = obtainStyledAttributes.getColor(0, k10);
        obtainStyledAttributes.recycle();
        return color == k10 ? j10 : C5751x0.b(color);
    }

    private static final ColorStateList i(Context context, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }
}
