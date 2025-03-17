package sH;

import CH.C15493e;
import EH.C15618c;
import EH.C15627l;
import EH.C15628m;
import EH.C15631p;
import FH.d;
import JH.t;
import XH.C16807N;
import YH.C16877v;
import YH.g0;
import dI.C17164e;
import dI.C17168i;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0016\u001a\u00020\u00058\u0006XD¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"LEH/l;", "requestHeaders", "LFH/d;", "content", "Lkotlin/Function2;", "", "LXH/N;", "block", "c", "(LEH/l;LFH/d;LnI/p;)V", "LdI/i;", "b", "(LdI/e;)Ljava/lang/Object;", "", "d", "()Z", "a", "Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT", "()Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT$annotations", "()V", "KTOR_DEFAULT_USER_AGENT", "", "Ljava/util/Set;", "DATE_HEADERS", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final String f147000a = "Ktor client";
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f147001b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEH/m;", "LXH/N;", "a", "(LEH/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C15628m, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15627l f147002c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f147003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15627l lVar, d dVar) {
            super(1);
            this.f147002c = lVar;
            this.f147003d = dVar;
        }

        public final void a(C15628m mVar) {
            C17542s.j(mVar, "$this$buildHeaders");
            mVar.d(this.f147002c);
            mVar.d(this.f147003d.c());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C15628m) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "key", "", "values", "LXH/N;", "a", "(Ljava/lang/String;Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements p<String, List<? extends String>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<String, String, C16807N> f147004c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p<? super String, ? super String, C16807N> pVar) {
            super(2);
            this.f147004c = pVar;
        }

        public final void a(String str, List<String> list) {
            C17542s.j(str, "key");
            C17542s.j(list, "values");
            C15631p pVar = C15631p.f134088a;
            if (C17542s.e(pVar.g(), str) || C17542s.e(pVar.h(), str)) {
                return;
            }
            if (m.f147001b.contains(str)) {
                p<String, String, C16807N> pVar2 = this.f147004c;
                for (String invoke : list) {
                    pVar2.invoke(str, invoke);
                }
                return;
            }
            this.f147004c.invoke(str, C16877v.G0(list, C17542s.e(pVar.i(), str) ? "; " : ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (List) obj2);
            return C16807N.f139792a;
        }
    }

    static {
        C15631p pVar = C15631p.f134088a;
        f147001b = g0.h(pVar.j(), pVar.k(), pVar.n(), pVar.l(), pVar.m());
    }

    public static final Object b(C17164e<? super C17168i> eVar) {
        C17168i.b bVar = eVar.getContext().get(j.f146996b);
        C17542s.g(bVar);
        return ((j) bVar).a();
    }

    public static final void c(C15627l lVar, d dVar, p<? super String, ? super String, C16807N> pVar) {
        String str;
        String str2;
        C17542s.j(lVar, "requestHeaders");
        C17542s.j(dVar, "content");
        C17542s.j(pVar, "block");
        C15493e.a(new a(lVar, dVar)).d(new b(pVar));
        C15631p pVar2 = C15631p.f134088a;
        if (lVar.get(pVar2.q()) == null && dVar.c().get(pVar2.q()) == null && d()) {
            pVar.invoke(pVar2.q(), f147000a);
        }
        C15618c b10 = dVar.b();
        if ((b10 == null || (str = b10.toString()) == null) && (str = dVar.c().get(pVar2.h())) == null) {
            str = lVar.get(pVar2.h());
        }
        Long a10 = dVar.a();
        if ((a10 == null || (str2 = a10.toString()) == null) && (str2 = dVar.c().get(pVar2.g())) == null) {
            str2 = lVar.get(pVar2.g());
        }
        if (str != null) {
            pVar.invoke(pVar2.h(), str);
        }
        if (str2 != null) {
            pVar.invoke(pVar2.g(), str2);
        }
    }

    private static final boolean d() {
        return !t.f135734a.a();
    }
}
