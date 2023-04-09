package io.github.saaris.simplejail

import org.bukkit.plugin.java.JavaPlugin

class SimpleJail : JavaPlugin() {
    override fun onEnable() {
        logger.info("SimpleJail has started.")
    }

    override fun onDisable() {
        logger.info("SimpleJail has been disabled.")
    }
}
