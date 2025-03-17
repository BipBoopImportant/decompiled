package androidx.compose.foundation;

import G1.C4507j;
import G1.C4515s;
import G1.r;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.M;
import n0.C5586I;
import nI.p;
import p1.C5747v0;
import p1.C5749w0;
import r0.C5812d;
import r0.C5813e;
import r0.h;
import r0.j;
import r0.k;
import r0.o;
import r1.C5817c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/g;", "Ln0/I;", "<init>", "()V", "Lr0/k;", "interactionSource", "LG1/j;", "a", "(Lr0/k;)LG1/j;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g implements C5586I {

    /* renamed from: a  reason: collision with root package name */
    public static final g f17630a = new g();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/g$a;", "Landroidx/compose/ui/d$c;", "LG1/r;", "Lr0/k;", "interactionSource", "<init>", "(Lr0/k;)V", "LXH/N;", "m2", "()V", "Lr1/c;", "z", "(Lr1/c;)V", "n", "Lr0/k;", "", "o", "Z", "isPressed", "p", "isHovered", "q", "isFocused", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends d.c implements r {
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public final k f17631n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public boolean f17632o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public boolean f17633p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public boolean f17634q;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {240}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.g$a$a  reason: collision with other inner class name */
        static final class C0248a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f17635c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f17636d;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/j;", "interaction", "LXH/N;", "c", "(Lr0/j;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.g$a$a$a  reason: collision with other inner class name */
            static final class C0249a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ M f17637a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ M f17638b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ M f17639c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ a f17640d;

                C0249a(M m10, M m11, M m12, a aVar) {
                    this.f17637a = m10;
                    this.f17638b = m11;
                    this.f17639c = m12;
                    this.f17640d = aVar;
                }

                /* renamed from: c */
                public final Object emit(j jVar, C17164e<? super C16807N> eVar) {
                    boolean z10 = true;
                    if (jVar instanceof o.b) {
                        this.f17637a.f144346a++;
                    } else if (jVar instanceof o.c) {
                        M m10 = this.f17637a;
                        m10.f144346a--;
                    } else if (jVar instanceof o.a) {
                        M m11 = this.f17637a;
                        m11.f144346a--;
                    } else if (jVar instanceof r0.g) {
                        this.f17638b.f144346a++;
                    } else if (jVar instanceof h) {
                        M m12 = this.f17638b;
                        m12.f144346a--;
                    } else if (jVar instanceof C5812d) {
                        this.f17639c.f144346a++;
                    } else if (jVar instanceof C5813e) {
                        M m13 = this.f17639c;
                        m13.f144346a--;
                    }
                    boolean z11 = false;
                    boolean z12 = this.f17637a.f144346a > 0;
                    boolean z13 = this.f17638b.f144346a > 0;
                    boolean z14 = this.f17639c.f144346a > 0;
                    if (this.f17640d.f17632o != z12) {
                        this.f17640d.f17632o = z12;
                        z11 = true;
                    }
                    if (this.f17640d.f17633p != z13) {
                        this.f17640d.f17633p = z13;
                        z11 = true;
                    }
                    if (this.f17640d.f17634q != z14) {
                        this.f17640d.f17634q = z14;
                    } else {
                        z10 = z11;
                    }
                    if (z10) {
                        C4515s.a(this.f17640d);
                    }
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0248a(a aVar, C17164e<? super C0248a> eVar) {
                super(2, eVar);
                this.f17636d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0248a(this.f17636d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0248a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f17635c;
                if (i10 == 0) {
                    y.b(obj);
                    M m10 = new M();
                    M m11 = new M();
                    M m12 = new M();
                    C16532g<j> c10 = this.f17636d.f17631n.c();
                    C0249a aVar = new C0249a(m10, m11, m12, this.f17636d);
                    this.f17635c = 1;
                    if (c10.collect(aVar, this) == f10) {
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

        public a(k kVar) {
            this.f17631n = kVar;
        }

        public void m2() {
            F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new C0248a(this, (C17164e<? super C0248a>) null), 3, (Object) null);
        }

        public void z(C5817c cVar) {
            cVar.V1();
            if (this.f17632o) {
                r1.f.q1(cVar, C5747v0.o(C5747v0.f27350b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, cVar.b(), 0.0f, (r1.g) null, (C5749w0) null, 0, 122, (Object) null);
            } else if (this.f17633p || this.f17634q) {
                r1.f.q1(cVar, C5747v0.o(C5747v0.f27350b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, cVar.b(), 0.0f, (r1.g) null, (C5749w0) null, 0, 122, (Object) null);
            }
        }
    }

    private g() {
    }

    public C4507j a(k kVar) {
        return new a(kVar);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return -1;
    }
}
