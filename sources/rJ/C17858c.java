package rJ;

import AI.C15422c;
import DI.C15538I;
import XH.v;
import XI.m;
import YI.C16882a;
import YI.C16884c;
import cJ.C17066c;
import java.io.InputStream;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qJ.C17833u;
import sJ.C17942s;
import tJ.C17994n;

/* renamed from: rJ.c  reason: case insensitive filesystem */
public final class C17858c extends C17833u implements C15422c {

    /* renamed from: o  reason: collision with root package name */
    public static final a f146681o = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private final boolean f146682n;

    /* renamed from: rJ.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17858c a(C17066c cVar, C17994n nVar, C15538I i10, InputStream inputStream, boolean z10) {
            C17542s.j(cVar, "fqName");
            C17542s.j(nVar, "storageManager");
            C17542s.j(i10, "module");
            C17542s.j(inputStream, "inputStream");
            v<m, C16882a> a10 = C16884c.a(inputStream);
            m a11 = a10.a();
            C16882a b10 = a10.b();
            if (a11 != null) {
                return new C17858c(cVar, nVar, i10, a11, b10, z10, (DefaultConstructorMarker) null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C16882a.f140474h + ", actual " + b10 + ". Please update Kotlin");
        }

        private a() {
        }
    }

    public /* synthetic */ C17858c(C17066c cVar, C17994n nVar, C15538I i10, m mVar, C16882a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, i10, mVar, aVar, z10);
    }

    public String toString() {
        return "builtins package fragment for " + f() + " from " + C17506e.s(this);
    }

    private C17858c(C17066c cVar, C17994n nVar, C15538I i10, m mVar, C16882a aVar, boolean z10) {
        super(cVar, nVar, i10, mVar, aVar, (C17942s) null);
        this.f146682n = z10;
    }
}
