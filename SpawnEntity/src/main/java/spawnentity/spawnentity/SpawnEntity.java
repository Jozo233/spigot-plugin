package spawnentity.spawnentity;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnEntity extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("[SpawnEntity] byl zapnut");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("[SpawnEntity] byl vypnut");
    }
}
