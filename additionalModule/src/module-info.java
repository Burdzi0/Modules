import org.chancellor.plugin.impl.ConcretePlugin;

module org.chancellor.plugin {
	exports org.chancellor.plugin;
	provides org.chancellor.plugin.Plugin
			with ConcretePlugin;
}