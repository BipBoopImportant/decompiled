package YD;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.net.Uri;
import cE.C14034b;
import cw.d;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LYD/d;", "LYD/a;", "Lcw/d;", "messageCenterRepository", "", "LZl/a;", "applinkMappers", "<init>", "(Lcw/d;Ljava/util/Set;)V", "", "applink", "LTJ/g;", "", "LcE/b;", "a", "(Ljava/lang/String;)LTJ/g;", "Lcw/d;", "b", "Ljava/util/Set;", "whatsnew-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YD.d  reason: case insensitive filesystem */
public final class C13864d implements C13861a {

    /* renamed from: a  reason: collision with root package name */
    private final d f118090a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Set<Zl.a> f118091b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcw/f;", "list", "LcE/b;", "<anonymous>", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.whatsnew.impl.domain.GetWhatsNewMessagesUseCaseImpl$invoke$1", f = "GetWhatsNewMessagesUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: YD.d$a */
    static final class a extends l implements p<List<? extends cw.f>, C17164e<? super List<? extends C14034b>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118092c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f118093d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f118094e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13864d f118095f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, C13864d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f118094e = str;
            this.f118095f = dVar;
        }

        /* access modifiers changed from: private */
        public static final boolean m(C13864d dVar, cw.f fVar) {
            if (fVar.d() != 0) {
                return false;
            }
            String c10 = fVar.c();
            if (c10 != null) {
                Iterable<Zl.a> b10 = dVar.f118091b;
                if (!(b10 instanceof Collection) || !((Collection) b10).isEmpty()) {
                    for (Zl.a a10 : b10) {
                        if (a10.a(Uri.parse(c10))) {
                        }
                    }
                }
            }
            return true;
            return false;
        }

        /* access modifiers changed from: private */
        public static final boolean n(String str, C13864d dVar, cw.f fVar) {
            if (fVar.d() == 0 && C17542s.e(fVar.c(), str)) {
                Iterable<Zl.a> b10 = dVar.f118091b;
                if (!(b10 instanceof Collection) || !((Collection) b10).isEmpty()) {
                    for (Zl.a a10 : b10) {
                        if (a10.a(Uri.parse(str))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f118094e, this.f118095f, eVar);
            aVar.f118093d = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118092c == 0) {
                y.b(obj);
                List list = (List) this.f118093d;
                String str = this.f118094e;
                C17642l bVar = (str == null || str.length() == 0) ? new C13862b(this.f118095f) : new C13863c(this.f118094e, this.f118095f);
                if (list == null) {
                    return C16877v.n();
                }
                ArrayList<cw.f> arrayList = new ArrayList<>();
                for (Object next : list) {
                    if (((Boolean) bVar.invoke(next)).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
                for (cw.f fVar : arrayList) {
                    arrayList2.add(new C14034b(fVar.e(), fVar.l(), fVar.k(), fVar.f(), fVar.m(), fVar.g()));
                }
                return arrayList2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: k */
        public final Object invoke(List<cw.f> list, C17164e<? super List<C14034b>> eVar) {
            return ((a) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    public C13864d(d dVar, Set<Zl.a> set) {
        C17542s.j(dVar, "messageCenterRepository");
        C17542s.j(set, "applinkMappers");
        this.f118090a = dVar;
        this.f118091b = set;
    }

    public C16532g<List<C14034b>> a(String str) {
        return C16534i.N(this.f118090a.a(), new a(str, this, (C17164e<? super a>) null));
    }
}
