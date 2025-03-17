package jz;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import Yy.g;
import aA.C13909a;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import dI.C17164e;
import eI.C17187b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.r;
import oz.C14902a;
import sz.b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"Ljz/e;", "Lsz/b;", "LYy/g;", "coWorkerDiscountLocalDataSource", "Loz/a;", "settingsLocalDataSource", "LaA/a;", "sessionManager", "<init>", "(LYy/g;Loz/a;LaA/a;)V", "LXH/N;", "b", "(LdI/e;)Ljava/lang/Object;", "a", "LYy/g;", "LTJ/g;", "", "LTJ/g;", "()LTJ/g;", "isCoWorkerDiscountApplied", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f128270a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<Boolean> f128271b;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "settings", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "isCoWorkerDiscountApplied", "isEmployee"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.repository.ScanAndGoCoWorkerDiscountRepositoryImpl$isCoWorkerDiscountApplied$1", f = "ScanAndGoCoWorkerDiscountRepositoryImpl.kt", l = {33}, m = "invokeSuspend")
    static final class a extends l implements r<ScanAndGoSettings, Boolean, Boolean, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f128272c;

        /* renamed from: d  reason: collision with root package name */
        Object f128273d;

        /* renamed from: e  reason: collision with root package name */
        boolean f128274e;

        /* renamed from: f  reason: collision with root package name */
        int f128275f;

        /* renamed from: g  reason: collision with root package name */
        int f128276g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f128277h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f128278i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ boolean f128279j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ e f128280k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(4, eVar2);
            this.f128280k = eVar;
        }

        public final Object i(ScanAndGoSettings scanAndGoSettings, Boolean bool, boolean z10, C17164e<? super Boolean> eVar) {
            a aVar = new a(this.f128280k, eVar);
            aVar.f128277h = scanAndGoSettings;
            aVar.f128278i = bool;
            aVar.f128279j = z10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object f10 = C17187b.f();
            int i10 = this.f128276g;
            if (i10 == 0) {
                y.b(obj);
                ScanAndGoSettings scanAndGoSettings = (ScanAndGoSettings) this.f128277h;
                Boolean bool = (Boolean) this.f128278i;
                boolean z11 = this.f128279j;
                Iterable q10 = C16877v.q(scanAndGoSettings != null ? kotlin.coroutines.jvm.internal.b.a(scanAndGoSettings.r()) : null, bool, kotlin.coroutines.jvm.internal.b.a(z11));
                if (!(q10 instanceof Collection) || !((Collection) q10).isEmpty()) {
                    Iterator it = q10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!C17542s.e((Boolean) it.next(), kotlin.coroutines.jvm.internal.b.a(true))) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z10 = true;
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(z10);
                e eVar = this.f128280k;
                boolean booleanValue = a10.booleanValue();
                g c10 = eVar.f128270a;
                this.f128277h = scanAndGoSettings;
                this.f128278i = bool;
                this.f128272c = a10;
                this.f128273d = eVar;
                this.f128279j = z11;
                this.f128274e = booleanValue;
                this.f128275f = 0;
                this.f128276g = 1;
                return c10.b(booleanValue, this) == f10 ? f10 : a10;
            } else if (i10 == 1) {
                e eVar2 = (e) this.f128273d;
                Boolean bool2 = (Boolean) this.f128272c;
                Boolean bool3 = (Boolean) this.f128278i;
                ScanAndGoSettings scanAndGoSettings2 = (ScanAndGoSettings) this.f128277h;
                y.b(obj);
                return bool2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((ScanAndGoSettings) obj, (Boolean) obj2, ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    public e(g gVar, C14902a aVar, C13909a aVar2) {
        C17542s.j(gVar, "coWorkerDiscountLocalDataSource");
        C17542s.j(aVar, "settingsLocalDataSource");
        C17542s.j(aVar2, "sessionManager");
        this.f128270a = gVar;
        this.f128271b = C16534i.m(C16534i.s(aVar.b()), C16534i.s(gVar.a()), C16534i.s(aVar2.j()), new a(this, (C17164e<? super a>) null));
    }

    public C16532g<Boolean> a() {
        return this.f128271b;
    }

    public Object b(C17164e<? super C16807N> eVar) {
        Object b10 = this.f128270a.b(false, eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }
}
