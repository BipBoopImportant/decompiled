package me.saket.telephoto.zoomable.internal;

import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR8\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lme/saket/telephoto/zoomable/internal/b;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "LdI/e;", "LXH/N;", "", "callback", "<init>", "(LnI/l;)V", "m2", "()V", "n", "LnI/l;", "C2", "()LnI/l;", "D2", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class b extends d.c {

    /* renamed from: n  reason: collision with root package name */
    private C17642l<? super C17164e<? super C16807N>, ? extends Object> f144626n;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f144627c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
        @f(c = "me.saket.telephoto.zoomable.internal.OnAttachedNode$onAttach$1$1", f = "OnAttachedModifier.kt", l = {29}, m = "invokeSuspend")
        /* renamed from: me.saket.telephoto.zoomable.internal.b$a$a  reason: collision with other inner class name */
        static final class C3528a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f144628c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f144629d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3528a(b bVar, C17164e<? super C3528a> eVar) {
                super(2, eVar);
                this.f144629d = bVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3528a(this.f144629d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3528a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f144628c;
                if (i10 == 0) {
                    y.b(obj);
                    C17642l<C17164e<? super C16807N>, Object> C22 = this.f144629d.C2();
                    this.f144628c = 1;
                    if (C22.invoke(this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.f144627c = bVar;
        }

        public final void invoke() {
            F0 unused = C16314k.d(this.f144627c.c2(), (C17168i) null, (T) null, new C3528a(this.f144627c, (C17164e<? super C3528a>) null), 3, (Object) null);
        }
    }

    public b(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        C17542s.j(lVar, "callback");
        this.f144626n = lVar;
    }

    public final C17642l<C17164e<? super C16807N>, Object> C2() {
        return this.f144626n;
    }

    public final void D2(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        C17542s.j(lVar, "<set-?>");
        this.f144626n = lVar;
    }

    public void m2() {
        A2(new a(this));
    }
}
