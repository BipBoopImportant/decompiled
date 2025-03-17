package N8;

import J8.b;
import M8.d;
import XH.C16807N;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import y8.C8993b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly8/b;", "LM8/a;", "aggregatedRules", "LJ8/b;", "symmetricCryptor", "LM8/d;", "telemetryBuilder", "a", "(Ly8/b;LM8/a;LJ8/b;LM8/d;)Ly8/b;", "error-analysis_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "size", "LXH/N;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17642l<Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f39171c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(1);
            this.f39171c = dVar;
        }

        public final void a(int i10) {
            this.f39171c.c("query_params_max_size_exceeded", (long) i10, 2000);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return C16807N.f139792a;
        }
    }

    public static final C8993b a(C8993b bVar, M8.a aVar, b bVar2, d dVar) {
        byte[] bArr;
        d dVar2 = dVar;
        C17542s.j(bVar, "<this>");
        C17542s.j(aVar, "aggregatedRules");
        C17542s.j(bVar2, "symmetricCryptor");
        C17542s.j(dVar2, "telemetryBuilder");
        Integer num = null;
        if (aVar.e()) {
            byte[] o10 = bVar.o();
            byte[] o11 = bVar.o();
            if (o11 != null) {
                num = Integer.valueOf(o11.length);
            }
            bArr = bVar2.b(o10, true, num, 2000L, new a(dVar2));
        } else {
            bArr = null;
        }
        return C8993b.b(bVar, 0, (String) null, (String) null, 0, 0, 0, (byte[]) null, (Integer) null, (byte[]) null, (Integer) null, (Map) null, (Map) null, (byte[]) null, (byte[]) null, bArr, (byte[]) null, (byte[]) null, (Long) null, (Map) null, (Map) null, (String) null, (List) null, (Map) null, (byte[]) null, (Map) null, (byte[]) null, (Map) null, (Map) null, 268419071, (Object) null);
    }
}
