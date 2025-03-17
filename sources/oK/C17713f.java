package oK;

import HJ.C15854t;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import WK.C16770e;
import WK.C16772g;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.util.TypedValue;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import eI.C17187b;
import jI.C17416c;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nK.C17676g;
import nK.C17679j;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LnK/j;", "Landroid/content/Context;", "context", "", "a", "(LnK/j;Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "b", "LnK/g;", "c", "(LnK/g;Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "sub-sampling-image_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.f  reason: case insensitive filesystem */
public final class C17713f {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "me.saket.telephoto.subsamplingimage.internal.ImageChecksKt", f = "imageChecks.kt", l = {16, 19}, m = "canBeSubSampled")
    /* renamed from: oK.f$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f145361c;

        /* renamed from: d  reason: collision with root package name */
        int f145362d;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f145361c = obj;
            this.f145362d |= Integer.MIN_VALUE;
            return C17713f.a((C17679j) null, (Context) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.internal.ImageChecksKt$canBeSubSampled$2", f = "imageChecks.kt", l = {}, m = "invokeSuspend")
    /* renamed from: oK.f$b */
    static final class b extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f145363c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17679j f145364d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f145365e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17679j jVar, Context context, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f145364d = jVar;
            this.f145365e = context;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f145364d, this.f145365e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f145363c == 0) {
                y.b(obj);
                C16772g C22 = this.f145364d.C2(this.f145365e);
                try {
                    Boolean a10 = kotlin.coroutines.jvm.internal.b.a(!C17714g.c(C22) && !C17714g.b(C22));
                    C17416c.a(C22, (Throwable) null);
                    return a10;
                } catch (Throwable th2) {
                    C17416c.a(C22, th);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.internal.ImageChecksKt$exists$2", f = "imageChecks.kt", l = {}, m = "invokeSuspend")
    /* renamed from: oK.f$c */
    static final class c extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f145366c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17679j f145367d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f145368e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17679j jVar, Context context, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f145367d = jVar;
            this.f145368e = context;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f145367d, this.f145368e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f145366c == 0) {
                y.b(obj);
                boolean z10 = false;
                try {
                    if (this.f145367d.C2(this.f145368e).u0(new C16770e(), 1) != -1) {
                        z10 = true;
                    }
                } catch (FileNotFoundException unused) {
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.internal.ImageChecksKt$isVectorDrawable$2", f = "imageChecks.kt", l = {}, m = "invokeSuspend")
    /* renamed from: oK.f$d */
    static final class d extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f145369c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f145370d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17676g f145371e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, C17676g gVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f145370d = context;
            this.f145371e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f145370d, this.f145371e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f145369c == 0) {
                y.b(obj);
                TypedValue typedValue = new TypedValue();
                this.f145370d.getResources().getValue(this.f145371e.c(), typedValue, true);
                CharSequence charSequence = typedValue.string;
                C17542s.i(charSequence, FeatureVariable.STRING_TYPE);
                return kotlin.coroutines.jvm.internal.b.a(C15854t.j0(charSequence, ".xml", false, 2, (Object) null));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(nK.C17679j r5, android.content.Context r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof oK.C17713f.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            oK.f$a r0 = (oK.C17713f.a) r0
            int r1 = r0.f145362d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f145362d = r1
            goto L_0x0018
        L_0x0013:
            oK.f$a r0 = new oK.f$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f145361c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f145362d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r7)
            goto L_0x0069
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            XH.y.b(r7)
            goto L_0x004a
        L_0x0038:
            XH.y.b(r7)
            boolean r7 = r5 instanceof nK.C17676g
            if (r7 == 0) goto L_0x0056
            nK.g r5 = (nK.C17676g) r5
            r0.f145362d = r4
            java.lang.Object r7 = c(r5, r6, r0)
            if (r7 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            r5 = r5 ^ r4
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        L_0x0056:
            QJ.M r7 = QJ.C16311i0.b()
            oK.f$b r2 = new oK.f$b
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f145362d = r3
            java.lang.Object r7 = QJ.C16310i.g(r7, r2, r0)
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oK.C17713f.a(nK.j, android.content.Context, dI.e):java.lang.Object");
    }

    public static final Object b(C17679j jVar, Context context, C17164e<? super Boolean> eVar) {
        return C16310i.g(C16311i0.b(), new c(jVar, context, (C17164e<? super c>) null), eVar);
    }

    private static final Object c(C17676g gVar, Context context, C17164e<? super Boolean> eVar) {
        return C16310i.g(C16311i0.b(), new d(context, gVar, (C17164e<? super d>) null), eVar);
    }
}
