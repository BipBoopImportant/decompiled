package HD;

import GD.C12928a;
import GD.C12929b;
import GD.C12930c;
import GD.k;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15990f;
import Oo.b;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import ix.c;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LHD/b;", "LHD/a;", "<init>", "()V", "Lix/c;", "card", "LIC/e;", "d", "(Lix/c;)LIC/e;", "LXH/v;", "LGD/k$b$g;", "e", "(Lix/c;)LXH/v;", "LKJ/f;", "LGD/c;", "b", "(Lix/c;)LKJ/f;", "Lix/c$b;", "LGD/a;", "f", "(Lix/c$b;)LGD/a;", "", "code", "c", "(Ljava/lang/String;)Ljava/lang/String;", "LGD/k$b;", "a", "(Lix/c;)LGD/k$b;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HD.b  reason: case insensitive filesystem */
public final class C12992b implements C12991a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HD.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f110679a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f110680b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                ix.c$d[] r0 = ix.c.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ix.c$d r2 = ix.c.d.GiftCard     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ix.c$d r3 = ix.c.d.RefundCard     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f110679a = r0
                ix.c$c[] r0 = ix.c.C3149c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ix.c$c r3 = ix.c.C3149c.Active     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                ix.c$c r1 = ix.c.C3149c.Expired     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                ix.c$c r1 = ix.c.C3149c.Other     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f110680b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: HD.C12992b.a.<clinit>():void");
        }
    }

    private final C15990f<C12930c> b(c cVar) {
        return C15985a.b(new C12930c(C13026h.a(b.f84629e7), cVar.i(), c(cVar.i()), true), new C12930c(C13026h.a(b.f84548X0), cVar.g(), cVar.g(), true));
    }

    private final String c(String str) {
        return C16877v.G0(C15854t.D1(str, 4), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    private final C13023e d(c cVar) {
        int i10 = a.f110679a[cVar.k().ordinal()];
        if (i10 == 1) {
            return C13026h.a(b.f84668i2);
        }
        if (i10 == 2) {
            return C13026h.a(b.f84690k2);
        }
        throw new t();
    }

    private final v<k.b.g, C13023e> e(c cVar) {
        C13023e eVar;
        int i10 = a.f110680b[cVar.j().ordinal()];
        if (i10 == 1) {
            if (!C15854t.v0(cVar.d())) {
                eVar = C13026h.b(b.f84538W0, DateTimeFormatter.ISO_LOCAL_DATE.format(Instant.parse(cVar.d()).atZone(ZoneId.systemDefault())));
            } else {
                eVar = C13026h.c("");
            }
            return C16796C.a(new k.b.g.a(cVar.h()), eVar);
        } else if (i10 == 2 || i10 == 3) {
            return C16796C.a(k.b.g.C2651b.f110432a, C13026h.a(b.f84528V0));
        } else {
            throw new t();
        }
    }

    private final C12928a f(c.b bVar) {
        return new C12928a(bVar.b(), bVar.a());
    }

    public k.b a(c cVar) {
        C17542s.j(cVar, "card");
        v<k.b.g, C13023e> e10 = e(cVar);
        k.b.g a10 = e10.a();
        C12929b bVar = new C12929b(d(cVar), C13026h.c(cVar.c().a()), e10.b());
        int i10 = a.f110679a[cVar.k().ordinal()];
        if (i10 == 1) {
            return new k.b.c(bVar, cVar.e(), cVar.i(), cVar.g(), f(cVar.f()), b(cVar), a10);
        }
        if (i10 == 2) {
            return new k.b.e(bVar, cVar.e(), cVar.i(), cVar.g(), f(cVar.f()), b(cVar), a10);
        }
        throw new t();
    }
}
