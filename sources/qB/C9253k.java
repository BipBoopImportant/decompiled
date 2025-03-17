package Qb;

import java.io.File;
import java.util.Comparator;

/* renamed from: Qb.k  reason: case insensitive filesystem */
public final /* synthetic */ class C9253k implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
    }
}
