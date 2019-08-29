import org.dzix.app.service.impl.BasicCustomerGroupService;
import org.dzix.app.service.CustomerGroupService;

module org.dzix.app {
	requires transitive org.chancellor.plugin;
	uses org.chancellor.plugin.Plugin;

	exports org.dzix.app.dto;
	exports org.dzix.app.service;
	provides CustomerGroupService
			with BasicCustomerGroupService;
}