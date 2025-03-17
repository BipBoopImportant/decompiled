package M8;

import XH.C16807N;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import y8.C8993b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ly8/b;", "LM8/a;", "aggregatedRules", "", "b", "(Ly8/b;LM8/a;)Z", "c", "LJ8/b;", "symmetricCryptor", "LM8/d;", "telemetrySender", "a", "(Ly8/b;LM8/a;LJ8/b;LM8/d;)Ly8/b;", "error-analysis_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "size", "LXH/N;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17642l<Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f38645c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(1);
            this.f38645c = dVar;
        }

        public final void a(int i10) {
            this.f38645c.c("request_body_max_size_exceeded", (long) i10, 64000);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "size", "LXH/N;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17642l<Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f38646c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(1);
            this.f38646c = dVar;
        }

        public final void a(int i10) {
            this.f38646c.c("response_body_max_size_exceeded", (long) i10, 5000);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return C16807N.f139792a;
        }
    }

    public static final C8993b a(C8993b bVar, a aVar, J8.b bVar2, d dVar) {
        byte[] bArr;
        byte[] bArr2;
        d dVar2 = dVar;
        C17542s.j(bVar, "<this>");
        C17542s.j(aVar, "aggregatedRules");
        C17542s.j(bVar2, "symmetricCryptor");
        C17542s.j(dVar2, "telemetrySender");
        if (b(bVar, aVar)) {
            bArr = bVar2.b(bVar.p(), true, bVar.r(), 64000L, new a(dVar2));
        } else {
            bArr = null;
        }
        if (c(bVar, aVar)) {
            bArr2 = bVar2.b(bVar.u(), true, bVar.w(), 5000L, new b(dVar2));
        } else {
            bArr2 = null;
        }
        return C8993b.b(bVar, 0, (String) null, (String) null, 0, 0, 0, bArr, (Integer) null, bArr2, (Integer) null, (Map) null, (Map) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (Long) null, (Map) null, (Map) null, (String) null, (List) null, (Map) null, (byte[]) null, (Map) null, (byte[]) null, (Map) null, (Map) null, 268435135, (Object) null);
    }

    public static final boolean b(C8993b bVar, a aVar) {
        byte[] p10;
        C17542s.j(bVar, "<this>");
        C17542s.j(aVar, "aggregatedRules");
        if (!aVar.f() || (p10 = bVar.p()) == null) {
            return false;
        }
        return (p10.length == 0) ^ true;
    }

    public static final boolean c(C8993b bVar, a aVar) {
        byte[] u10;
        C17542s.j(bVar, "<this>");
        C17542s.j(aVar, "aggregatedRules");
        if (!aVar.g() || (u10 = bVar.u()) == null) {
            return false;
        }
        return (u10.length == 0) ^ true;
    }
}
