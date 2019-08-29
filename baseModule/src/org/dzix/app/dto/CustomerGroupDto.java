package org.dzix.app.dto;

import java.util.StringJoiner;
import java.util.UUID;

public class CustomerGroupDto {

	public final UUID id;
	public final String name;

	public CustomerGroupDto(UUID id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return new StringJoiner(" ", CustomerGroupDto.class.getSimpleName() + "[", "]")
				.add("id: " + id)
				.add("name: '" + name + "'")
				.toString();
	}
}
