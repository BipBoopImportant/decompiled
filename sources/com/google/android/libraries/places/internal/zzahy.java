package com.google.android.libraries.places.internal;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class zzahy {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzahw zzahw, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzahw, sb2, 0);
        return sb2.toString();
    }

    static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb2, i10, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb2, i10, str, zzb2);
            }
        } else {
            sb2.append(10);
            zzc(i10, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzaiw.zza(new zzafq(((String) obj).getBytes(zzagx.zzb))));
                sb2.append('\"');
            } else if (obj instanceof zzaft) {
                sb2.append(": \"");
                sb2.append(zzaiw.zza((zzaft) obj));
                sb2.append('\"');
            } else if (obj instanceof zzago) {
                sb2.append(" {");
                zzd((zzago) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i12 = i10 + 2;
                zzb(sb2, i12, "key", entry.getKey());
                zzb(sb2, i12, "value", entry.getValue());
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzahw zzahw, StringBuilder sb2, int i10) {
        int i11;
        boolean z10;
        Method method;
        Method method2;
        zzahw zzahw2 = zzahw;
        StringBuilder sb3 = sb2;
        int i12 = i10;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzahw.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb3, i12, substring.substring(0, substring.length() - 4), zzago.zzE(method2, zzahw2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb3, i12, substring.substring(0, substring.length() - 3), zzago.zzE(method, zzahw2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzE = zzago.zzE(method4, zzahw2, new Object[0]);
                    if (method5 == null) {
                        if (zzE instanceof Boolean) {
                            if (!((Boolean) zzE).booleanValue()) {
                            }
                        } else if (zzE instanceof Integer) {
                            if (((Integer) zzE).intValue() == 0) {
                            }
                        } else if (zzE instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzE).floatValue()) == 0) {
                            }
                        } else if (!(zzE instanceof Double)) {
                            if (zzE instanceof String) {
                                z10 = zzE.equals("");
                            } else if (zzE instanceof zzaft) {
                                z10 = zzE.equals(zzaft.zzb);
                            } else if (zzE instanceof zzahw) {
                                if (zzE == ((zzahw) zzE).zzt()) {
                                }
                            } else if ((zzE instanceof Enum) && ((Enum) zzE).ordinal() == 0) {
                            }
                            if (z10) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzE).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzago.zzE(method5, zzahw2, new Object[0])).booleanValue()) {
                    }
                    zzb(sb3, i12, substring, zzE);
                }
            }
            i11 = 3;
        }
        if (!(zzahw2 instanceof zzagm)) {
            zzaiz zzaiz = ((zzago) zzahw2).zzc;
            if (zzaiz != null) {
                zzaiz.zzg(sb3, i12);
                return;
            }
            return;
        }
        zzagm zzagm = (zzagm) zzahw2;
        throw null;
    }
}
