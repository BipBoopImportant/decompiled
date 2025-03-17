package com.google.gson;

import com.google.gson.reflect.TypeToken;

public interface v {
    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
