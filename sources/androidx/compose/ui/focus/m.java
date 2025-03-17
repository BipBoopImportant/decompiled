package androidx.compose.ui.focus;

import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n1.C5634n;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0000¢\u0006\u0004\b\f\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/m;", "", "<init>", "()V", "LXH/N;", "f", "", "d", "()Z", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "c", "(LnI/l;)Z", "LW0/b;", "Ln1/n;", "a", "LW0/b;", "e", "()LW0/b;", "focusRequesterNodes", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18861b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final m f18862c = new m();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final m f18863d = new m();

    /* renamed from: a  reason: collision with root package name */
    private final W0.b<C5634n> f18864a = new W0.b<>(new C5634n[16], 0);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\u00078GX\u0004¢\u0006\u0012\n\u0004\b\f\u0010\t\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/m$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/m$a$a;", "a", "()Landroidx/compose/ui/focus/m$a$a;", "Landroidx/compose/ui/focus/m;", "Default", "Landroidx/compose/ui/focus/m;", "c", "()Landroidx/compose/ui/focus/m;", "Cancel", "b", "getCancel$annotations", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/focus/m$a$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/m;", "a", "()Landroidx/compose/ui/focus/m;", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.focus.m$a$a  reason: collision with other inner class name */
        public static final class C0291a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0291a f18865a = new C0291a();

            private C0291a() {
            }

            public final m a() {
                return new m();
            }

            public final m b() {
                return new m();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0291a a() {
            return C0291a.f18865a;
        }

        public final m b() {
            return m.f18863d;
        }

        public final m c() {
            return m.f18862c;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<FocusTargetNode, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f18866c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(q.j(focusTargetNode));
        }
    }

    public final boolean c(C17642l<? super FocusTargetNode, Boolean> lVar) {
        C17642l<? super FocusTargetNode, Boolean> lVar2 = lVar;
        a aVar = f18861b;
        if (this == aVar.c()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        } else if (this == aVar.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        } else if (this.f18864a.v()) {
            W0.b<C5634n> bVar = this.f18864a;
            int r10 = bVar.r();
            if (r10 <= 0) {
                return false;
            }
            Object[] q10 = bVar.q();
            int i10 = 0;
            boolean z10 = false;
            do {
                C5634n nVar = (C5634n) q10[i10];
                int a10 = C4502e0.a(1024);
                if (nVar.E0().j2()) {
                    W0.b bVar2 = new W0.b(new d.c[16], 0);
                    d.c a22 = nVar.E0().a2();
                    if (a22 == null) {
                        C4508k.c(bVar2, nVar.E0());
                    } else {
                        bVar2.b(a22);
                    }
                    while (true) {
                        if (!bVar2.v()) {
                            break;
                        }
                        d.c cVar = (d.c) bVar2.B(bVar2.r() - 1);
                        if ((cVar.Z1() & a10) == 0) {
                            C4508k.c(bVar2, cVar);
                        } else {
                            while (true) {
                                if (cVar == null) {
                                    continue;
                                    break;
                                } else if ((cVar.e2() & a10) != 0) {
                                    W0.b bVar3 = null;
                                    while (cVar != null) {
                                        if (cVar instanceof FocusTargetNode) {
                                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                                            if (focusTargetNode.H2().y() ? lVar2.invoke(focusTargetNode).booleanValue() : u.k(focusTargetNode, d.f18832b.b(), lVar2)) {
                                                z10 = true;
                                                break;
                                            }
                                        } else {
                                            if (((cVar.e2() & a10) != 0) && (cVar instanceof C4510m)) {
                                                int i11 = 0;
                                                for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                                    if ((D22.e2() & a10) != 0) {
                                                        i11++;
                                                        if (i11 == 1) {
                                                            cVar = D22;
                                                        } else {
                                                            if (bVar3 == null) {
                                                                bVar3 = new W0.b(new d.c[16], 0);
                                                            }
                                                            if (cVar != null) {
                                                                bVar3.b(cVar);
                                                                cVar = null;
                                                            }
                                                            bVar3.b(D22);
                                                        }
                                                    }
                                                }
                                                if (i11 == 1) {
                                                }
                                            }
                                        }
                                        cVar = C4508k.g(bVar3);
                                    }
                                    continue;
                                } else {
                                    cVar = cVar.a2();
                                }
                            }
                        }
                    }
                    i10++;
                } else {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
            } while (i10 < r10);
            return z10;
        } else {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
    }

    public final boolean d() {
        return c(b.f18866c);
    }

    public final W0.b<C5634n> e() {
        return this.f18864a;
    }

    public final void f() {
        d();
    }
}
