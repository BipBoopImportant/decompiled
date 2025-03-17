package yF;

import DF.C12785b;
import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.h;
import com.sugarcube.core.logger.AnyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LyF/b;", "Landroidx/recyclerview/widget/h$f;", "LDF/b;", "<init>", "()V", "oldItem", "newItem", "", "b", "(LDF/b;LDF/b;)Z", "a", "", "c", "(LDF/b;LDF/b;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yF.b  reason: case insensitive filesystem */
public final class C15304b extends h.f<C12785b> {
    /* renamed from: a */
    public boolean areContentsTheSame(C12785b bVar, C12785b bVar2) {
        C17542s.j(bVar, "oldItem");
        C17542s.j(bVar2, "newItem");
        boolean e10 = C17542s.e(bVar, bVar2);
        Log.d(AnyKt.SUGARCUBE_TAG, "content same " + e10);
        return C17542s.e(bVar, bVar2);
    }

    /* renamed from: b */
    public boolean areItemsTheSame(C12785b bVar, C12785b bVar2) {
        C17542s.j(bVar, "oldItem");
        C17542s.j(bVar2, "newItem");
        return C17542s.e(bVar.a().getCompositionUuid(), bVar2.a().getCompositionUuid());
    }

    /* renamed from: c */
    public Object getChangePayload(C12785b bVar, C12785b bVar2) {
        C17542s.j(bVar, "oldItem");
        C17542s.j(bVar2, "newItem");
        if (!C17542s.e(bVar.a().getCompositionUuid(), bVar2.a().getCompositionUuid())) {
            return super.getChangePayload(bVar, bVar2);
        }
        if (bVar.b() == bVar2.b() && bVar.c() == bVar2.c()) {
            return super.getChangePayload(bVar, bVar2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("arg.composition.showDetails", bVar2.b());
        bundle.putBoolean("arg.composition.isShared", bVar2.c());
        return bundle;
    }
}
