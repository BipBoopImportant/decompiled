package androidx.camera.core.impl;

import C.C4407o;
import C.C4408p;
import H2.i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.core.impl.v0  reason: case insensitive filesystem */
public class C5052v0 implements C4407o {

    /* renamed from: b  reason: collision with root package name */
    private final int f17024b;

    public C5052v0(int i10) {
        this.f17024b = i10;
    }

    public List<C4408p> b(List<C4408p> list) {
        ArrayList arrayList = new ArrayList();
        for (C4408p next : list) {
            i.b(next instanceof I, "The camera info doesn't contain internal implementation.");
            if (next.f() == this.f17024b) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f17024b;
    }
}
