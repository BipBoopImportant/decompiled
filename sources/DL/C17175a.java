package dL;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import eL.C17217a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l3.a;
import nI.C17631a;
import pL.C17770a;
import qL.C17844a;
import sL.C17952a;
import uI.C18055d;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LdL/a;", "Landroidx/lifecycle/i0$c;", "LuI/d;", "Landroidx/lifecycle/f0;", "kClass", "LsL/a;", "scope", "LqL/a;", "qualifier", "Lkotlin/Function0;", "LpL/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "params", "<init>", "(LuI/d;LsL/a;LqL/a;LnI/a;)V", "T", "Ljava/lang/Class;", "modelClass", "Ll3/a;", "extras", "create", "(Ljava/lang/Class;Ll3/a;)Landroidx/lifecycle/f0;", "a", "LuI/d;", "b", "LsL/a;", "c", "LqL/a;", "e", "LnI/a;", "koin-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dL.a  reason: case insensitive filesystem */
public final class C17175a implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private final C18055d<? extends f0> f142978a;

    /* renamed from: b  reason: collision with root package name */
    private final C17952a f142979b;

    /* renamed from: c  reason: collision with root package name */
    private final C17844a f142980c;

    /* renamed from: e  reason: collision with root package name */
    private final C17631a<C17770a> f142981e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "T", "LpL/a;", "b", "()LpL/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dL.a$a  reason: collision with other inner class name */
    static final class C3483a extends C17544u implements C17631a<C17770a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17217a f142982c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3483a(C17217a aVar) {
            super(0);
            this.f142982c = aVar;
        }

        /* renamed from: b */
        public final C17770a invoke() {
            return this.f142982c;
        }
    }

    public C17175a(C18055d<? extends f0> dVar, C17952a aVar, C17844a aVar2, C17631a<? extends C17770a> aVar3) {
        C17542s.j(dVar, "kClass");
        C17542s.j(aVar, "scope");
        this.f142978a = dVar;
        this.f142979b = aVar;
        this.f142980c = aVar2;
        this.f142981e = aVar3;
    }

    public <T extends f0> T create(Class<T> cls, a aVar) {
        C17542s.j(cls, "modelClass");
        C17542s.j(aVar, "extras");
        return (f0) this.f142979b.b(this.f142978a, this.f142980c, new C3483a(new C17217a(this.f142981e, aVar)));
    }
}
