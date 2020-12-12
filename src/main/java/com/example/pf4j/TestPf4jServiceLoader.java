package com.example.pf4j;

import org.pf4j.*;

import java.util.List;

public class TestPf4jServiceLoader {
    public static void main(String[] args) {
        PluginManager pluginManager = new DefaultPluginManager();
        pluginManager.loadPlugins();
        pluginManager.startPlugins();

        List<IPf4jGreeting> greetings = pluginManager.getExtensions(IPf4jGreeting.class);
        greetings.forEach(IPf4jGreeting::sayHello);

        pluginManager.stopPlugins();
    }
}