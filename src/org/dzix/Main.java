package org.dzix;

import org.chancellor.plugin.Plugin;
import org.dzix.app.dto.CustomerGroupDto;
import org.dzix.app.service.CustomerGroupService;

import java.util.ServiceLoader;
import java.util.UUID;

public class Main {

	private final static String name = "customer-group";

	public static void main(String[] args) {
		CustomerGroupService service = initApp();

		service.plugin();

		CustomerGroupDto createdGroup = service.addCustomerGroup(name);
		System.out.println(createdGroup);
		UUID id = createdGroup.id;

		CustomerGroupDto retrievedGroup = service.getCustomerGroup(id).orElseThrow();
		System.out.println(retrievedGroup);
	}

	private static CustomerGroupService initApp() {
		Iterable<CustomerGroupService> services = ServiceLoader.load(CustomerGroupService.class);
		return services.iterator().next();
	}

	private static Plugin getPlugin() {
		return ServiceLoader.load(Plugin.class).findFirst().get();
	}
}
