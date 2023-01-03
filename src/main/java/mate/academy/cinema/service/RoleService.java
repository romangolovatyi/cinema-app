package mate.academy.cinema.service;

import mate.academy.cinema.model.Role;

public interface RoleService {
    Role add(Role roleName);

    Role getByName(String roleName);
}
