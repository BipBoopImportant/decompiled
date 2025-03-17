package RF;

import XH.C16796C;
import XH.v;
import YH.X;
import com.squareup.moshi.f;
import com.squareup.moshi.q;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import kK.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LRF/l;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "<init>", "()V", "Lcom/squareup/moshi/q;", "writer", "value", "LXH/N;", "b", "(Lcom/squareup/moshi/q;Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "", "toString", "()Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends f<ModelScreenTransform> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.decorate_engine.ModelScreenTransform fromJson(com.squareup.moshi.k r6) {
        /*
            r5 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            com.sugarcube.decorate_engine.ModelScreenTransform r0 = new com.sugarcube.decorate_engine.ModelScreenTransform
            r0.<init>()
            java.lang.String r6 = r6.C1()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r6)
            java.lang.String r6 = "screenX"
            double r2 = r1.getDouble(r6)
            float r6 = (float) r2
            r0.screenX = r6
            java.lang.String r6 = "screenY"
            double r2 = r1.getDouble(r6)
            float r6 = (float) r2
            r0.screenY = r6
            java.lang.String r6 = "yawRadians"
            double r2 = r1.getDouble(r6)
            float r6 = (float) r2
            r0.yawRadians = r6
            java.lang.String r6 = "isAbsolutePosition"
            boolean r6 = r1.getBoolean(r6)
            r0.isAbsolutePosition = r6
            java.lang.String r6 = "isAbsoluteYaw"
            boolean r6 = r1.getBoolean(r6)
            r0.isAbsoluteYaw = r6
            java.lang.String r6 = "isPanoSpace"
            boolean r6 = r1.getBoolean(r6)
            r0.isPanoSpace = r6
            java.lang.String r6 = "applyPhysics"
            boolean r6 = r1.getBoolean(r6)
            r0.applyPhysics = r6
            java.lang.String r6 = "isModelRolled90"
            java.lang.Object r6 = r1.opt(r6)
            java.lang.Object r2 = org.json.JSONObject.NULL
            boolean r3 = kotlin.jvm.internal.C17542s.e(r6, r2)
            r4 = 0
            if (r3 == 0) goto L_0x005f
        L_0x005d:
            r6 = r4
            goto L_0x0065
        L_0x005f:
            boolean r3 = r6 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x005d
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L_0x0065:
            r0.isModelRolled90 = r6
            java.lang.String r6 = "isModelMirrored"
            java.lang.Object r6 = r1.opt(r6)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r6, r2)
            if (r1 == 0) goto L_0x0074
            goto L_0x007b
        L_0x0074:
            boolean r1 = r6 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x007b
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L_0x007b:
            r0.isModelMirrored = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: RF.l.fromJson(com.squareup.moshi.k):com.sugarcube.decorate_engine.ModelScreenTransform");
    }

    /* renamed from: b */
    public void toJson(q qVar, ModelScreenTransform modelScreenTransform) {
        C17542s.j(qVar, "writer");
        Boolean bool = null;
        v a10 = C16796C.a("screenX", j.b(modelScreenTransform != null ? Float.valueOf(modelScreenTransform.screenX) : null));
        v a11 = C16796C.a("screenY", j.b(modelScreenTransform != null ? Float.valueOf(modelScreenTransform.screenY) : null));
        v a12 = C16796C.a("yawRadians", j.b(modelScreenTransform != null ? Float.valueOf(modelScreenTransform.yawRadians) : null));
        v a13 = C16796C.a("isAbsolutePosition", j.a(modelScreenTransform != null ? Boolean.valueOf(modelScreenTransform.isAbsolutePosition) : null));
        v a14 = C16796C.a("isAbsoluteYaw", j.a(modelScreenTransform != null ? Boolean.valueOf(modelScreenTransform.isAbsoluteYaw) : null));
        v a15 = C16796C.a("isPanoSpace", j.a(modelScreenTransform != null ? Boolean.valueOf(modelScreenTransform.isPanoSpace) : null));
        if (modelScreenTransform != null) {
            bool = Boolean.valueOf(modelScreenTransform.applyPhysics);
        }
        v a16 = C16796C.a("applyPhysics", j.a(bool));
        boolean z10 = false;
        v a17 = C16796C.a("isModelRolled90", j.a(Boolean.valueOf(modelScreenTransform != null ? C17542s.e(modelScreenTransform.isModelRolled90, Boolean.TRUE) : false)));
        if (modelScreenTransform != null) {
            z10 = C17542s.e(modelScreenTransform.isModelMirrored, Boolean.TRUE);
        }
        qVar.N(new JsonObject(X.m(a10, a11, a12, a13, a14, a15, a16, a17, C16796C.a("isModelMirrored", j.a(Boolean.valueOf(z10))))).toString());
    }

    public String toString() {
        return "JsonAdapter(ModelScreenTransform)";
    }
}
