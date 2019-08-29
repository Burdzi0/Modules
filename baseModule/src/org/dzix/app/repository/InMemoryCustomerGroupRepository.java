package org.dzix.app.repository;

import org.dzix.app.model.CustomerGroup;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMemoryCustomerGroupRepository implements CustomerGroupRepository {

	private Map<UUID, CustomerGroup> customerGroups = new HashMap<>();

	@Override
	public CustomerGroup getCustomerGroup(UUID uuid) {
		return customerGroups.get(uuid);
	}

	@Override
	public CustomerGroup saveCustomer(CustomerGroup customerGroup) {
		customerGroups.put(customerGroup.getId(), customerGroup);
		return customerGroup;
	}


}
