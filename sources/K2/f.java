package k2;

import java.util.Arrays;
import java.util.HashMap;

public class f {

    /* renamed from: a  reason: collision with root package name */
    HashMap<Object, HashMap<String, float[]>> f25056a = new HashMap<>();

    public float a(Object obj, String str, int i10) {
        HashMap hashMap;
        float[] fArr;
        if (this.f25056a.containsKey(obj) && (hashMap = this.f25056a.get(obj)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > i10) {
            return fArr[i10];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i10, float f10) {
        if (!this.f25056a.containsKey(obj)) {
            HashMap hashMap = new HashMap();
            float[] fArr = new float[(i10 + 1)];
            fArr[i10] = f10;
            hashMap.put(str, fArr);
            this.f25056a.put(obj, hashMap);
            return;
        }
        HashMap hashMap2 = this.f25056a.get(obj);
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
        }
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[(i10 + 1)];
            fArr2[i10] = f10;
            hashMap2.put(str, fArr2);
            this.f25056a.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = (float[]) hashMap2.get(str);
        if (fArr3 == null) {
            fArr3 = new float[0];
        }
        if (fArr3.length <= i10) {
            fArr3 = Arrays.copyOf(fArr3, i10 + 1);
        }
        fArr3[i10] = f10;
        hashMap2.put(str, fArr3);
    }
}
