package Kb;

import java.util.Arrays;
import java.util.List;

public class r extends s {

    /* renamed from: a  reason: collision with root package name */
    private final List<C9128c<?>> f61471a;

    public r(List<C9128c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f61471a = list;
    }
}
