package ru.homeless;

public interface ProxyConfigurator {

    Object replaceWithProxyIfNeeded(Object t, Class implClass);
}
