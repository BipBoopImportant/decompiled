package eE;

import androidx.work.C7042k;
import androidx.work.C7054x;
import java.util.UUID;
import kotlin.Metadata;
import uI.C18055d;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ9\u0010\r\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LeE/d;", "", "Landroidx/work/x;", "W", "LuI/d;", "worker", "LeE/a;", "parameters", "Ljava/util/UUID;", "a", "(LuI/d;LeE/a;)Ljava/util/UUID;", "Landroidx/work/k;", "existingWorkPolicy", "b", "(LuI/d;LeE/a;Landroidx/work/k;)Ljava/util/UUID;", "LeE/b;", "d", "(LuI/d;LeE/b;)Ljava/util/UUID;", "", "name", "LXH/N;", "c", "(Ljava/lang/String;)V", "workscheduler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eE.d  reason: case insensitive filesystem */
public interface C14400d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eE.d$a */
    public static final class a {
        public static /* synthetic */ UUID a(C14400d dVar, C18055d dVar2, C14397a aVar, C7042k kVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    kVar = C7042k.REPLACE;
                }
                return dVar.b(dVar2, aVar, kVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scheduleUnique");
        }
    }

    <W extends C7054x> UUID a(C18055d<W> dVar, C14397a aVar);

    <W extends C7054x> UUID b(C18055d<W> dVar, C14397a aVar, C7042k kVar);

    void c(String str);

    <W extends C7054x> UUID d(C18055d<W> dVar, C14398b bVar);
}
