package de.mineformers.robots.api.registry;

import de.mineformers.robots.api.RobotModule;

import java.util.Collection;
import java.util.HashMap;

/**
 * R0b0ts
 * <p/>
 * ModuleRegistry
 *
 * @author PaleoCrafter
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ModuleRegistry {

    private static ModuleRegistry instance;
    private HashMap<String, RobotModule> modules;

    public static ModuleRegistry instance() {
        if (instance == null)
            instance = new ModuleRegistry();
        return instance;
    }

    private ModuleRegistry() {
        modules = new HashMap<String, RobotModule>();
    }

    public void registerModule(RobotModule module) {
        modules.put(module.getIdentifier(), module);
    }

    public RobotModule getModule(String identifier) {
        return modules.get(identifier);
    }

    public Collection<RobotModule> getModules() {
        return modules.values();
    }
}
