package eL;

import androidx.lifecycle.U;
import androidx.lifecycle.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import pL.C17770a;
import uI.C18055d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LeL/a;", "LpL/a;", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersDefinition;", "initialValues", "Ll3/a;", "extras", "<init>", "(LnI/a;Ll3/a;)V", "T", "LuI/d;", "clazz", "block", "g", "(LuI/d;LnI/a;)Ljava/lang/Object;", "c", "(LuI/d;)Ljava/lang/Object;", "d", "Ll3/a;", "getExtras", "()Ll3/a;", "koin-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eL.a  reason: case insensitive filesystem */
public final class C17217a extends C17770a {

    /* renamed from: d  reason: collision with root package name */
    private final a f143135d;

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eL.a$a  reason: collision with other inner class name */
    static final class C3489a extends C17544u implements C17631a<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17217a f143136c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18055d<?> f143137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3489a(C17217a aVar, C18055d<?> dVar) {
            super(0);
            this.f143136c = aVar;
            this.f143137d = dVar;
        }

        public final T invoke() {
            return C17217a.super.c(this.f143137d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r3 = YH.C16877v.w1((r3 = (r3 = (pL.C17770a) r3.invoke()).d()));
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17217a(nI.C17631a<? extends pL.C17770a> r3, l3.a r4) {
        /*
            r2 = this;
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            if (r3 == 0) goto L_0x001d
            java.lang.Object r3 = r3.invoke()
            pL.a r3 = (pL.C17770a) r3
            if (r3 == 0) goto L_0x001d
            java.util.List r3 = r3.d()
            if (r3 == 0) goto L_0x001d
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r3 = YH.C16877v.w1(r3)
            if (r3 != 0) goto L_0x0022
        L_0x001d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0022:
            r0 = 2
            r1 = 0
            r2.<init>(r3, r1, r0, r1)
            r2.f143135d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eL.C17217a.<init>(nI.a, l3.a):void");
    }

    private final <T> T g(C18055d<?> dVar, C17631a<? extends T> aVar) {
        return C17542s.e(dVar, P.b(U.class)) ? X.b(this.f143135d) : aVar.invoke();
    }

    public <T> T c(C18055d<?> dVar) {
        C17542s.j(dVar, "clazz");
        return g(dVar, new C3489a(this, dVar));
    }
}
