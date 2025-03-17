package rK;

import XH.C16807N;
import XH.y;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.n;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n1.C5635o;
import nI.C17642l;
import r0.m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "LrK/i;", "forwarder", "", "enabled", "a", "(Landroidx/compose/ui/d;LrK/i;Z)Landroidx/compose/ui/d;", "b", "(Landroidx/compose/ui/d;LrK/i;)Landroidx/compose/ui/d;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.j  reason: case insensitive filesystem */
public final class C17875j {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln1/o;", "it", "LXH/N;", "a", "(Ln1/o;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rK.j$a */
    static final class a extends C17544u implements C17642l<C5635o, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17874i f146770c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17874i iVar) {
            super(1);
            this.f146770c = iVar;
        }

        public final void a(C5635o oVar) {
            C17542s.j(oVar, "it");
            this.f146770c.e(oVar.a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5635o) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln1/o;", "it", "LXH/N;", "a", "(Ln1/o;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rK.j$b */
    static final class b extends C17544u implements C17642l<C5635o, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17874i f146771c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17874i iVar) {
            super(1);
            this.f146771c = iVar;
        }

        public final void a(C5635o oVar) {
            C17542s.j(oVar, "it");
            this.f146771c.d(oVar.a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5635o) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.zoomable.internal.FocusForwarderKt$receiveFocusFrom$2", f = "FocusForwarder.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: rK.j$c */
    static final class c extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f146772c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17874i f146773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17874i iVar, C17164e<? super c> eVar) {
            super(1, eVar);
            this.f146773d = iVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new c(this.f146773d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f146772c;
            if (i10 == 0) {
                y.b(obj);
                C17874i iVar = this.f146773d;
                this.f146772c = 1;
                if (iVar.f(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public static final d a(d dVar, C17874i iVar, boolean z10) {
        C17542s.j(dVar, "<this>");
        C17542s.j(iVar, "forwarder");
        return z10 ? FocusableKt.c(androidx.compose.ui.focus.b.a(dVar, new a(iVar)), !iVar.b(), (m) null, 2, (Object) null) : dVar;
    }

    public static final d b(d dVar, C17874i iVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(iVar, "forwarder");
        return me.saket.telephoto.zoomable.internal.a.a(androidx.compose.ui.focus.b.a(n.a(dVar, iVar.a()), new b(iVar)), new c(iVar, (C17164e<? super c>) null));
    }
}
