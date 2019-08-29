package org.dzix.app.repository;

import org.dzix.app.model.CustomerGroup;

import java.util.UUID;

public interface CustomerGroupRepository {
	CustomerGroup getCustomerGroup(UUID uuid);
	CustomerGroup saveCustomer(CustomerGroup customerGroup);
}
