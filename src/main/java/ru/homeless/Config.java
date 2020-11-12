package ru.homeless;

public interface Config {
    public <T> Class<? extends T> getImplClass(Class<T> ifc);
}
