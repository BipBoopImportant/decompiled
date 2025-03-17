package U5;

import T5.r;
import U5.e;
import dI.C17164e;
import k6.C8441h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\tJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"LU5/h;", "", "LT5/r;", "imageLoader", "Lk6/h;", "request", "LU5/e$c;", "a", "(LT5/r;Lk6/h;LdI/e;)Ljava/lang/Object;", "b", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h {

    /* renamed from: a  reason: collision with root package name */
    public static final b f40225a = b.f40232a;

    /* renamed from: b  reason: collision with root package name */
    public static final h f40226b = a.f40227c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements h {

        /* renamed from: c  reason: collision with root package name */
        public static final a f40227c = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @f(c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", f = "LocalAsyncImagePreviewHandler.kt", l = {37}, m = "handle")
        /* renamed from: U5.h$a$a  reason: collision with other inner class name */
        static final class C0660a extends d {

            /* renamed from: c  reason: collision with root package name */
            Object f40228c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f40229d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a f40230e;

            /* renamed from: f  reason: collision with root package name */
            int f40231f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0660a(a aVar, C17164e<? super C0660a> eVar) {
                super(eVar);
                this.f40230e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f40229d = obj;
                this.f40231f |= Integer.MIN_VALUE;
                return this.f40230e.a((r) null, (C8441h) null, this);
            }
        }

        a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: k6.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(T5.r r5, k6.C8441h r6, dI.C17164e<? super U5.e.c> r7) {
            /*
                r4 = this;
                boolean r0 = r7 instanceof U5.h.a.C0660a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                U5.h$a$a r0 = (U5.h.a.C0660a) r0
                int r1 = r0.f40231f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f40231f = r1
                goto L_0x0018
            L_0x0013:
                U5.h$a$a r0 = new U5.h$a$a
                r0.<init>(r4, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f40229d
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f40231f
                r3 = 1
                if (r2 == 0) goto L_0x0036
                if (r2 != r3) goto L_0x002e
                java.lang.Object r5 = r0.f40228c
                r6 = r5
                k6.h r6 = (k6.C8441h) r6
                XH.y.b(r7)
                goto L_0x0044
            L_0x002e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0036:
                XH.y.b(r7)
                r0.f40228c = r6
                r0.f40231f = r3
                java.lang.Object r7 = r5.d(r6, r0)
                if (r7 != r1) goto L_0x0044
                return r1
            L_0x0044:
                k6.l r7 = (k6.C8445l) r7
                boolean r5 = r7 instanceof k6.C8454u
                r0 = 2
                r1 = 0
                r2 = 0
                if (r5 == 0) goto L_0x0061
                U5.e$c$d r5 = new U5.e$c$d
                k6.u r7 = (k6.C8454u) r7
                T5.n r3 = r7.k()
                android.content.Context r6 = r6.c()
                t1.c r6 = U5.n.b(r3, r6, r1, r0, r2)
                r5.<init>(r6, r7)
                goto L_0x007a
            L_0x0061:
                boolean r5 = r7 instanceof k6.C8438e
                if (r5 == 0) goto L_0x007b
                U5.e$c$b r5 = new U5.e$c$b
                k6.e r7 = (k6.C8438e) r7
                T5.n r3 = r7.k()
                if (r3 == 0) goto L_0x0077
                android.content.Context r6 = r6.c()
                t1.c r2 = U5.n.b(r3, r6, r1, r0, r2)
            L_0x0077:
                r5.<init>(r2, r7)
            L_0x007a:
                return r5
            L_0x007b:
                XH.t r5 = new XH.t
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: U5.h.a.a(T5.r, k6.h, dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"LU5/h$b;", "", "<init>", "()V", "LU5/h;", "Default", "LU5/h;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f40232a = new b();

        private b() {
        }
    }

    Object a(r rVar, C8441h hVar, C17164e<? super e.c> eVar);
}
