package org.dzix.app.service;

import org.dzix.app.dto.CustomerGroupDto;

import java.util.Optional;
import java.util.UUID;

public interface CustomerGroupService {
	void plugin();
	CustomerGroupDto addCustomerGroup(String name);
	Optional<CustomerGroupDto> getCustomerGroup(UUID id);
}
