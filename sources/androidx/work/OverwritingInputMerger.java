package androidx.work;

import androidx.work.C7037f;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Landroidx/work/n;", "<init>", "()V", "", "Landroidx/work/f;", "inputs", "a", "(Ljava/util/List;)Landroidx/work/f;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OverwritingInputMerger extends C7045n {
    public C7037f a(List<C7037f> list) {
        C17542s.j(list, "inputs");
        C7037f.a aVar = new C7037f.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C7037f e10 : list) {
            linkedHashMap.putAll(e10.e());
        }
        aVar.d(linkedHashMap);
        return aVar.a();
    }
}
