package androidx.compose.ui.platform;

import GJ.C15765h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/r1;", "LGJ/h;", "Landroidx/compose/ui/platform/q1;", "<init>", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "name", "", "value", "LXH/N;", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "a", "Ljava/util/List;", "elements", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r1 implements C15765h<q1> {

    /* renamed from: a  reason: collision with root package name */
    private final List<q1> f19569a = new ArrayList();

    public final void c(String str, Object obj) {
        this.f19569a.add(new q1(str, obj));
    }

    public Iterator<q1> iterator() {
        return this.f19569a.iterator();
    }
}
