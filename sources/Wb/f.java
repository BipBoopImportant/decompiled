package Wb;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class f implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f64624a;

    public /* synthetic */ f(String str) {
        this.f64624a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.f64624a);
    }
}
