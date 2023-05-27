package com.bridgelabz.AddressBookSystem;

import java.lang.ref.Cleaner;

public class GsonBuilder {
    public Cleaner registerTypeAdapter(Class<Contact> contactClass, TypeAdapter<String> stringTypeAdapter) {
        return null;
    }

    private class TypeAdapter<T> {
    }
}
