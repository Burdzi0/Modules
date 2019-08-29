package org.dzix.app.service.impl;

import org.chancellor.plugin.Plugin;
import org.dzix.app.dto.CustomerGroupDto;
import org.dzix.app.model.CustomerGroup;
import org.dzix.app.repository.CustomerGroupRepository;
import org.dzix.app.repository.InMemoryCustomerGroupRepository;
import org.dzix.app.service.CustomerGroupService;

import java.util.Optional;
import java.util.ServiceLoader;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class BasicCustomerGroupService implements CustomerGroupService {

	private CustomerGroupRepository repository;
	private Plugin plugin;

	public BasicCustomerGroupService() {
		this.repository = new InMemoryCustomerGroupRepository();
		this.plugin = ServiceLoader.load(Plugin.class).findFirst().get();
	}

	@Override
	public void plugin() {
		plugin.plug();
	}

	@Override
	public CustomerGroupDto addCustomerGroup(String name) {
		System.out.println("Adding customer group with name: " + name);
		return toDto(repository.saveCustomer(new CustomerGroup(randomUUID(), name)));
	}

	@Override
	public Optional<CustomerGroupDto> getCustomerGroup(UUID id) {
		System.out.println("Retrieving group with id: " + id);
		return Optional.ofNullable(repository.getCustomerGroup(id)).map(this::toDto);
	}

	private CustomerGroupDto toDto(CustomerGroup customerGroup) {
		return new CustomerGroupDto(customerGroup.getId(), customerGroup.getName());
	}
}
