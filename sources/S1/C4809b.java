package S1;

import S1.C4828v;
import XH.x;
import XH.y;
import android.content.Context;
import android.graphics.Typeface;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, d2 = {"LS1/b;", "LS1/J;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LS1/l;", "font", "Landroid/graphics/Typeface;", "d", "(LS1/l;)Landroid/graphics/Typeface;", "b", "(LS1/l;LdI/e;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", "", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: S1.b  reason: case insensitive filesystem */
public final class C4809b implements J {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13368a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f13369b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {57, 58}, m = "awaitLoad")
    /* renamed from: S1.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f13370c;

        /* renamed from: d  reason: collision with root package name */
        Object f13371d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f13372e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4809b f13373f;

        /* renamed from: g  reason: collision with root package name */
        int f13374g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4809b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f13373f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13372e = obj;
            this.f13374g |= Integer.MIN_VALUE;
            return this.f13373f.b((C4819l) null, this);
        }
    }

    public C4809b(Context context) {
        this.f13368a = context.getApplicationContext();
    }

    public Object a() {
        return this.f13369b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(S1.C4819l r6, dI.C17164e<? super android.graphics.Typeface> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof S1.C4809b.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            S1.b$a r0 = (S1.C4809b.a) r0
            int r1 = r0.f13374g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13374g = r1
            goto L_0x0018
        L_0x0013:
            S1.b$a r0 = new S1.b$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f13372e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f13374g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r6 = r0.f13371d
            S1.l r6 = (S1.C4819l) r6
            java.lang.Object r0 = r0.f13370c
            S1.b r0 = (S1.C4809b) r0
            XH.y.b(r7)
            goto L_0x005e
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            XH.y.b(r7)
            return r7
        L_0x0040:
            XH.y.b(r7)
            boolean r7 = r6 instanceof S1.C4808a
            if (r7 != 0) goto L_0x0084
            boolean r7 = r6 instanceof S1.Q
            if (r7 == 0) goto L_0x006d
            r7 = r6
            S1.Q r7 = (S1.Q) r7
            android.content.Context r2 = r5.f13368a
            r0.f13370c = r5
            r0.f13371d = r6
            r0.f13374g = r3
            java.lang.Object r7 = S1.C4810c.d(r7, r2, r0)
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r5
        L_0x005e:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            S1.Q r6 = (S1.Q) r6
            S1.B r6 = r6.e()
            android.content.Context r0 = r0.f13368a
            android.graphics.Typeface r6 = S1.P.c(r7, r6, r0)
            return r6
        L_0x006d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0084:
            S1.a r6 = (S1.C4808a) r6
            r6.d()
            r0.f13374g = r4
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C4809b.b(S1.l, dI.e):java.lang.Object");
    }

    /* renamed from: d */
    public Typeface c(C4819l lVar) {
        Typeface typeface;
        Object obj;
        Object obj2 = null;
        if (lVar instanceof C4808a) {
            ((C4808a) lVar).d();
            throw null;
        } else if (!(lVar instanceof Q)) {
            return null;
        } else {
            int a10 = lVar.a();
            C4828v.a aVar = C4828v.f13445a;
            if (C4828v.e(a10, aVar.b())) {
                typeface = C4810c.c((Q) lVar, this.f13368a);
            } else if (C4828v.e(a10, aVar.c())) {
                try {
                    x.a aVar2 = x.f139812b;
                    obj = x.b(C4810c.c((Q) lVar, this.f13368a));
                } catch (Throwable th2) {
                    x.a aVar3 = x.f139812b;
                    obj = x.b(y.a(th2));
                }
                if (!x.g(obj)) {
                    obj2 = obj;
                }
                typeface = (Typeface) obj2;
            } else if (C4828v.e(a10, aVar.a())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            } else {
                throw new IllegalArgumentException("Unknown loading type " + C4828v.g(lVar.a()));
            }
            return P.c(typeface, ((Q) lVar).e(), this.f13368a);
        }
    }
}
