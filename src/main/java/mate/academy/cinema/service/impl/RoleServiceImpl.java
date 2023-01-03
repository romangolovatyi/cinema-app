package mate.academy.cinema.service.impl;

import mate.academy.cinema.dao.RoleDao;
import mate.academy.cinema.model.Role;
import mate.academy.cinema.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role roleName) {
        return roleDao.add(roleName);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName).orElseThrow(
                () -> new RuntimeException("Role " + roleName + " not found"));
    }
}
