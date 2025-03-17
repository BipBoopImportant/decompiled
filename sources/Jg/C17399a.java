package jG;

import jI.C17423j;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LjG/a;", "", "<init>", "()V", "Ljava/io/File;", "cacheDir", "Ljava/util/UUID;", "compositionUuid", "", "", "gltfMap", "a", "(Ljava/io/File;Ljava/util/UUID;Ljava/util/Map;)Ljava/lang/String;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jG.a  reason: case insensitive filesystem */
public final class C17399a {
    public final String a(File file, UUID uuid, Map<String, ? extends Object> map) {
        C17542s.j(file, "cacheDir");
        C17542s.j(uuid, "compositionUuid");
        C17542s.j(map, "gltfMap");
        File file2 = new File(file, uuid + ".gltf");
        String jSONObject = new JSONObject(map).toString();
        C17542s.i(jSONObject, "toString(...)");
        C17423j.l(file2, jSONObject, (Charset) null, 2, (Object) null);
        String absolutePath = file2.getAbsolutePath();
        C17542s.i(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }
}
